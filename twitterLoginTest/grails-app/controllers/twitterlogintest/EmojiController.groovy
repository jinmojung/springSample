package twitterlogintest

import facebook4j.Facebook
import facebook4j.FacebookException
import facebook4j.FacebookFactory
import facebook4j.Friendlist;
import facebook4j.Permission;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

import javax.servlet.ServletException


class EmojiController {

    def index() { 
		println params
		byte[] test = new byte[4];
		test[0] = 0xF0
		test[1] = 0x9F
		test[2] = 0x98
		test[3] = 0x81
		String aa ="\u00A9"
		
		
		String str  = new String(test,"UTF-8");
		[test:aa]
	}

	
}