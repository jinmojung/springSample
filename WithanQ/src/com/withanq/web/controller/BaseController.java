package com.withanq.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

public class BaseController {
	public static Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	
	@ExceptionHandler(NoSuchRequestHandlingMethodException.class)
	public ModelAndView NoSuchRequestHandlingMethodException(Exception e) {
		logger.debug("NoSuchRequestHandlingMethodException  ");
		e.printStackTrace();
		return new ModelAndView("error/404").addObject("msg", e.getMessage()).addObject("className", e.getClass().toString());
	}
	@ExceptionHandler
    public ModelAndView exceptionHandler(Exception e) {
		logger.debug("exceptionHandler  ");
		e.printStackTrace();
        return new ModelAndView("error/500").addObject("msg", e.getMessage()).addObject("className", e.getClass().toString());
    }
	
	
}

