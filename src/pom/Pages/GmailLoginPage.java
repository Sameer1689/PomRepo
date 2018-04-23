package pom.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GmailLoginPage {

	 
	@FindBy(xpath="//input[@id='identifierId']")
	
     public WebElement username;
	
	@FindBy(xpath="//span[contains(text(),'Next')]//parent::content//preceding-sibling::div")
	
	public WebElement signin;
	
	@FindBy(how=How.XPATH,using=" //input[@class='whsOnd zHQkBf' and @type='password']")
	 
	public WebElement password;
	public void doLogin(String myusername,String myPassword) throws InterruptedException
	{
		username.sendKeys(myusername);
		
		password.sendKeys(myPassword);
		
		Thread.sleep(5000);
		
		signin.click();
	}
}
