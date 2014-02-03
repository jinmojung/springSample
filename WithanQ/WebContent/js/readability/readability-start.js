
var linkStringStart = "javascript:(function(){";
var linkStringEndJavascript   = "_readability_script=document.createElement('SCRIPT');_readability_script.type='text/javascript';_readability_script.src='" + baseHref + "/js/readability/readability-javascript.js?x='+(Math.random());document.getElementsByTagName('head')[0].appendChild(_readability_script);})();";
var linkStringEndJava   = "_readability_script=document.createElement('SCRIPT');_readability_script.type='text/javascript';_readability_script.src='" + baseHref + "/js/readability/readability-java.js?x='+(Math.random());document.getElementsByTagName('head')[0].appendChild(_readability_script);})();";

$(document).ready(function() {
	$("#bookmarkletLinkJavascript").attr("href", linkStringStart + linkStringEndJavascript);
	
	$("#bookmarkletLinkJavascript").bind("click", function(){
		if($.browser.msie){
			alert("To start using Readability, right-click and select 'Add To Favorites...' to save this link to your browser's bookmarks toolbar.");
		}
		else {
			alert("To start using Readability, drag this link to your browser's bookmarks toolbar.");
		}
		return false;
	});
	
	$("#bookmarkletLinkJava").attr("href", linkStringStart + linkStringEndJava);
	
	$("#bookmarkletLinkJava").bind("click", function(){
		if($.browser.msie){
			alert("To start using Readability, right-click and select 'Add To Favorites...' to save this link to your browser's bookmarks toolbar.");
		}
		else {
			alert("To start using Readability, drag this link to your browser's bookmarks toolbar.");
		}
		return false;
	});
});

