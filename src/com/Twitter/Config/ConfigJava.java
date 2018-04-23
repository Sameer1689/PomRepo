package com.Twitter.Config;

public class ConfigJava
{
	// author second
	public static String testsite="https://twitter.com/login";
	
//twitter login page
		public static final String email="//input[@class='js-username-field email-input js-initial-focus']//parent::div//input[@type='text']";

		public static final String	password="//input[@class='js-password-field']//parent::div//input[@type='password']";

		public static final String	login="//button[@type='submit']//parent::div//button[@type='submit']";

		
//twitter Landing page

		public static final String profile="//b[contains(text(),'Sameer02697610')]//parent::span[@class='username u-dir']";

		public static final String tweet="//span[contains(text(),'Tweets')]//parent::a[@class='ProfileCardStats-statLink u-textUserColor u-linkClean u-block js-nav js-tooltip']";

		public static final String following="//span[contains(text(),'Following')]//parent::a[@class='ProfileCardStats-statLink u-textUserColor u-linkClean u-block js-nav js-tooltip']";

		public static final String	followers="//span[contains(text(),'Followers')]//parent::a[@class='ProfileCardStats-statLink u-textUserColor u-linkClean u-block js-nav js-tooltip']";

		
		
//twitter edit btn

		public static final String editprofilebtn="//span[contains(text(),'Edit profile')]//parent::button[@type='button']";

		
//twitter save btn

		public static final String saveChangesbtn="//button[contains(text(),'Save changes')]//parent::div//preceding-sibling::button[@class='ProfilePage-saveButton EdgeButton EdgeButton--secondary']";

}
