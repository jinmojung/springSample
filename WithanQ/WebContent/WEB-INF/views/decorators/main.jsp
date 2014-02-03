<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.withanq.web.filter.MessageFilter.I18n"%>
<%@ page import="com.withanq.web.conf.Conf"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix ="i18n" tagdir="/WEB-INF/tags/i18n" %>
<html>
<head>
<title><decorator:title default="WithanQ"/></title>
<script type="text/javascript" src="<%= request.getContextPath()%>/js/message/ln_<%= I18n.getLang()%>.js"></script>
<script type="text/javascript">
	var baseHref = '<%=Conf.BASE_HREF%>';
</script>
<decorator:head/>
</head>
<body>
top
<br>
<decorator:body/>
<br>
bottom
</body>
</html>