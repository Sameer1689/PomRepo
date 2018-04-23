package pom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FacbookLoginPage {
	
	WebDriver driver;
	
	public FacbookLoginPage(WebDriver driver)
	
	{
		 this.driver=driver;
	}
	
	@FindBy(xpath="//input[@id='email']")
	
	public WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	
	public WebElement pass;
	
	@FindBy(xpath="//input[@type='submit']//parent::label//input[@type='submit']")
	
	public WebElement login;
	
	
	public FbLandingPage doLogin(String myEmail,String myPassword) throws Exception  
	
	{
		email.sendKeys(myEmail);
		
		pass.sendKeys(myPassword);
		
		Thread.sleep(5000);
		
		login.click();
		
		return PageFactory.initElements(driver, FbLandingPage.class);
	}

}
