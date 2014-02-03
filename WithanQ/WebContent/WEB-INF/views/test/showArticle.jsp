<%@ page contentType="text/html; charset=utf-8"%>
<jsp:directive.include file="/WEB-INF/views/include/taglibs.jsp"/>
<html>
<head>
<title>loginPage</title>
</head>
<body>
<h1>${reader.title }</h1>
${reader.contents }
<h1>url = ${reader.url }</h1>
<h1>createDate = ${reader.createDate }</h1>
<h1>source = ${reader.source }</h1>
</body>
</html>