package pom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestFbLogin {

	public static void main(String[] args) throws Exception {
 
		
		 System.setProperty("webdriver.chrome.driver","D:\\latest Selenium config\\chrome latest exe\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
					
			driver.get("https://www.facebook.com");
			Thread.sleep(5000);
			
			FacbookLoginPage fb=PageFactory.initElements(driver, FacbookLoginPage.class);
			
			FbLandingPage landingpage=fb.doLogin("Sgadve888@rediffmail.com", "guruswami06");
			
			landingpage.goNewsFeed();
	}

}
