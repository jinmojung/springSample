<!DOCTYPE html>
<!--[if IE 7 ]><html lang="en" class="ie7 ielt9 ielt10 en"><![endif]-->
<!--[if IE 8 ]><html lang="en" class="ie8 ielt9 ielt10 en"><![endif]-->
<!--[if IE 9 ]><html lang="en" class="ie9 ielt10 en"><![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--><html><!--<![endif]-->
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="http://passets-ec.pinterest.com/webapp/style/app/common/bundle.0ba4f652.css">
     <link rel="stylesheet" href="http://passets-ak.pinterest.com/webapp/style/app/desktop/bundle.2b224ed5.css">
     <g:javascript src="jquery-2.0.3.min.js"/>
     <g:javascript src="dynamicUi.js"/>
    <title>Pinterest</title>
    <script type="text/javascript">
    $(window).load(function() {
    	dynamicUi.init($("#container"));
    	$(window).scroll(function() {
    		if(!dynamicUi.isMakingContent){
	        	var isNextPage = dynamicUi.isNextPage();
	        	if(isNextPage){
	        		dynamicUi.getContentData(dynamicUi.lastMsSeq);
	            }
    		}

    	});	
    	$(window).resize(function() {
        	if(!dynamicUi.isMakingContent){
        		var isChangedColumnNumber = dynamicUi.isChangedColumnNumber();
        		if(isChangedColumnNumber){
        			dynamicUi.reDisplayContents();
            	}
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