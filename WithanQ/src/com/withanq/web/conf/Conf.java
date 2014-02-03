package com.withanq.web.conf;

import java.net.InetAddress;
import java.net.UnknownHostException;
import kr.co.mnbiz.api.message.Message;

public class Conf {
	private static enum OS{
		WINDOWS,
		LINUX
	}
	public static class Environment{
		private static final OS os = System.getProperty("os.name").contains("indows")?OS.WINDOWS:OS.LINUX;
		private static String ADDRESS;
		static{
	        try
	        {
	            InetAddress addr = InetAddress.getLocalHost();
	            ADDRESS = addr.getHostAddress();
	            System.out.println("InetAddress.getLocalHost() = " + ADDRESS);
	        }catch(UnknownHostException e){
	        	e.printStackTrace();
	        	ADDRESS = "";
	        }
		}
	}
	private static enum Mode{
		DEV,
		TEST,
		REAL
	}
	private static final Mode mode;


	static {
		if (Environment.os == OS.WINDOWS) {
			mode = Mode.DEV;
		}else{
			if (Environment.ADDRESS.startsWith("192.168.0") || Environment.ADDRESS.equals("1.234.245.22")|| Environment.ADDRESS.equals("127.0.1.1")) {
				mode = Mode.TEST;
			}else{
				mode = Mode.REAL;
			}
		}
	}
	
	private static <T> T conf(T... arg){
		switch (mode) {
		case DEV:
			return arg[0];
		case TEST:
			return arg.length > 1 && arg[1] != null ?arg[1]:arg[0];
		case REAL:
			return arg.length > 2 && arg[2] != null ? arg[2]:( arg.length > 1 && arg[1] != null ?arg[1]:arg[0]);
		default:
			throw new IllegalStateException("unknown mode");
		}
	}
	
	public static String URL_PREFIX = conf("http://127.0.0.1", "http://withanqwww.s-onair.com" , "http://www.withanq.com");
	public static String BASE_HREF = conf("http://localhost", "http://withanqwww.s-onair.com" , "http://www.withanq.com");
	
	
	public static String PATH_PREFIX = conf("C:\\test", "/test");
	
	public static Integer DISK_FILE_ITEM_SIZE_THRESHOLD = conf(1);
	
	public static String API_HOST = conf("http://thanks_proto_kr.s-onair.com:10080");
	
	public static String LANG_KO = conf("ko");
	public static String LANG_EN = conf("en");
	public static String LANG_JA = conf("jp");
	public static String DEFAULT_LANG = conf("ko");
	
	public static void main(String[] args) {
		System.out.println(URL_PREFIX);
		System.out.println(PATH_PREFIX);
		System.out.println("dd22" + Message.EN.format("221","sdf"));
	}
	
	
	public static class Path{
		public static String MOV_ROOT = conf("D:\\mov\\", "/tomcats/1005/mov/" , "/home/min/mov/");
		private static String WEBAPP_ROOT = conf("D:\\springsource\\workspace\\WithanQ", "/tomcats/1005/webapps/ROOT" , "/home/min/tomcat7/webapps/ROOT");
		public static String LOG_PROPERTY = WEBAPP_ROOT + conf("\\WebContent\\WEB-INF\\config\\log4j_dev.properties", "/WEB-INF/config/log4j_test.properties" , "/WEB-INF/config/log4j_real.properties");
		public static String UPLOAD_IMAGE = WEBAPP_ROOT + conf("\\WebContent\\img\\upload\\", "/img/upload/" , "/img/upload/");
		
	
	}
	
	
}
