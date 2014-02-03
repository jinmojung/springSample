<%@ page contentType="text/html; charset=utf-8"%>
<jsp:directive.include file="/WEB-INF/views/include/taglibs.jsp"/>
<html>
<head>
<title>messageTest</title>
</head>
<body>
<script type="text/javascript">
alert(ln.format("202",ln.get("hello"),"hello"));
</script>
<i18n:msg id="202">
	<i18n:id>hello</i18n:id>
	<i18n:val>hello</i18n:val>
</i18n:msg>
테스트임
${message }
</body>
</html>