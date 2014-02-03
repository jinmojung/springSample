package com.withanq.web.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.withanq.cont.type.ContType;
import com.withanq.cont.type.Data;
import com.withanq.cont.type.Image;
import com.withanq.cont.type.Text;

public class Readability {
	
	public static Logger logger = LoggerFactory.getLogger(Readability.class);
	
	private static Map<String, String> regexps = new HashMap<String, String>();
	static{
		regexps.put("unlikelyCandidatesRe", "(?i)(?:\b|_)(?:combx|comment|disqus|foot|header|menu|meta|nav|rss|shoutbox|sidebar|sponsor)(?![a-z])");
		regexps.put("okMaybeItsACandidateRe", "(?i)and|article|body|column|main");
		regexps.put("positiveRe", "(?i)article|body|content|entry|hentry|page|pagination|post|text");
		regexps.put("negativeRe", "(?i)combx|comment|contact|foot|footer|footnote|link|media|meta|promo|related|scroll|shoutbox|sponsor|tags|widget");
		regexps.put("divToPElementsRe", "(?i)<(a|blockquote|dl|div|img|ol|p|pre|table|ul)");
		regexps.put("replaceBrsRe", "(?i)(<br[^>]*>[ \n\r\t]*){2,}");
		regexps.put("replaceFontsRe", "(?i)<(\\/?)font[^>]*>");
		regexps.put("trimRe", "^\\s+|\\s+$");
		regexps.put("normalizeRe", "\\s{2,}");
		regexps.put("killBreaksRe", "(<br\\s*\\/?>(\\s|&nbsp;?)*){1,}");
		regexps.put("videoRe", "(?i)http:\\/\\/(www\\.)?(youtube|vimeo)\\.com");
		regexps.put("javascriptTagRe", "(?i)<\\s*script\\s*\\b[^<]*(?:(?!<\\s*\\/\\s*script\\s*[^>]*>)<[^<]*)*<\\s*\\/\\s*script\\s*[^>]*>");
		regexps.put("styleTagRe", "(?i)<\\s*style\\s*\\b[^<]*(?:(?!<\\s*\\/\\s*style\\s*[^>]*>)<[^<]*)*<\\s*\\/\\s*style\\s*[^>]*>");
		regexps.put("conmmentTagRe", "(?i)<!--[^>]*>");
		regexps.put("tagRe", "(?i)<(\\/?)([a-z]+)[^>]*>");
		regexps.put("srcTagRe", "(?i)src\\s*=\\s*['\"]([^'\"]+)['\"]");
		regexps.put("heightTagRe", "(?i)height\\s*=\\s*['\"]([^'\"]+)['\"]");
		regexps.put("widthTagRe", "(?i)width\\s*=\\s*['\"]([^'\"]+)['\"]");
	}
	
	private static List<String> replaceFromTagReList = Arrays.asList("(?i)<(\\/?)strong[^>]*>","(?i)<(\\/?)em[^>]*>","(?i)<(\\/?)li[^>]*>");
	private static List<String> replaceToTagList = Arrays.asList("b","i","p");
	private static List<String> notRemoveTagList = Arrays.asList("p","img","b","i");
	private Document contents;
	private static int maxImgSize = 50;
	
	private String targetUrl;
	
	//millis
	private static int timeout = 5000;
	
	public Readability(){
		super();
	}
	
	public void setTargetUrl(String targetUrl) throws IOException {
		this.targetUrl = targetUrl;
		this.contents = Jsoup.connect(targetUrl).timeout(timeout).get();
	}
	
	
	private Document prepDocument(Document contents){
		String contentsHtml = contents.html();
		contents.html(contentsHtml.replaceAll(regexps.get("replaceBrsRe"), "</p><p>").replaceAll(regexps.get("replaceFontsRe"), "<$1span>"));
		return contents;
	}
	
	public String getArticleTitle(){
		if(this.contents == null){
			this.contents = new Document(targetUrl);
		}
		return contents.title();
	}
	
	public List<Data> getData(){
		List<Data> data = new ArrayList<Data>();
		Element article = getArticle();
		Elements children = article.children();
		String previousText = "";
		for(Element element:children){
			String currentTagName = element.tagName().toLowerCase();
			
			if(!currentTagName.equals("p") && !previousText.equals("")){
				data.add(new Text(previousText));
				previousText = "";
			}
			if(currentTagName.equals("img")){
				data.add(new Image(element.attr("src")));
			}else if(currentTagName.equals("p")){
				previousText = previousText + element.outerHtml();
			}
		}
		if(!previousText.equals("")){
			data.add(new Text(previousText));
		}
		return data;
	}
	
	public String  getContents(){
		return getArticle().html();
	}

	private Element getArticle(){
		if(this.contents == null){
			this.contents = new Document(targetUrl);
		}
		
		Document cloneContents = contents.clone();
		
		Document prepDocument = prepDocument(cloneContents);
		
        Pattern unlikelyCandidatesRePattern = Pattern.compile(regexps.get("unlikelyCandidatesRe")); 
        Pattern okMaybeItsACandidateRePattern = Pattern.compile(regexps.get("okMaybeItsACandidateRe")); 
        Pattern divToPElementsRePattern = Pattern.compile(regexps.get("divToPElementsRe")); 
		
		for(Element element:prepDocument.getAllElements()){
			/* Remove unlikely candidates */
			String unlikelyMatchString = element.className() + element.id();
			if (unlikelyCandidatesRePattern.matcher(unlikelyMatchString).find() == true &&
				okMaybeItsACandidateRePattern.matcher(unlikelyMatchString).find() == false &&
			    !element.tagName().toLowerCase().equals("body")){
				
				logger.debug("Removing unlikely candidate - " + unlikelyMatchString);
				try{
					element.remove();
				}catch (Exception e) {
					//div에 부모가 없을때
					e.printStackTrace();
					element.html("");
				}
			}	
			
			
			/* Turn all divs that don't have children block level elements into p's */
			if (element.tagName().toLowerCase().equals("div")) {
				if (divToPElementsRePattern.matcher(element.html()).find() == false)	{
					logger.debug("Altering div to p");
					Element newNode = cloneContents.createElement("p");
					newNode.html(element.html());
					try{
						element.after(newNode);
						element.remove();
					}catch (Exception e) {
						//div에 부모가 없을때
						e.printStackTrace();
						String html = element.html();
						element.html("<p>"+html+"</p>");
					}
					
				}else{
					/* EXPERIMENTAL */
					for(Node children: element.childNodes()){
						if (children instanceof TextNode) {
							logger.debug("replacing text node with a p tag with the same content.");
							children.wrap("<p></p>");
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
		Elements allParagraphs = prepDocument.getElementsByTag("p");
		List<Element> candidates = new ArrayList<Element>();

		for (Element paragrap:allParagraphs) {
			Element parentNode  = paragrap.parent();
			Element grandParentNode = parentNode.parent();
			String innerText  = getInnerText(paragrap,true);
			
			/* If this paragraph is less than 25 characters, don't even count it. */
			if(innerText.length() < 25)
				continue;

			/* Initialize readability data for the parent. */
			if(parentNode.attr("contentScore").equals("")){
				initializeNode(parentNode);
				candidates.add(parentNode);
			}

			/* Initialize readability data for the parent. */
			if(grandParentNode.attr("contentScore").equals("")){
				initializeNode(grandParentNode);
				candidates.add(grandParentNode);
			}
			
			
			double contentScore = 0;

			/* Add a point for the paragraph itself as a base. */
			contentScore++;

			/* Add points for any commas within this paragraph */
			String[] split = innerText.split(",");
			contentScore += (double)split.length;
			
			/* For every 100 characters in this paragraph, add another point. Up to 3 points. */
			contentScore += Math.min(Math.floor(innerText.length() / (double)100.0), (double)3.0);
			
			/* Add the score to the parent. The grandparent gets half. */
			double parentNodeContentScore = getContentScore(parentNode);
			setContentScore(parentNode,parentNodeContentScore + contentScore);
			
			double grandParentNodeContentScore = getContentScore(grandParentNode);
			setContentScore(grandParentNode,grandParentNodeContentScore + contentScore / (double)2.0);
		}
		
		/**
		 * After we've calculated scores, loop through all of the possible candidate nodes we found
		 * and find the one with the highest score.
		**/
		Element topCandidate = null;
		for(Element candidate:candidates){
			/**
			 * Scale the final candidates score based on link density. Good content should have a
			 * relatively small link density (5% or less) and be mostly unaffected by this operation.
			**/
			
			
			double candidateContentScore = getContentScore(candidate);
			setContentScore(candidate,candidateContentScore * (1 - getLinkDensity(candidate)));

			logger.debug("Candidate: " + candidate.tagName() + " (" + candidate.className() + ":" + candidate.id() + ") with score " + getContentScore(candidate));

			if(topCandidate == null || getContentScore(candidate) > getContentScore(topCandidate)){
				topCandidate = candidate;
			}
		}
		
		/**
		 * If we still have no top candidate, just use the body as a last resort.
		 * We also have to copy the body node so it is something we can modify.
		 **/
		if (topCandidate == null || topCandidate.tagName().toLowerCase().equals("body")){
			topCandidate = cloneContents.createElement("div");
			topCandidate.html(cloneContents.body().html());
			initializeNode(topCandidate);
		}
		
		
		/**
		 * Now that we have the top candidate, look through its siblings for content that might also be related.
		 * Things like preambles, content split by ads that we removed, etc.
		**/
		Element articleContent = cloneContents.createElement("div");
	    articleContent.attr("id","readability-content");
		double siblingScoreThreshold = Math.max(10.0, getContentScore(topCandidate) * 0.2);
		Elements siblingNodes = topCandidate.parent().children();
		
		for(Element siblingNode:siblingNodes){
			boolean append = false;

			logger.debug("Looking at sibling node: " + siblingNode.tagName() + " (" + siblingNode.className() + ":" + siblingNode.id() + ")");
			logger.debug("Sibling has score " + getContentScore(siblingNode));

			if(siblingNode.equals(topCandidate)){
				append = true;
			}
			
			if(siblingNode.attr("contentScore").equals("") && getContentScore(siblingNode) >= siblingScoreThreshold){
				append = true;
			}
			
			if(siblingNode.tagName().toLowerCase().equals("p")) {
				double linkDensity = getLinkDensity(siblingNode);
				String nodeContent = getInnerText(siblingNode,true);
				double nodeLength  = (double)nodeContent.length();
				
				Pattern pattern = Pattern.compile("\\.( |$)"); 
				
				if(nodeLength > 80.0 && linkDensity < 0.25){
					append = true;
				}
				else if(nodeLength < 80.0 && linkDensity == 0.0 && pattern.matcher(nodeContent).find() == true){
					append = true;
				}
			}

			if(append){
				logger.debug("Appending node: " + siblingNode.tagName());

				/* Append sibling and subtract from our list because it removes the node when you append to another node */
				
				articleContent.appendChild(siblingNode);
				
			}
		}
		
		/**
		 * So we have all of the content that we need. Now we clean it up for presentation.
		**/
		prepArticle(articleContent);
		
		String normalize = normalize(articleContent.html());
		
		articleContent.html(normalize);
		
		return articleContent;
	}
	
	private void prepArticle(Element articleContent) {
		
		cleanContentscore(articleContent);
		killBreaks(articleContent);

		/* Clean out junk from the article content */
		clean(articleContent, "form");
		clean(articleContent, "object");
		clean(articleContent, "h1");
		
		/**
		 * If there is only one h2, they are probably using it
		 * as a header and not a subheader, so remove it since we already have a header.
		***/
		if(articleContent.getElementsByTag("h2").size() == 1){
			clean(articleContent, "h2");
		}
		clean(articleContent, "iframe");

		cleanHeaders(articleContent);

		/* Do these last as the previous stuff may have removed junk that will affect these */
		cleanConditionally(articleContent, "table");
		cleanConditionally(articleContent, "ul");
		cleanConditionally(articleContent, "div");

		/* Remove extra paragraphs */
		Elements articleParagraphs = articleContent.getElementsByTag("p");
		for(Element articleParagraph:articleParagraphs){
			int imgCount    = articleParagraph.getElementsByTag("img").size();
			int embedCount  = articleParagraph.getElementsByTag("embed").size();
			int objectCount = articleParagraph.getElementsByTag("object").size();
			
			if(imgCount == 0 && embedCount == 0 && objectCount == 0 && getInnerText(articleParagraph, false).equals("")){
				try{
					articleParagraph.remove();
				}catch (Exception e) {
					//div에 부모가 없을때
					e.printStackTrace();
					articleParagraph.html("");
				}
			}
		}
		String articleContentHtml = articleContent.html();
		articleContent.html(articleContentHtml.replaceAll("(?i)<br[^>]*>\\s*<p", "<p"));
		
	}
	
	private static String normalize(String articleContent) {
		Document parsedDocument = Jsoup.parse(articleContent);
		clean(parsedDocument, "script");
		clean(parsedDocument, "style");
		
		String replaceTags = replaceTags(parsedDocument.html());
		
		String removeJavascriptTag = removeJavascriptTag(replaceTags);
		
		String removeStyleTag = removeStyleTag(removeJavascriptTag);
		
		String removeConmmentTag = removeConmmentTag(removeStyleTag);
		
		String removeTags = removeTags(removeConmmentTag);
		
		
		return removeTags;
	}
	
	private static String replaceTags(String articleContent) {
		for(int i =0;i < replaceFromTagReList.size();i++) {
			articleContent = articleContent.replaceAll(replaceFromTagReList.get(i), "<$1"+replaceToTagList.get(i)+">");
		}
		return articleContent;
	}
	
	private static String removeJavascriptTag(String articleContent) {
		articleContent = articleContent.replaceAll(regexps.get("javascriptTagRe"), "");
		return articleContent;
	}
	
	private static String removeStyleTag(String articleContent) {
		articleContent = articleContent.replaceAll(regexps.get("styleTagRe"), "");
		return articleContent;
	}
	
	private static String removeConmmentTag(String articleContent) {
		articleContent = articleContent.replaceAll(regexps.get("conmmentTagRe"), "");
		return articleContent;
	}
	
	private static String removeTags(String articleContent) {
		StringBuffer madeHtml = new StringBuffer();
		Pattern removeTagsPattern = Pattern.compile(regexps.get("tagRe")); 
		Pattern srcTagRePattern = Pattern.compile(regexps.get("srcTagRe")); 
		Pattern heightTagRePattern = Pattern.compile(regexps.get("heightTagRe")); 
		Pattern widthTagRePattern = Pattern.compile(regexps.get("widthTagRe")); 
		Matcher matcher = removeTagsPattern.matcher(articleContent);
		while (matcher.find()) {
			boolean remove = true;
			String replaceStr = "";
			for(String notRemoveTag:notRemoveTagList) {
				if(notRemoveTag.indexOf(matcher.group(2).toLowerCase()) != -1){
					remove = false;
					continue;
				}
			}
			if(remove){
				replaceStr = "";
				logger.debug("removeTags  "  + matcher.group(2));
			}else{
				if(matcher.group(2).toLowerCase().indexOf("img") != -1){
					logger.debug("not removeTags img "  + matcher.group(0));
					Matcher srcMatcher = srcTagRePattern.matcher(matcher.group(0));
					Matcher heightMatcher = heightTagRePattern.matcher(matcher.group(0));
					Matcher widthMatcher = widthTagRePattern.matcher(matcher.group(0));
					srcMatcher.find();
					
					if(matcher.group(1).equals("/")){
						replaceStr = "<" + matcher.group(1) + matcher.group(2) + ">";
					}else{
						replaceStr = "<" + matcher.group(2) + " src=\"" + srcMatcher.group(1) + "\" >";
					}
					
					
					if(heightMatcher.find()){
						String height = heightMatcher.group(1).replaceAll("[^0-9]", "");
						if(Integer.parseInt(height) < maxImgSize){
							replaceStr = "";
						}
						
					}
					
					if(widthMatcher.find()){
						String width = widthMatcher.group(1).replaceAll("[^0-9]", "");
						if(Integer.parseInt(width) < maxImgSize){
							replaceStr = "";
						}
						
					}
					
					logger.debug("not removeTags img result"  + replaceStr);
				}else{
					logger.debug("not removeTags  "  + matcher.group(1) + matcher.group(2));
					replaceStr = "<" + matcher.group(1) + matcher.group(2) + ">";
				}
			}
			matcher.appendReplacement(madeHtml, replaceStr);
		}
		
		matcher.appendTail(madeHtml);
		return madeHtml.toString();
		
	}
	
	private void removeStyle(Element articleContent) {
		/*for(Element element:articleContent.getAllElements()){
			logger.debug("remove style  "  + element.tagName());
			Element newNode = this.contents.createElement(element.tagName());
			newNode.html(element.html());
			if(element.tagName().toLowerCase().equals("img")){
				String height = element.attr("height").replaceAll("[^0-9]", "");
				String width = element.attr("width").replaceAll("[^0-9]", "");
				if(!height.equals("") && Integer.parseInt(height) < maxImgSize){
					try{
						element.remove();
					}catch (Exception e) {
						//div에 부모가 없을때
						e.printStackTrace();
						element.html("");
					}
					continue;
				}
				
				if(!width.equals("") && Integer.parseInt(width) < maxImgSize){
					try{
						element.remove();
					}catch (Exception e) {
						//div에 부모가 없을때
						e.printStackTrace();
						element.html("");
					}
					continue;
				}
				newNode.attr("src", element.attr("src"));
			}
			try{
				element.after(newNode);
				element.remove();
			}catch (Exception e) {
				//div 제일 위에껀 넘어감
				e.printStackTrace();
			}
		}*/
		
	}



	private void cleanContentscore(Element articleContent) {
		for(Element element:articleContent.getAllElements()){
			if(!element.attr("contentscore").equals("")){
				element.removeAttr("contentscore");
			}
		}
	}


	private void cleanConditionally(Element element, String tag) {
		Elements tagsList = element.getElementsByTag(tag);

		/**
		 * Gather counts for other typical elements embedded within.
		 * Traverse backwards so we can remove nodes at the same time without effecting the traversal.
		 *
		 * TODO: Consider taking into account original contentScore here.
		**/
		for (Element tags:tagsList) {
			double weight = getClassWeight(tags);

			logger.debug("Cleaning Conditionally " + tags.tagName() + " (" + tags.className() + ":" + tags.id() + ")");
			logger.debug("Cleaning has score " + getContentScore(tags));

			if(weight < 0.0){
				try{
					tags.remove();
				}catch (Exception e) {
					//div에 부모가 없을때
					e.printStackTrace();
					tags.html("");
				}
			}
			else if ( getCharCount(tags,",") < 10) {
				/**
				 * If there are not very many commas, and the number of
				 * non-paragraph elements is more than paragraphs or other ominous signs, remove the element.
				**/

				int p      = tags.getElementsByTag("p").size();
				int img    = tags.getElementsByTag("img").size();
				int li     = tags.getElementsByTag("li").size()-100;
				int input  = tags.getElementsByTag("input").size();

				int embedCount = 0;
				Elements embeds     = tags.getElementsByTag("embed");
				for(Element embed:embeds) {
					
					Pattern videoRePattern = Pattern.compile(regexps.get("videoRe")); 
					if(videoRePattern.matcher(embed.attr("src")).find() == false){
						embedCount++;	
					}
				}

				double linkDensity   = getLinkDensity(tags);
				int contentLength = getInnerText(tags,true).length();
				boolean toRemove      = false;

				if ( img > p ) {
				 	toRemove = true;
				} else if(li > p && tag != "ul" && tag != "ol") {
					toRemove = true;
				} else if( input > Math.floor(p/3) ) {
				 	toRemove = true; 
				} else if(contentLength < 25 && (img == 0 || img > 2) ) {
					toRemove = true;
				} else if(weight < 25 && linkDensity > 0.2) {
					toRemove = true;
				} else if(weight >= 25 && linkDensity > 0.5) {
					toRemove = true;
				} else if((embedCount == 1 && contentLength < 75) || embedCount > 1) {
					toRemove = true;
				}

				if(toRemove) {
					try{
						tags.remove();
					}catch (Exception e) {
						//div에 부모가 없을때
						e.printStackTrace();
						tags.html("");
					}
				}
			}
		}
		
	}


	private int getCharCount(Element element, String splitString) {
		return getInnerText(element,true).split(splitString).length;
	}


	private void cleanHeaders(Element element) {
		for (int headerIndex = 1; headerIndex < 7; headerIndex++) {
			Elements headers = element.getElementsByTag("h" + headerIndex);
			for (Element header:headers) {
				if (getClassWeight(header) < 0.0 || getLinkDensity(header) > 0.33) {
					try{
						header.remove();
					}catch (Exception e) {
						//div에 부모가 없을때
						e.printStackTrace();
						header.html("");
					}
				}
			}
		}
		
	}


	private static void clean(Element element, String tag) {
		Elements targetList = element.getElementsByTag(tag);
		
		boolean isEmbed = false;
		if(tag.toLowerCase().equals("object") || tag.toLowerCase().equals("embed")){
			isEmbed = true;
		}
		
		Pattern videoRePattern = Pattern.compile(regexps.get("videoRe")); 
		for(Element target:targetList){
			/* Allow youtube and vimeo videos through as people usually want to see those. */
			if(isEmbed && videoRePattern.matcher(target.html()).find() == true){
				continue;
			}
			
			try{
				target.remove();
			}catch (Exception e) {
				//div에 부모가 없을때
				e.printStackTrace();
				target.html("");
			}
		}
		
	}


	private void killBreaks(Element element) {
		element.html(element.html().replaceAll(regexps.get("killBreaksRe"), "<br />"));
	}



	private double getLinkDensity(Element candidate) {
		Elements links      = candidate.getElementsByTag("a");
		double textLength = getInnerText(candidate,true).length();
		double linkLength = 0.0;
		for(Element link:links){
			linkLength += getInnerText(link,true).length();
		}	
		
		return linkLength / textLength;
	}


	private void setContentScore(Element node, double contentScore) {
		node.attr("contentScore",contentScore+"");
	}


	private double getContentScore(Element node) {
		String contentScore = node.attr("contentScore");
		if(contentScore.equals("")){
			return (double)0.0;
		}else{
			return Double.parseDouble(contentScore);
		}
		
	}


	private void initializeNode(Element node) {
		double contentScore = 0.0;
		
		if(node.tagName().toLowerCase().equals("div")){
			contentScore += 5.0;
		}else if(node.tagName().toLowerCase().equals("blockquote")){
			contentScore += 3.0;
		}else if(node.tagName().toLowerCase().equals("form")){
			contentScore -= 3.0;
		}else if(node.tagName().toLowerCase().equals("th")){
			contentScore -= 5.0;
		}

		contentScore += getClassWeight(node);
		node.attr("contentScore",contentScore + "");
		
	}


	private double getClassWeight(Element node) {
		double weight = 0.0;
		
		Pattern negativeRePattern = Pattern.compile(regexps.get("negativeRe")); 
        Pattern positiveRePattern = Pattern.compile(regexps.get("positiveRe")); 

		/* Look for a special classname */
		if (!node.className().equals("")){
			if(negativeRePattern.matcher(node.className()).find() == true){
				weight -= 25.0;
			}

			if(positiveRePattern.matcher(node.className()).find() == true){
				weight += 25.0;
			}
		}

		/* Look for a special ID */
		if (!node.id().equals(""))
		{
			if(negativeRePattern.matcher(node.id()).find() == true){
				weight -= 25.0;
			}

			if(positiveRePattern.matcher(node.id()).find() == true){
				weight += 25.0;
			}
			
		}
		return weight;
	}


	private String getInnerText(Element paragrap,boolean normalizeSpaces) {
		String textContent    = "";
		textContent = paragrap.text().replaceAll(regexps.get("trimRe"), "");

		if(normalizeSpaces)
			return textContent.replace(regexps.get("normalizeRe"), " ");
		else
			return textContent;
	}



	public static void main(String[] args) throws IOException {
		 Readability readablity = new Readability();

		 readablity.setTargetUrl("http://news.chosun.com/site/data/html_dir/2014/01/10/2014011001925.html");
		 String articleTitle = readablity.getArticleTitle();
		 String getContents = readablity.getContents();
		 List<Data> dataList = readablity.getData();
		 System.out.println(getContents);
		for(Data data: dataList){
			System.out.println(data.getContType());
			if(data.getContType().equals(ContType.IMAGE)){
				System.out.println(((Image)data).getUrl());
			}else if(data.getContType().equals(ContType.TEXT)){
				System.out.println(((Text)data).getData());
			}
		}
		 /*readablity.setTargetUrl("http://edition.cnn.com/2013/12/05/world/africa/un-central-african-republic-meeting/index.html?hpt=hp_t2");
		 articleTitle = readablity.getArticleTitle();
		 contents2 = readablity.getContents();
		 
		 System.out.println(articleTitle);
		 System.out.println(contents2);*/
		 
		 
		 
		 
		 
	 }

}
