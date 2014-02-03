package twitterlogintest

import facebook4j.Facebook
import facebook4j.FacebookException
import facebook4j.FacebookFactory
import facebook4j.Friendlist;
import facebook4j.Permission;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

import javax.servlet.ServletException


class FacebookController {

    def signin() { 
		Facebook facebook = new FacebookFactory().getInstance();
		//api 키, 시크릿키
		facebook.setOAuthAppId("359078210895233", "24edbe64f7eb3d2b591e313024383f16");
		facebook.setOAuthPermissions("publish_actions,email,user_birthday,user_checkins,user_education_history,read_friendlists,manage_friendlists")
        request.getSession().setAttribute("facebook", facebook);
        String callbackURL = "http://localhost:8080/twitterLoginTest/facebook/callback";
        response.sendRedirect(facebook.getOAuthAuthorizationURL(callbackURL.toString()));
	}
	
	def callback() {
		Facebook facebook = (Facebook) request.getSession().getAttribute("facebook");
		String oauthCode = request.getParameter("code");
		try {
			AccessToken getOAuthAccessToken = facebook.getOAuthAccessToken(oauthCode);
			System.out.println("token: " + getOAuthAccessToken.getToken());
			System.out.println("id : " + facebook.getId());
			List<Permission> getPermissions = facebook.getPermissions();
			for(Permission permission :getPermissions){
				System.out.println("permission : " + permission.getName());
			}
			int i = 0
			
			for(Friendlist friendlist :facebook.getFriendlists()){
				System.out.println("friendlist : " + friendlist.toString());
				for(def friend :facebook.getFriendlistMembers(friendlist.getId())){
					System.out.println("friend : " + friend.toString());
					i++
				}
			}
			
			
			System.out.println("i : " + i);
			//System.out.println("addFriendlistMember : " + facebook.addFriendlistMember("509616672442551", "100000545710133"));
			//facebook.postStatusMessage("Hello World from Facebook4J.");
			/*
			 * facebook에는 permission 수락안하는게 없고 건너뜀
			 * 수락안되면 받아온 permission에 없음
			 * if(id가 디비에 있으면 ){
				response.sendRedirect(첫화면);
			  else if(id가 디비에 없으면 ){
				response.sendRedirect(회원가입);
			}*/
		} catch (FacebookException e) {
			throw new ServletException(e);
		}
		render '성공';
	}
	def logout() {
		request.getSession().invalidate();
		response.sendRedirect(request.getContextPath()+ "/logout");
	}
}
