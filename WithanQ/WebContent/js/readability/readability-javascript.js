/*
 * Readability. An Arc90 Lab Experiment. 
 * Website: http://lab.arc90.com/experiments/readability
 * Source:  http://code.google.com/p/arc90labs-readability
 *
 * Copyright (c) 2009 Arc90 Inc
 * Readability is licensed under the Apache License, Version 2.0.
**/
var readability = {
	version:     '0.5.1',
	iframeLoads: 0,
	frameHack:   false, /**
	                     * The frame hack is to workaround a firefox bug where if you
						 * pull content out of a frame and stick it into the parent element, the scrollbar won't appear.
						 * So we fake a scrollbar in the wrapping div.
						**/
	bodyCache:  null,   /* Cache the body HTML in case we need to re-use it later */
	sendArticleUrl:  'http://withanqwww.s-onair.com/test/getArticleJavascript',   
	replaceFromTagReList: [/<(\/?)strong[^>]*>/gi,/<(\/?)em[^>]*>/gi,/<(\/?)li[^>]*>/gi],
	replaceToTagList: ['b','i','p'],
	notRemoveTagList: ['p','img','b','i'],
	maxImgSize: 50,
	
	/**
	 * All of the regular expressions in use within readability.
	 * Defined up here so we don't instantiate them repeatedly in loops.
	 **/
	regexps: {
		unlikelyCandidatesRe:   /(?:\b|_)(?:combx|comment|disqus|foot|header|menu|meta|nav|rss|shoutbox|sidebar|sponsor)(?![a-z])/i,
		okMaybeItsACandidateRe: /and|article|body|column|main/i,
		positiveRe:             /article|body|content|entry|hentry|page|pagination|post|text/i,
		negativeRe:             /combx|comment|contact|foot|footer|footnote|link|media|meta|promo|related|scroll|shoutbox|sponsor|tags|widget/i,
		divToPElementsRe:       /<(a|blockquote|dl|div|img|ol|p|pre|table|ul)/i,
		replaceBrsRe:           /(<br[^>]*>[ \n\r\t]*){2,}/gi,
		replaceFontsRe:         /<(\/?)font[^>]*>/gi,
		trimRe:                 /^\s+|\s+$/g,
		normalizeRe:            /\s{2,}/g,
		killBreaksRe:           /(<br\s*\/?>(\s|&nbsp;?)*){1,}/g,
		videoRe:                /http:\/\/(www\.)?(youtube|vimeo)\.com/i,
		conmmentTagRe:      /<!--[^>]*>/gi
	},
	
	/**
	 * Get the article title as an H1. Currently just uses document.title,
	 * we might want to be smarter in the future.
	 *
	 * @return void
	 **/
	getArticleTitle: function () {
		var articleTitle = document.createElement("H1");
		articleTitle.innerHTML = document.title;
		
		return articleTitle;
	},
	
	/**
	 * Prepare the HTML element for readability to scrape it.
	 * This includes things like stripping javascript, CSS, and handling terrible markup.
	 * 
	 * @param Element
	 * @return Element
	 **/
	prepDocument: function (html) {
		/**
		 * In some cases a body element can't be found (if the HTML is totally hosed for example)
		 * so we create a new body node and append it to the document.
		 */
		if(document.body === null){
			body = document.createElement("body");
			try {
				html = body;		
			}
			catch(e) {
				html.appendChild(body);
			}
		}

		var frames = document.getElementsByTagName('frame');
		if(frames.length > 0){
			var bestFrame = null;
			var bestFrameSize = 0;
			for(var frameIndex = 0; frameIndex < frames.length; frameIndex++)
			{
				var frameSize = frames[frameIndex].offsetWidth + frames[frameIndex].offsetHeight;
				var canAccessFrame = false;
				try {
					frames[frameIndex].contentWindow.document.body;
					canAccessFrame = true;
				} catch(e) {}
				
				if(canAccessFrame && frameSize > bestFrameSize)
				{
					bestFrame = frames[frameIndex];
					bestFrameSize = frameSize;
				}
			}

			if(bestFrame)
			{
				var newBody = document.createElement('body');
				newBody.innerHTML = bestFrame.contentWindow.document.body.innerHTML;
				newBody.style.overflow = 'scroll';
				document.body = newBody;
				
				var frameset = document.getElementsByTagName('frameset')[0];
				if(frameset)
					frameset.parentNode.removeChild(frameset);
					
				readability.frameHack = true;
			}
		}


		/* Remove all style tags in head (not doing this on IE) - TODO: Why not? */
		var styleTags = html.getElementsByTagName("style");
		for (var j=0;j < styleTags.length; j++)
			if (navigator.appName != "Microsoft Internet Explorer")
				styleTags[j].textContent = "";

		/* Turn all double br's into p's */
		/* Note, this is pretty costly as far as processing goes. Maybe optimize later. */
		html.innerHTML = html.innerHTML.replace(readability.regexps.replaceBrsRe, '</p><p>').replace(readability.regexps.replaceFontsRe, '<$1span>')
		return html;
	},

	
	

	/**
	 * Prepare the article node for display. Clean out any inline styles,
	 * iframes, forms, strip extraneous <p> tags, etc.
	 *
	 * @param Element
	 * @return void
	 **/
	prepArticle: function (articleContent) {
		readability.killBreaks(articleContent);

		/* Clean out junk from the article content */
		readability.clean(articleContent, "form");
		readability.clean(articleContent, "object");
		readability.clean(articleContent, "h1");
		readability.clean(articleContent, "script");
		readability.clean(articleContent, "style");
		
		/**
		 * If there is only one h2, they are probably using it
		 * as a header and not a subheader, so remove it since we already have a header.
		***/
		if(articleContent.getElementsByTagName('h2').length == 1)
			readability.clean(articleContent, "h2");
		readability.clean(articleContent, "iframe");

		readability.cleanHeaders(articleContent);

		/* Do these last as the previous stuff may have removed junk that will affect these */
		readability.cleanConditionally(articleContent, "table");
		readability.cleanConditionally(articleContent, "ul");
		readability.cleanConditionally(articleContent, "div");

		/* Remove extra paragraphs */
		var articleParagraphs = articleContent.getElementsByTagName('p');
		for(i = articleParagraphs.length-1; i >= 0; i--)
		{
			var imgCount    = articleParagraphs[i].getElementsByTagName('img').length;
			var embedCount  = articleParagraphs[i].getElementsByTagName('embed').length;
			var objectCount = articleParagraphs[i].getElementsByTagName('object').length;
			
			if(imgCount == 0 && embedCount == 0 && objectCount == 0 && readability.getInnerText(articleParagraphs[i], false) == '')
			{
				articleParagraphs[i].parentNode.removeChild(articleParagraphs[i]);
			}
		}

		try {
			articleContent.innerHTML = articleContent.innerHTML.replace(/<br[^>]*>\s*<p/gi, '<p');		
		}
		catch (e) {
			console.log("Cleaning innerHTML of breaks failed. This is an IE strict-block-elements bug. Ignoring.");
		}
	},
	
	/**
	 * Initialize a node with the readability object. Also checks the
	 * className/id for special names to add to its score.
	 *
	 * @param Element
	 * @return void
	**/
	initializeNode: function (node) {
		node.readability = {"contentScore": 0};			

		switch(node.tagName) {
			case 'DIV':
				node.readability.contentScore += 5;
				break;

			case 'PRE':
			case 'TD':
			case 'BLOCKQUOTE':
				node.readability.contentScore += 3;
				break;
				
			case 'ADDRESS':
			case 'OL':
			case 'UL':
			case 'DL':
			case 'DD':
			case 'DT':
			case 'LI':
			case 'FORM':
				node.readability.contentScore -= 3;
				break;

			case 'H1':
			case 'H2':
			case 'H3':
			case 'H4':
			case 'H5':
			case 'H6':
			case 'TH':
				node.readability.contentScore -= 5;
				break;
		}

		node.readability.contentScore += readability.getClassWeight(node);
	},
	
	/***
	 * grabArticle - Using a variety of metrics (content score, classname, element types), find the content that is
	 *               most likely to be the stuff a user wants to read. Then return it wrapped up in a div.
	 *
	 * @return Element
	**/
	grabArticle: function (preserveUnlikelyCandidates) {
		/**
		 * First, node prepping. Trash nodes that look cruddy (like ones with the class name "comment", etc), and turn divs
		 * into P tags where they have been used inappropriately (as in, where they contain no other block level elements.)
		 *
		 * Note: Assignment from index for performance. See http://www.peachpit.com/articles/article.aspx?p=31567&seqNum=5
		 * TODO: Shouldn't this be a reverse traversal?
		**/
		
		
		var docCopy = document.body.parentNode.cloneNode(true);
		var prepDocumentDoc = readability.prepDocument(docCopy);
		var docCopyNode = prepDocumentDoc.getElementsByTagName('*');
		var node;
		
		for(var nodeIndex = 0; (node = docCopyNode[nodeIndex]); nodeIndex++)
		{
			/* Remove unlikely candidates */
			if (!preserveUnlikelyCandidates) {
				var unlikelyMatchString = node.className + node.id;
				
				if (unlikelyMatchString.search(readability.regexps.unlikelyCandidatesRe) !== -1 &&
				    unlikelyMatchString.search(readability.regexps.okMaybeItsACandidateRe) == -1 &&
					node.tagName !== "BODY")
				{
					console.log("Removing unlikely candidate - " + unlikelyMatchString);
					node.parentNode.removeChild(node);
					nodeIndex--;
					continue;
				}				
			}

			/* Turn all divs that don't have children block level elements into p's */
			if (node.tagName === "DIV") {
				if (node.innerHTML.search(readability.regexps.divToPElementsRe) === -1)	{
					console.log("Altering div to p");
					var newNode = document.createElement('p');
					try {
						newNode.innerHTML = node.innerHTML;				
						node.parentNode.replaceChild(newNode, node);
						nodeIndex--;
					}
					catch(e)
					{
						console.log("Could not alter div to p, probably an IE restriction, reverting back to div.")
					}
				}
				else
				{
					/* EXPERIMENTAL */
					for(var i = 0, il = node.childNodes.length; i < il; i++) {
						var childNode = node.childNodes[i];
						if(childNode.nodeType == Node.TEXT_NODE) {
							console.log("replacing text node with a p tag with the same content.");
							var p = document.createElement('p');
							p.innerHTML = childNode.nodeValue;
							childNode.parentNode.replaceChild(p, childNode);
						}
					}
				}
			} 
		}

		/**
		 * Loop through all paragraphs, and assign a score to them based on how content-y they look.
		 * Then add their score to their parent node.
		 *
		 * A score is determined by things like number of commas, class names, etc. Maybe eventually link density.
		**/
		var allParagraphs = docCopy.getElementsByTagName("p");
		var candidates    = [];

		for (var j=0; j	< allParagraphs.length; j++) {
			var parentNode      = allParagraphs[j].parentNode;
			var grandParentNode = parentNode.parentNode;
			var innerText       = readability.getInnerText(allParagraphs[j]);
			
			/* If this paragraph is less than 25 characters, don't even count it. */
			if(innerText.length < 25)
				continue;

			/* Initialize readability data for the parent. */
			if(typeof parentNode.readability == 'undefined')
			{
				readability.initializeNode(parentNode);
				candidates.push(parentNode);
			}

			/* Initialize readability data for the grandparent. */
			if(typeof grandParentNode.readability == 'undefined')
			{
				readability.initializeNode(grandParentNode);
				candidates.push(grandParentNode);
			}

			var contentScore = 0;

			/* Add a point for the paragraph itself as a base. */
			contentScore++;

			/* Add points for any commas within this paragraph */
			contentScore += innerText.split(',').length;
			
			/* For every 100 characters in this paragraph, add another point. Up to 3 points. */
			contentScore += Math.min(Math.floor(innerText.length / 100), 3);
			
			/* Add the score to the parent. The grandparent gets half. */
			parentNode.readability.contentScore += contentScore;
			grandParentNode.readability.contentScore += contentScore/2;
		}

		/**
		 * After we've calculated scores, loop through all of the possible candidate nodes we found
		 * and find the one with the highest score.
		**/
		var topCandidate = null;
		for(var i=0, il=candidates.length; i < il; i++)
		{
			/**
			 * Scale the final candidates score based on link density. Good content should have a
			 * relatively small link density (5% or less) and be mostly unaffected by this operation.
			**/
			candidates[i].readability.contentScore = candidates[i].readability.contentScore * (1-readability.getLinkDensity(candidates[i]));

			console.log('Candidate: ' + candidates[i] + " (" + candidates[i].className + ":" + candidates[i].id + ") with score " + candidates[i].readability.contentScore);

			if(!topCandidate || candidates[i].readability.contentScore > topCandidate.readability.contentScore)
				topCandidate = candidates[i];
		}

		/**
		 * If we still have no top candidate, just use the body as a last resort.
		 * We also have to copy the body node so it is something we can modify.
		 **/
		if (topCandidate == null || topCandidate.tagName == "BODY")
		{
			topCandidate = document.createElement("DIV");
			topCandidate.innerHTML = document.body.innerHTML;
			readability.initializeNode(topCandidate);
		}


		/**
		 * Now that we have the top candidate, look through its siblings for content that might also be related.
		 * Things like preambles, content split by ads that we removed, etc.
		**/
		var articleContent        = document.createElement("DIV");
	        articleContent.id     = "readability-content";
		var siblingScoreThreshold = Math.max(10, topCandidate.readability.contentScore * 0.2);
		var siblingNodes          = topCandidate.parentNode.childNodes;
		for(var i=0, il=siblingNodes.length; i < il; i++)
		{
			var siblingNode = siblingNodes[i];
			var append      = false;

			console.log("Looking at sibling node: " + siblingNode + " (" + siblingNode.className + ":" + siblingNode.id + ")" + ((typeof siblingNode.readability != 'undefined') ? (" with score " + siblingNode.readability.contentScore) : ''));
			console.log("Sibling has score " + (siblingNode.readability ? siblingNode.readability.contentScore : 'Unknown'));

			if(siblingNode === topCandidate)
			{
				append = true;
			}
			
			if(typeof siblingNode.readability != 'undefined' && siblingNode.readability.contentScore >= siblingScoreThreshold)
			{
				append = true;
			}
			
			if(siblingNode.nodeName == "P") {
				var linkDensity = readability.getLinkDensity(siblingNode);
				var nodeContent = readability.getInnerText(siblingNode);
				var nodeLength  = nodeContent.length;
				
				if(nodeLength > 80 && linkDensity < 0.25)
				{
					append = true;
				}
				else if(nodeLength < 80 && linkDensity == 0 && nodeContent.search(/\.( |$)/) !== -1)
				{
					append = true;
				}
			}

			if(append)
			{
				console.log("Appending node: " + siblingNode)

				/* Append sibling and subtract from our list because it removes the node when you append to another node */
				
				articleContent.appendChild(siblingNode);
				i--;
				il--;
			}
		}				

		/**
		 * So we have all of the content that we need. Now we clean it up for presentation.
		**/
		readability.prepArticle(articleContent);
		
		readability.replaceTags(articleContent);
		
		readability.removeConmmentTag(articleContent);
		
		readability.removeTags(articleContent);
		
		readability.removeStyle(articleContent);
		
		
		return articleContent;
	},
	
	/**
	 *
	 * @param Element
	 * @return string
	 **/
	replaceTags: function (articleContent) {
		var i;
		var replaceFromTagReList = readability.replaceFromTagReList;
		var replaceToTagList = readability.replaceToTagList;
		var replaceFromTagListLength = replaceFromTagReList.length;
		for(i = 0; i < replaceFromTagListLength; i++) {
			replaceToTag = replaceToTagList[i];
			articleContent.innerHTML = articleContent.innerHTML.replace( replaceFromTagReList[i], '<$1'+replaceToTag+'>');
		}
	},
	
	/**
	 *
	 * @param Element
	 * @return string
	 **/
	removeStyle: function (articleContent) {
		var docCopyNode = articleContent.getElementsByTagName('*');
		var nodeIndex;
		var newNode;
		var node;
		for(nodeIndex = 0; (node = docCopyNode[nodeIndex]); nodeIndex++){
			console.log("remove style - " + node.tagName);
			newNode = document.createElement(node.tagName);
			if(node.height < readability.maxImgSize || node.width < readability.maxImgSize){
				console.log("IMG remove - " + node.height);
				node.parentNode.removeChild(node);
				nodeIndex--;
				continue;
			}
			if(node.tagName == "IMG"){
				newNode.src = node.src;
			}
			try {
				newNode.innerHTML = node.innerHTML;	
				node.parentNode.replaceChild(newNode, node);
			}
			catch(e){
				console.log("Could not alter div to p, probably an IE restriction, reverting back to div.")
			}
		}
	},
	
	/**
	 *
	 * @param Element
	 * @return string
	 **/
	removeConmmentTag: function (articleContent) {
		articleContent.innerHTML = articleContent.innerHTML.replace(readability.regexps.conmmentTagRe, ''); 
	},
	
	/**
	 *
	 * @param Element
	 * @return string
	**/
	removeTags: function (articleContent) {
		articleContent.innerHTML = articleContent.innerHTML.replace(/<\/?([a-z]+)[^>]*>/gi, function (str,p1,offset,s) {
			var i;
			var notRemoveTagList = readability.notRemoveTagList;
			var notRemoveTagListLength = notRemoveTagList.length;
			var remove = true;
			var replaceStr;
			for(i = 0; i < notRemoveTagListLength; i++) {
				if(notRemoveTagList[i].indexOf(p1.toLowerCase()) != -1){
					remove = false;
					continue;
				}
			}
			if(remove){
				replaceStr = '';
				console.log("removeTags  "  + p1);
			}else{
				replaceStr = str;
			}
			return replaceStr;
		  }
		);
	},
	
	
	/**
	 * Get the inner text of a node - cross browser compatibly.
	 * This also strips out any excess whitespace to be found.
	 *
	 * @param Element
	 * @return string
	**/
	getInnerText: function (e, normalizeSpaces) {
		var textContent    = "";

		normalizeSpaces = (typeof normalizeSpaces == 'undefined') ? true : normalizeSpaces;

		if (navigator.appName == "Microsoft Internet Explorer")
			textContent = e.innerText.replace( readability.regexps.trimRe, "" );
		else
			textContent = e.textContent.replace( readability.regexps.trimRe, "" );

		if(normalizeSpaces)
			return textContent.replace( readability.regexps.normalizeRe, " ");
		else
			return textContent;
	},

	/**
	 * Get the number of times a string s appears in the node e.
	 *
	 * @param Element
	 * @param string - what to split on. Default is ","
	 * @return number (integer)
	**/
	getCharCount: function (e,s) {
	    s = s || ",";
		return readability.getInnerText(e).split(s).length;
	},

	
	/**
	 * Get the density of links as a percentage of the content
	 * This is the amount of text that is inside a link divided by the total text in the node.
	 * 
	 * @param Element
	 * @return number (float)
	**/
	getLinkDensity: function (e) {
		var links      = e.getElementsByTagName("a");
		var textLength = readability.getInnerText(e).length;
		var linkLength = 0;
		for(var i=0, il=links.length; i<il;i++)
		{
			linkLength += readability.getInnerText(links[i]).length;
		}		

		return linkLength / textLength;
	},
	
	/**
	 * Get an elements class/id weight. Uses regular expressions to tell if this 
	 * element looks good or bad.
	 *
	 * @param Element
	 * @return number (Integer)
	**/
	getClassWeight: function (e) {
		var weight = 0;

		/* Look for a special classname */
		if (e.className != "")
		{
			if(e.className.search(readability.regexps.negativeRe) !== -1)
				weight -= 25;

			if(e.className.search(readability.regexps.positiveRe) !== -1)
				weight += 25;				
		}

		/* Look for a special ID */
		if (typeof(e.id) == 'string' && e.id != "")
		{
			if(e.id.search(readability.regexps.negativeRe) !== -1)
				weight -= 25;

			if(e.id.search(readability.regexps.positiveRe) !== -1)
				weight += 25;				
		}

		return weight;
	},
	
	/**
	 * Remove extraneous break tags from a node.
	 *
	 * @param Element
	 * @return void
	 **/
	killBreaks: function (e) {
		try {
			e.innerHTML = e.innerHTML.replace(readability.regexps.killBreaksRe,'<br />');		
		}
		catch (e) {
			console.log("KillBreaks failed - this is an IE bug. Ignoring.");
		}
	},

	/**
	 * Clean a node of all elements of type "tag".
	 * (Unless it's a youtube/vimeo video. People love movies.)
	 *
	 * @param Element
	 * @param string tag to clean
	 * @return void
	 **/
	clean: function (e, tag) {
		var targetList = e.getElementsByTagName( tag );
		var isEmbed    = (tag == 'object' || tag == 'embed');

		for (var y=targetList.length-1; y >= 0; y--) {
			/* Allow youtube and vimeo videos through as people usually want to see those. */
			if(isEmbed && targetList[y].innerHTML.search(readability.regexps.videoRe) !== -1)
			{
				continue;
			}

			targetList[y].parentNode.removeChild(targetList[y]);
		}
	},
	
	/**
	 * Clean an element of all tags of type "tag" if they look fishy.
	 * "Fishy" is an algorithm based on content length, classnames, link density, number of images & embeds, etc.
	 *
	 * @return void
	 **/
	cleanConditionally: function (e, tag) {
		var tagsList      = e.getElementsByTagName(tag);
		var curTagsLength = tagsList.length;

		/**
		 * Gather counts for other typical elements embedded within.
		 * Traverse backwards so we can remove nodes at the same time without effecting the traversal.
		 *
		 * TODO: Consider taking into account original contentScore here.
		**/
		for (var i=curTagsLength-1; i >= 0; i--) {
			var weight = readability.getClassWeight(tagsList[i]);

			console.log("Cleaning Conditionally " + tagsList[i] + " (" + tagsList[i].className + ":" + tagsList[i].id + ")" + ((typeof tagsList[i].readability != 'undefined') ? (" with score " + tagsList[i].readability.contentScore) : ''));

			if(weight < 0)
			{
				tagsList[i].parentNode.removeChild(tagsList[i]);
			}
			else if ( readability.getCharCount(tagsList[i],',') < 10) {
				/**
				 * If there are not very many commas, and the number of
				 * non-paragraph elements is more than paragraphs or other ominous signs, remove the element.
				**/

				var p      = tagsList[i].getElementsByTagName("p").length;
				var img    = tagsList[i].getElementsByTagName("img").length;
				var li     = tagsList[i].getElementsByTagName("li").length-100;
				var input  = tagsList[i].getElementsByTagName("input").length;

				var embedCount = 0;
				var embeds     = tagsList[i].getElementsByTagName("embed");
				for(var ei=0,il=embeds.length; ei < il; ei++) {
					if (embeds[ei].src.search(readability.regexps.videoRe) == -1) {
					  embedCount++;	
					}
				}

				var linkDensity   = readability.getLinkDensity(tagsList[i]);
				var contentLength = readability.getInnerText(tagsList[i]).length;
				var toRemove      = false;

				if ( img > p ) {
				 	toRemove = true;
				} else if(li > p && tag != "ul" && tag != "ol") {
					toRemove = true;
				} else if( input > Math.floor(p/3) ) {
				 	toRemove = true; 
				} else if(contentLength < 25 && (img == 0 || img > 2) ) {
					toRemove = true;
				} else if(weight < 25 && linkDensity > .2) {
					toRemove = true;
				} else if(weight >= 25 && linkDensity > .5) {
					toRemove = true;
				} else if((embedCount == 1 && contentLength < 75) || embedCount > 1) {
					toRemove = true;
				}

				if(toRemove) {
					tagsList[i].parentNode.removeChild(tagsList[i]);
				}
			}
		}
	},

	/**
	 * Clean out spurious headers from an Element. Checks things like classnames and link density.
	 *
	 * @param Element
	 * @return void
	**/
	cleanHeaders: function (e) {
		for (var headerIndex = 1; headerIndex < 7; headerIndex++) {
			var headers = e.getElementsByTagName('h' + headerIndex);
			for (var i=headers.length-1; i >=0; i--) {
				if (readability.getClassWeight(headers[i]) < 0 || readability.getLinkDensity(headers[i]) > 0.33) {
					headers[i].parentNode.removeChild(headers[i]);
				}
			}
		}
	},
	
	/**
	 * send article contents to server
	 *
	 * @return void
	 **/
	sendArticleContentsToServer: function () {
	    var submitContainer = document.getElementById('submit-container');
	    if(null != submitContainer)
	    {
	        return;
	    }

	    var submitContainer = document.createElement('div');
	    submitContainer.setAttribute('id', 'submit-container');
	    submitContainer.style.display = 'none';
	    submitContainer.innerHTML = '<iframe id="submitIframe" name="submitIframe" scrolling="no" onload="readability.removeFrame()"></iframe>';

	    document.body.appendChild(submitContainer);
	    
		/* Dynamically create a form to be POSTed to the iframe */
		var formHtml =  '<form id="submitForm" target="submitIframe" method="post" action="' + readability.sendArticleUrl + '">\
		                     <input type="hidden" name="contents" id="contents" value="' + encodeURIComponent(readability.grabArticle().innerHTML) + '" />\
						     <input type="hidden" name="title" id="title" value="' + encodeURIComponent(readability.getArticleTitle().innerHTML) + '" />\
						     <input type="hidden" name="url" id="url" value="' + encodeURIComponent(window.location.toString()) + '" />\
                         </form>';

		submitContainer.innerHTML += formHtml;
		document.forms['submitForm'].submit();
	},
	
	/**
	 * Close the iframe. This is a hacktackular way to check if we're in a "close loop".
	 * Since we don't have crossdomain access to the frame, we can only know when it has
	 * loaded again. If it's loaded over 2 times, we know to close the frame.
	 *
	 * @return void
	 **/
	removeFrame: function () {
	    readability.iframeLoads++;
	    if (readability.iframeLoads > 2)
	    {

	        var submitContainer = document.getElementById('submit-container');
	        if (null !== submitContainer) {
	            submitContainer.parentNode.removeChild(submitContainer);
	        }

	        readability.iframeLoads = 0;
	    }			
	}
	
	
};
readability.sendArticleContentsToServer();