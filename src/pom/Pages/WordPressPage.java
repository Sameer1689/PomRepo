package pom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WordPressPage
{

  @FindBy(xpath="//input[@id='log']")
  
  		public WebElement username;
  
  @FindBy(xpath="//input[@id='pwd']")
  
  		public WebElement password;
  
  @FindBy(xpath="//input[@id='login']")
  
  		public WebElement login;


	public WordPressLandingPage doLogin(String myusername,String mypassword) throws Exception
	{
		  username.sendKeys(myusername);
		  
		  password.sendKeys(mypassword);
		  
		  Thread.sleep(5000);
		  
		  login.click();
		return null;
		  
		  
		  
	}
	


}