var dbg = function(s) {
	if (typeof console !== 'undefined')
		console.log("dynamicUi: " + s);
};

var dynamicUi = {
	version : '0.0.1',
	maxColumn : 10,
	minColumn : 3,
	currentColumnCnt : -1,
	contentWidth : 300,
	contentAndMarginWidth : 324,
	contentMarginTop : 10,
	isMakingContent : false,
	columnTotalHeightArray : [],
	contentData: [],
	lastMsSeq: "",
	contentDiv: null,
	containerDiv: null,
	nextPageScrollRatio: 0.20,

	
	/**
	 * Get the content title as an H1. Currently just uses document.title, we
	 * might want to be smarter in the future.
	 * 
	 * @return void
	 */
	init : function(containerDiv) {
		dynamicUi.createContentDiv();
		dynamicUi.containerDiv = containerDiv;
		dynamicUi.isChangedColumnNumber();
		dynamicUi.getContentData(dynamicUi.lastMsSeq);
	},

	/**
	 * Get the content title as an H1. Currently just uses document.title, we
	 * might want to be smarter in the future.
	 * 
	 * @return void
	 */
	isChangedColumnNumber : function() {
		var result = false;
		var windowWidth = $(window).width();
		var columnCnt = Math.floor(windowWidth / dynamicUi.contentAndMarginWidth);
		if (columnCnt > dynamicUi.maxColumn) {
			columnCnt = dynamicUi.maxColumn;
		} else if (columnCnt < dynamicUi.minColumn) {
			columnCnt = dynamicUi.minColumn;
		}
		if (dynamicUi.currentColumnCnt !== columnCnt) {
			result = true;
			dynamicUi.currentColumnCnt = columnCnt;
		}
		return result;
	},
	
	/**
	 * Get the content title as an H1. Currently just uses document.title, we
	 * might want to be smarter in the future.
	 * 
	 * @return void
	 */
	isNextPage : function() {
		var result = false;
		var htmlHeight = $(document).height() - $(window).height();
		var scrollTop = $(window).scrollTop();
		var bottomHeight = htmlHeight - scrollTop;
		var topHeight = htmlHeight - bottomHeight;
		dbg(bottomHeight / topHeight)
		if(bottomHeight / topHeight < dynamicUi.nextPageScrollRatio){
			result = true;
		}
		return result;
	},

	/**
	 * Get the content title as an H1. Currently just uses document.title, we
	 * might want to be smarter in the future.
	 * 
	 * @return void
	 */
	reDisplayContents : function() {
		dynamicUi.isMakingContent = true;
		dynamicUi.containerDiv.empty();
		dynamicUi.columnTotalHeightArray = [];
		dynamicUi.attachDivsbyData(dynamicUi.contentData);
		dynamicUi.isMakingContent = false;
	},


	/**
	 * Get the content title as an H1. Currently just uses document.title, we
	 * might want to be smarter in the future.
	 * 
	 * @return void
	 */
	getContentData : function(lastMsSeq) {
		dbg("getContentData start: ");
		dynamicUi.isMakingContent = true;
		$.getJSON("thanksApi/MsEntireMessageList", {
			last_ms_seq : lastMsSeq
		}).done(function(json) {
			dynamicUi.setContentData(json);
			dynamicUi.attachDivsbyData(json.messages.message);
			dynamicUi.isMakingContent = false;
			dbg("getContentData end: ");
		}).fail(function(jqxhr, textStatus, error) {
			dynamicUi.isMakingContent = false;
			var err = textStatus + ", " + error;
			dbg("Request Failed: " + err);
		});
	},
	
	/**
	 * Get the content title as an H1. Currently just uses document.title, we
	 * might want to be smarter in the future.
	 * 
	 * @return void
	 */
	setContentData : function(json) {
		$.merge(dynamicUi.contentData,json.messages.message);
		dynamicUi.lastMsSeq = dynamicUi.contentData[dynamicUi.contentData.length - 1].ms_seq;
	},
	

	/**
	 * Get the content title as an H1. Currently just uses document.title, we
	 * might want to be smarter in the future.
	 * 
	 * @return void
	 */
	createContentDiv : function() {
		var divTop = $('<div class="item " style="top: 0px; left: 0px; visibility: visible;">');
		var divLayout = $('<div data-component-type="0" class="lite PinBase Pin Module summary" style="width: 300px;">');
		var pinHolder = $('<div class="pinHolder"><img class="pinImg fullBleed loaded fade"/></div>');
		var pinMeta = $('<div class="pinMeta "><p class="pinDescription"></p></div>');
		var pinCredits = $('<div class="pinCredits"><a href="/clt518/kitchens/" class="creditItem"> <img src="http://media-cache-ec0.pinimg.com/avatars/clt518_1377048098_30.jpg" class="creditImg" style=""> <span class="creditName"></span></a></div>"');
		divLayout.append(pinHolder)
		divLayout.append(pinMeta)
		divLayout.append(pinCredits)
		divTop.append(divLayout)
		dynamicUi.contentDiv = divTop;
	},
	
	/**
	 * Get the content title as an H1. Currently just uses document.title, we
	 * might want to be smarter in the future.
	 * 
	 * @return void
	 */
	attachDivsbyData : function(data) {
		var i;
		var j;
		var itemImage;
		var itemWidth;
		var itemHeight;
		var contentData = data;
		var shortHeightColumnPosition = 0;
		var contentMarginTop = dynamicUi.contentMarginTop;
		var contentAndMarginWidth = dynamicUi.contentAndMarginWidth;
		var columnTotalHeightArray = dynamicUi.columnTotalHeightArray;
		var currentColumnCnt = dynamicUi.currentColumnCnt;
		var containerDiv = dynamicUi.containerDiv;
		var contentDiv = dynamicUi.contentDiv;
		var contentDataLength = contentData.length;
		for(i = 0;i < contentDataLength;i++){
			if(contentData[i].ms_type == "image"){
				
			}
			for(j = 0;j < currentColumnCnt;j++){
				if(typeof columnTotalHeightArray[j] == "undefined"){
					columnTotalHeightArray[j] = 0;
				}
				if(columnTotalHeightArray[shortHeightColumnPosition] > columnTotalHeightArray[j]){
					shortHeightColumnPosition = j;
				}
			}
			var divItem = contentDiv.clone();
			divItem.attr("id","content_"+ contentData[i].ms_seq);
			divItem.css("top",(columnTotalHeightArray[shortHeightColumnPosition])+"px");
			divItem.css("left",(shortHeightColumnPosition * contentAndMarginWidth)+"px");
			containerDiv.append(divItem);
			
			if(contentData[i].ms_type == "image"){
				itemImage = contentData[i].image.images.image[0].scale.pop();
				contentData[i].image.images.image[0].scale.push(itemImage);
				itemWidth = itemImage.width;
				itemHeight = itemImage.height;
				if(itemWidth < dynamicUi.contentWidth){
					itemHeight = (dynamicUi.contentWidth / itemWidth) * itemHeight;
					itemWidth = dynamicUi.contentWidth;
				}
				if(typeof contentData[i].image.cont == "undefined"){
					divItem.find(".pinMeta").remove();
				}else{
					divItem.find(".pinDescription").text(contentData[i].image.cont);
				}
				divItem.find(".pinHolder img").attr("src",itemImage.url);
				divItem.find(".pinHolder img").css("width",itemWidth+"px");
				divItem.find(".pinHolder img").css("height",itemHeight+"px");
			}else if(contentData[i].ms_type == "text"){
				divItem.find(".pinHolder").remove();
				divItem.find(".pinDescription").text(contentData[i].text.cont);
				
			}
			divItem.find(".creditName").text(contentData[i].writer.user_name);
			columnTotalHeightArray[shortHeightColumnPosition] = columnTotalHeightArray[shortHeightColumnPosition] + divItem.height() + contentMarginTop;
		}
	},

	aa : function() {
	}

};
