package pom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WordPressLandingPage
{

	WebDriver driver;
	
	public WordPressLandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[contains(text(),'Product Category')]//parent::li[@id='menu-item-33']")
	
	public WebElement product;
	
	
	 public void goNewsFeed()
	 {
		 product.click();
		 
		 
	 }
}
