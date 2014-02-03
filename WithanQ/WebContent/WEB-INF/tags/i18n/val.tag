<%@ tag language="java" pageEncoding="UTF-8"%>
<%
	getJspContext().getOut().print("val=");
	getJspBody().invoke(null);
	getJspContext().getOut().print(",");
%>
