package com.withanq.web.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.withanq.web.conf.Conf;
import com.withanq.web.filter.MessageFilter.I18n;
import com.withanq.web.model.Reader;
import com.withanq.web.util.MovScreenShot;
import com.withanq.web.util.Readability;


@Controller
@SessionAttributes("reader")
public class TestController extends BaseController{
	
	public static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	
	@RequestMapping(value = "messageTest", method = RequestMethod.GET)
	public void messageTest(ModelMap model) {
		logger.debug("messageTest  " + I18n.format("202","ddddg","222"));
		model.put("message", "모델 메시지 입니다");
	}
	
	@RequestMapping(value = "webEditor", method = RequestMethod.GET)
	public void webEditor() {
	}
	@RequestMapping(value = "loginPage", method = RequestMethod.GET)
	public void loginPage() {
	}
	
	@RequestMapping(value = "exceptionTest", method = RequestMethod.GET)
	public void exceptionTest() {
		System.out.println(10 / 0);
	}
	
	@RequestMapping(value = "dynamicUiTest", method = RequestMethod.GET)
	public void dynamicUiTest() {
	}
	@RequestMapping(value = "readabilityTest", method = RequestMethod.GET)
	public void readabilityTest() {
	}
	@RequestMapping(value = "showArticle", method = RequestMethod.GET)
	public void showArticle() {
	}
	@RequestMapping(value = "emojiTest", method = RequestMethod.GET)
	public void emojiTest(ModelMap model) throws UnsupportedEncodingException {
		byte[] byteString = new byte[4];
		byteString[0] = (byte) 0xF0;
		byteString[1] = (byte)0x9F;
		byteString[2] = (byte)0x98;
		byteString[3] = (byte)0x81;
		String unicode ="\u00A9";
		
		
		String byteStringTest  = new String(byteString,"UTF-8");
		model.put("unicode", unicode);
		model.put("byteStringTest", byteStringTest);
	}
	
	@RequestMapping(value = "getArticleJavascript", method = RequestMethod.POST)
	public void getArticleJavascript(@RequestParam(value = "contents", required = true) String contents,
			@RequestParam(value = "title", required = true) String title,
			@RequestParam(value = "url", required = true) String url,ModelMap model) throws UnsupportedEncodingException {
		contents = java.net.URLDecoder.decode(contents,"UTF-8");
		title = java.net.URLDecoder.decode(title,"UTF-8");
		url = java.net.URLDecoder.decode(url,"UTF-8");
		logger.debug("contents  " + contents);;
		logger.debug("title  " + title);
		logger.debug("url  " + url);

		Reader reader = new Reader();
		reader.setContents(contents);
		reader.setTitle(title);
		reader.setUrl(url);
		reader.setCreateDate(new Date());
		reader.setSource("javascript");
		model.addAttribute("reader", reader);
		
	}
	
	@RequestMapping(value = "getArticleJava", method = RequestMethod.POST)
	public void getArticleJava(@RequestParam(value = "url", required = true) String url,ModelMap model) throws IOException{
		url = java.net.URLDecoder.decode(url,"UTF-8");
		logger.debug("url  " + url);
		Readability readablity = new Readability();
		readablity.setTargetUrl(url);
		String contents = readablity.getContents();
		String title = readablity.getArticleTitle();
		Reader reader = new Reader();
		reader.setContents(contents);
		reader.setTitle(title);
		reader.setUrl(url);
		reader.setCreateDate(new Date());
		reader.setSource("java");
		model.addAttribute("reader", reader);
		
	}
	
	@RequestMapping(value = "movScreenShotTest", method = RequestMethod.GET)
	public void movScreenShotTest(@RequestParam(value = "movName", required = true) String movName,ModelMap model){
		String movPath = Conf.Path.MOV_ROOT+movName;
		logger.debug("movPath  " + movPath);
		MovScreenShot movScreenShot = new MovScreenShot(movPath);
		model.put("movPath", movPath);
		model.put("fileName", movScreenShot.getFileName());
	}
	
}

