package com.withanq.web.servlet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.PropertyConfigurator;

import com.withanq.web.conf.Conf;

@SuppressWarnings("serial")
public class InitServlet  extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(Conf.Path.LOG_PROPERTY));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    PropertyConfigurator.configure(p);
		super.init();
	}
	
	
}
