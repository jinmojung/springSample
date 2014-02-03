<%@tag import="java.io.StringWriter"%>
<%@tag import="com.withanq.web.filter.MessageFilter.I18n"%>
<%@ attribute name ="val" required="true" type="java.lang.String"%>
<%
	StringBuffer result = new StringBuffer();
	int index = val.indexOf("/img");
	if(index == 0){
		String	name = val.replace("/img", "");
		System.out.println(name);
		result.append(request.getContextPath()).append("/img/").append(I18n.getLang()).append(name);
	}else{
		result.append(request.getContextPath()).append(val);
	}
	
%>
<%= result.toString().trim()%>
