<%@ tag language="java" pageEncoding="UTF-8"%>
<%
	getJspContext().getOut().print("id=");
	getJspBody().invoke(null);
	getJspContext().getOut().print(",");
%>
