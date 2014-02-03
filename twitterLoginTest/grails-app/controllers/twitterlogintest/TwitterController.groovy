package twitterlogintest

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
class TwitterController {

    def signin() { 
		Twitter twitter = new TwitterFactory().getInstance();
		request.getSession().setAttribute("twitter", twitter);
		try {
			String callbackURL = "http://127.0.0.1:8080/twitterLoginTest/twitter/callback";
			//Consumer키,시크릿키
			twitter.setOAuthConsumer("oAjygSlPTmDsfz05NufVg", "0Dps53R1pgwwiQBgcDAIzvdLjBq1sCIiPbwZCYHELE");
			RequestToken requestToken = twitter.getOAuthRequestToken(callbackURL.toString());
			request.getSession().setAttribute("requestToken", requestToken);
			response.sendRedirect(requestToken.getAuthenticationURL());

		} catch (TwitterException e) {
			e.printStackTrace();
			render '에러';
		}
	}
	
	def callback() {
		Twitter twitter = (Twitter) request.getSession().getAttribute("twitter");
        RequestToken requestToken = (RequestToken) request.getSession().getAttribute("requestToken");
        String verifier = request.getParameter("oauth_verifier");
        try {
            AccessToken getOAuthAccessToken = twitter.getOAuthAccessToken(requestToken, verifier);
			Long userId = getOAuthAccessToken.getUserId();
			String token = getOAuthAccessToken.getToken();
			System.out.println("userId: " + userId);
			System.out.println("token: " + token);
			
			/*
			 * 
			 * if(denied != null){
			 * 어플리케이션 acess설정 왜하는지 설득페이지
			 * 
			 * if(userId가 디비에 있으면 ){
				response.sendRedirect(첫화면);
			  else if(userId가 디비에 없으면 ){
			    response.sendRedirect(회원가입);
			}*/
            request.getSession().removeAttribute("requestToken");
			render '성공';
        } catch (TwitterException e) {
            e.printStackTrace();
			render '에러';
        }
	}
	def logout() {
		request.getSession().invalidate();
        response.sendRedirect(request.getContextPath()+ "/logout");
	}
}
