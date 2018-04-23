package pom.Pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Twitter.Config.ConfigJava;

public class TwitMyProfile
{
 
	 
	 
	WebDriver driver;

	public TwitMyProfile(WebDriver driver) throws IOException
	{
		this.driver=driver;
		
	 
		 
	}
	
	
@FindBy(xpath=ConfigJava.editprofilebtn) 
public WebElement editprofilebtn;
  
public EditProfile goEditProfile()
{
	editprofilebtn.click();
	 
	return PageFactory.initElements(driver, EditProfile.class);
	
	
 
	 
}

}
