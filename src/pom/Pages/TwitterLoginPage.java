package pom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Twitter.Config.ConfigJava;

public class TwitterLoginPage
{
	
WebDriver driver;

public TwitterLoginPage(WebDriver driver)
{
	this.driver=driver;
}
	
@FindBy(xpath=ConfigJava.email)

public WebElement email;

@FindBy(xpath=ConfigJava.password)

public WebElement password;

@FindBy(xpath=ConfigJava.login)

public WebElement login;



public TwitLandingPage doLogin(String myEmail,String myPassword)

{
	email.sendKeys(myEmail);
	
	password.sendKeys(myPassword);
	
	login.click();
	
	return PageFactory.initElements(driver, TwitLandingPage.class);
}


}
