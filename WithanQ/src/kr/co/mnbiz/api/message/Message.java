/*
 * This code is generated!! never modify this! 
 */
package kr.co.mnbiz.api.message;

import java.util.Map;
import java.util.HashMap;
import kr.co.mnbiz.api.message.MessageManager;

public class Message{
	
	
	public static final kr.co.mnbiz.api.message.MessageManager EN = new ENClass();
	
	private static class ENClass extends kr.co.mnbiz.api.message.MessageManager implements ProjectMessage{

		private static Map<String, String> data = new HashMap<String, String>();
		static{
			
			data.put("hello", "hello");
			data.put("200", "");
			data.put("201", "");
			data.put("202", "");
			data.put("221", "{0} is required.");
			data.put("222", "{0} is not a float format");
			data.put("223", "");
			data.put("224", "");
			data.put("225", "");
			data.put("226", "");
			data.put("227", "");
			data.put("228", "");
			data.put("231", "");
			data.put("232", "");
			data.put("233", "");
			data.put("234", "");
			data.put("235", "");
			data.put("236", "");
			data.put("241", "");
			data.put("242", "");
			data.put("243", "");
			data.put("244", "");
			data.put("300", "");
			data.put("301", "");
			data.put("302", "");
			data.put("303", "");
			data.put("304", "");
			data.put("305", "");
			data.put("310", "");
			data.put("311", "");
			data.put("330", "");
			data.put("333", "");
			data.put("401", "");
			data.put("402", "");
			data.put("403", "");
			data.put("501", "");
			data.put("502", "");
			data.put("503", "");
			data.put("521", "");
			data.put("601", "");
			data.put("602", "");
			data.put("901", "");
			data.put("902", "");
			data.put("vt_ok_password_change", "");
			data.put("key", "key");
			data.put("test", "Test");
			data.put("res-type", "response type");
			data.put("program-error", "Program Error");
			data.put("status", "Status");
			data.put("login", "LOGIN");
			data.put("user_id", "User Id");
			data.put("password", "Password");
			data.put("name", "Name");
			data.put("email", "E-mail");
			data.put("description", "Description");
			data.put("desc", "Description");
			data.put("current_version", "current version");
			data.put("error", "Error");
			data.put("reg_dt", "Registered");
			data.put("ss_01_login", "");
			data.put("ss_01_thanks", "");
			data.put("ss_01_signup", "");
			data.put("ss_01_guest_mode", "");
			data.put("ss_02_thanks", "");
			data.put("ss_02_login", "");
			data.put("ss_02_twitter_login", "");
			data.put("ss_02_facebook_login", "");
			data.put("ss_02_or", "");
			data.put("ss_02_user_name_or_email", "");
			data.put("ss_02_password", "");
			data.put("ss_02_forget_password", "");
			data.put("ss_02_cancel_login", "");
			data.put("ss_02_signup", "");
			data.put("ss_02_pass_info", "");
			data.put("ss_02_email", "");
			data.put("ss_02_reset_passowrd", "");
			data.put("ss_02_back_to_login", "");
			data.put("ss_02_enter_password", "");
			data.put("ss_02_password_changed", "");
			data.put("ss_02_full_name", "");
			data.put("ss_02_user_name", "");
			data.put("ss_03_setting", "");
			data.put("ss_03_peronalization", "");
			data.put("ss_03_profile", "");
			data.put("ss_03_account", "");
			data.put("ss_03_localization", "");
			data.put("ss_03_content_liicensing", "");
			data.put("ss_03_history_notificatoin", "");
			data.put("ss_03_content_history", "");
			data.put("ss_03_reward_history", "");
			data.put("ss_03_notification", "");
			data.put("ss_03_external", "");
			data.put("ss_03_social", "");
			data.put("ss_03_application", "");
			data.put("ss_03_about", "");
			data.put("ss_03_notice", "");
			data.put("ss_03_shop", "");
			data.put("ss_03_shop_register", "");
			data.put("ss_03_shop_manage", "");
			data.put("ss_03_change_image", "");
			data.put("ss_03_first_name", "");
			data.put("ss_03_last_name", "");
			data.put("ss_03_gender", "");
			data.put("ss_03_birthday", "");
			data.put("ss_03_interests", "");
			data.put("ss_03_take_photo", "");
			data.put("ss_03_choose_photo", "");
			data.put("ss_03_cancel", "");
			data.put("ss_03_retake", "");
			data.put("ss_03_scale", "");
			data.put("ss_03_use", "");
			data.put("ss_03_accountp", "");
			data.put("ss_03_email", "");
			data.put("ss_03_let_people_look", "");
			data.put("ss_03_password", "");
			data.put("ss_03_url", "");
			data.put("ss_03_post_by_email", "");
			data.put("ss_03_add_email", "");
			data.put("ss_03_account_delete", "");
			data.put("ss_03_uemail", "");
			data.put("ss_03_email_update", "");
			data.put("ss_03_nemail", "");
			data.put("ss_03_nemail_check", "");
			data.put("ss_03_thanks_password", "");
			data.put("ss_03_emailupdate", "");
			data.put("ss_03_incorret_email", "");
			data.put("ss_03_ok", "");
			data.put("ss_03_incorret_password", "");
			data.put("ss_03_email_updated", "");
			data.put("ss_03_upassword", "");
			data.put("ss_03_password_update", "");
			data.put("ss_03_opassword", "");
			data.put("ss_03_npassword", "");
			data.put("ss_03_npasswordcheck", "");
			data.put("ss_03_passwordupdate", "");
			data.put("ss_03_incorrect_opassword", "");
			data.put("ss_03_incorrect_npassword", "");
			data.put("ss_03_password_updated", "");
			data.put("ss_03_uurl", "");
			data.put("ss_03_url_update", "");
			data.put("ss_03_thankscom", "");
			data.put("ss_03_tpassword", "");
			data.put("ss_03_urlupdate", "");
			data.put("ss_03_cantuseurl", "");
			data.put("ss_03_incorrect_tpassword", "");
			data.put("ss_03_url_updated", "");
			data.put("ss_03_pbemail", "");
			data.put("ss_03_add_contact", "");
			data.put("ss_03_msg01", "");
			data.put("ss_03_msg02", "");
			data.put("ss_03_email_reset", "");
			data.put("ss_03_resetemail", "");
			data.put("ss_03_accountdeletecheck", "");
			data.put("ss_03_msg03", "");
			data.put("ss_03_terms", "");
			data.put("ss_03_msg06", "");
			data.put("ss_03_deleteaccount", "");
			data.put("ss_03_incorrect_password", "");
			data.put("ss_03_account_deleted", "");
			data.put("ss_04_text", "");
			data.put("ss_04_photo", "");
			data.put("ss_04_video", "");
			data.put("ss_04_audio", "");
			data.put("ss_04_story", "");
			data.put("ss_04_link", "");
			data.put("ss_04_profile", "");
			data.put("ss_04_change_member", "");
			data.put("ss_04_cancle", "");
			data.put("ss_04_ok", "");
			data.put("ss_04_member_info", "");
			data.put("ss_04_follower", "");
			data.put("ss_04_following", "");
			data.put("ss_04_subscribing", "");
			data.put("ss_04_subscribing_all_content", "");
			data.put("ss_04_follow_all", "");
			data.put("ss_04_Unfollow_all", "");
			data.put("ss_04_matome", "");
			data.put("ss_04_content", "");
			data.put("ss_04_thanq", "");
			data.put("ss_04_subscribe02", "");
			data.put("ss_04_thanq1", "");
			data.put("ss_04_subscribe01", "");
			data.put("ss_04_flag_member", "");
			data.put("ss_04_report_m", "");
			data.put("ss_04_block_m", "");
			data.put("ss_04_block", "");
			data.put("ss_04_block_member", "");
			data.put("ss_04_block_member1", "");
			data.put("ss_04_block_msg", "");
			data.put("ss_04_report_member", "");
			data.put("ss_04_summit", "");
			data.put("ss_04_report_hbs", "");
			data.put("ss_04_cancel_summit", "");
			data.put("ss_04_member_hbb", "");
			data.put("ss_04_cancel_block", "");
			data.put("ss_04_edit01", "");
			data.put("ss_04_subscribe03", "");
			data.put("ss_04_wo_matome", "");
			data.put("ss_04_cancel_subscribe", "");
			data.put("ss_04_edit_mimage01", "");
			data.put("ss_04_edit02", "");
			data.put("ss_04_matome_report_hbs", "");
			data.put("ss_04_cr_matome01", "");
			data.put("ss_04_cr_matome02", "");
			data.put("ss_04_complete", "");
			data.put("ss_04_edit_image02", "");
			data.put("ss_04_m_name", "");
			data.put("ss_04_m_explain", "");
			data.put("ss_04_m_category", "");
			data.put("ss_04_m_option", "");
			data.put("ss_04_m_open", "");
			data.put("ss_04_m_subscriber", "");
			data.put("ss_04_private", "");
			data.put("ss_04_m_c_option", "");
			data.put("ss_04_me", "");
			data.put("ss_04_m_s", "");
			data.put("ss_04_m_all", "");
			data.put("ss_04_edit_matome", "");
			data.put("ss_04_edit_complete", "");
			data.put("ss_04_delete_matome01", "");
			data.put("ss_04_delete_matome02", "");
			data.put("ss_04_cancel_delete", "");
			data.put("ss_04_delete_mimage", "");
			data.put("ss_05_cancle01", "");
			data.put("ss_05_w_complete", "");
			data.put("ss_05_subject", "");
			data.put("ss_05_contents", "");
			data.put("ss_05_tag", "");
			data.put("ss_05_s_matome01", "");
			data.put("ss_05_s_matome02", "");
			data.put("ss_05_m_nmatome", "");
			data.put("ss_05_s_image_way", "");
			data.put("ss_05_t_photo", "");
			data.put("ss_05_s_photo", "");
			data.put("ss_05_cb_image", "");
			data.put("ss_05_cancel02", "");
			data.put("ss_05_msg01", "");
			data.put("ss_05_ok", "");
			data.put("ss_05_clipboard", "");
			data.put("ss_05_s_complete", "");
			data.put("ss_05_msg02", "");
			data.put("ss_05_msg03", "");
			data.put("ss_05_t_keep", "");
			data.put("ss_05_r_upload", "");
			data.put("ss_05_p_location", "");
			data.put("ss_05_w_country", "");
			data.put("ss_05_cwn01", "");
			data.put("ss_05_edit01", "");
			data.put("ss_05_nothing_w", "");
			data.put("ss_05_cancel03", "");
			data.put("ss_05_content_s", "");
			data.put("ss_05_complete01", "");
			data.put("ss_05_cnw02", "");
			data.put("ss_05_complete02", "");
			data.put("ss_05_allow_m", "");
			data.put("ss_05_msg04", "");
			data.put("ss_05_add_com", "");
			data.put("ss_05_msg05", "");
			data.put("ss_05_c_info", "");
			data.put("ss_05_msg06", "");
			data.put("ss_05__c_info02", "");
			data.put("ss_05_complete", "");
			data.put("ss_06_title", "");
			data.put("ss_07_comment", "");
			data.put("ss_07_whitqb", "");
			data.put("ss_07_withq", "");
			data.put("ss_07_thanq", "");
			data.put("ss_07_c_place", "");
			data.put("ss_07_r_content", "");
			data.put("first_name", "First Name");
			data.put("last_name", "Last Name");
			data.put("latitude", "Latitude");
			data.put("longitude", "Longitude");
			data.put("lang", "Language");
			data.put("user_name", "User Name");
			data.put("keyword", "keyword");
			data.put("default_matome_name", "Default Board");
			data.put("smut", "Smut");
			data.put("personal_attack", "Personal Attack");
			data.put("violence", "Violence");
			data.put("curse", "Curse");
			data.put("spam", "Spam");
			data.put("etc", "Others");
			data.put("signup", "Signup");
			data.put("guest_mode", "Guest Mode");
			data.put("thanks", "Thanks");
		}
		private ENClass(){
			super(data);
		}

		@Override
		public Map<String, String> get(){
			return data;
		}
		
		@Override
		public String getHello(){
			return "hello";
		}
		
		@Override
		public String get200(){
			return "";
		}
		
		@Override
		public String get201(){
			return "";
		}
		
		@Override
		public String get202(){
			return "";
		}
		
		@Override
		public String get221(){
			return "{0} is required.";
		}
		
		@Override
		public String get222(){
			return "{0} is not a float format";
		}
		
		@Override
		public String get223(){
			return "";
		}
		
		@Override
		public String get224(){
			return "";
		}
		
		@Override
		public String get225(){
			return "";
		}
		
		@Override
		public String get226(){
			return "";
		}
		
		@Override
		public String get227(){
			return "";
		}
		
		@Override
		public String get228(){
			return "";
		}
		
		@Override
		public String get231(){
			return "";
		}
		
		@Override
		public String get232(){
			return "";
		}
		
		@Override
		public String get233(){
			return "";
		}
		
		@Override
		public String get234(){
			return "";
		}
		
		@Override
		public String get235(){
			return "";
		}
		
		@Override
		public String get236(){
			return "";
		}
		
		@Override
		public String get241(){
			return "";
		}
		
		@Override
		public String get242(){
			return "";
		}
		
		@Override
		public String get243(){
			return "";
		}
		
		@Override
		public String get244(){
			return "";
		}
		
		@Override
		public String get300(){
			return "";
		}
		
		@Override
		public String get301(){
			return "";
		}
		
		@Override
		public String get302(){
			return "";
		}
		
		@Override
		public String get303(){
			return "";
		}
		
		@Override
		public String get304(){
			return "";
		}
		
		@Override
		public String get305(){
			return "";
		}
		
		@Override
		public String get310(){
			return "";
		}
		
		@Override
		public String get311(){
			return "";
		}
		
		@Override
		public String get330(){
			return "";
		}
		
		@Override
		public String get333(){
			return "";
		}
		
		@Override
		public String get401(){
			return "";
		}
		
		@Override
		public String get402(){
			return "";
		}
		
		@Override
		public String get403(){
			return "";
		}
		
		@Override
		public String get501(){
			return "";
		}
		
		@Override
		public String get502(){
			return "";
		}
		
		@Override
		public String get503(){
			return "";
		}
		
		@Override
		public String get521(){
			return "";
		}
		
		@Override
		public String get601(){
			return "";
		}
		
		@Override
		public String get602(){
			return "";
		}
		
		@Override
		public String get901(){
			return "";
		}
		
		@Override
		public String get902(){
			return "";
		}
		
		@Override
		public String getVtOkPasswordChange(){
			return "";
		}
		
		@Override
		public String getKey(){
			return "key";
		}
		
		@Override
		public String getTest(){
			return "Test";
		}
		
		@Override
		public String getResType(){
			return "response type";
		}
		
		@Override
		public String getProgramError(){
			return "Program Error";
		}
		
		@Override
		public String getStatus(){
			return "Status";
		}
		
		@Override
		public String getLogin(){
			return "LOGIN";
		}
		
		@Override
		public String getUserId(){
			return "User Id";
		}
		
		@Override
		public String getPassword(){
			return "Password";
		}
		
		@Override
		public String getName(){
			return "Name";
		}
		
		@Override
		public String getEmail(){
			return "E-mail";
		}
		
		@Override
		public String getDescription(){
			return "Description";
		}
		
		@Override
		public String getDesc(){
			return "Description";
		}
		
		@Override
		public String getCurrentVersion(){
			return "current version";
		}
		
		@Override
		public String getError(){
			return "Error";
		}
		
		@Override
		public String getRegDt(){
			return "Registered";
		}
		
		@Override
		public String getSs01Login(){
			return "";
		}
		
		@Override
		public String getSs01Thanks(){
			return "";
		}
		
		@Override
		public String getSs01Signup(){
			return "";
		}
		
		@Override
		public String getSs01GuestMode(){
			return "";
		}
		
		@Override
		public String getSs02Thanks(){
			return "";
		}
		
		@Override
		public String getSs02Login(){
			return "";
		}
		
		@Override
		public String getSs02TwitterLogin(){
			return "";
		}
		
		@Override
		public String getSs02FacebookLogin(){
			return "";
		}
		
		@Override
		public String getSs02Or(){
			return "";
		}
		
		@Override
		public String getSs02UserNameOrEmail(){
			return "";
		}
		
		@Override
		public String getSs02Password(){
			return "";
		}
		
		@Override
		public String getSs02ForgetPassword(){
			return "";
		}
		
		@Override
		public String getSs02CancelLogin(){
			return "";
		}
		
		@Override
		public String getSs02Signup(){
			return "";
		}
		
		@Override
		public String getSs02PassInfo(){
			return "";
		}
		
		@Override
		public String getSs02Email(){
			return "";
		}
		
		@Override
		public String getSs02ResetPassowrd(){
			return "";
		}
		
		@Override
		public String getSs02BackToLogin(){
			return "";
		}
		
		@Override
		public String getSs02EnterPassword(){
			return "";
		}
		
		@Override
		public String getSs02PasswordChanged(){
			return "";
		}
		
		@Override
		public String getSs02FullName(){
			return "";
		}
		
		@Override
		public String getSs02UserName(){
			return "";
		}
		
		@Override
		public String getSs03Setting(){
			return "";
		}
		
		@Override
		public String getSs03Peronalization(){
			return "";
		}
		
		@Override
		public String getSs03Profile(){
			return "";
		}
		
		@Override
		public String getSs03Account(){
			return "";
		}
		
		@Override
		public String getSs03Localization(){
			return "";
		}
		
		@Override
		public String getSs03ContentLiicensing(){
			return "";
		}
		
		@Override
		public String getSs03HistoryNotificatoin(){
			return "";
		}
		
		@Override
		public String getSs03ContentHistory(){
			return "";
		}
		
		@Override
		public String getSs03RewardHistory(){
			return "";
		}
		
		@Override
		public String getSs03Notification(){
			return "";
		}
		
		@Override
		public String getSs03External(){
			return "";
		}
		
		@Override
		public String getSs03Social(){
			return "";
		}
		
		@Override
		public String getSs03Application(){
			return "";
		}
		
		@Override
		public String getSs03About(){
			return "";
		}
		
		@Override
		public String getSs03Notice(){
			return "";
		}
		
		@Override
		public String getSs03Shop(){
			return "";
		}
		
		@Override
		public String getSs03ShopRegister(){
			return "";
		}
		
		@Override
		public String getSs03ShopManage(){
			return "";
		}
		
		@Override
		public String getSs03ChangeImage(){
			return "";
		}
		
		@Override
		public String getSs03FirstName(){
			return "";
		}
		
		@Override
		public String getSs03LastName(){
			return "";
		}
		
		@Override
		public String getSs03Gender(){
			return "";
		}
		
		@Override
		public String getSs03Birthday(){
			return "";
		}
		
		@Override
		public String getSs03Interests(){
			return "";
		}
		
		@Override
		public String getSs03TakePhoto(){
			return "";
		}
		
		@Override
		public String getSs03ChoosePhoto(){
			return "";
		}
		
		@Override
		public String getSs03Cancel(){
			return "";
		}
		
		@Override
		public String getSs03Retake(){
			return "";
		}
		
		@Override
		public String getSs03Scale(){
			return "";
		}
		
		@Override
		public String getSs03Use(){
			return "";
		}
		
		@Override
		public String getSs03Accountp(){
			return "";
		}
		
		@Override
		public String getSs03Email(){
			return "";
		}
		
		@Override
		public String getSs03LetPeopleLook(){
			return "";
		}
		
		@Override
		public String getSs03Password(){
			return "";
		}
		
		@Override
		public String getSs03Url(){
			return "";
		}
		
		@Override
		public String getSs03PostByEmail(){
			return "";
		}
		
		@Override
		public String getSs03AddEmail(){
			return "";
		}
		
		@Override
		public String getSs03AccountDelete(){
			return "";
		}
		
		@Override
		public String getSs03Uemail(){
			return "";
		}
		
		@Override
		public String getSs03EmailUpdate(){
			return "";
		}
		
		@Override
		public String getSs03Nemail(){
			return "";
		}
		
		@Override
		public String getSs03NemailCheck(){
			return "";
		}
		
		@Override
		public String getSs03ThanksPassword(){
			return "";
		}
		
		@Override
		public String getSs03Emailupdate(){
			return "";
		}
		
		@Override
		public String getSs03IncorretEmail(){
			return "";
		}
		
		@Override
		public String getSs03Ok(){
			return "";
		}
		
		@Override
		public String getSs03IncorretPassword(){
			return "";
		}
		
		@Override
		public String getSs03EmailUpdated(){
			return "";
		}
		
		@Override
		public String getSs03Upassword(){
			return "";
		}
		
		@Override
		public String getSs03PasswordUpdate(){
			return "";
		}
		
		@Override
		public String getSs03Opassword(){
			return "";
		}
		
		@Override
		public String getSs03Npassword(){
			return "";
		}
		
		@Override
		public String getSs03Npasswordcheck(){
			return "";
		}
		
		@Override
		public String getSs03Passwordupdate(){
			return "";
		}
		
		@Override
		public String getSs03IncorrectOpassword(){
			return "";
		}
		
		@Override
		public String getSs03IncorrectNpassword(){
			return "";
		}
		
		@Override
		public String getSs03PasswordUpdated(){
			return "";
		}
		
		@Override
		public String getSs03Uurl(){
			return "";
		}
		
		@Override
		public String getSs03UrlUpdate(){
			return "";
		}
		
		@Override
		public String getSs03Thankscom(){
			return "";
		}
		
		@Override
		public String getSs03Tpassword(){
			return "";
		}
		
		@Override
		public String getSs03Urlupdate(){
			return "";
		}
		
		@Override
		public String getSs03Cantuseurl(){
			return "";
		}
		
		@Override
		public String getSs03IncorrectTpassword(){
			return "";
		}
		
		@Override
		public String getSs03UrlUpdated(){
			return "";
		}
		
		@Override
		public String getSs03Pbemail(){
			return "";
		}
		
		@Override
		public String getSs03AddContact(){
			return "";
		}
		
		@Override
		public String getSs03Msg01(){
			return "";
		}
		
		@Override
		public String getSs03Msg02(){
			return "";
		}
		
		@Override
		public String getSs03EmailReset(){
			return "";
		}
		
		@Override
		public String getSs03Resetemail(){
			return "";
		}
		
		@Override
		public String getSs03Accountdeletecheck(){
			return "";
		}
		
		@Override
		public String getSs03Msg03(){
			return "";
		}
		
		@Override
		public String getSs03Terms(){
			return "";
		}
		
		@Override
		public String getSs03Msg06(){
			return "";
		}
		
		@Override
		public String getSs03Deleteaccount(){
			return "";
		}
		
		@Override
		public String getSs03IncorrectPassword(){
			return "";
		}
		
		@Override
		public String getSs03AccountDeleted(){
			return "";
		}
		
		@Override
		public String getSs04Text(){
			return "";
		}
		
		@Override
		public String getSs04Photo(){
			return "";
		}
		
		@Override
		public String getSs04Video(){
			return "";
		}
		
		@Override
		public String getSs04Audio(){
			return "";
		}
		
		@Override
		public String getSs04Story(){
			return "";
		}
		
		@Override
		public String getSs04Link(){
			return "";
		}
		
		@Override
		public String getSs04Profile(){
			return "";
		}
		
		@Override
		public String getSs04ChangeMember(){
			return "";
		}
		
		@Override
		public String getSs04Cancle(){
			return "";
		}
		
		@Override
		public String getSs04Ok(){
			return "";
		}
		
		@Override
		public String getSs04MemberInfo(){
			return "";
		}
		
		@Override
		public String getSs04Follower(){
			return "";
		}
		
		@Override
		public String getSs04Following(){
			return "";
		}
		
		@Override
		public String getSs04Subscribing(){
			return "";
		}
		
		@Override
		public String getSs04SubscribingAllContent(){
			return "";
		}
		
		@Override
		public String getSs04FollowAll(){
			return "";
		}
		
		@Override
		public String getSs04UnfollowAll(){
			return "";
		}
		
		@Override
		public String getSs04Matome(){
			return "";
		}
		
		@Override
		public String getSs04Content(){
			return "";
		}
		
		@Override
		public String getSs04Thanq(){
			return "";
		}
		
		@Override
		public String getSs04Subscribe02(){
			return "";
		}
		
		@Override
		public String getSs04Thanq1(){
			return "";
		}
		
		@Override
		public String getSs04Subscribe01(){
			return "";
		}
		
		@Override
		public String getSs04FlagMember(){
			return "";
		}
		
		@Override
		public String getSs04ReportM(){
			return "";
		}
		
		@Override
		public String getSs04BlockM(){
			return "";
		}
		
		@Override
		public String getSs04Block(){
			return "";
		}
		
		@Override
		public String getSs04BlockMember(){
			return "";
		}
		
		@Override
		public String getSs04BlockMember1(){
			return "";
		}
		
		@Override
		public String getSs04BlockMsg(){
			return "";
		}
		
		@Override
		public String getSs04ReportMember(){
			return "";
		}
		
		@Override
		public String getSs04Summit(){
			return "";
		}
		
		@Override
		public String getSs04ReportHbs(){
			return "";
		}
		
		@Override
		public String getSs04CancelSummit(){
			return "";
		}
		
		@Override
		public String getSs04MemberHbb(){
			return "";
		}
		
		@Override
		public String getSs04CancelBlock(){
			return "";
		}
		
		@Override
		public String getSs04Edit01(){
			return "";
		}
		
		@Override
		public String getSs04Subscribe03(){
			return "";
		}
		
		@Override
		public String getSs04WoMatome(){
			return "";
		}
		
		@Override
		public String getSs04CancelSubscribe(){
			return "";
		}
		
		@Override
		public String getSs04EditMimage01(){
			return "";
		}
		
		@Override
		public String getSs04Edit02(){
			return "";
		}
		
		@Override
		public String getSs04MatomeReportHbs(){
			return "";
		}
		
		@Override
		public String getSs04CrMatome01(){
			return "";
		}
		
		@Override
		public String getSs04CrMatome02(){
			return "";
		}
		
		@Override
		public String getSs04Complete(){
			return "";
		}
		
		@Override
		public String getSs04EditImage02(){
			return "";
		}
		
		@Override
		public String getSs04MName(){
			return "";
		}
		
		@Override
		public String getSs04MExplain(){
			return "";
		}
		
		@Override
		public String getSs04MCategory(){
			return "";
		}
		
		@Override
		public String getSs04MOption(){
			return "";
		}
		
		@Override
		public String getSs04MOpen(){
			return "";
		}
		
		@Override
		public String getSs04MSubscriber(){
			return "";
		}
		
		@Override
		public String getSs04Private(){
			return "";
		}
		
		@Override
		public String getSs04MCOption(){
			return "";
		}
		
		@Override
		public String getSs04Me(){
			return "";
		}
		
		@Override
		public String getSs04MS(){
			return "";
		}
		
		@Override
		public String getSs04MAll(){
			return "";
		}
		
		@Override
		public String getSs04EditMatome(){
			return "";
		}
		
		@Override
		public String getSs04EditComplete(){
			return "";
		}
		
		@Override
		public String getSs04DeleteMatome01(){
			return "";
		}
		
		@Override
		public String getSs04DeleteMatome02(){
			return "";
		}
		
		@Override
		public String getSs04CancelDelete(){
			return "";
		}
		
		@Override
		public String getSs04DeleteMimage(){
			return "";
		}
		
		@Override
		public String getSs05Cancle01(){
			return "";
		}
		
		@Override
		public String getSs05WComplete(){
			return "";
		}
		
		@Override
		public String getSs05Subject(){
			return "";
		}
		
		@Override
		public String getSs05Contents(){
			return "";
		}
		
		@Override
		public String getSs05Tag(){
			return "";
		}
		
		@Override
		public String getSs05SMatome01(){
			return "";
		}
		
		@Override
		public String getSs05SMatome02(){
			return "";
		}
		
		@Override
		public String getSs05MNmatome(){
			return "";
		}
		
		@Override
		public String getSs05SImageWay(){
			return "";
		}
		
		@Override
		public String getSs05TPhoto(){
			return "";
		}
		
		@Override
		public String getSs05SPhoto(){
			return "";
		}
		
		@Override
		public String getSs05CbImage(){
			return "";
		}
		
		@Override
		public String getSs05Cancel02(){
			return "";
		}
		
		@Override
		public String getSs05Msg01(){
			return "";
		}
		
		@Override
		public String getSs05Ok(){
			return "";
		}
		
		@Override
		public String getSs05Clipboard(){
			return "";
		}
		
		@Override
		public String getSs05SComplete(){
			return "";
		}
		
		@Override
		public String getSs05Msg02(){
			return "";
		}
		
		@Override
		public String getSs05Msg03(){
			return "";
		}
		
		@Override
		public String getSs05TKeep(){
			return "";
		}
		
		@Override
		public String getSs05RUpload(){
			return "";
		}
		
		@Override
		public String getSs05PLocation(){
			return "";
		}
		
		@Override
		public String getSs05WCountry(){
			return "";
		}
		
		@Override
		public String getSs05Cwn01(){
			return "";
		}
		
		@Override
		public String getSs05Edit01(){
			return "";
		}
		
		@Override
		public String getSs05NothingW(){
			return "";
		}
		
		@Override
		public String getSs05Cancel03(){
			return "";
		}
		
		@Override
		public String getSs05ContentS(){
			return "";
		}
		
		@Override
		public String getSs05Complete01(){
			return "";
		}
		
		@Override
		public String getSs05Cnw02(){
			return "";
		}
		
		@Override
		public String getSs05Complete02(){
			return "";
		}
		
		@Override
		public String getSs05AllowM(){
			return "";
		}
		
		@Override
		public String getSs05Msg04(){
			return "";
		}
		
		@Override
		public String getSs05AddCom(){
			return "";
		}
		
		@Override
		public String getSs05Msg05(){
			return "";
		}
		
		@Override
		public String getSs05CInfo(){
			return "";
		}
		
		@Override
		public String getSs05Msg06(){
			return "";
		}
		
		@Override
		public String getSs05CInfo02(){
			return "";
		}
		
		@Override
		public String getSs05Complete(){
			return "";
		}
		
		@Override
		public String getSs06Title(){
			return "";
		}
		
		@Override
		public String getSs07Comment(){
			return "";
		}
		
		@Override
		public String getSs07Whitqb(){
			return "";
		}
		
		@Override
		public String getSs07Withq(){
			return "";
		}
		
		@Override
		public String getSs07Thanq(){
			return "";
		}
		
		@Override
		public String getSs07CPlace(){
			return "";
		}
		
		@Override
		public String getSs07RContent(){
			return "";
		}
		
		@Override
		public String getFirstName(){
			return "First Name";
		}
		
		@Override
		public String getLastName(){
			return "Last Name";
		}
		
		@Override
		public String getLatitude(){
			return "Latitude";
		}
		
		@Override
		public String getLongitude(){
			return "Longitude";
		}
		
		@Override
		public String getLang(){
			return "Language";
		}
		
		@Override
		public String getUserName(){
			return "User Name";
		}
		
		@Override
		public String getKeyword(){
			return "keyword";
		}
		
		@Override
		public String getDefaultMatomeName(){
			return "Default Board";
		}
		
		@Override
		public String getSmut(){
			return "Smut";
		}
		
		@Override
		public String getPersonalAttack(){
			return "Personal Attack";
		}
		
		@Override
		public String getViolence(){
			return "Violence";
		}
		
		@Override
		public String getCurse(){
			return "Curse";
		}
		
		@Override
		public String getSpam(){
			return "Spam";
		}
		
		@Override
		public String getEtc(){
			return "Others";
		}
		
		@Override
		public String getSignup(){
			return "Signup";
		}
		
		@Override
		public String getGuestMode(){
			return "Guest Mode";
		}
		
		@Override
		public String getThanks(){
			return "Thanks";
		}
		
	}
	
	public static final kr.co.mnbiz.api.message.MessageManager JA = new JAClass();
	
	private static class JAClass extends kr.co.mnbiz.api.message.MessageManager implements ProjectMessage{

		private static Map<String, String> data = new HashMap<String, String>();
		static{
			
			data.put("hello", "こんにちは");
			data.put("200", "申し訳ありません。システムエラーが発生しました。 ");
			data.put("201", "申し訳ありません。今はシステムメンテナンス中です。");
			data.put("202", "申し訳ありません。 {0}から{1}までシステムメンテナンス中です。");
			data.put("221", "{0}は必要値です。");
			data.put("222", "{0}は実数でなければななりません。");
			data.put("223", "{0}は整数ででなければななりません。");
			data.put("224", "{0}は {1}のいずれかででなければななりません。");
			data.put("225", "{0}は日付フォーマットでなければななりません。");
			data.put("226", "{0}は時間フォーマットでなければななりません。");
			data.put("227", "{0}は日付 - 時間フォーマットでなければななりません。");
			data.put("228", "{0}は e - mailフォーマットでなければななりません。");
			data.put("231", "{0}は {1}文字以下でなければななりません。");
			data.put("232", "{0}は {1}文字以上でなければななりません。");
			data.put("233", "{0}は最大{1}です。");
			data.put("234", "{0}は最小{1}です。");
			data.put("235", "{0}は最大{1}個まで入力可能です。");
			data.put("236", "{0}は最小{1}つ入力する必要があります。");
			data.put("241", "{0}があるとき{1}は必ず入力する必要があります。");
			data.put("242", "{0}や{1}のいずれかでなければななりません。");
			data.put("243", "{0}が{2}のいずれかのときに{1}は、入力する必要があります。");
			data.put("244", "{0}が{2}のいずれかでは場合に{1}は、入力する必要があります。");
			data.put("300", "SessionKey error 。");
			data.put("301", "データベースエラー。");
			data.put("302", "すでに登録された{0}です。");
			data.put("303", "すでに登録された{0}です。");
			data.put("304", "すでに登録された{0}です。");
			data.put("305", "空白を許可しない");
			data.put("310", "{0}は存在しないメールアドレスです。");
			data.put("311", "電子メールの作成に失敗しました。");
			data.put("330", "所有関係が正しくありません。");
			data.put("333", "Permissionはありません。");
			data.put("401", "ログイン失敗");
			data.put("402", "存在しないユーザー名または電子メール、またはパスワードが間違っています。");
			data.put("403", "パスワードが間違っています。");
			data.put("501", "存在していないまとめです。");
			data.put("502", "所有権のないまとめです。");
			data.put("503", "文書を書く権限がないまとめです。");
			data.put("521", "画像のレイアウトが正しくありません。");
			data.put("601", "変更、および削除ができない文書です。");
			data.put("602", "存在しない文書です。");
			data.put("901", "サポートしていない画像形式です。");
			data.put("902", "入力できない文字が含まれています。");
			data.put("vt_ok_password_change", "パスワードの変更方法を{0}[で]メールを送信しました。");
			data.put("key", "キー");
			data.put("test", "テスト");
			data.put("res-type", "応答タイプ");
			data.put("program-error", "プログラムエラー");
			data.put("status", "状態");
			data.put("login", "ログイン");
			data.put("user_id", "ユーザーID");
			data.put("password", "パスワード");
			data.put("name", "名前");
			data.put("email", "メール");
			data.put("description", "詳細説明");
			data.put("desc", "詳細説明");
			data.put("current_version", "現在のバージョン");
			data.put("error", "エラー");
			data.put("reg_dt", "登録日");
			data.put("ss_01_login", "ログイン");
			data.put("ss_01_thanks", "Thanks");
			data.put("ss_01_signup", "会員登録");
			data.put("ss_01_guest_mode", "ゲストモード");
			data.put("ss_02_thanks", "Thanks");
			data.put("ss_02_login", "ログイン");
			data.put("ss_02_twitter_login", "ツイッターでログインする");
			data.put("ss_02_facebook_login", "Facebookでログインする");
			data.put("ss_02_or", "または");
			data.put("ss_02_user_name_or_email", "ユーザー名または電子メール");
			data.put("ss_02_password", "パスワード");
			data.put("ss_02_forget_password", "パスワードをお忘れですか？");
			data.put("ss_02_cancel_login", "ログインキャンセル");
			data.put("ss_02_signup", "会員登録");
			data.put("ss_02_pass_info", "下のメール欄にメールアドレスを入力してください。そのメールにパスワードのリセットする方法をお送りいたします。");
			data.put("ss_02_email", "メール");
			data.put("ss_02_reset_passowrd", "パスワードのリセット");
			data.put("ss_02_back_to_login", "ログインに戻る");
			data.put("ss_02_enter_password", "{0}のパスワードを入力してください。");
			data.put("ss_02_password_changed", "これで新しいパスワードでログインすることができます。");
			data.put("ss_02_full_name", "名前");
			data.put("ss_02_user_name", "ユーザー名");
			data.put("ss_03_setting", "設定");
			data.put("ss_03_peronalization", "個人化");
			data.put("ss_03_profile", "プロファイル");
			data.put("ss_03_account", "アカウント");
			data.put("ss_03_localization", "言語および地域");
			data.put("ss_03_content_liicensing", "コンテンツと著作権");
			data.put("ss_03_history_notificatoin", "履歴および通知");
			data.put("ss_03_content_history", "通知履歴");
			data.put("ss_03_reward_history", "補償内容");
			data.put("ss_03_notification", "通知設定");
			data.put("ss_03_external", "連動情報の設定");
			data.put("ss_03_social", "ソーシャル連動");
			data.put("ss_03_application", "アプリケーション");
			data.put("ss_03_about", "ThanQについて。");
			data.put("ss_03_notice", "お知らせ");
			data.put("ss_03_shop", "Shop");
			data.put("ss_03_shop_register", "Shop登録");
			data.put("ss_03_shop_manage", "Shop管理");
			data.put("ss_03_change_image", "プロファイル画像の変更");
			data.put("ss_03_first_name", "名前");
			data.put("ss_03_last_name", "性");
			data.put("ss_03_gender", "性別");
			data.put("ss_03_birthday", "誕生日");
			data.put("ss_03_interests", "お気に入り情報選択");
			data.put("ss_03_take_photo", "写真を撮る");
			data.put("ss_03_choose_photo", "写真の選択");
			data.put("ss_03_cancel", "キャンセル");
			data.put("ss_03_retake", "再度撮影する");
			data.put("ss_03_scale", "サイズ変更");
			data.put("ss_03_use", "使用する");
			data.put("ss_03_accountp", "系");
			data.put("ss_03_email", "メール");
			data.put("ss_03_let_people_look", "他のユーザーが電子メールで私を検索できます。");
			data.put("ss_03_password", "パスワード");
			data.put("ss_03_url", "URL");
			data.put("ss_03_post_by_email", "Post by E - mail");
			data.put("ss_03_add_email", "メールアドレスの追加");
			data.put("ss_03_account_delete", "アカウントの削除");
			data.put("ss_03_uemail", "更新メール");
			data.put("ss_03_email_update", "メールアドレスの更新");
			data.put("ss_03_nemail", "新しいメールアドレス");
			data.put("ss_03_nemail_check", "メールアドレス確認");
			data.put("ss_03_thanks_password", "Thanksパスワード");
			data.put("ss_03_emailupdate", "メールアドレスの更新");
			data.put("ss_03_incorret_email", "メールアドレスが正しく入力されていません。");
			data.put("ss_03_ok", "確認");
			data.put("ss_03_incorret_password", "パスワードが正しく入力されていません。");
			data.put("ss_03_email_updated", "メールアドレスが更新されました。");
			data.put("ss_03_upassword", "Update Password");
			data.put("ss_03_password_update", "パスワードの更新");
			data.put("ss_03_opassword", "既存のパスワード");
			data.put("ss_03_npassword", "新しいパスワード");
			data.put("ss_03_npasswordcheck", "新しいパスワードの確認");
			data.put("ss_03_passwordupdate", "パスワードの更新");
			data.put("ss_03_incorrect_opassword", "既存のパスワードが正しく入力されていません。");
			data.put("ss_03_incorrect_npassword", "新しいパスワードが正しく入力されていません。");
			data.put("ss_03_password_updated", "パスワードが更新されました。");
			data.put("ss_03_uurl", "Update URL");
			data.put("ss_03_url_update", "URLを更新");
			data.put("ss_03_thankscom", "thanks.com");
			data.put("ss_03_tpassword", "Thanksパスワード");
			data.put("ss_03_urlupdate", "URLを更新");
			data.put("ss_03_cantuseurl", "入力されたURLは使用することができません。");
			data.put("ss_03_incorrect_tpassword", "パスワードが正しくありません。");
			data.put("ss_03_url_updated", "URLを更新しました。");
			data.put("ss_03_pbemail", "Post by E - mail");
			data.put("ss_03_add_contact", "アドレス帳に追加");
			data.put("ss_03_msg01", "会員がコンテンツを投稿することができる固有の電子メールアドレスです。電子メールでテキスト、写真、ウェブリンクをお送くると、自動的にコンテンツが登録されます。");
			data.put("ss_03_msg02", "アカウントにスパムメールが送信される場合は、 '電子メールのリセット'をクリックして、固有電子メールを作成してください。");
			data.put("ss_03_email_reset", "メールのリセット");
			data.put("ss_03_resetemail", "メールアドレスをリセットしますか？");
			data.put("ss_03_accountdeletecheck", "アカウント削除の確認");
			data.put("ss_03_msg03", "会員のアカウントの削除を確認するためにパスワードを入力し、アカウントの削除ボタンを押してください。削除されたアカウントは復元することができません。アカウントの削除の詳細については、会員規約の内容を参考にしてください。ありがとうございます。");
			data.put("ss_03_terms", "会員規約を見る");
			data.put("ss_03_msg06", "アカウント削除の確認のためにパスワードを入力してください。");
			data.put("ss_03_deleteaccount", "アカウントを削除します。");
			data.put("ss_03_incorrect_password", "パスワードが正しくありません。");
			data.put("ss_03_account_deleted", "アカウントの削除が完了しました。");
			data.put("ss_04_text", "Text");
			data.put("ss_04_photo", "Photo");
			data.put("ss_04_video", "Video");
			data.put("ss_04_audio", "Audio");
			data.put("ss_04_story", "Story");
			data.put("ss_04_link", "Link");
			data.put("ss_04_profile", "会員情報の表示");
			data.put("ss_04_change_member", "{ 0 会員に変更しますか？");
			data.put("ss_04_cancle", "キャンセル");
			data.put("ss_04_ok", "確認");
			data.put("ss_04_member_info", "member info");
			data.put("ss_04_follower", "フォロワー");
			data.put("ss_04_following", "フォロー");
			data.put("ss_04_subscribing", "購読中");
			data.put("ss_04_subscribing_all_content", "すべてのコンテンツを購読します。");
			data.put("ss_04_follow_all", "Follow All");
			data.put("ss_04_Unfollow_all", "Unfollow All");
			data.put("ss_04_matome", "まとめ");
			data.put("ss_04_content", "コンテンツ");
			data.put("ss_04_thanq", "thanQ");
			data.put("ss_04_subscribe02", "Subscribe");
			data.put("ss_04_thanq1", "thanQ");
			data.put("ss_04_subscribe01", "購読する");
			data.put("ss_04_flag_member", "Flag_member");
			data.put("ss_04_report_m", "Report {0}");
			data.put("ss_04_block_m", "Block {0}");
			data.put("ss_04_block", "block");
			data.put("ss_04_block_member", "Block member");
			data.put("ss_04_block_member1", "Block {0}");
			data.put("ss_04_block_msg", "{0}さんをブロックすると、 {0}さんとチャットの会話が不可能になり、 {0}さんのコンテンツが会員様のページにはこれ以上表示されません。");
			data.put("ss_04_report_member", "Report member");
			data.put("ss_04_summit", "提出");
			data.put("ss_04_report_hbs", "{0}のレポートが提出されました。");
			data.put("ss_04_cancel_summit", "提出の取り消し");
			data.put("ss_04_member_hbb", "{0}がブロックされました。");
			data.put("ss_04_cancel_block", "ブロック解除");
			data.put("ss_04_edit01", "編集する");
			data.put("ss_04_subscribe03", "購読する");
			data.put("ss_04_wo_matome", "{0}まとめに書く");
			data.put("ss_04_cancel_subscribe", "購読を解除する");
			data.put("ss_04_edit_mimage01", "まとめ代表画像編集");
			data.put("ss_04_edit02", "Edit");
			data.put("ss_04_matome_report_hbs", "{0}まとめのレポートを提出しました。");
			data.put("ss_04_cr_matome01", "新しいまとめボードの作成");
			data.put("ss_04_cr_matome02", "Create matome");
			data.put("ss_04_complete", "完了");
			data.put("ss_04_edit_image02", "まとめ代表画像編集（オプション）");
			data.put("ss_04_m_name", "まとめタイトル");
			data.put("ss_04_m_explain", "まとめ説明");
			data.put("ss_04_m_category", "まとめカテゴリ");
			data.put("ss_04_m_option", "まとめビューのオプション");
			data.put("ss_04_m_open", "オープンまとめ（誰でも見ることができます）");
			data.put("ss_04_m_subscriber", "購読使用者まとめ（購読使用者のみ見ることができます）");
			data.put("ss_04_private", "非公開まとめ（私だけ見ることができます）");
			data.put("ss_04_m_c_option", "まとめコンテンツの作成オプション");
			data.put("ss_04_me", "私だけ作成可能");
			data.put("ss_04_m_s", "私と購読使用者の作成可能");
			data.put("ss_04_m_all", "すべての使用者が作成可能");
			data.put("ss_04_edit_matome", "Edit matome");
			data.put("ss_04_edit_complete", "編集完了");
			data.put("ss_04_delete_matome01", "まとめを削除する");
			data.put("ss_04_delete_matome02", "{0}まとめを削除しますか？まとめの中のすべてのコンテンツが削除されます。");
			data.put("ss_04_cancel_delete", "削除キャンセル");
			data.put("ss_04_delete_mimage", "{0}まとめ代表画像を削除しますか？");
			data.put("ss_05_cancle01", "キャンセル");
			data.put("ss_05_w_complete", "作成完了");
			data.put("ss_05_subject", "タイトル（ option ）");
			data.put("ss_05_contents", "内容");
			data.put("ss_05_tag", "＃タグ");
			data.put("ss_05_s_matome01", "Select a Matome");
			data.put("ss_05_s_matome02", "Select Matome");
			data.put("ss_05_m_nmatome", "新しいまとめボードの作成");
			data.put("ss_05_s_image_way", "写真を追加する方法を選択してください。");
			data.put("ss_05_t_photo", "写真を撮る");
			data.put("ss_05_s_photo", "アルバムの写真を選択");
			data.put("ss_05_cb_image", "クリップボードの画像");
			data.put("ss_05_cancel02", "キャンセル");
			data.put("ss_05_msg01", "写真は10枚まで添付可能です。");
			data.put("ss_05_ok", "確認");
			data.put("ss_05_clipboard", "クリップボード");
			data.put("ss_05_s_complete", "選択完了");
			data.put("ss_05_msg02", "コンテンツの転送が失敗して作成されたコンテンツが下書きに保存されました。");
			data.put("ss_05_msg03", "アップロードする添付ファイルの容量が10MB以上です。アップロードしますか？");
			data.put("ss_05_t_keep", "一時保管");
			data.put("ss_05_r_upload", "アップロードの実行");
			data.put("ss_05_p_location", "現在位置");
			data.put("ss_05_w_country", "全国");
			data.put("ss_05_cwn01", "コンテンツ引用と関連Webページ");
			data.put("ss_05_edit01", "編集");
			data.put("ss_05_nothing_w", "（作成されたコンテンツはありません。 ）");
			data.put("ss_05_cancel03", "キャンセル");
			data.put("ss_05_content_s", "コンテンツ引用");
			data.put("ss_05_complete01", "完了");
			data.put("ss_05_cnw02", "コンテンツ引用と関連Webページ");
			data.put("ss_05_complete02", "完了");
			data.put("ss_05_allow_m", "1:1メッセージを許可する");
			data.put("ss_05_msg04", "1:1のメッセージを許可すると、他のユーザーが作成したコンテンツで{0}チャンニムにメッセージを送ることができます。");
			data.put("ss_05_add_com", "広告追加");
			data.put("ss_05_msg05", "広告追加をONにすると、タグと関連付けられている広告が一緒に表示されます。追加された広告のリワードポイントは会員情報の確認ができます。");
			data.put("ss_05_c_info", "コスト情報");
			data.put("ss_05_msg06", "コンテンツと関連したコスト情報を入力することができます。例：価格、購入コスト、使用料、旅費等");
			data.put("ss_05__c_info02", "コスト情報");
			data.put("ss_05_complete", "完了");
			data.put("ss_06_title", "(title)");
			data.put("ss_07_comment", "comment");
			data.put("ss_07_whitqb", "withQed by");
			data.put("ss_07_withq", "{0} withQ");
			data.put("ss_07_thanq", "{0} thanq");
			data.put("ss_07_c_place", "広告スペース");
			data.put("ss_07_r_content", "related content");
			data.put("first_name", "名前");
			data.put("last_name", "性");
			data.put("latitude", "緯度");
			data.put("longitude", "経度");
			data.put("lang", "言語");
			data.put("user_name", "ユーザー名");
			data.put("keyword", "キーワード");
			data.put("default_matome_name", "基本的なまとめ");
			data.put("smut", "低俗な言葉やポルノグラフィック");
			data.put("personal_attack", "個人攻撃や集団攻撃の性向");
			data.put("violence", "暴力的なグラフィック");
			data.put("curse", "呪いの言葉、お守り、グラフィックス");
			data.put("spam", "あまりにも過度な迷惑な広告");
			data.put("etc", "その他");
			data.put("signup", "");
			data.put("guest_mode", "");
			data.put("thanks", "");
		}
		private JAClass(){
			super(data);
		}

		@Override
		public Map<String, String> get(){
			return data;
		}
		
		@Override
		public String getHello(){
			return "こんにちは";
		}
		
		@Override
		public String get200(){
			return "申し訳ありません。システムエラーが発生しました。 ";
		}
		
		@Override
		public String get201(){
			return "申し訳ありません。今はシステムメンテナンス中です。";
		}
		
		@Override
		public String get202(){
			return "申し訳ありません。 {0}から{1}までシステムメンテナンス中です。";
		}
		
		@Override
		public String get221(){
			return "{0}は必要値です。";
		}
		
		@Override
		public String get222(){
			return "{0}は実数でなければななりません。";
		}
		
		@Override
		public String get223(){
			return "{0}は整数ででなければななりません。";
		}
		
		@Override
		public String get224(){
			return "{0}は {1}のいずれかででなければななりません。";
		}
		
		@Override
		public String get225(){
			return "{0}は日付フォーマットでなければななりません。";
		}
		
		@Override
		public String get226(){
			return "{0}は時間フォーマットでなければななりません。";
		}
		
		@Override
		public String get227(){
			return "{0}は日付 - 時間フォーマットでなければななりません。";
		}
		
		@Override
		public String get228(){
			return "{0}は e - mailフォーマットでなければななりません。";
		}
		
		@Override
		public String get231(){
			return "{0}は {1}文字以下でなければななりません。";
		}
		
		@Override
		public String get232(){
			return "{0}は {1}文字以上でなければななりません。";
		}
		
		@Override
		public String get233(){
			return "{0}は最大{1}です。";
		}
		
		@Override
		public String get234(){
			return "{0}は最小{1}です。";
		}
		
		@Override
		public String get235(){
			return "{0}は最大{1}個まで入力可能です。";
		}
		
		@Override
		public String get236(){
			return "{0}は最小{1}つ入力する必要があります。";
		}
		
		@Override
		public String get241(){
			return "{0}があるとき{1}は必ず入力する必要があります。";
		}
		
		@Override
		public String get242(){
			return "{0}や{1}のいずれかでなければななりません。";
		}
		
		@Override
		public String get243(){
			return "{0}が{2}のいずれかのときに{1}は、入力する必要があります。";
		}
		
		@Override
		public String get244(){
			return "{0}が{2}のいずれかでは場合に{1}は、入力する必要があります。";
		}
		
		@Override
		public String get300(){
			return "SessionKey error 。";
		}
		
		@Override
		public String get301(){
			return "データベースエラー。";
		}
		
		@Override
		public String get302(){
			return "すでに登録された{0}です。";
		}
		
		@Override
		public String get303(){
			return "すでに登録された{0}です。";
		}
		
		@Override
		public String get304(){
			return "すでに登録された{0}です。";
		}
		
		@Override
		public String get305(){
			return "空白を許可しない";
		}
		
		@Override
		public String get310(){
			return "{0}は存在しないメールアドレスです。";
		}
		
		@Override
		public String get311(){
			return "電子メールの作成に失敗しました。";
		}
		
		@Override
		public String get330(){
			return "所有関係が正しくありません。";
		}
		
		@Override
		public String get333(){
			return "Permissionはありません。";
		}
		
		@Override
		public String get401(){
			return "ログイン失敗";
		}
		
		@Override
		public String get402(){
			return "存在しないユーザー名または電子メール、またはパスワードが間違っています。";
		}
		
		@Override
		public String get403(){
			return "パスワードが間違っています。";
		}
		
		@Override
		public String get501(){
			return "存在していないまとめです。";
		}
		
		@Override
		public String get502(){
			return "所有権のないまとめです。";
		}
		
		@Override
		public String get503(){
			return "文書を書く権限がないまとめです。";
		}
		
		@Override
		public String get521(){
			return "画像のレイアウトが正しくありません。";
		}
		
		@Override
		public String get601(){
			return "変更、および削除ができない文書です。";
		}
		
		@Override
		public String get602(){
			return "存在しない文書です。";
		}
		
		@Override
		public String get901(){
			return "サポートしていない画像形式です。";
		}
		
		@Override
		public String get902(){
			return "入力できない文字が含まれています。";
		}
		
		@Override
		public String getVtOkPasswordChange(){
			return "パスワードの変更方法を{0}[で]メールを送信しました。";
		}
		
		@Override
		public String getKey(){
			return "キー";
		}
		
		@Override
		public String getTest(){
			return "テスト";
		}
		
		@Override
		public String getResType(){
			return "応答タイプ";
		}
		
		@Override
		public String getProgramError(){
			return "プログラムエラー";
		}
		
		@Override
		public String getStatus(){
			return "状態";
		}
		
		@Override
		public String getLogin(){
			return "ログイン";
		}
		
		@Override
		public String getUserId(){
			return "ユーザーID";
		}
		
		@Override
		public String getPassword(){
			return "パスワード";
		}
		
		@Override
		public String getName(){
			return "名前";
		}
		
		@Override
		public String getEmail(){
			return "メール";
		}
		
		@Override
		public String getDescription(){
			return "詳細説明";
		}
		
		@Override
		public String getDesc(){
			return "詳細説明";
		}
		
		@Override
		public String getCurrentVersion(){
			return "現在のバージョン";
		}
		
		@Override
		public String getError(){
			return "エラー";
		}
		
		@Override
		public String getRegDt(){
			return "登録日";
		}
		
		@Override
		public String getSs01Login(){
			return "ログイン";
		}
		
		@Override
		public String getSs01Thanks(){
			return "Thanks";
		}
		
		@Override
		public String getSs01Signup(){
			return "会員登録";
		}
		
		@Override
		public String getSs01GuestMode(){
			return "ゲストモード";
		}
		
		@Override
		public String getSs02Thanks(){
			return "Thanks";
		}
		
		@Override
		public String getSs02Login(){
			return "ログイン";
		}
		
		@Override
		public String getSs02TwitterLogin(){
			return "ツイッターでログインする";
		}
		
		@Override
		public String getSs02FacebookLogin(){
			return "Facebookでログインする";
		}
		
		@Override
		public String getSs02Or(){
			return "または";
		}
		
		@Override
		public String getSs02UserNameOrEmail(){
			return "ユーザー名または電子メール";
		}
		
		@Override
		public String getSs02Password(){
			return "パスワード";
		}
		
		@Override
		public String getSs02ForgetPassword(){
			return "パスワードをお忘れですか？";
		}
		
		@Override
		public String getSs02CancelLogin(){
			return "ログインキャンセル";
		}
		
		@Override
		public String getSs02Signup(){
			return "会員登録";
		}
		
		@Override
		public String getSs02PassInfo(){
			return "下のメール欄にメールアドレスを入力してください。そのメールにパスワードのリセットする方法をお送りいたします。";
		}
		
		@Override
		public String getSs02Email(){
			return "メール";
		}
		
		@Override
		public String getSs02ResetPassowrd(){
			return "パスワードのリセット";
		}
		
		@Override
		public String getSs02BackToLogin(){
			return "ログインに戻る";
		}
		
		@Override
		public String getSs02EnterPassword(){
			return "{0}のパスワードを入力してください。";
		}
		
		@Override
		public String getSs02PasswordChanged(){
			return "これで新しいパスワードでログインすることができます。";
		}
		
		@Override
		public String getSs02FullName(){
			return "名前";
		}
		
		@Override
		public String getSs02UserName(){
			return "ユーザー名";
		}
		
		@Override
		public String getSs03Setting(){
			return "設定";
		}
		
		@Override
		public String getSs03Peronalization(){
			return "個人化";
		}
		
		@Override
		public String getSs03Profile(){
			return "プロファイル";
		}
		
		@Override
		public String getSs03Account(){
			return "アカウント";
		}
		
		@Override
		public String getSs03Localization(){
			return "言語および地域";
		}
		
		@Override
		public String getSs03ContentLiicensing(){
			return "コンテンツと著作権";
		}
		
		@Override
		public String getSs03HistoryNotificatoin(){
			return "履歴および通知";
		}
		
		@Override
		public String getSs03ContentHistory(){
			return "通知履歴";
		}
		
		@Override
		public String getSs03RewardHistory(){
			return "補償内容";
		}
		
		@Override
		public String getSs03Notification(){
			return "通知設定";
		}
		
		@Override
		public String getSs03External(){
			return "連動情報の設定";
		}
		
		@Override
		public String getSs03Social(){
			return "ソーシャル連動";
		}
		
		@Override
		public String getSs03Application(){
			return "アプリケーション";
		}
		
		@Override
		public String getSs03About(){
			return "ThanQについて。";
		}
		
		@Override
		public String getSs03Notice(){
			return "お知らせ";
		}
		
		@Override
		public String getSs03Shop(){
			return "Shop";
		}
		
		@Override
		public String getSs03ShopRegister(){
			return "Shop登録";
		}
		
		@Override
		public String getSs03ShopManage(){
			return "Shop管理";
		}
		
		@Override
		public String getSs03ChangeImage(){
			return "プロファイル画像の変更";
		}
		
		@Override
		public String getSs03FirstName(){
			return "名前";
		}
		
		@Override
		public String getSs03LastName(){
			return "性";
		}
		
		@Override
		public String getSs03Gender(){
			return "性別";
		}
		
		@Override
		public String getSs03Birthday(){
			return "誕生日";
		}
		
		@Override
		public String getSs03Interests(){
			return "お気に入り情報選択";
		}
		
		@Override
		public String getSs03TakePhoto(){
			return "写真を撮る";
		}
		
		@Override
		public String getSs03ChoosePhoto(){
			return "写真の選択";
		}
		
		@Override
		public String getSs03Cancel(){
			return "キャンセル";
		}
		
		@Override
		public String getSs03Retake(){
			return "再度撮影する";
		}
		
		@Override
		public String getSs03Scale(){
			return "サイズ変更";
		}
		
		@Override
		public String getSs03Use(){
			return "使用する";
		}
		
		@Override
		public String getSs03Accountp(){
			return "系";
		}
		
		@Override
		public String getSs03Email(){
			return "メール";
		}
		
		@Override
		public String getSs03LetPeopleLook(){
			return "他のユーザーが電子メールで私を検索できます。";
		}
		
		@Override
		public String getSs03Password(){
			return "パスワード";
		}
		
		@Override
		public String getSs03Url(){
			return "URL";
		}
		
		@Override
		public String getSs03PostByEmail(){
			return "Post by E - mail";
		}
		
		@Override
		public String getSs03AddEmail(){
			return "メールアドレスの追加";
		}
		
		@Override
		public String getSs03AccountDelete(){
			return "アカウントの削除";
		}
		
		@Override
		public String getSs03Uemail(){
			return "更新メール";
		}
		
		@Override
		public String getSs03EmailUpdate(){
			return "メールアドレスの更新";
		}
		
		@Override
		public String getSs03Nemail(){
			return "新しいメールアドレス";
		}
		
		@Override
		public String getSs03NemailCheck(){
			return "メールアドレス確認";
		}
		
		@Override
		public String getSs03ThanksPassword(){
			return "Thanksパスワード";
		}
		
		@Override
		public String getSs03Emailupdate(){
			return "メールアドレスの更新";
		}
		
		@Override
		public String getSs03IncorretEmail(){
			return "メールアドレスが正しく入力されていません。";
		}
		
		@Override
		public String getSs03Ok(){
			return "確認";
		}
		
		@Override
		public String getSs03IncorretPassword(){
			return "パスワードが正しく入力されていません。";
		}
		
		@Override
		public String getSs03EmailUpdated(){
			return "メールアドレスが更新されました。";
		}
		
		@Override
		public String getSs03Upassword(){
			return "Update Password";
		}
		
		@Override
		public String getSs03PasswordUpdate(){
			return "パスワードの更新";
		}
		
		@Override
		public String getSs03Opassword(){
			return "既存のパスワード";
		}
		
		@Override
		public String getSs03Npassword(){
			return "新しいパスワード";
		}
		
		@Override
		public String getSs03Npasswordcheck(){
			return "新しいパスワードの確認";
		}
		
		@Override
		public String getSs03Passwordupdate(){
			return "パスワードの更新";
		}
		
		@Override
		public String getSs03IncorrectOpassword(){
			return "既存のパスワードが正しく入力されていません。";
		}
		
		@Override
		public String getSs03IncorrectNpassword(){
			return "新しいパスワードが正しく入力されていません。";
		}
		
		@Override
		public String getSs03PasswordUpdated(){
			return "パスワードが更新されました。";
		}
		
		@Override
		public String getSs03Uurl(){
			return "Update URL";
		}
		
		@Override
		public String getSs03UrlUpdate(){
			return "URLを更新";
		}
		
		@Override
		public String getSs03Thankscom(){
			return "thanks.com";
		}
		
		@Override
		public String getSs03Tpassword(){
			return "Thanksパスワード";
		}
		
		@Override
		public String getSs03Urlupdate(){
			return "URLを更新";
		}
		
		@Override
		public String getSs03Cantuseurl(){
			return "入力されたURLは使用することができません。";
		}
		
		@Override
		public String getSs03IncorrectTpassword(){
			return "パスワードが正しくありません。";
		}
		
		@Override
		public String getSs03UrlUpdated(){
			return "URLを更新しました。";
		}
		
		@Override
		public String getSs03Pbemail(){
			return "Post by E - mail";
		}
		
		@Override
		public String getSs03AddContact(){
			return "アドレス帳に追加";
		}
		
		@Override
		public String getSs03Msg01(){
			return "会員がコンテンツを投稿することができる固有の電子メールアドレスです。電子メールでテキスト、写真、ウェブリンクをお送くると、自動的にコンテンツが登録されます。";
		}
		
		@Override
		public String getSs03Msg02(){
			return "アカウントにスパムメールが送信される場合は、 '電子メールのリセット'をクリックして、固有電子メールを作成してください。";
		}
		
		@Override
		public String getSs03EmailReset(){
			return "メールのリセット";
		}
		
		@Override
		public String getSs03Resetemail(){
			return "メールアドレスをリセットしますか？";
		}
		
		@Override
		public String getSs03Accountdeletecheck(){
			return "アカウント削除の確認";
		}
		
		@Override
		public String getSs03Msg03(){
			return "会員のアカウントの削除を確認するためにパスワードを入力し、アカウントの削除ボタンを押してください。削除されたアカウントは復元することができません。アカウントの削除の詳細については、会員規約の内容を参考にしてください。ありがとうございます。";
		}
		
		@Override
		public String getSs03Terms(){
			return "会員規約を見る";
		}
		
		@Override
		public String getSs03Msg06(){
			return "アカウント削除の確認のためにパスワードを入力してください。";
		}
		
		@Override
		public String getSs03Deleteaccount(){
			return "アカウントを削除します。";
		}
		
		@Override
		public String getSs03IncorrectPassword(){
			return "パスワードが正しくありません。";
		}
		
		@Override
		public String getSs03AccountDeleted(){
			return "アカウントの削除が完了しました。";
		}
		
		@Override
		public String getSs04Text(){
			return "Text";
		}
		
		@Override
		public String getSs04Photo(){
			return "Photo";
		}
		
		@Override
		public String getSs04Video(){
			return "Video";
		}
		
		@Override
		public String getSs04Audio(){
			return "Audio";
		}
		
		@Override
		public String getSs04Story(){
			return "Story";
		}
		
		@Override
		public String getSs04Link(){
			return "Link";
		}
		
		@Override
		public String getSs04Profile(){
			return "会員情報の表示";
		}
		
		@Override
		public String getSs04ChangeMember(){
			return "{ 0 会員に変更しますか？";
		}
		
		@Override
		public String getSs04Cancle(){
			return "キャンセル";
		}
		
		@Override
		public String getSs04Ok(){
			return "確認";
		}
		
		@Override
		public String getSs04MemberInfo(){
			return "member info";
		}
		
		@Override
		public String getSs04Follower(){
			return "フォロワー";
		}
		
		@Override
		public String getSs04Following(){
			return "フォロー";
		}
		
		@Override
		public String getSs04Subscribing(){
			return "購読中";
		}
		
		@Override
		public String getSs04SubscribingAllContent(){
			return "すべてのコンテンツを購読します。";
		}
		
		@Override
		public String getSs04FollowAll(){
			return "Follow All";
		}
		
		@Override
		public String getSs04UnfollowAll(){
			return "Unfollow All";
		}
		
		@Override
		public String getSs04Matome(){
			return "まとめ";
		}
		
		@Override
		public String getSs04Content(){
			return "コンテンツ";
		}
		
		@Override
		public String getSs04Thanq(){
			return "thanQ";
		}
		
		@Override
		public String getSs04Subscribe02(){
			return "Subscribe";
		}
		
		@Override
		public String getSs04Thanq1(){
			return "thanQ";
		}
		
		@Override
		public String getSs04Subscribe01(){
			return "購読する";
		}
		
		@Override
		public String getSs04FlagMember(){
			return "Flag_member";
		}
		
		@Override
		public String getSs04ReportM(){
			return "Report {0}";
		}
		
		@Override
		public String getSs04BlockM(){
			return "Block {0}";
		}
		
		@Override
		public String getSs04Block(){
			return "block";
		}
		
		@Override
		public String getSs04BlockMember(){
			return "Block member";
		}
		
		@Override
		public String getSs04BlockMember1(){
			return "Block {0}";
		}
		
		@Override
		public String getSs04BlockMsg(){
			return "{0}さんをブロックすると、 {0}さんとチャットの会話が不可能になり、 {0}さんのコンテンツが会員様のページにはこれ以上表示されません。";
		}
		
		@Override
		public String getSs04ReportMember(){
			return "Report member";
		}
		
		@Override
		public String getSs04Summit(){
			return "提出";
		}
		
		@Override
		public String getSs04ReportHbs(){
			return "{0}のレポートが提出されました。";
		}
		
		@Override
		public String getSs04CancelSummit(){
			return "提出の取り消し";
		}
		
		@Override
		public String getSs04MemberHbb(){
			return "{0}がブロックされました。";
		}
		
		@Override
		public String getSs04CancelBlock(){
			return "ブロック解除";
		}
		
		@Override
		public String getSs04Edit01(){
			return "編集する";
		}
		
		@Override
		public String getSs04Subscribe03(){
			return "購読する";
		}
		
		@Override
		public String getSs04WoMatome(){
			return "{0}まとめに書く";
		}
		
		@Override
		public String getSs04CancelSubscribe(){
			return "購読を解除する";
		}
		
		@Override
		public String getSs04EditMimage01(){
			return "まとめ代表画像編集";
		}
		
		@Override
		public String getSs04Edit02(){
			return "Edit";
		}
		
		@Override
		public String getSs04MatomeReportHbs(){
			return "{0}まとめのレポートを提出しました。";
		}
		
		@Override
		public String getSs04CrMatome01(){
			return "新しいまとめボードの作成";
		}
		
		@Override
		public String getSs04CrMatome02(){
			return "Create matome";
		}
		
		@Override
		public String getSs04Complete(){
			return "完了";
		}
		
		@Override
		public String getSs04EditImage02(){
			return "まとめ代表画像編集（オプション）";
		}
		
		@Override
		public String getSs04MName(){
			return "まとめタイトル";
		}
		
		@Override
		public String getSs04MExplain(){
			return "まとめ説明";
		}
		
		@Override
		public String getSs04MCategory(){
			return "まとめカテゴリ";
		}
		
		@Override
		public String getSs04MOption(){
			return "まとめビューのオプション";
		}
		
		@Override
		public String getSs04MOpen(){
			return "オープンまとめ（誰でも見ることができます）";
		}
		
		@Override
		public String getSs04MSubscriber(){
			return "購読使用者まとめ（購読使用者のみ見ることができます）";
		}
		
		@Override
		public String getSs04Private(){
			return "非公開まとめ（私だけ見ることができます）";
		}
		
		@Override
		public String getSs04MCOption(){
			return "まとめコンテンツの作成オプション";
		}
		
		@Override
		public String getSs04Me(){
			return "私だけ作成可能";
		}
		
		@Override
		public String getSs04MS(){
			return "私と購読使用者の作成可能";
		}
		
		@Override
		public String getSs04MAll(){
			return "すべての使用者が作成可能";
		}
		
		@Override
		public String getSs04EditMatome(){
			return "Edit matome";
		}
		
		@Override
		public String getSs04EditComplete(){
			return "編集完了";
		}
		
		@Override
		public String getSs04DeleteMatome01(){
			return "まとめを削除する";
		}
		
		@Override
		public String getSs04DeleteMatome02(){
			return "{0}まとめを削除しますか？まとめの中のすべてのコンテンツが削除されます。";
		}
		
		@Override
		public String getSs04CancelDelete(){
			return "削除キャンセル";
		}
		
		@Override
		public String getSs04DeleteMimage(){
			return "{0}まとめ代表画像を削除しますか？";
		}
		
		@Override
		public String getSs05Cancle01(){
			return "キャンセル";
		}
		
		@Override
		public String getSs05WComplete(){
			return "作成完了";
		}
		
		@Override
		public String getSs05Subject(){
			return "タイトル（ option ）";
		}
		
		@Override
		public String getSs05Contents(){
			return "内容";
		}
		
		@Override
		public String getSs05Tag(){
			return "＃タグ";
		}
		
		@Override
		public String getSs05SMatome01(){
			return "Select a Matome";
		}
		
		@Override
		public String getSs05SMatome02(){
			return "Select Matome";
		}
		
		@Override
		public String getSs05MNmatome(){
			return "新しいまとめボードの作成";
		}
		
		@Override
		public String getSs05SImageWay(){
			return "写真を追加する方法を選択してください。";
		}
		
		@Override
		public String getSs05TPhoto(){
			return "写真を撮る";
		}
		
		@Override
		public String getSs05SPhoto(){
			return "アルバムの写真を選択";
		}
		
		@Override
		public String getSs05CbImage(){
			return "クリップボードの画像";
		}
		
		@Override
		public String getSs05Cancel02(){
			return "キャンセル";
		}
		
		@Override
		public String getSs05Msg01(){
			return "写真は10枚まで添付可能です。";
		}
		
		@Override
		public String getSs05Ok(){
			return "確認";
		}
		
		@Override
		public String getSs05Clipboard(){
			return "クリップボード";
		}
		
		@Override
		public String getSs05SComplete(){
			return "選択完了";
		}
		
		@Override
		public String getSs05Msg02(){
			return "コンテンツの転送が失敗して作成されたコンテンツが下書きに保存されました。";
		}
		
		@Override
		public String getSs05Msg03(){
			return "アップロードする添付ファイルの容量が10MB以上です。アップロードしますか？";
		}
		
		@Override
		public String getSs05TKeep(){
			return "一時保管";
		}
		
		@Override
		public String getSs05RUpload(){
			return "アップロードの実行";
		}
		
		@Override
		public String getSs05PLocation(){
			return "現在位置";
		}
		
		@Override
		public String getSs05WCountry(){
			return "全国";
		}
		
		@Override
		public String getSs05Cwn01(){
			return "コンテンツ引用と関連Webページ";
		}
		
		@Override
		public String getSs05Edit01(){
			return "編集";
		}
		
		@Override
		public String getSs05NothingW(){
			return "（作成されたコンテンツはありません。 ）";
		}
		
		@Override
		public String getSs05Cancel03(){
			return "キャンセル";
		}
		
		@Override
		public String getSs05ContentS(){
			return "コンテンツ引用";
		}
		
		@Override
		public String getSs05Complete01(){
			return "完了";
		}
		
		@Override
		public String getSs05Cnw02(){
			return "コンテンツ引用と関連Webページ";
		}
		
		@Override
		public String getSs05Complete02(){
			return "完了";
		}
		
		@Override
		public String getSs05AllowM(){
			return "1:1メッセージを許可する";
		}
		
		@Override
		public String getSs05Msg04(){
			return "1:1のメッセージを許可すると、他のユーザーが作成したコンテンツで{0}チャンニムにメッセージを送ることができます。";
		}
		
		@Override
		public String getSs05AddCom(){
			return "広告追加";
		}
		
		@Override
		public String getSs05Msg05(){
			return "広告追加をONにすると、タグと関連付けられている広告が一緒に表示されます。追加された広告のリワードポイントは会員情報の確認ができます。";
		}
		
		@Override
		public String getSs05CInfo(){
			return "コスト情報";
		}
		
		@Override
		public String getSs05Msg06(){
			return "コンテンツと関連したコスト情報を入力することができます。例：価格、購入コスト、使用料、旅費等";
		}
		
		@Override
		public String getSs05CInfo02(){
			return "コスト情報";
		}
		
		@Override
		public String getSs05Complete(){
			return "完了";
		}
		
		@Override
		public String getSs06Title(){
			return "(title)";
		}
		
		@Override
		public String getSs07Comment(){
			return "comment";
		}
		
		@Override
		public String getSs07Whitqb(){
			return "withQed by";
		}
		
		@Override
		public String getSs07Withq(){
			return "{0} withQ";
		}
		
		@Override
		public String getSs07Thanq(){
			return "{0} thanq";
		}
		
		@Override
		public String getSs07CPlace(){
			return "広告スペース";
		}
		
		@Override
		public String getSs07RContent(){
			return "related content";
		}
		
		@Override
		public String getFirstName(){
			return "名前";
		}
		
		@Override
		public String getLastName(){
			return "性";
		}
		
		@Override
		public String getLatitude(){
			return "緯度";
		}
		
		@Override
		public String getLongitude(){
			return "経度";
		}
		
		@Override
		public String getLang(){
			return "言語";
		}
		
		@Override
		public String getUserName(){
			return "ユーザー名";
		}
		
		@Override
		public String getKeyword(){
			return "キーワード";
		}
		
		@Override
		public String getDefaultMatomeName(){
			return "基本的なまとめ";
		}
		
		@Override
		public String getSmut(){
			return "低俗な言葉やポルノグラフィック";
		}
		
		@Override
		public String getPersonalAttack(){
			return "個人攻撃や集団攻撃の性向";
		}
		
		@Override
		public String getViolence(){
			return "暴力的なグラフィック";
		}
		
		@Override
		public String getCurse(){
			return "呪いの言葉、お守り、グラフィックス";
		}
		
		@Override
		public String getSpam(){
			return "あまりにも過度な迷惑な広告";
		}
		
		@Override
		public String getEtc(){
			return "その他";
		}
		
		@Override
		public String getSignup(){
			return "";
		}
		
		@Override
		public String getGuestMode(){
			return "";
		}
		
		@Override
		public String getThanks(){
			return "";
		}
		
	}
	
	public static final kr.co.mnbiz.api.message.MessageManager KO = new KOClass();
	
	private static class KOClass extends kr.co.mnbiz.api.message.KrMessageManager implements ProjectMessage{

		private static Map<String, String> data = new HashMap<String, String>();
		static{
			
			data.put("hello", "안녕하세요.");
			data.put("200", "죄송합니다. 시스템 에러가 발생하였습니다.");
			data.put("201", "죄송합니다. 지금은 시스템 점검 중입니다.");
			data.put("202", "죄송합니다. {0} 부터 {1} 까지 시스템 점검 중입니다.");
			data.put("221", "{0}[는/은] 필수값입니다.");
			data.put("222", "{0}[는/은] 실수여야 합니다.");
			data.put("223", "{0}[는/은] 정수여야 합니다.");
			data.put("224", "{0}[는/은] {1} 중 하나여야 합니다.");
			data.put("225", "{0}[는/은] 날짜 포맷이어야 합니다.");
			data.put("226", "{0}[는/은] 시간 포맷이어야 합니다.");
			data.put("227", "{0}[는/은] 날짜-시간 포맷이어야 합니다.");
			data.put("228", "{0}[는/은] e-mail 포맷이어야 합니다.");
			data.put("231", "{0}[는/은] {1}글자 이하여야 합니다.");
			data.put("232", "{0}[는/은] {1}글자 이상이여야 합니다.");
			data.put("233", "{0}[는/은] 최대 {1} 입니다.");
			data.put("234", "{0}[는/은] 최소 {1} 입니다.");
			data.put("235", "{0}[는/은] 최대 {1} 개까지만 입력가능합니다.");
			data.put("236", "{0}[는/은] 최소 {1} 개 입력해야 합니다.");
			data.put("241", "{0}[가/이] 있을 때 {1}[는/은] 반드시 입력되어야 합니다.");
			data.put("242", "{0}[나/이나] {1} 중 하나는 되어야 합니다.");
			data.put("243", "{0}[가/이] {2} 중 하나일 때 {1}은 입력되어야 합니다.");
			data.put("244", "{0}[가/이] {2} 중 하나가 아닐 때 {1}은 입력되어야 합니다.");
			data.put("300", "SessionKey error.");
			data.put("301", "데이터 베이스 에러.");
			data.put("302", "이미 등록된 {0}입니다.");
			data.put("303", "이미 등록된 {0}입니다.");
			data.put("304", "이미 등록된 {0}입니다.");
			data.put("305", "빈칸허용 안함");
			data.put("310", "{0}은 존재하지 않는 이메일 입니다.");
			data.put("311", "이메일 생성에 실패했습니다.");
			data.put("330", "소유관계가 옳바르지 않습니다.");
			data.put("333", "Permission이 없습니다.");
			data.put("401", "로그인 실패");
			data.put("402", "존재하지 않는 사용자 이름 또는 이메일이거나 암호가 틀렸습니다.");
			data.put("403", "암호가 틀렸습니다.");
			data.put("501", "존재하지 않는 마토메입니다.");
			data.put("502", "소유권이 없는 마토메입니다.");
			data.put("503", "글을 쓸 권한이 없는 마토메입니다.");
			data.put("521", "이미지 레이아웃이 잘못되었습니다.");
			data.put("601", "수정 및 삭제가 불가능한 글입니다.");
			data.put("602", "존재하지 않는 글입니다.");
			data.put("901", "지원하지 않는 이미지 포맷입니다.");
			data.put("902", "넣을 수 없는 문자가 포함되어있습니다.");
			data.put("vt_ok_password_change", "암호 변경하는 방법을 {0}[로/으로] 이메일을 발송하였습니다.");
			data.put("key", "키");
			data.put("test", "테스트");
			data.put("res-type", "응답 타입");
			data.put("program-error", "프로그램 에러");
			data.put("status", "상태");
			data.put("login", "로그인");
			data.put("user_id", "사용자 아이디");
			data.put("password", "암호");
			data.put("name", "이름");
			data.put("email", "이메일");
			data.put("description", "상세설명");
			data.put("desc", "상세설명");
			data.put("current_version", "현재 버젼");
			data.put("error", "에러");
			data.put("reg_dt", "등록일");
			data.put("ss_01_login", "로그인");
			data.put("ss_01_thanks", "고마왕");
			data.put("ss_01_signup", "회원가입");
			data.put("ss_01_guest_mode", "손님 모드");
			data.put("ss_02_thanks", "Thanks");
			data.put("ss_02_login", "로그인");
			data.put("ss_02_twitter_login", "트위터로 로그인하기");
			data.put("ss_02_facebook_login", "Facebook으로 로그인 하기");
			data.put("ss_02_or", "또는");
			data.put("ss_02_user_name_or_email", "사용자 이름 또는 이메일");
			data.put("ss_02_password", "암호");
			data.put("ss_02_forget_password", "암호를 분실하셨나요?");
			data.put("ss_02_cancel_login", "로그인 취소");
			data.put("ss_02_signup", "회원 가입");
			data.put("ss_02_pass_info", "아래에 이메일란에 이메일을 적어주시면 이메일로 암호 재설정하는 방법을 보내드립니다.");
			data.put("ss_02_email", "이메일");
			data.put("ss_02_reset_passowrd", "암호 재설정");
			data.put("ss_02_back_to_login", "로그인으로 돌아가기");
			data.put("ss_02_enter_password", "{0}에 대한 암호를 입력해 주세요.");
			data.put("ss_02_password_changed", "이제 새로운 암호로 로그인하실 수 있습니다.");
			data.put("ss_02_full_name", "이름");
			data.put("ss_02_user_name", "사용자 이름");
			data.put("ss_03_setting", "설정");
			data.put("ss_03_peronalization", "개인화");
			data.put("ss_03_profile", "프로파일");
			data.put("ss_03_account", "계정");
			data.put("ss_03_localization", "언어 및 지역");
			data.put("ss_03_content_liicensing", "컨텐트 및 저작권");
			data.put("ss_03_history_notificatoin", "히스토리 및 알림");
			data.put("ss_03_content_history", "알림 내역");
			data.put("ss_03_reward_history", "보상 내역");
			data.put("ss_03_notification", "알림 설정");
			data.put("ss_03_external", "연동 정보 설정");
			data.put("ss_03_social", "소셜 연동");
			data.put("ss_03_application", "애플리케이션");
			data.put("ss_03_about", "ThanQ에 대해서..");
			data.put("ss_03_notice", "공지사항");
			data.put("ss_03_shop", "Shop");
			data.put("ss_03_shop_register", "Shop 신청하기");
			data.put("ss_03_shop_manage", "Shop 관리하기");
			data.put("ss_03_change_image", "프로파일 사진 변경");
			data.put("ss_03_first_name", "이름");
			data.put("ss_03_last_name", "성");
			data.put("ss_03_gender", "성별");
			data.put("ss_03_birthday", "생일");
			data.put("ss_03_interests", "관심 정보 선택");
			data.put("ss_03_take_photo", "사진 찍기");
			data.put("ss_03_choose_photo", "사진에서 선택");
			data.put("ss_03_cancel", "취소");
			data.put("ss_03_retake", "다시찍기");
			data.put("ss_03_scale", "크기조정");
			data.put("ss_03_use", "사용하기");
			data.put("ss_03_accountp", "계");
			data.put("ss_03_email", "이메일");
			data.put("ss_03_let_people_look", "다른 사용자가 이 이메일로 나를 찾을수있습니다.");
			data.put("ss_03_password", "비밀번호");
			data.put("ss_03_url", "URL");
			data.put("ss_03_post_by_email", "Post by E-mail");
			data.put("ss_03_add_email", "이메일추가");
			data.put("ss_03_account_delete", "계정삭제");
			data.put("ss_03_uemail", "업데이트 이메일");
			data.put("ss_03_email_update", "이메일 주소 업데이트");
			data.put("ss_03_nemail", "새 이메일");
			data.put("ss_03_nemail_check", "이메일 확인");
			data.put("ss_03_thanks_password", "Thanks 비밀번호");
			data.put("ss_03_emailupdate", "이메일 업데이트");
			data.put("ss_03_incorret_email", "이메일 주소가 올바르게 입력되지 않았습니다. ");
			data.put("ss_03_ok", "확인");
			data.put("ss_03_incorret_password", "비밀번호가 올바르게 입력되지 않았습니다. ");
			data.put("ss_03_email_updated", "이메일 주소가 업데이트 되었습니다.");
			data.put("ss_03_upassword", "Update Password");
			data.put("ss_03_password_update", "패스워드 업데이트");
			data.put("ss_03_opassword", "기존 비밀번호");
			data.put("ss_03_npassword", "새 비밀번호");
			data.put("ss_03_npasswordcheck", "새 비밀번호 확인");
			data.put("ss_03_passwordupdate", "패스워드 업데이트");
			data.put("ss_03_incorrect_opassword", "기존 비밀번호가 올바르게 입력되지 않았습니다.");
			data.put("ss_03_incorrect_npassword", "새 비밀번호가 올바르게 입력되지 않았습니다.");
			data.put("ss_03_password_updated", "비밀번호가 업데이트 되었습니다.");
			data.put("ss_03_uurl", "Update URL");
			data.put("ss_03_url_update", "URL 업데이트");
			data.put("ss_03_thankscom", "thanks.com");
			data.put("ss_03_tpassword", "Thanks 비밀번호");
			data.put("ss_03_urlupdate", "URL 업데이트");
			data.put("ss_03_cantuseurl", "입력하신 URL은 사용하실 수 없습니다. ");
			data.put("ss_03_incorrect_tpassword", "비밀번호가 올바르지 않습니다. ");
			data.put("ss_03_url_updated", "URL이 업데이트 되었습니다. ");
			data.put("ss_03_pbemail", "Post by E-mail ");
			data.put("ss_03_add_contact", "주소록에 추가");
			data.put("ss_03_msg01", "회원님이 콘텐트를 포스팅 할 수 있는 고유 이메일 주소입니다.  이메일로 텍스트, 사진, 웹링크를 보내시면 자동으로 콘텐트가 등록됩니다. ");
			data.put("ss_03_msg02", "계정으로 스팸 메일이 전송된다면, ‘이메일 재설정’을 눌러 새 고유 이메일을 만들어 주십시오. ");
			data.put("ss_03_email_reset", "이메일 재설정");
			data.put("ss_03_resetemail", "이메일 주소를 재설정 하시겠습니까? ");
			data.put("ss_03_accountdeletecheck", "계정 삭제 확인 ");
			data.put("ss_03_msg03", "회원님의 계정 삭제를 확인하기 위하여 비밀번호를 입력 후 계정삭제 버튼을 눌러 주십시오. 삭제된 계정은 복구 하실 수 없습니다. 계정 삭제에 대한 자세한 사항은 회원 약관의 내용을 참고 부탁드리겠습니다. 감사합니다.");
			data.put("ss_03_terms", "회원약관보기");
			data.put("ss_03_msg06", "계정삭제 확인을 위하여 비밀번호를 입력해 주십시오. ");
			data.put("ss_03_deleteaccount", "계정을 삭제 하겠습니다.");
			data.put("ss_03_incorrect_password", "비밀번호가 올바르지 않습니다.");
			data.put("ss_03_account_deleted", "계정 삭제가 완료되었습니다. ");
			data.put("ss_04_text", "Text");
			data.put("ss_04_photo", "Photo");
			data.put("ss_04_video", "Video");
			data.put("ss_04_audio", "Audio");
			data.put("ss_04_story", "Story");
			data.put("ss_04_link", "Link");
			data.put("ss_04_profile", "회원정보 보기");
			data.put("ss_04_change_member", "{0}회원으로 변경하시겠습니까?");
			data.put("ss_04_cancle", "취소");
			data.put("ss_04_ok", "확인");
			data.put("ss_04_member_info", "member info");
			data.put("ss_04_follower", "팔로워");
			data.put("ss_04_following", "팔로잉");
			data.put("ss_04_subscribing", "구독중");
			data.put("ss_04_subscribing_all_content", "모든 콘텐트를 구독합니다.");
			data.put("ss_04_follow_all", "Follow All");
			data.put("ss_04_Unfollow_all", "Unfollow All");
			data.put("ss_04_matome", "마토메");
			data.put("ss_04_content", "콘텐트");
			data.put("ss_04_thanq", "thanQ");
			data.put("ss_04_subscribe02", "Subscribe");
			data.put("ss_04_thanq1", "thanQ");
			data.put("ss_04_subscribe01", "구독하기");
			data.put("ss_04_flag_member", "Flag_member");
			data.put("ss_04_report_m", "Report {0}");
			data.put("ss_04_block_m", "Block {0}");
			data.put("ss_04_block", "block");
			data.put("ss_04_block_member", "Block member");
			data.put("ss_04_block_member1", "Block {0}");
			data.put("ss_04_block_msg", "{0}님을 블럭하시면 {0}님과 채팅 대화가 불가능해 지며 {0}님의 콘텐트가 회원님의 페이지에 더 이상 표시 되지 않습니다. ");
			data.put("ss_04_report_member", "Report member");
			data.put("ss_04_summit", "제출");
			data.put("ss_04_report_hbs", "{0}에 대한 레포트가 제출되었습니다.");
			data.put("ss_04_cancel_summit", "제출 취소");
			data.put("ss_04_member_hbb", "{0}이 블럭되었습니다.");
			data.put("ss_04_cancel_block", "블럭취소");
			data.put("ss_04_edit01", "편집하기");
			data.put("ss_04_subscribe03", "구독하기");
			data.put("ss_04_wo_matome", "{0} 마토메에 글쓰기");
			data.put("ss_04_cancel_subscribe", "구독 해지하기");
			data.put("ss_04_edit_mimage01", "마토메 대표 이미지 편집");
			data.put("ss_04_edit02", "Edit");
			data.put("ss_04_matome_report_hbs", "{0} 마토메에 대한 레포트가 제출되었습니다.");
			data.put("ss_04_cr_matome01", "새로운 마토메 보드 만들기");
			data.put("ss_04_cr_matome02", "Create matome");
			data.put("ss_04_complete", "완료");
			data.put("ss_04_edit_image02", "마토메 대표 이미지 편집 (옵션)");
			data.put("ss_04_m_name", "마토메 제목");
			data.put("ss_04_m_explain", "마토메 설명");
			data.put("ss_04_m_category", "마토메 카테고리");
			data.put("ss_04_m_option", "마토메 보기 옵션");
			data.put("ss_04_m_open", "오픈 마토메 (누구나 볼 수 있음) ");
			data.put("ss_04_m_subscriber", "구독 사용자 마토메 (구독 사용자만 볼수 있음) ");
			data.put("ss_04_private", "비공개 마토메 (나만 볼 수 있음) ");
			data.put("ss_04_m_c_option", "마토메 콘텐트 작성 옵션 ");
			data.put("ss_04_me", "나만 작성 가능 ");
			data.put("ss_04_m_s", "나와 구독 사용자 작성 가능 ");
			data.put("ss_04_m_all", "모든 사용자 작성 가능 ");
			data.put("ss_04_edit_matome", "Edit matome");
			data.put("ss_04_edit_complete", "편집완료");
			data.put("ss_04_delete_matome01", "마토메 삭제하기");
			data.put("ss_04_delete_matome02", "{0} 마토메 삭제하시겠습니까? 마토메 안의 모든 콘텐트가 삭제됩니다.");
			data.put("ss_04_cancel_delete", "삭제 취소");
			data.put("ss_04_delete_mimage", "{0} 마토메 대표 이미지를 삭제 하시겠습니까?");
			data.put("ss_05_cancle01", "취소");
			data.put("ss_05_w_complete", "작성완료");
			data.put("ss_05_subject", "제목 (option)");
			data.put("ss_05_contents", "내용");
			data.put("ss_05_tag", "#태그");
			data.put("ss_05_s_matome01", "Select a Matome");
			data.put("ss_05_s_matome02", "Select Matome");
			data.put("ss_05_m_nmatome", "새로운 마토메 보드 만들기");
			data.put("ss_05_s_image_way", "사진 입력 방법을 선택하세요.");
			data.put("ss_05_t_photo", "사진 찍기");
			data.put("ss_05_s_photo", "앨범 사진 선택");
			data.put("ss_05_cb_image", "클립보드 이미지");
			data.put("ss_05_cancel02", "취소");
			data.put("ss_05_msg01", "사진은 10장까지만 첨부 가능합니다.");
			data.put("ss_05_ok", "확인");
			data.put("ss_05_clipboard", "클립 보드");
			data.put("ss_05_s_complete", "선택 완료");
			data.put("ss_05_msg02", "콘텐트 전송이 실패하여 작성하신 콘텐트가 임시보관함에 저장되었습니다. ");
			data.put("ss_05_msg03", "업로드할 첨부 파일의 용량이 10MB 이상입니다. 업로드 하시겠습니까? ");
			data.put("ss_05_t_keep", "임시 보관");
			data.put("ss_05_r_upload", "업로드 실행");
			data.put("ss_05_p_location", "현재위치");
			data.put("ss_05_w_country", "전국");
			data.put("ss_05_cwn01", "콘텐트 출처 및 연관 웹 페이지");
			data.put("ss_05_edit01", "편집");
			data.put("ss_05_nothing_w", "(작성된 내용이 없습니다.)");
			data.put("ss_05_cancel03", "취소");
			data.put("ss_05_content_s", "콘텐트 출처");
			data.put("ss_05_complete01", "완료");
			data.put("ss_05_cnw02", "콘텐트 출처 및 연관 웹페이지");
			data.put("ss_05_complete02", "완료");
			data.put("ss_05_allow_m", "1:1 메시지 허용");
			data.put("ss_05_msg04", "1:1 메시지를 허용 하시면 다른 사용자가 작성된 콘텐트를 통해 {0}짱님에게 메시지를 보낼 수 있습니다. ");
			data.put("ss_05_add_com", "광고 추가");
			data.put("ss_05_msg05", "광고 추가를 ON 하시면, 태그와 연관된 광고가 같이 표시됩니다. 추가된 광고에 대한 리워드 포인트는 회원정보에서 확인 가능합니다. ");
			data.put("ss_05_c_info", "비용정보");
			data.put("ss_05_msg06", "콘텐트와 관련한 비용 정보를 입력하실 수 있습니다. 예: 가격, 구매 비용, 사용료, 여행 경비 등등 ");
			data.put("ss_05__c_info02", "비용 정보");
			data.put("ss_05_complete", "완료");
			data.put("ss_06_title", "(title)");
			data.put("ss_07_comment", "comment");
			data.put("ss_07_whitqb", "withQed by");
			data.put("ss_07_withq", "{0} withQ");
			data.put("ss_07_thanq", "{0} thanq");
			data.put("ss_07_c_place", "광고 영역");
			data.put("ss_07_r_content", "related content");
			data.put("first_name", "이름");
			data.put("last_name", "성");
			data.put("latitude", "위도");
			data.put("longitude", "경도");
			data.put("lang", "언어");
			data.put("user_name", "사용자이름");
			data.put("keyword", "키워드");
			data.put("default_matome_name", "기본마토메");
			data.put("smut", "음란패설 또는 포르노 그라픽");
			data.put("personal_attack", "인신 공격 또는 집단 공격 성향");
			data.put("violence", "폭력적인 그래픽");
			data.put("curse", "저주하는 말, 부적, 그래픽");
			data.put("spam", "너무 과도한 스팸성 광고");
			data.put("etc", "기타");
			data.put("signup", "가입");
			data.put("guest_mode", "방문하기");
			data.put("thanks", "고마워");
		}
		private KOClass(){
			super(data);
		}

		@Override
		public Map<String, String> get(){
			return data;
		}
		
		@Override
		public String getHello(){
			return "안녕하세요.";
		}
		
		@Override
		public String get200(){
			return "죄송합니다. 시스템 에러가 발생하였습니다.";
		}
		
		@Override
		public String get201(){
			return "죄송합니다. 지금은 시스템 점검 중입니다.";
		}
		
		@Override
		public String get202(){
			return "죄송합니다. {0} 부터 {1} 까지 시스템 점검 중입니다.";
		}
		
		@Override
		public String get221(){
			return "{0}[는/은] 필수값입니다.";
		}
		
		@Override
		public String get222(){
			return "{0}[는/은] 실수여야 합니다.";
		}
		
		@Override
		public String get223(){
			return "{0}[는/은] 정수여야 합니다.";
		}
		
		@Override
		public String get224(){
			return "{0}[는/은] {1} 중 하나여야 합니다.";
		}
		
		@Override
		public String get225(){
			return "{0}[는/은] 날짜 포맷이어야 합니다.";
		}
		
		@Override
		public String get226(){
			return "{0}[는/은] 시간 포맷이어야 합니다.";
		}
		
		@Override
		public String get227(){
			return "{0}[는/은] 날짜-시간 포맷이어야 합니다.";
		}
		
		@Override
		public String get228(){
			return "{0}[는/은] e-mail 포맷이어야 합니다.";
		}
		
		@Override
		public String get231(){
			return "{0}[는/은] {1}글자 이하여야 합니다.";
		}
		
		@Override
		public String get232(){
			return "{0}[는/은] {1}글자 이상이여야 합니다.";
		}
		
		@Override
		public String get233(){
			return "{0}[는/은] 최대 {1} 입니다.";
		}
		
		@Override
		public String get234(){
			return "{0}[는/은] 최소 {1} 입니다.";
		}
		
		@Override
		public String get235(){
			return "{0}[는/은] 최대 {1} 개까지만 입력가능합니다.";
		}
		
		@Override
		public String get236(){
			return "{0}[는/은] 최소 {1} 개 입력해야 합니다.";
		}
		
		@Override
		public String get241(){
			return "{0}[가/이] 있을 때 {1}[는/은] 반드시 입력되어야 합니다.";
		}
		
		@Override
		public String get242(){
			return "{0}[나/이나] {1} 중 하나는 되어야 합니다.";
		}
		
		@Override
		public String get243(){
			return "{0}[가/이] {2} 중 하나일 때 {1}은 입력되어야 합니다.";
		}
		
		@Override
		public String get244(){
			return "{0}[가/이] {2} 중 하나가 아닐 때 {1}은 입력되어야 합니다.";
		}
		
		@Override
		public String get300(){
			return "SessionKey error.";
		}
		
		@Override
		public String get301(){
			return "데이터 베이스 에러.";
		}
		
		@Override
		public String get302(){
			return "이미 등록된 {0}입니다.";
		}
		
		@Override
		public String get303(){
			return "이미 등록된 {0}입니다.";
		}
		
		@Override
		public String get304(){
			return "이미 등록된 {0}입니다.";
		}
		
		@Override
		public String get305(){
			return "빈칸허용 안함";
		}
		
		@Override
		public String get310(){
			return "{0}은 존재하지 않는 이메일 입니다.";
		}
		
		@Override
		public String get311(){
			return "이메일 생성에 실패했습니다.";
		}
		
		@Override
		public String get330(){
			return "소유관계가 옳바르지 않습니다.";
		}
		
		@Override
		public String get333(){
			return "Permission이 없습니다.";
		}
		
		@Override
		public String get401(){
			return "로그인 실패";
		}
		
		@Override
		public String get402(){
			return "존재하지 않는 사용자 이름 또는 이메일이거나 암호가 틀렸습니다.";
		}
		
		@Override
		public String get403(){
			return "암호가 틀렸습니다.";
		}
		
		@Override
		public String get501(){
			return "존재하지 않는 마토메입니다.";
		}
		
		@Override
		public String get502(){
			return "소유권이 없는 마토메입니다.";
		}
		
		@Override
		public String get503(){
			return "글을 쓸 권한이 없는 마토메입니다.";
		}
		
		@Override
		public String get521(){
			return "이미지 레이아웃이 잘못되었습니다.";
		}
		
		@Override
		public String get601(){
			return "수정 및 삭제가 불가능한 글입니다.";
		}
		
		@Override
		public String get602(){
			return "존재하지 않는 글입니다.";
		}
		
		@Override
		public String get901(){
			return "지원하지 않는 이미지 포맷입니다.";
		}
		
		@Override
		public String get902(){
			return "넣을 수 없는 문자가 포함되어있습니다.";
		}
		
		@Override
		public String getVtOkPasswordChange(){
			return "암호 변경하는 방법을 {0}[로/으로] 이메일을 발송하였습니다.";
		}
		
		@Override
		public String getKey(){
			return "키";
		}
		
		@Override
		public String getTest(){
			return "테스트";
		}
		
		@Override
		public String getResType(){
			return "응답 타입";
		}
		
		@Override
		public String getProgramError(){
			return "프로그램 에러";
		}
		
		@Override
		public String getStatus(){
			return "상태";
		}
		
		@Override
		public String getLogin(){
			return "로그인";
		}
		
		@Override
		public String getUserId(){
			return "사용자 아이디";
		}
		
		@Override
		public String getPassword(){
			return "암호";
		}
		
		@Override
		public String getName(){
			return "이름";
		}
		
		@Override
		public String getEmail(){
			return "이메일";
		}
		
		@Override
		public String getDescription(){
			return "상세설명";
		}
		
		@Override
		public String getDesc(){
			return "상세설명";
		}
		
		@Override
		public String getCurrentVersion(){
			return "현재 버젼";
		}
		
		@Override
		public String getError(){
			return "에러";
		}
		
		@Override
		public String getRegDt(){
			return "등록일";
		}
		
		@Override
		public String getSs01Login(){
			return "로그인";
		}
		
		@Override
		public String getSs01Thanks(){
			return "고마왕";
		}
		
		@Override
		public String getSs01Signup(){
			return "회원가입";
		}
		
		@Override
		public String getSs01GuestMode(){
			return "손님 모드";
		}
		
		@Override
		public String getSs02Thanks(){
			return "Thanks";
		}
		
		@Override
		public String getSs02Login(){
			return "로그인";
		}
		
		@Override
		public String getSs02TwitterLogin(){
			return "트위터로 로그인하기";
		}
		
		@Override
		public String getSs02FacebookLogin(){
			return "Facebook으로 로그인 하기";
		}
		
		@Override
		public String getSs02Or(){
			return "또는";
		}
		
		@Override
		public String getSs02UserNameOrEmail(){
			return "사용자 이름 또는 이메일";
		}
		
		@Override
		public String getSs02Password(){
			return "암호";
		}
		
		@Override
		public String getSs02ForgetPassword(){
			return "암호를 분실하셨나요?";
		}
		
		@Override
		public String getSs02CancelLogin(){
			return "로그인 취소";
		}
		
		@Override
		public String getSs02Signup(){
			return "회원 가입";
		}
		
		@Override
		public String getSs02PassInfo(){
			return "아래에 이메일란에 이메일을 적어주시면 이메일로 암호 재설정하는 방법을 보내드립니다.";
		}
		
		@Override
		public String getSs02Email(){
			return "이메일";
		}
		
		@Override
		public String getSs02ResetPassowrd(){
			return "암호 재설정";
		}
		
		@Override
		public String getSs02BackToLogin(){
			return "로그인으로 돌아가기";
		}
		
		@Override
		public String getSs02EnterPassword(){
			return "{0}에 대한 암호를 입력해 주세요.";
		}
		
		@Override
		public String getSs02PasswordChanged(){
			return "이제 새로운 암호로 로그인하실 수 있습니다.";
		}
		
		@Override
		public String getSs02FullName(){
			return "이름";
		}
		
		@Override
		public String getSs02UserName(){
			return "사용자 이름";
		}
		
		@Override
		public String getSs03Setting(){
			return "설정";
		}
		
		@Override
		public String getSs03Peronalization(){
			return "개인화";
		}
		
		@Override
		public String getSs03Profile(){
			return "프로파일";
		}
		
		@Override
		public String getSs03Account(){
			return "계정";
		}
		
		@Override
		public String getSs03Localization(){
			return "언어 및 지역";
		}
		
		@Override
		public String getSs03ContentLiicensing(){
			return "컨텐트 및 저작권";
		}
		
		@Override
		public String getSs03HistoryNotificatoin(){
			return "히스토리 및 알림";
		}
		
		@Override
		public String getSs03ContentHistory(){
			return "알림 내역";
		}
		
		@Override
		public String getSs03RewardHistory(){
			return "보상 내역";
		}
		
		@Override
		public String getSs03Notification(){
			return "알림 설정";
		}
		
		@Override
		public String getSs03External(){
			return "연동 정보 설정";
		}
		
		@Override
		public String getSs03Social(){
			return "소셜 연동";
		}
		
		@Override
		public String getSs03Application(){
			return "애플리케이션";
		}
		
		@Override
		public String getSs03About(){
			return "ThanQ에 대해서..";
		}
		
		@Override
		public String getSs03Notice(){
			return "공지사항";
		}
		
		@Override
		public String getSs03Shop(){
			return "Shop";
		}
		
		@Override
		public String getSs03ShopRegister(){
			return "Shop 신청하기";
		}
		
		@Override
		public String getSs03ShopManage(){
			return "Shop 관리하기";
		}
		
		@Override
		public String getSs03ChangeImage(){
			return "프로파일 사진 변경";
		}
		
		@Override
		public String getSs03FirstName(){
			return "이름";
		}
		
		@Override
		public String getSs03LastName(){
			return "성";
		}
		
		@Override
		public String getSs03Gender(){
			return "성별";
		}
		
		@Override
		public String getSs03Birthday(){
			return "생일";
		}
		
		@Override
		public String getSs03Interests(){
			return "관심 정보 선택";
		}
		
		@Override
		public String getSs03TakePhoto(){
			return "사진 찍기";
		}
		
		@Override
		public String getSs03ChoosePhoto(){
			return "사진에서 선택";
		}
		
		@Override
		public String getSs03Cancel(){
			return "취소";
		}
		
		@Override
		public String getSs03Retake(){
			return "다시찍기";
		}
		
		@Override
		public String getSs03Scale(){
			return "크기조정";
		}
		
		@Override
		public String getSs03Use(){
			return "사용하기";
		}
		
		@Override
		public String getSs03Accountp(){
			return "계";
		}
		
		@Override
		public String getSs03Email(){
			return "이메일";
		}
		
		@Override
		public String getSs03LetPeopleLook(){
			return "다른 사용자가 이 이메일로 나를 찾을수있습니다.";
		}
		
		@Override
		public String getSs03Password(){
			return "비밀번호";
		}
		
		@Override
		public String getSs03Url(){
			return "URL";
		}
		
		@Override
		public String getSs03PostByEmail(){
			return "Post by E-mail";
		}
		
		@Override
		public String getSs03AddEmail(){
			return "이메일추가";
		}
		
		@Override
		public String getSs03AccountDelete(){
			return "계정삭제";
		}
		
		@Override
		public String getSs03Uemail(){
			return "업데이트 이메일";
		}
		
		@Override
		public String getSs03EmailUpdate(){
			return "이메일 주소 업데이트";
		}
		
		@Override
		public String getSs03Nemail(){
			return "새 이메일";
		}
		
		@Override
		public String getSs03NemailCheck(){
			return "이메일 확인";
		}
		
		@Override
		public String getSs03ThanksPassword(){
			return "Thanks 비밀번호";
		}
		
		@Override
		public String getSs03Emailupdate(){
			return "이메일 업데이트";
		}
		
		@Override
		public String getSs03IncorretEmail(){
			return "이메일 주소가 올바르게 입력되지 않았습니다. ";
		}
		
		@Override
		public String getSs03Ok(){
			return "확인";
		}
		
		@Override
		public String getSs03IncorretPassword(){
			return "비밀번호가 올바르게 입력되지 않았습니다. ";
		}
		
		@Override
		public String getSs03EmailUpdated(){
			return "이메일 주소가 업데이트 되었습니다.";
		}
		
		@Override
		public String getSs03Upassword(){
			return "Update Password";
		}
		
		@Override
		public String getSs03PasswordUpdate(){
			return "패스워드 업데이트";
		}
		
		@Override
		public String getSs03Opassword(){
			return "기존 비밀번호";
		}
		
		@Override
		public String getSs03Npassword(){
			return "새 비밀번호";
		}
		
		@Override
		public String getSs03Npasswordcheck(){
			return "새 비밀번호 확인";
		}
		
		@Override
		public String getSs03Passwordupdate(){
			return "패스워드 업데이트";
		}
		
		@Override
		public String getSs03IncorrectOpassword(){
			return "기존 비밀번호가 올바르게 입력되지 않았습니다.";
		}
		
		@Override
		public String getSs03IncorrectNpassword(){
			return "새 비밀번호가 올바르게 입력되지 않았습니다.";
		}
		
		@Override
		public String getSs03PasswordUpdated(){
			return "비밀번호가 업데이트 되었습니다.";
		}
		
		@Override
		public String getSs03Uurl(){
			return "Update URL";
		}
		
		@Override
		public String getSs03UrlUpdate(){
			return "URL 업데이트";
		}
		
		@Override
		public String getSs03Thankscom(){
			return "thanks.com";
		}
		
		@Override
		public String getSs03Tpassword(){
			return "Thanks 비밀번호";
		}
		
		@Override
		public String getSs03Urlupdate(){
			return "URL 업데이트";
		}
		
		@Override
		public String getSs03Cantuseurl(){
			return "입력하신 URL은 사용하실 수 없습니다. ";
		}
		
		@Override
		public String getSs03IncorrectTpassword(){
			return "비밀번호가 올바르지 않습니다. ";
		}
		
		@Override
		public String getSs03UrlUpdated(){
			return "URL이 업데이트 되었습니다. ";
		}
		
		@Override
		public String getSs03Pbemail(){
			return "Post by E-mail ";
		}
		
		@Override
		public String getSs03AddContact(){
			return "주소록에 추가";
		}
		
		@Override
		public String getSs03Msg01(){
			return "회원님이 콘텐트를 포스팅 할 수 있는 고유 이메일 주소입니다.  이메일로 텍스트, 사진, 웹링크를 보내시면 자동으로 콘텐트가 등록됩니다. ";
		}
		
		@Override
		public String getSs03Msg02(){
			return "계정으로 스팸 메일이 전송된다면, ‘이메일 재설정’을 눌러 새 고유 이메일을 만들어 주십시오. ";
		}
		
		@Override
		public String getSs03EmailReset(){
			return "이메일 재설정";
		}
		
		@Override
		public String getSs03Resetemail(){
			return "이메일 주소를 재설정 하시겠습니까? ";
		}
		
		@Override
		public String getSs03Accountdeletecheck(){
			return "계정 삭제 확인 ";
		}
		
		@Override
		public String getSs03Msg03(){
			return "회원님의 계정 삭제를 확인하기 위하여 비밀번호를 입력 후 계정삭제 버튼을 눌러 주십시오. 삭제된 계정은 복구 하실 수 없습니다. 계정 삭제에 대한 자세한 사항은 회원 약관의 내용을 참고 부탁드리겠습니다. 감사합니다.";
		}
		
		@Override
		public String getSs03Terms(){
			return "회원약관보기";
		}
		
		@Override
		public String getSs03Msg06(){
			return "계정삭제 확인을 위하여 비밀번호를 입력해 주십시오. ";
		}
		
		@Override
		public String getSs03Deleteaccount(){
			return "계정을 삭제 하겠습니다.";
		}
		
		@Override
		public String getSs03IncorrectPassword(){
			return "비밀번호가 올바르지 않습니다.";
		}
		
		@Override
		public String getSs03AccountDeleted(){
			return "계정 삭제가 완료되었습니다. ";
		}
		
		@Override
		public String getSs04Text(){
			return "Text";
		}
		
		@Override
		public String getSs04Photo(){
			return "Photo";
		}
		
		@Override
		public String getSs04Video(){
			return "Video";
		}
		
		@Override
		public String getSs04Audio(){
			return "Audio";
		}
		
		@Override
		public String getSs04Story(){
			return "Story";
		}
		
		@Override
		public String getSs04Link(){
			return "Link";
		}
		
		@Override
		public String getSs04Profile(){
			return "회원정보 보기";
		}
		
		@Override
		public String getSs04ChangeMember(){
			return "{0}회원으로 변경하시겠습니까?";
		}
		
		@Override
		public String getSs04Cancle(){
			return "취소";
		}
		
		@Override
		public String getSs04Ok(){
			return "확인";
		}
		
		@Override
		public String getSs04MemberInfo(){
			return "member info";
		}
		
		@Override
		public String getSs04Follower(){
			return "팔로워";
		}
		
		@Override
		public String getSs04Following(){
			return "팔로잉";
		}
		
		@Override
		public String getSs04Subscribing(){
			return "구독중";
		}
		
		@Override
		public String getSs04SubscribingAllContent(){
			return "모든 콘텐트를 구독합니다.";
		}
		
		@Override
		public String getSs04FollowAll(){
			return "Follow All";
		}
		
		@Override
		public String getSs04UnfollowAll(){
			return "Unfollow All";
		}
		
		@Override
		public String getSs04Matome(){
			return "마토메";
		}
		
		@Override
		public String getSs04Content(){
			return "콘텐트";
		}
		
		@Override
		public String getSs04Thanq(){
			return "thanQ";
		}
		
		@Override
		public String getSs04Subscribe02(){
			return "Subscribe";
		}
		
		@Override
		public String getSs04Thanq1(){
			return "thanQ";
		}
		
		@Override
		public String getSs04Subscribe01(){
			return "구독하기";
		}
		
		@Override
		public String getSs04FlagMember(){
			return "Flag_member";
		}
		
		@Override
		public String getSs04ReportM(){
			return "Report {0}";
		}
		
		@Override
		public String getSs04BlockM(){
			return "Block {0}";
		}
		
		@Override
		public String getSs04Block(){
			return "block";
		}
		
		@Override
		public String getSs04BlockMember(){
			return "Block member";
		}
		
		@Override
		public String getSs04BlockMember1(){
			return "Block {0}";
		}
		
		@Override
		public String getSs04BlockMsg(){
			return "{0}님을 블럭하시면 {0}님과 채팅 대화가 불가능해 지며 {0}님의 콘텐트가 회원님의 페이지에 더 이상 표시 되지 않습니다. ";
		}
		
		@Override
		public String getSs04ReportMember(){
			return "Report member";
		}
		
		@Override
		public String getSs04Summit(){
			return "제출";
		}
		
		@Override
		public String getSs04ReportHbs(){
			return "{0}에 대한 레포트가 제출되었습니다.";
		}
		
		@Override
		public String getSs04CancelSummit(){
			return "제출 취소";
		}
		
		@Override
		public String getSs04MemberHbb(){
			return "{0}이 블럭되었습니다.";
		}
		
		@Override
		public String getSs04CancelBlock(){
			return "블럭취소";
		}
		
		@Override
		public String getSs04Edit01(){
			return "편집하기";
		}
		
		@Override
		public String getSs04Subscribe03(){
			return "구독하기";
		}
		
		@Override
		public String getSs04WoMatome(){
			return "{0} 마토메에 글쓰기";
		}
		
		@Override
		public String getSs04CancelSubscribe(){
			return "구독 해지하기";
		}
		
		@Override
		public String getSs04EditMimage01(){
			return "마토메 대표 이미지 편집";
		}
		
		@Override
		public String getSs04Edit02(){
			return "Edit";
		}
		
		@Override
		public String getSs04MatomeReportHbs(){
			return "{0} 마토메에 대한 레포트가 제출되었습니다.";
		}
		
		@Override
		public String getSs04CrMatome01(){
			return "새로운 마토메 보드 만들기";
		}
		
		@Override
		public String getSs04CrMatome02(){
			return "Create matome";
		}
		
		@Override
		public String getSs04Complete(){
			return "완료";
		}
		
		@Override
		public String getSs04EditImage02(){
			return "마토메 대표 이미지 편집 (옵션)";
		}
		
		@Override
		public String getSs04MName(){
			return "마토메 제목";
		}
		
		@Override
		public String getSs04MExplain(){
			return "마토메 설명";
		}
		
		@Override
		public String getSs04MCategory(){
			return "마토메 카테고리";
		}
		
		@Override
		public String getSs04MOption(){
			return "마토메 보기 옵션";
		}
		
		@Override
		public String getSs04MOpen(){
			return "오픈 마토메 (누구나 볼 수 있음) ";
		}
		
		@Override
		public String getSs04MSubscriber(){
			return "구독 사용자 마토메 (구독 사용자만 볼수 있음) ";
		}
		
		@Override
		public String getSs04Private(){
			return "비공개 마토메 (나만 볼 수 있음) ";
		}
		
		@Override
		public String getSs04MCOption(){
			return "마토메 콘텐트 작성 옵션 ";
		}
		
		@Override
		public String getSs04Me(){
			return "나만 작성 가능 ";
		}
		
		@Override
		public String getSs04MS(){
			return "나와 구독 사용자 작성 가능 ";
		}
		
		@Override
		public String getSs04MAll(){
			return "모든 사용자 작성 가능 ";
		}
		
		@Override
		public String getSs04EditMatome(){
			return "Edit matome";
		}
		
		@Override
		public String getSs04EditComplete(){
			return "편집완료";
		}
		
		@Override
		public String getSs04DeleteMatome01(){
			return "마토메 삭제하기";
		}
		
		@Override
		public String getSs04DeleteMatome02(){
			return "{0} 마토메 삭제하시겠습니까? 마토메 안의 모든 콘텐트가 삭제됩니다.";
		}
		
		@Override
		public String getSs04CancelDelete(){
			return "삭제 취소";
		}
		
		@Override
		public String getSs04DeleteMimage(){
			return "{0} 마토메 대표 이미지를 삭제 하시겠습니까?";
		}
		
		@Override
		public String getSs05Cancle01(){
			return "취소";
		}
		
		@Override
		public String getSs05WComplete(){
			return "작성완료";
		}
		
		@Override
		public String getSs05Subject(){
			return "제목 (option)";
		}
		
		@Override
		public String getSs05Contents(){
			return "내용";
		}
		
		@Override
		public String getSs05Tag(){
			return "#태그";
		}
		
		@Override
		public String getSs05SMatome01(){
			return "Select a Matome";
		}
		
		@Override
		public String getSs05SMatome02(){
			return "Select Matome";
		}
		
		@Override
		public String getSs05MNmatome(){
			return "새로운 마토메 보드 만들기";
		}
		
		@Override
		public String getSs05SImageWay(){
			return "사진 입력 방법을 선택하세요.";
		}
		
		@Override
		public String getSs05TPhoto(){
			return "사진 찍기";
		}
		
		@Override
		public String getSs05SPhoto(){
			return "앨범 사진 선택";
		}
		
		@Override
		public String getSs05CbImage(){
			return "클립보드 이미지";
		}
		
		@Override
		public String getSs05Cancel02(){
			return "취소";
		}
		
		@Override
		public String getSs05Msg01(){
			return "사진은 10장까지만 첨부 가능합니다.";
		}
		
		@Override
		public String getSs05Ok(){
			return "확인";
		}
		
		@Override
		public String getSs05Clipboard(){
			return "클립 보드";
		}
		
		@Override
		public String getSs05SComplete(){
			return "선택 완료";
		}
		
		@Override
		public String getSs05Msg02(){
			return "콘텐트 전송이 실패하여 작성하신 콘텐트가 임시보관함에 저장되었습니다. ";
		}
		
		@Override
		public String getSs05Msg03(){
			return "업로드할 첨부 파일의 용량이 10MB 이상입니다. 업로드 하시겠습니까? ";
		}
		
		@Override
		public String getSs05TKeep(){
			return "임시 보관";
		}
		
		@Override
		public String getSs05RUpload(){
			return "업로드 실행";
		}
		
		@Override
		public String getSs05PLocation(){
			return "현재위치";
		}
		
		@Override
		public String getSs05WCountry(){
			return "전국";
		}
		
		@Override
		public String getSs05Cwn01(){
			return "콘텐트 출처 및 연관 웹 페이지";
		}
		
		@Override
		public String getSs05Edit01(){
			return "편집";
		}
		
		@Override
		public String getSs05NothingW(){
			return "(작성된 내용이 없습니다.)";
		}
		
		@Override
		public String getSs05Cancel03(){
			return "취소";
		}
		
		@Override
		public String getSs05ContentS(){
			return "콘텐트 출처";
		}
		
		@Override
		public String getSs05Complete01(){
			return "완료";
		}
		
		@Override
		public String getSs05Cnw02(){
			return "콘텐트 출처 및 연관 웹페이지";
		}
		
		@Override
		public String getSs05Complete02(){
			return "완료";
		}
		
		@Override
		public String getSs05AllowM(){
			return "1:1 메시지 허용";
		}
		
		@Override
		public String getSs05Msg04(){
			return "1:1 메시지를 허용 하시면 다른 사용자가 작성된 콘텐트를 통해 {0}짱님에게 메시지를 보낼 수 있습니다. ";
		}
		
		@Override
		public String getSs05AddCom(){
			return "광고 추가";
		}
		
		@Override
		public String getSs05Msg05(){
			return "광고 추가를 ON 하시면, 태그와 연관된 광고가 같이 표시됩니다. 추가된 광고에 대한 리워드 포인트는 회원정보에서 확인 가능합니다. ";
		}
		
		@Override
		public String getSs05CInfo(){
			return "비용정보";
		}
		
		@Override
		public String getSs05Msg06(){
			return "콘텐트와 관련한 비용 정보를 입력하실 수 있습니다. 예: 가격, 구매 비용, 사용료, 여행 경비 등등 ";
		}
		
		@Override
		public String getSs05CInfo02(){
			return "비용 정보";
		}
		
		@Override
		public String getSs05Complete(){
			return "완료";
		}
		
		@Override
		public String getSs06Title(){
			return "(title)";
		}
		
		@Override
		public String getSs07Comment(){
			return "comment";
		}
		
		@Override
		public String getSs07Whitqb(){
			return "withQed by";
		}
		
		@Override
		public String getSs07Withq(){
			return "{0} withQ";
		}
		
		@Override
		public String getSs07Thanq(){
			return "{0} thanq";
		}
		
		@Override
		public String getSs07CPlace(){
			return "광고 영역";
		}
		
		@Override
		public String getSs07RContent(){
			return "related content";
		}
		
		@Override
		public String getFirstName(){
			return "이름";
		}
		
		@Override
		public String getLastName(){
			return "성";
		}
		
		@Override
		public String getLatitude(){
			return "위도";
		}
		
		@Override
		public String getLongitude(){
			return "경도";
		}
		
		@Override
		public String getLang(){
			return "언어";
		}
		
		@Override
		public String getUserName(){
			return "사용자이름";
		}
		
		@Override
		public String getKeyword(){
			return "키워드";
		}
		
		@Override
		public String getDefaultMatomeName(){
			return "기본마토메";
		}
		
		@Override
		public String getSmut(){
			return "음란패설 또는 포르노 그라픽";
		}
		
		@Override
		public String getPersonalAttack(){
			return "인신 공격 또는 집단 공격 성향";
		}
		
		@Override
		public String getViolence(){
			return "폭력적인 그래픽";
		}
		
		@Override
		public String getCurse(){
			return "저주하는 말, 부적, 그래픽";
		}
		
		@Override
		public String getSpam(){
			return "너무 과도한 스팸성 광고";
		}
		
		@Override
		public String getEtc(){
			return "기타";
		}
		
		@Override
		public String getSignup(){
			return "가입";
		}
		
		@Override
		public String getGuestMode(){
			return "방문하기";
		}
		
		@Override
		public String getThanks(){
			return "고마워";
		}
		
	}
	
	public static final kr.co.mnbiz.api.message.MessageManager ZH = new ZHClass();
	
	private static class ZHClass extends kr.co.mnbiz.api.message.MessageManager implements ProjectMessage{

		private static Map<String, String> data = new HashMap<String, String>();
		static{
			
			data.put("hello", "你 好");
			data.put("200", "");
			data.put("201", "");
			data.put("202", "");
			data.put("221", "");
			data.put("222", "");
			data.put("223", "");
			data.put("224", "");
			data.put("225", "");
			data.put("226", "");
			data.put("227", "");
			data.put("228", "");
			data.put("231", "");
			data.put("232", "");
			data.put("233", "");
			data.put("234", "");
			data.put("235", "");
			data.put("236", "");
			data.put("241", "");
			data.put("242", "");
			data.put("243", "");
			data.put("244", "");
			data.put("300", "");
			data.put("301", "");
			data.put("302", "");
			data.put("303", "");
			data.put("304", "");
			data.put("305", "");
			data.put("310", "");
			data.put("311", "");
			data.put("330", "");
			data.put("333", "");
			data.put("401", "");
			data.put("402", "");
			data.put("403", "");
			data.put("501", "");
			data.put("502", "");
			data.put("503", "");
			data.put("521", "");
			data.put("601", "");
			data.put("602", "");
			data.put("901", "");
			data.put("902", "");
			data.put("vt_ok_password_change", "");
			data.put("key", "");
			data.put("test", "");
			data.put("res-type", "");
			data.put("program-error", "");
			data.put("status", "");
			data.put("login", "");
			data.put("user_id", "");
			data.put("password", "");
			data.put("name", "");
			data.put("email", "");
			data.put("description", "");
			data.put("desc", "");
			data.put("current_version", "");
			data.put("error", "");
			data.put("reg_dt", "");
			data.put("ss_01_login", "");
			data.put("ss_01_thanks", "");
			data.put("ss_01_signup", "");
			data.put("ss_01_guest_mode", "");
			data.put("ss_02_thanks", "");
			data.put("ss_02_login", "");
			data.put("ss_02_twitter_login", "");
			data.put("ss_02_facebook_login", "");
			data.put("ss_02_or", "");
			data.put("ss_02_user_name_or_email", "");
			data.put("ss_02_password", "");
			data.put("ss_02_forget_password", "");
			data.put("ss_02_cancel_login", "");
			data.put("ss_02_signup", "");
			data.put("ss_02_pass_info", "");
			data.put("ss_02_email", "");
			data.put("ss_02_reset_passowrd", "");
			data.put("ss_02_back_to_login", "");
			data.put("ss_02_enter_password", "");
			data.put("ss_02_password_changed", "");
			data.put("ss_02_full_name", "");
			data.put("ss_02_user_name", "");
			data.put("ss_03_setting", "");
			data.put("ss_03_peronalization", "");
			data.put("ss_03_profile", "");
			data.put("ss_03_account", "");
			data.put("ss_03_localization", "");
			data.put("ss_03_content_liicensing", "");
			data.put("ss_03_history_notificatoin", "");
			data.put("ss_03_content_history", "");
			data.put("ss_03_reward_history", "");
			data.put("ss_03_notification", "");
			data.put("ss_03_external", "");
			data.put("ss_03_social", "");
			data.put("ss_03_application", "");
			data.put("ss_03_about", "");
			data.put("ss_03_notice", "");
			data.put("ss_03_shop", "");
			data.put("ss_03_shop_register", "");
			data.put("ss_03_shop_manage", "");
			data.put("ss_03_change_image", "");
			data.put("ss_03_first_name", "");
			data.put("ss_03_last_name", "");
			data.put("ss_03_gender", "");
			data.put("ss_03_birthday", "");
			data.put("ss_03_interests", "");
			data.put("ss_03_take_photo", "");
			data.put("ss_03_choose_photo", "");
			data.put("ss_03_cancel", "");
			data.put("ss_03_retake", "");
			data.put("ss_03_scale", "");
			data.put("ss_03_use", "");
			data.put("ss_03_accountp", "");
			data.put("ss_03_email", "");
			data.put("ss_03_let_people_look", "");
			data.put("ss_03_password", "");
			data.put("ss_03_url", "");
			data.put("ss_03_post_by_email", "");
			data.put("ss_03_add_email", "");
			data.put("ss_03_account_delete", "");
			data.put("ss_03_uemail", "");
			data.put("ss_03_email_update", "");
			data.put("ss_03_nemail", "");
			data.put("ss_03_nemail_check", "");
			data.put("ss_03_thanks_password", "");
			data.put("ss_03_emailupdate", "");
			data.put("ss_03_incorret_email", "");
			data.put("ss_03_ok", "");
			data.put("ss_03_incorret_password", "");
			data.put("ss_03_email_updated", "");
			data.put("ss_03_upassword", "");
			data.put("ss_03_password_update", "");
			data.put("ss_03_opassword", "");
			data.put("ss_03_npassword", "");
			data.put("ss_03_npasswordcheck", "");
			data.put("ss_03_passwordupdate", "");
			data.put("ss_03_incorrect_opassword", "");
			data.put("ss_03_incorrect_npassword", "");
			data.put("ss_03_password_updated", "");
			data.put("ss_03_uurl", "");
			data.put("ss_03_url_update", "");
			data.put("ss_03_thankscom", "");
			data.put("ss_03_tpassword", "");
			data.put("ss_03_urlupdate", "");
			data.put("ss_03_cantuseurl", "");
			data.put("ss_03_incorrect_tpassword", "");
			data.put("ss_03_url_updated", "");
			data.put("ss_03_pbemail", "");
			data.put("ss_03_add_contact", "");
			data.put("ss_03_msg01", "");
			data.put("ss_03_msg02", "");
			data.put("ss_03_email_reset", "");
			data.put("ss_03_resetemail", "");
			data.put("ss_03_accountdeletecheck", "");
			data.put("ss_03_msg03", "");
			data.put("ss_03_terms", "");
			data.put("ss_03_msg06", "");
			data.put("ss_03_deleteaccount", "");
			data.put("ss_03_incorrect_password", "");
			data.put("ss_03_account_deleted", "");
			data.put("ss_04_text", "");
			data.put("ss_04_photo", "");
			data.put("ss_04_video", "");
			data.put("ss_04_audio", "");
			data.put("ss_04_story", "");
			data.put("ss_04_link", "");
			data.put("ss_04_profile", "");
			data.put("ss_04_change_member", "");
			data.put("ss_04_cancle", "");
			data.put("ss_04_ok", "");
			data.put("ss_04_member_info", "");
			data.put("ss_04_follower", "");
			data.put("ss_04_following", "");
			data.put("ss_04_subscribing", "");
			data.put("ss_04_subscribing_all_content", "");
			data.put("ss_04_follow_all", "");
			data.put("ss_04_Unfollow_all", "");
			data.put("ss_04_matome", "");
			data.put("ss_04_content", "");
			data.put("ss_04_thanq", "");
			data.put("ss_04_subscribe02", "");
			data.put("ss_04_thanq1", "");
			data.put("ss_04_subscribe01", "");
			data.put("ss_04_flag_member", "");
			data.put("ss_04_report_m", "");
			data.put("ss_04_block_m", "");
			data.put("ss_04_block", "");
			data.put("ss_04_block_member", "");
			data.put("ss_04_block_member1", "");
			data.put("ss_04_block_msg", "");
			data.put("ss_04_report_member", "");
			data.put("ss_04_summit", "");
			data.put("ss_04_report_hbs", "");
			data.put("ss_04_cancel_summit", "");
			data.put("ss_04_member_hbb", "");
			data.put("ss_04_cancel_block", "");
			data.put("ss_04_edit01", "");
			data.put("ss_04_subscribe03", "");
			data.put("ss_04_wo_matome", "");
			data.put("ss_04_cancel_subscribe", "");
			data.put("ss_04_edit_mimage01", "");
			data.put("ss_04_edit02", "");
			data.put("ss_04_matome_report_hbs", "");
			data.put("ss_04_cr_matome01", "");
			data.put("ss_04_cr_matome02", "");
			data.put("ss_04_complete", "");
			data.put("ss_04_edit_image02", "");
			data.put("ss_04_m_name", "");
			data.put("ss_04_m_explain", "");
			data.put("ss_04_m_category", "");
			data.put("ss_04_m_option", "");
			data.put("ss_04_m_open", "");
			data.put("ss_04_m_subscriber", "");
			data.put("ss_04_private", "");
			data.put("ss_04_m_c_option", "");
			data.put("ss_04_me", "");
			data.put("ss_04_m_s", "");
			data.put("ss_04_m_all", "");
			data.put("ss_04_edit_matome", "");
			data.put("ss_04_edit_complete", "");
			data.put("ss_04_delete_matome01", "");
			data.put("ss_04_delete_matome02", "");
			data.put("ss_04_cancel_delete", "");
			data.put("ss_04_delete_mimage", "");
			data.put("ss_05_cancle01", "");
			data.put("ss_05_w_complete", "");
			data.put("ss_05_subject", "");
			data.put("ss_05_contents", "");
			data.put("ss_05_tag", "");
			data.put("ss_05_s_matome01", "");
			data.put("ss_05_s_matome02", "");
			data.put("ss_05_m_nmatome", "");
			data.put("ss_05_s_image_way", "");
			data.put("ss_05_t_photo", "");
			data.put("ss_05_s_photo", "");
			data.put("ss_05_cb_image", "");
			data.put("ss_05_cancel02", "");
			data.put("ss_05_msg01", "");
			data.put("ss_05_ok", "");
			data.put("ss_05_clipboard", "");
			data.put("ss_05_s_complete", "");
			data.put("ss_05_msg02", "");
			data.put("ss_05_msg03", "");
			data.put("ss_05_t_keep", "");
			data.put("ss_05_r_upload", "");
			data.put("ss_05_p_location", "");
			data.put("ss_05_w_country", "");
			data.put("ss_05_cwn01", "");
			data.put("ss_05_edit01", "");
			data.put("ss_05_nothing_w", "");
			data.put("ss_05_cancel03", "");
			data.put("ss_05_content_s", "");
			data.put("ss_05_complete01", "");
			data.put("ss_05_cnw02", "");
			data.put("ss_05_complete02", "");
			data.put("ss_05_allow_m", "");
			data.put("ss_05_msg04", "");
			data.put("ss_05_add_com", "");
			data.put("ss_05_msg05", "");
			data.put("ss_05_c_info", "");
			data.put("ss_05_msg06", "");
			data.put("ss_05__c_info02", "");
			data.put("ss_05_complete", "");
			data.put("ss_06_title", "");
			data.put("ss_07_comment", "");
			data.put("ss_07_whitqb", "");
			data.put("ss_07_withq", "");
			data.put("ss_07_thanq", "");
			data.put("ss_07_c_place", "");
			data.put("ss_07_r_content", "");
			data.put("first_name", "");
			data.put("last_name", "");
			data.put("latitude", "");
			data.put("longitude", "");
			data.put("lang", "");
			data.put("user_name", "");
			data.put("keyword", "");
			data.put("default_matome_name", "");
			data.put("smut", "");
			data.put("personal_attack", "");
			data.put("violence", "");
			data.put("curse", "");
			data.put("spam", "");
			data.put("etc", "");
			data.put("signup", "");
			data.put("guest_mode", "");
			data.put("thanks", "");
		}
		private ZHClass(){
			super(data);
		}

		@Override
		public Map<String, String> get(){
			return data;
		}
		
		@Override
		public String getHello(){
			return "你 好";
		}
		
		@Override
		public String get200(){
			return "";
		}
		
		@Override
		public String get201(){
			return "";
		}
		
		@Override
		public String get202(){
			return "";
		}
		
		@Override
		public String get221(){
			return "";
		}
		
		@Override
		public String get222(){
			return "";
		}
		
		@Override
		public String get223(){
			return "";
		}
		
		@Override
		public String get224(){
			return "";
		}
		
		@Override
		public String get225(){
			return "";
		}
		
		@Override
		public String get226(){
			return "";
		}
		
		@Override
		public String get227(){
			return "";
		}
		
		@Override
		public String get228(){
			return "";
		}
		
		@Override
		public String get231(){
			return "";
		}
		
		@Override
		public String get232(){
			return "";
		}
		
		@Override
		public String get233(){
			return "";
		}
		
		@Override
		public String get234(){
			return "";
		}
		
		@Override
		public String get235(){
			return "";
		}
		
		@Override
		public String get236(){
			return "";
		}
		
		@Override
		public String get241(){
			return "";
		}
		
		@Override
		public String get242(){
			return "";
		}
		
		@Override
		public String get243(){
			return "";
		}
		
		@Override
		public String get244(){
			return "";
		}
		
		@Override
		public String get300(){
			return "";
		}
		
		@Override
		public String get301(){
			return "";
		}
		
		@Override
		public String get302(){
			return "";
		}
		
		@Override
		public String get303(){
			return "";
		}
		
		@Override
		public String get304(){
			return "";
		}
		
		@Override
		public String get305(){
			return "";
		}
		
		@Override
		public String get310(){
			return "";
		}
		
		@Override
		public String get311(){
			return "";
		}
		
		@Override
		public String get330(){
			return "";
		}
		
		@Override
		public String get333(){
			return "";
		}
		
		@Override
		public String get401(){
			return "";
		}
		
		@Override
		public String get402(){
			return "";
		}
		
		@Override
		public String get403(){
			return "";
		}
		
		@Override
		public String get501(){
			return "";
		}
		
		@Override
		public String get502(){
			return "";
		}
		
		@Override
		public String get503(){
			return "";
		}
		
		@Override
		public String get521(){
			return "";
		}
		
		@Override
		public String get601(){
			return "";
		}
		
		@Override
		public String get602(){
			return "";
		}
		
		@Override
		public String get901(){
			return "";
		}
		
		@Override
		public String get902(){
			return "";
		}
		
		@Override
		public String getVtOkPasswordChange(){
			return "";
		}
		
		@Override
		public String getKey(){
			return "";
		}
		
		@Override
		public String getTest(){
			return "";
		}
		
		@Override
		public String getResType(){
			return "";
		}
		
		@Override
		public String getProgramError(){
			return "";
		}
		
		@Override
		public String getStatus(){
			return "";
		}
		
		@Override
		public String getLogin(){
			return "";
		}
		
		@Override
		public String getUserId(){
			return "";
		}
		
		@Override
		public String getPassword(){
			return "";
		}
		
		@Override
		public String getName(){
			return "";
		}
		
		@Override
		public String getEmail(){
			return "";
		}
		
		@Override
		public String getDescription(){
			return "";
		}
		
		@Override
		public String getDesc(){
			return "";
		}
		
		@Override
		public String getCurrentVersion(){
			return "";
		}
		
		@Override
		public String getError(){
			return "";
		}
		
		@Override
		public String getRegDt(){
			return "";
		}
		
		@Override
		public String getSs01Login(){
			return "";
		}
		
		@Override
		public String getSs01Thanks(){
			return "";
		}
		
		@Override
		public String getSs01Signup(){
			return "";
		}
		
		@Override
		public String getSs01GuestMode(){
			return "";
		}
		
		@Override
		public String getSs02Thanks(){
			return "";
		}
		
		@Override
		public String getSs02Login(){
			return "";
		}
		
		@Override
		public String getSs02TwitterLogin(){
			return "";
		}
		
		@Override
		public String getSs02FacebookLogin(){
			return "";
		}
		
		@Override
		public String getSs02Or(){
			return "";
		}
		
		@Override
		public String getSs02UserNameOrEmail(){
			return "";
		}
		
		@Override
		public String getSs02Password(){
			return "";
		}
		
		@Override
		public String getSs02ForgetPassword(){
			return "";
		}
		
		@Override
		public String getSs02CancelLogin(){
			return "";
		}
		
		@Override
		public String getSs02Signup(){
			return "";
		}
		
		@Override
		public String getSs02PassInfo(){
			return "";
		}
		
		@Override
		public String getSs02Email(){
			return "";
		}
		
		@Override
		public String getSs02ResetPassowrd(){
			return "";
		}
		
		@Override
		public String getSs02BackToLogin(){
			return "";
		}
		
		@Override
		public String getSs02EnterPassword(){
			return "";
		}
		
		@Override
		public String getSs02PasswordChanged(){
			return "";
		}
		
		@Override
		public String getSs02FullName(){
			return "";
		}
		
		@Override
		public String getSs02UserName(){
			return "";
		}
		
		@Override
		public String getSs03Setting(){
			return "";
		}
		
		@Override
		public String getSs03Peronalization(){
			return "";
		}
		
		@Override
		public String getSs03Profile(){
			return "";
		}
		
		@Override
		public String getSs03Account(){
			return "";
		}
		
		@Override
		public String getSs03Localization(){
			return "";
		}
		
		@Override
		public String getSs03ContentLiicensing(){
			return "";
		}
		
		@Override
		public String getSs03HistoryNotificatoin(){
			return "";
		}
		
		@Override
		public String getSs03ContentHistory(){
			return "";
		}
		
		@Override
		public String getSs03RewardHistory(){
			return "";
		}
		
		@Override
		public String getSs03Notification(){
			return "";
		}
		
		@Override
		public String getSs03External(){
			return "";
		}
		
		@Override
		public String getSs03Social(){
			return "";
		}
		
		@Override
		public String getSs03Application(){
			return "";
		}
		
		@Override
		public String getSs03About(){
			return "";
		}
		
		@Override
		public String getSs03Notice(){
			return "";
		}
		
		@Override
		public String getSs03Shop(){
			return "";
		}
		
		@Override
		public String getSs03ShopRegister(){
			return "";
		}
		
		@Override
		public String getSs03ShopManage(){
			return "";
		}
		
		@Override
		public String getSs03ChangeImage(){
			return "";
		}
		
		@Override
		public String getSs03FirstName(){
			return "";
		}
		
		@Override
		public String getSs03LastName(){
			return "";
		}
		
		@Override
		public String getSs03Gender(){
			return "";
		}
		
		@Override
		public String getSs03Birthday(){
			return "";
		}
		
		@Override
		public String getSs03Interests(){
			return "";
		}
		
		@Override
		public String getSs03TakePhoto(){
			return "";
		}
		
		@Override
		public String getSs03ChoosePhoto(){
			return "";
		}
		
		@Override
		public String getSs03Cancel(){
			return "";
		}
		
		@Override
		public String getSs03Retake(){
			return "";
		}
		
		@Override
		public String getSs03Scale(){
			return "";
		}
		
		@Override
		public String getSs03Use(){
			return "";
		}
		
		@Override
		public String getSs03Accountp(){
			return "";
		}
		
		@Override
		public String getSs03Email(){
			return "";
		}
		
		@Override
		public String getSs03LetPeopleLook(){
			return "";
		}
		
		@Override
		public String getSs03Password(){
			return "";
		}
		
		@Override
		public String getSs03Url(){
			return "";
		}
		
		@Override
		public String getSs03PostByEmail(){
			return "";
		}
		
		@Override
		public String getSs03AddEmail(){
			return "";
		}
		
		@Override
		public String getSs03AccountDelete(){
			return "";
		}
		
		@Override
		public String getSs03Uemail(){
			return "";
		}
		
		@Override
		public String getSs03EmailUpdate(){
			return "";
		}
		
		@Override
		public String getSs03Nemail(){
			return "";
		}
		
		@Override
		public String getSs03NemailCheck(){
			return "";
		}
		
		@Override
		public String getSs03ThanksPassword(){
			return "";
		}
		
		@Override
		public String getSs03Emailupdate(){
			return "";
		}
		
		@Override
		public String getSs03IncorretEmail(){
			return "";
		}
		
		@Override
		public String getSs03Ok(){
			return "";
		}
		
		@Override
		public String getSs03IncorretPassword(){
			return "";
		}
		
		@Override
		public String getSs03EmailUpdated(){
			return "";
		}
		
		@Override
		public String getSs03Upassword(){
			return "";
		}
		
		@Override
		public String getSs03PasswordUpdate(){
			return "";
		}
		
		@Override
		public String getSs03Opassword(){
			return "";
		}
		
		@Override
		public String getSs03Npassword(){
			return "";
		}
		
		@Override
		public String getSs03Npasswordcheck(){
			return "";
		}
		
		@Override
		public String getSs03Passwordupdate(){
			return "";
		}
		
		@Override
		public String getSs03IncorrectOpassword(){
			return "";
		}
		
		@Override
		public String getSs03IncorrectNpassword(){
			return "";
		}
		
		@Override
		public String getSs03PasswordUpdated(){
			return "";
		}
		
		@Override
		public String getSs03Uurl(){
			return "";
		}
		
		@Override
		public String getSs03UrlUpdate(){
			return "";
		}
		
		@Override
		public String getSs03Thankscom(){
			return "";
		}
		
		@Override
		public String getSs03Tpassword(){
			return "";
		}
		
		@Override
		public String getSs03Urlupdate(){
			return "";
		}
		
		@Override
		public String getSs03Cantuseurl(){
			return "";
		}
		
		@Override
		public String getSs03IncorrectTpassword(){
			return "";
		}
		
		@Override
		public String getSs03UrlUpdated(){
			return "";
		}
		
		@Override
		public String getSs03Pbemail(){
			return "";
		}
		
		@Override
		public String getSs03AddContact(){
			return "";
		}
		
		@Override
		public String getSs03Msg01(){
			return "";
		}
		
		@Override
		public String getSs03Msg02(){
			return "";
		}
		
		@Override
		public String getSs03EmailReset(){
			return "";
		}
		
		@Override
		public String getSs03Resetemail(){
			return "";
		}
		
		@Override
		public String getSs03Accountdeletecheck(){
			return "";
		}
		
		@Override
		public String getSs03Msg03(){
			return "";
		}
		
		@Override
		public String getSs03Terms(){
			return "";
		}
		
		@Override
		public String getSs03Msg06(){
			return "";
		}
		
		@Override
		public String getSs03Deleteaccount(){
			return "";
		}
		
		@Override
		public String getSs03IncorrectPassword(){
			return "";
		}
		
		@Override
		public String getSs03AccountDeleted(){
			return "";
		}
		
		@Override
		public String getSs04Text(){
			return "";
		}
		
		@Override
		public String getSs04Photo(){
			return "";
		}
		
		@Override
		public String getSs04Video(){
			return "";
		}
		
		@Override
		public String getSs04Audio(){
			return "";
		}
		
		@Override
		public String getSs04Story(){
			return "";
		}
		
		@Override
		public String getSs04Link(){
			return "";
		}
		
		@Override
		public String getSs04Profile(){
			return "";
		}
		
		@Override
		public String getSs04ChangeMember(){
			return "";
		}
		
		@Override
		public String getSs04Cancle(){
			return "";
		}
		
		@Override
		public String getSs04Ok(){
			return "";
		}
		
		@Override
		public String getSs04MemberInfo(){
			return "";
		}
		
		@Override
		public String getSs04Follower(){
			return "";
		}
		
		@Override
		public String getSs04Following(){
			return "";
		}
		
		@Override
		public String getSs04Subscribing(){
			return "";
		}
		
		@Override
		public String getSs04SubscribingAllContent(){
			return "";
		}
		
		@Override
		public String getSs04FollowAll(){
			return "";
		}
		
		@Override
		public String getSs04UnfollowAll(){
			return "";
		}
		
		@Override
		public String getSs04Matome(){
			return "";
		}
		
		@Override
		public String getSs04Content(){
			return "";
		}
		
		@Override
		public String getSs04Thanq(){
			return "";
		}
		
		@Override
		public String getSs04Subscribe02(){
			return "";
		}
		
		@Override
		public String getSs04Thanq1(){
			return "";
		}
		
		@Override
		public String getSs04Subscribe01(){
			return "";
		}
		
		@Override
		public String getSs04FlagMember(){
			return "";
		}
		
		@Override
		public String getSs04ReportM(){
			return "";
		}
		
		@Override
		public String getSs04BlockM(){
			return "";
		}
		
		@Override
		public String getSs04Block(){
			return "";
		}
		
		@Override
		public String getSs04BlockMember(){
			return "";
		}
		
		@Override
		public String getSs04BlockMember1(){
			return "";
		}
		
		@Override
		public String getSs04BlockMsg(){
			return "";
		}
		
		@Override
		public String getSs04ReportMember(){
			return "";
		}
		
		@Override
		public String getSs04Summit(){
			return "";
		}
		
		@Override
		public String getSs04ReportHbs(){
			return "";
		}
		
		@Override
		public String getSs04CancelSummit(){
			return "";
		}
		
		@Override
		public String getSs04MemberHbb(){
			return "";
		}
		
		@Override
		public String getSs04CancelBlock(){
			return "";
		}
		
		@Override
		public String getSs04Edit01(){
			return "";
		}
		
		@Override
		public String getSs04Subscribe03(){
			return "";
		}
		
		@Override
		public String getSs04WoMatome(){
			return "";
		}
		
		@Override
		public String getSs04CancelSubscribe(){
			return "";
		}
		
		@Override
		public String getSs04EditMimage01(){
			return "";
		}
		
		@Override
		public String getSs04Edit02(){
			return "";
		}
		
		@Override
		public String getSs04MatomeReportHbs(){
			return "";
		}
		
		@Override
		public String getSs04CrMatome01(){
			return "";
		}
		
		@Override
		public String getSs04CrMatome02(){
			return "";
		}
		
		@Override
		public String getSs04Complete(){
			return "";
		}
		
		@Override
		public String getSs04EditImage02(){
			return "";
		}
		
		@Override
		public String getSs04MName(){
			return "";
		}
		
		@Override
		public String getSs04MExplain(){
			return "";
		}
		
		@Override
		public String getSs04MCategory(){
			return "";
		}
		
		@Override
		public String getSs04MOption(){
			return "";
		}
		
		@Override
		public String getSs04MOpen(){
			return "";
		}
		
		@Override
		public String getSs04MSubscriber(){
			return "";
		}
		
		@Override
		public String getSs04Private(){
			return "";
		}
		
		@Override
		public String getSs04MCOption(){
			return "";
		}
		
		@Override
		public String getSs04Me(){
			return "";
		}
		
		@Override
		public String getSs04MS(){
			return "";
		}
		
		@Override
		public String getSs04MAll(){
			return "";
		}
		
		@Override
		public String getSs04EditMatome(){
			return "";
		}
		
		@Override
		public String getSs04EditComplete(){
			return "";
		}
		
		@Override
		public String getSs04DeleteMatome01(){
			return "";
		}
		
		@Override
		public String getSs04DeleteMatome02(){
			return "";
		}
		
		@Override
		public String getSs04CancelDelete(){
			return "";
		}
		
		@Override
		public String getSs04DeleteMimage(){
			return "";
		}
		
		@Override
		public String getSs05Cancle01(){
			return "";
		}
		
		@Override
		public String getSs05WComplete(){
			return "";
		}
		
		@Override
		public String getSs05Subject(){
			return "";
		}
		
		@Override
		public String getSs05Contents(){
			return "";
		}
		
		@Override
		public String getSs05Tag(){
			return "";
		}
		
		@Override
		public String getSs05SMatome01(){
			return "";
		}
		
		@Override
		public String getSs05SMatome02(){
			return "";
		}
		
		@Override
		public String getSs05MNmatome(){
			return "";
		}
		
		@Override
		public String getSs05SImageWay(){
			return "";
		}
		
		@Override
		public String getSs05TPhoto(){
			return "";
		}
		
		@Override
		public String getSs05SPhoto(){
			return "";
		}
		
		@Override
		public String getSs05CbImage(){
			return "";
		}
		
		@Override
		public String getSs05Cancel02(){
			return "";
		}
		
		@Override
		public String getSs05Msg01(){
			return "";
		}
		
		@Override
		public String getSs05Ok(){
			return "";
		}
		
		@Override
		public String getSs05Clipboard(){
			return "";
		}
		
		@Override
		public String getSs05SComplete(){
			return "";
		}
		
		@Override
		public String getSs05Msg02(){
			return "";
		}
		
		@Override
		public String getSs05Msg03(){
			return "";
		}
		
		@Override
		public String getSs05TKeep(){
			return "";
		}
		
		@Override
		public String getSs05RUpload(){
			return "";
		}
		
		@Override
		public String getSs05PLocation(){
			return "";
		}
		
		@Override
		public String getSs05WCountry(){
			return "";
		}
		
		@Override
		public String getSs05Cwn01(){
			return "";
		}
		
		@Override
		public String getSs05Edit01(){
			return "";
		}
		
		@Override
		public String getSs05NothingW(){
			return "";
		}
		
		@Override
		public String getSs05Cancel03(){
			return "";
		}
		
		@Override
		public String getSs05ContentS(){
			return "";
		}
		
		@Override
		public String getSs05Complete01(){
			return "";
		}
		
		@Override
		public String getSs05Cnw02(){
			return "";
		}
		
		@Override
		public String getSs05Complete02(){
			return "";
		}
		
		@Override
		public String getSs05AllowM(){
			return "";
		}
		
		@Override
		public String getSs05Msg04(){
			return "";
		}
		
		@Override
		public String getSs05AddCom(){
			return "";
		}
		
		@Override
		public String getSs05Msg05(){
			return "";
		}
		
		@Override
		public String getSs05CInfo(){
			return "";
		}
		
		@Override
		public String getSs05Msg06(){
			return "";
		}
		
		@Override
		public String getSs05CInfo02(){
			return "";
		}
		
		@Override
		public String getSs05Complete(){
			return "";
		}
		
		@Override
		public String getSs06Title(){
			return "";
		}
		
		@Override
		public String getSs07Comment(){
			return "";
		}
		
		@Override
		public String getSs07Whitqb(){
			return "";
		}
		
		@Override
		public String getSs07Withq(){
			return "";
		}
		
		@Override
		public String getSs07Thanq(){
			return "";
		}
		
		@Override
		public String getSs07CPlace(){
			return "";
		}
		
		@Override
		public String getSs07RContent(){
			return "";
		}
		
		@Override
		public String getFirstName(){
			return "";
		}
		
		@Override
		public String getLastName(){
			return "";
		}
		
		@Override
		public String getLatitude(){
			return "";
		}
		
		@Override
		public String getLongitude(){
			return "";
		}
		
		@Override
		public String getLang(){
			return "";
		}
		
		@Override
		public String getUserName(){
			return "";
		}
		
		@Override
		public String getKeyword(){
			return "";
		}
		
		@Override
		public String getDefaultMatomeName(){
			return "";
		}
		
		@Override
		public String getSmut(){
			return "";
		}
		
		@Override
		public String getPersonalAttack(){
			return "";
		}
		
		@Override
		public String getViolence(){
			return "";
		}
		
		@Override
		public String getCurse(){
			return "";
		}
		
		@Override
		public String getSpam(){
			return "";
		}
		
		@Override
		public String getEtc(){
			return "";
		}
		
		@Override
		public String getSignup(){
			return "";
		}
		
		@Override
		public String getGuestMode(){
			return "";
		}
		
		@Override
		public String getThanks(){
			return "";
		}
		
	}
	

	public static final MessageManager getDefault(){
		return KO;  
	}
	
	public interface ProjectMessage{
		public abstract Map<String, String> get();
	
		abstract String getHello();
	
		abstract String get200();
	
		abstract String get201();
	
		abstract String get202();
	
		abstract String get221();
	
		abstract String get222();
	
		abstract String get223();
	
		abstract String get224();
	
		abstract String get225();
	
		abstract String get226();
	
		abstract String get227();
	
		abstract String get228();
	
		abstract String get231();
	
		abstract String get232();
	
		abstract String get233();
	
		abstract String get234();
	
		abstract String get235();
	
		abstract String get236();
	
		abstract String get241();
	
		abstract String get242();
	
		abstract String get243();
	
		abstract String get244();
	
		abstract String get300();
	
		abstract String get301();
	
		abstract String get302();
	
		abstract String get303();
	
		abstract String get304();
	
		abstract String get305();
	
		abstract String get310();
	
		abstract String get311();
	
		abstract String get330();
	
		abstract String get333();
	
		abstract String get401();
	
		abstract String get402();
	
		abstract String get403();
	
		abstract String get501();
	
		abstract String get502();
	
		abstract String get503();
	
		abstract String get521();
	
		abstract String get601();
	
		abstract String get602();
	
		abstract String get901();
	
		abstract String get902();
	
		abstract String getVtOkPasswordChange();
	
		abstract String getKey();
	
		abstract String getTest();
	
		abstract String getResType();
	
		abstract String getProgramError();
	
		abstract String getStatus();
	
		abstract String getLogin();
	
		abstract String getUserId();
	
		abstract String getPassword();
	
		abstract String getName();
	
		abstract String getEmail();
	
		abstract String getDescription();
	
		abstract String getDesc();
	
		abstract String getCurrentVersion();
	
		abstract String getError();
	
		abstract String getRegDt();
	
		abstract String getSs01Login();
	
		abstract String getSs01Thanks();
	
		abstract String getSs01Signup();
	
		abstract String getSs01GuestMode();
	
		abstract String getSs02Thanks();
	
		abstract String getSs02Login();
	
		abstract String getSs02TwitterLogin();
	
		abstract String getSs02FacebookLogin();
	
		abstract String getSs02Or();
	
		abstract String getSs02UserNameOrEmail();
	
		abstract String getSs02Password();
	
		abstract String getSs02ForgetPassword();
	
		abstract String getSs02CancelLogin();
	
		abstract String getSs02Signup();
	
		abstract String getSs02PassInfo();
	
		abstract String getSs02Email();
	
		abstract String getSs02ResetPassowrd();
	
		abstract String getSs02BackToLogin();
	
		abstract String getSs02EnterPassword();
	
		abstract String getSs02PasswordChanged();
	
		abstract String getSs02FullName();
	
		abstract String getSs02UserName();
	
		abstract String getSs03Setting();
	
		abstract String getSs03Peronalization();
	
		abstract String getSs03Profile();
	
		abstract String getSs03Account();
	
		abstract String getSs03Localization();
	
		abstract String getSs03ContentLiicensing();
	
		abstract String getSs03HistoryNotificatoin();
	
		abstract String getSs03ContentHistory();
	
		abstract String getSs03RewardHistory();
	
		abstract String getSs03Notification();
	
		abstract String getSs03External();
	
		abstract String getSs03Social();
	
		abstract String getSs03Application();
	
		abstract String getSs03About();
	
		abstract String getSs03Notice();
	
		abstract String getSs03Shop();
	
		abstract String getSs03ShopRegister();
	
		abstract String getSs03ShopManage();
	
		abstract String getSs03ChangeImage();
	
		abstract String getSs03FirstName();
	
		abstract String getSs03LastName();
	
		abstract String getSs03Gender();
	
		abstract String getSs03Birthday();
	
		abstract String getSs03Interests();
	
		abstract String getSs03TakePhoto();
	
		abstract String getSs03ChoosePhoto();
	
		abstract String getSs03Cancel();
	
		abstract String getSs03Retake();
	
		abstract String getSs03Scale();
	
		abstract String getSs03Use();
	
		abstract String getSs03Accountp();
	
		abstract String getSs03Email();
	
		abstract String getSs03LetPeopleLook();
	
		abstract String getSs03Password();
	
		abstract String getSs03Url();
	
		abstract String getSs03PostByEmail();
	
		abstract String getSs03AddEmail();
	
		abstract String getSs03AccountDelete();
	
		abstract String getSs03Uemail();
	
		abstract String getSs03EmailUpdate();
	
		abstract String getSs03Nemail();
	
		abstract String getSs03NemailCheck();
	
		abstract String getSs03ThanksPassword();
	
		abstract String getSs03Emailupdate();
	
		abstract String getSs03IncorretEmail();
	
		abstract String getSs03Ok();
	
		abstract String getSs03IncorretPassword();
	
		abstract String getSs03EmailUpdated();
	
		abstract String getSs03Upassword();
	
		abstract String getSs03PasswordUpdate();
	
		abstract String getSs03Opassword();
	
		abstract String getSs03Npassword();
	
		abstract String getSs03Npasswordcheck();
	
		abstract String getSs03Passwordupdate();
	
		abstract String getSs03IncorrectOpassword();
	
		abstract String getSs03IncorrectNpassword();
	
		abstract String getSs03PasswordUpdated();
	
		abstract String getSs03Uurl();
	
		abstract String getSs03UrlUpdate();
	
		abstract String getSs03Thankscom();
	
		abstract String getSs03Tpassword();
	
		abstract String getSs03Urlupdate();
	
		abstract String getSs03Cantuseurl();
	
		abstract String getSs03IncorrectTpassword();
	
		abstract String getSs03UrlUpdated();
	
		abstract String getSs03Pbemail();
	
		abstract String getSs03AddContact();
	
		abstract String getSs03Msg01();
	
		abstract String getSs03Msg02();
	
		abstract String getSs03EmailReset();
	
		abstract String getSs03Resetemail();
	
		abstract String getSs03Accountdeletecheck();
	
		abstract String getSs03Msg03();
	
		abstract String getSs03Terms();
	
		abstract String getSs03Msg06();
	
		abstract String getSs03Deleteaccount();
	
		abstract String getSs03IncorrectPassword();
	
		abstract String getSs03AccountDeleted();
	
		abstract String getSs04Text();
	
		abstract String getSs04Photo();
	
		abstract String getSs04Video();
	
		abstract String getSs04Audio();
	
		abstract String getSs04Story();
	
		abstract String getSs04Link();
	
		abstract String getSs04Profile();
	
		abstract String getSs04ChangeMember();
	
		abstract String getSs04Cancle();
	
		abstract String getSs04Ok();
	
		abstract String getSs04MemberInfo();
	
		abstract String getSs04Follower();
	
		abstract String getSs04Following();
	
		abstract String getSs04Subscribing();
	
		abstract String getSs04SubscribingAllContent();
	
		abstract String getSs04FollowAll();
	
		abstract String getSs04UnfollowAll();
	
		abstract String getSs04Matome();
	
		abstract String getSs04Content();
	
		abstract String getSs04Thanq();
	
		abstract String getSs04Subscribe02();
	
		abstract String getSs04Thanq1();
	
		abstract String getSs04Subscribe01();
	
		abstract String getSs04FlagMember();
	
		abstract String getSs04ReportM();
	
		abstract String getSs04BlockM();
	
		abstract String getSs04Block();
	
		abstract String getSs04BlockMember();
	
		abstract String getSs04BlockMember1();
	
		abstract String getSs04BlockMsg();
	
		abstract String getSs04ReportMember();
	
		abstract String getSs04Summit();
	
		abstract String getSs04ReportHbs();
	
		abstract String getSs04CancelSummit();
	
		abstract String getSs04MemberHbb();
	
		abstract String getSs04CancelBlock();
	
		abstract String getSs04Edit01();
	
		abstract String getSs04Subscribe03();
	
		abstract String getSs04WoMatome();
	
		abstract String getSs04CancelSubscribe();
	
		abstract String getSs04EditMimage01();
	
		abstract String getSs04Edit02();
	
		abstract String getSs04MatomeReportHbs();
	
		abstract String getSs04CrMatome01();
	
		abstract String getSs04CrMatome02();
	
		abstract String getSs04Complete();
	
		abstract String getSs04EditImage02();
	
		abstract String getSs04MName();
	
		abstract String getSs04MExplain();
	
		abstract String getSs04MCategory();
	
		abstract String getSs04MOption();
	
		abstract String getSs04MOpen();
	
		abstract String getSs04MSubscriber();
	
		abstract String getSs04Private();
	
		abstract String getSs04MCOption();
	
		abstract String getSs04Me();
	
		abstract String getSs04MS();
	
		abstract String getSs04MAll();
	
		abstract String getSs04EditMatome();
	
		abstract String getSs04EditComplete();
	
		abstract String getSs04DeleteMatome01();
	
		abstract String getSs04DeleteMatome02();
	
		abstract String getSs04CancelDelete();
	
		abstract String getSs04DeleteMimage();
	
		abstract String getSs05Cancle01();
	
		abstract String getSs05WComplete();
	
		abstract String getSs05Subject();
	
		abstract String getSs05Contents();
	
		abstract String getSs05Tag();
	
		abstract String getSs05SMatome01();
	
		abstract String getSs05SMatome02();
	
		abstract String getSs05MNmatome();
	
		abstract String getSs05SImageWay();
	
		abstract String getSs05TPhoto();
	
		abstract String getSs05SPhoto();
	
		abstract String getSs05CbImage();
	
		abstract String getSs05Cancel02();
	
		abstract String getSs05Msg01();
	
		abstract String getSs05Ok();
	
		abstract String getSs05Clipboard();
	
		abstract String getSs05SComplete();
	
		abstract String getSs05Msg02();
	
		abstract String getSs05Msg03();
	
		abstract String getSs05TKeep();
	
		abstract String getSs05RUpload();
	
		abstract String getSs05PLocation();
	
		abstract String getSs05WCountry();
	
		abstract String getSs05Cwn01();
	
		abstract String getSs05Edit01();
	
		abstract String getSs05NothingW();
	
		abstract String getSs05Cancel03();
	
		abstract String getSs05ContentS();
	
		abstract String getSs05Complete01();
	
		abstract String getSs05Cnw02();
	
		abstract String getSs05Complete02();
	
		abstract String getSs05AllowM();
	
		abstract String getSs05Msg04();
	
		abstract String getSs05AddCom();
	
		abstract String getSs05Msg05();
	
		abstract String getSs05CInfo();
	
		abstract String getSs05Msg06();
	
		abstract String getSs05CInfo02();
	
		abstract String getSs05Complete();
	
		abstract String getSs06Title();
	
		abstract String getSs07Comment();
	
		abstract String getSs07Whitqb();
	
		abstract String getSs07Withq();
	
		abstract String getSs07Thanq();
	
		abstract String getSs07CPlace();
	
		abstract String getSs07RContent();
	
		abstract String getFirstName();
	
		abstract String getLastName();
	
		abstract String getLatitude();
	
		abstract String getLongitude();
	
		abstract String getLang();
	
		abstract String getUserName();
	
		abstract String getKeyword();
	
		abstract String getDefaultMatomeName();
	
		abstract String getSmut();
	
		abstract String getPersonalAttack();
	
		abstract String getViolence();
	
		abstract String getCurse();
	
		abstract String getSpam();
	
		abstract String getEtc();
	
		abstract String getSignup();
	
		abstract String getGuestMode();
	
		abstract String getThanks();
	
	}
	
}
