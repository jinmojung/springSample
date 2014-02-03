package com.withanq.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.PortableInterceptor.Interceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("LoginCheckInterceptor");
		if(!isLogin()){
			((HttpServletResponse)response).sendRedirect("/test/loginPage");
		}
		return true;
	}

	private boolean isLogin() {
		return true;
	}

}
