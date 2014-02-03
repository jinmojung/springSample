<%@tag import="java.io.StringWriter"%>
<%@tag import="java.util.ArrayList"%>
<%@tag import="java.util.List"%>
<%@tag import="com.withanq.web.filter.MessageFilter.I18n"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name ="id" required="true" type="java.lang.String"%>
<%
	String result = "";
	StringWriter stringWriter = new StringWriter();
	getJspBody().invoke(stringWriter);
	String bodyContent = stringWriter.getBuffer().toString().trim();
	if(bodyContent.equals("")){
		result = I18n.get(id);
	}else{
		String[] childParams = bodyContent.split(",");
		List<String> resultParams = new ArrayList<String>();
		for(String param :childParams){
			param = param.trim();
			if(param.indexOf("id") != -1){
				resultParams.add(I18n.get(param.replace("id=", "")));
			}else if(param.indexOf("val") != -1){
				resultParams.add(param.replace("val=", ""));
			}
		}
		result = I18n.format(id,resultParams.toArray());
	}

%>
<%= result%>