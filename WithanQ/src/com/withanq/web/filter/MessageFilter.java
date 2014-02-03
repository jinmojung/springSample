package com.withanq.web.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.withanq.web.conf.Conf;

import kr.co.mnbiz.api.message.Message;
import kr.co.mnbiz.api.message.MessageManager;

public class MessageFilter implements Filter{
	
	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,FilterChain chain) throws IOException, ServletException {
		String lang = "";
		String loginUserAccepLanguage = getLoginUserAccepLanguage();
		if(loginUserAccepLanguage == null){
			String header = ((HttpServletRequest)req).getHeader("Accept-Language");
			String headerLang = getAccepLanguageFromHeader(header);
			if(headerLang == null){
				lang = Conf.DEFAULT_LANG;
			}
		}
		Map<String, Object> i18nMap = new HashMap<String, Object>();
		putMessageManager(i18nMap,lang);
		i18nMap.put("lang", lang);
		I18n.getI18nMap().set(i18nMap);
		chain.doFilter(req, resp);
		I18n.getI18nMap().remove();
		
		
	}
	
	private String getLoginUserAccepLanguage() {
		return null;
	}

	private String getAccepLanguageFromHeader(String header) {
		return null;
	}

	private void putMessageManager(Map<String, Object> i18nMap, String lang) {
		if(lang.equals(Conf.LANG_KO)){
			i18nMap.put("messageManager", Message.KO);
		}else if(lang.equals(Conf.LANG_EN)){
			i18nMap.put("messageManager", Message.EN);
		}else if(lang.equals(Conf.LANG_JA)){
			i18nMap.put("messageManager", Message.JA);
		}else{
			i18nMap.put("messageManager", Message.KO);
		}
	}



	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}
	
	public static class I18n{
		private static ThreadLocal<Map<String, Object>> i18nMap = new ThreadLocal<Map<String, Object>>();

		public static ThreadLocal<Map<String, Object>> getI18nMap() {
			return i18nMap;
		}

		public static void setI18nMap(ThreadLocal<Map<String, Object>> i18nMap) {
			I18n.i18nMap = i18nMap;
		}

		public static String format(String id, Object... datum) {
			return ((MessageManager) i18nMap.get().get("messageManager")).format(id,datum);
		}

		public static String get(String string) {
			return ((MessageManager) i18nMap.get().get("messageManager")).get(string);
		}
		
		public static String getLang() {
			return (String) i18nMap.get().get("lang");
		}
		
	}
	
}
