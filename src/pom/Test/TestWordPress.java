package pom.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pom.Pages.WordPressLandingPage;
import pom.Pages.WordPressPage;

public class TestWordPress {

	public static void main(String[] args) throws Exception
	{
      
		 System.setProperty("webdriver.chrome.driver","D:\\latest Selenium config\\chrome latest exe\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
					
			driver.get("http://store.demoqa.com/products-page/your-account");
			Thread.sleep(5000);
			
			WordPressPage wb= PageFactory.initElements(driver, WordPressPage.class);
			
			WordPressLandingPage landing =	wb.doLogin("sameergadve0@gmail.com","selenium160689");
			landing.goNewsFeed();
	}

}
