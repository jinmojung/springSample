<%@ page contentType="text/html; charset=utf-8"%>
<jsp:directive.include file="/WEB-INF/views/include/taglibs.jsp"/>
<head>
    <link rel="stylesheet" href="http://passets-ec.pinterest.com/webapp/style/app/common/bundle.0ba4f652.css">
    <link rel="stylesheet" href="http://passets-ak.pinterest.com/webapp/style/app/desktop/bundle.2b224ed5.css">
    <script type="text/javascript" src='<c:url value="/js/common/jquery-2.0.3.js"/>'></script>
	<script type="text/javascript" src='<c:url value="/js/common/dynamicUi.js"/>'></script>
    <title>dynamicUiTest</title>
    <script type="text/javascript">
    $(window).load(function() {
    	dynamicUi.init($("#container"));
    	$(window).scroll(function() {
    		var isNextPage = dynamicUi.isNextPage();
        	if(isNextPage){
	        	dynamicUi.getContentData(dynamicUi.lastMsSeq);
        	}
    	});	
    	$(window).resize(function() {
       		var isChangedColumnNumber = dynamicUi.isChangedColumnNumber();
       		if(isChangedColumnNumber){
       			dynamicUi.reDisplayContents();
           	}
    	});
	});
    </script>
</head>
    <body style="">
    <div class="App full Module">    
        <div class="Header Module">
        <div class="hasFooter Grid Module">
        <div id="container" class="variableHeightLayout padItems GridItems Module centeredWithinWrapper" style="height: 1400px;">
</div>        
</div>
</div>
</div>
</body>
</html>
