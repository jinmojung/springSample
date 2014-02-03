<%@page import="com.withanq.web.conf.Conf"%>
<%@ page contentType="text/html; charset=utf-8"%>
<jsp:directive.include file="/WEB-INF/views/include/taglibs.jsp"/>
<html>
<head>
<title>index</title>
</head>
<body>
<a href='<c:url value="/test/messageTest"/>'>messageTest</a>
<br>
<a href='<c:url value="/test/webEditor"/>'>webEditor</a>
<br>
<a href='<c:url value="/test/exceptionTest"/>'>exceptionTest</a>
<br>
<a href='<c:url value="/test/dynamicUiTest"/>'>dynamicUiTest</a>
<br>
<a href='<c:url value="/test/readabilityTest"/>'>readabilityTest</a>
<br>
<a href='<c:url value="/test/movScreenShotTest?movName=test1.mov"/>'>movScreenShotTest</a>
<br>
<a href='<c:url value="/test/emojiTest"/>'>emojiTest</a>
<br>
</body>
</html>
