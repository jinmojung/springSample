<%@ page contentType="text/html; charset=utf-8"%>
<jsp:directive.include file="/WEB-INF/views/include/taglibs.jsp"/>
<html>
<head>
<title>Readability test</title>
<script type="text/javascript" src='<c:url value="/js/common/jquery-2.0.3.js"/>'></script>
<script type="text/javascript" src='<c:url value="/js/readability/readability-start.js"/>'></script>
</head>
<body>
	<div id="readHiddenContent">
    	<h1>Readability test</h1>
        <p>아래의 버튼 클릭후 알럿창을 따라하세요</p>
    </div>
	<div>
    	<h1>방금전 리딩 내용 확인</h1>
        <p id="howToshowArticle">/test/showArticle 에서 방금전 리딩 내용 확인</p>
    </div>
	<div id="bookmarkletJavascript">
		<a id="bookmarkletLinkJavascript">bookmarkletJavascript</a>
	</div>
	<div id="bookmarkletJava">
		<a id="bookmarkletLinkJava">bookmarkletJava</a>
	</div>
</body>
</html>