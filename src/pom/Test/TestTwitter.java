package pom.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.Twitter.Config.ConfigJava;

import pom.Pages.EditProfile;
import pom.Pages.TwitLandingPage;
import pom.Pages.TwitMyProfile;
import pom.Pages.TwitterLoginPage;

public class TestTwitter

{
	
			public static Properties config = new Properties();

			public static void main(String[] args) throws InterruptedException, IOException
	 {
		
				  
		
				System.setProperty("webdriver.chrome.driver","D:\\latest Selenium config\\chrome latest exe\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
					
				driver.get(ConfigJava.testsite);
			
				Thread.sleep(5000);
			
				TwitterLoginPage tw = PageFactory.initElements(driver, TwitterLoginPage.class);
			
				TwitLandingPage landing=tw.doLogin("sameergadve0@gmail.com", "guruswami06");
			
				Thread.sleep(5000);
			
				TwitMyProfile twp=landing.goToProfile();
			
				Thread.sleep(5000);
			
				EditProfile ep=twp.goEditProfile();
			
				Thread.sleep(5000);
			
				ep.saveChangesbtn.click();
				
			
			
			
	 }

}
