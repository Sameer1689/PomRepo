package pom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Twitter.Config.ConfigJava;

public class EditProfile
{

	WebDriver driver;

	public EditProfile(WebDriver driver)
	{
		this.driver=driver;
	}
	
@FindBy(xpath=ConfigJava.saveChangesbtn)
	public WebElement saveChangesbtn;
		
	public void goToSChange()
	{
		saveChangesbtn.click();
		
 
	}
	
}