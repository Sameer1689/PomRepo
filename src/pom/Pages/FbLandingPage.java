package pom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FbLandingPage
{
WebDriver driver;
	
	public FbLandingPage(WebDriver driver)
	
	{
		 this.driver=driver;
	}
	 
	 @FindBy(xpath="//div[contains(text(),'News Feed')]")
	
	public WebElement newsfeed;
	 
	/* @FindBy(xpath="//div[contains(text(),'Messenger')]")
	 
	 public WebElement messenger;
	 
	 @FindBy(xpath="//div[contains(text(),'Marketplace')]")
	 
	 public WebElement marketplace;
	 */
	 
	 public void goNewsFeed()
	 {
		 newsfeed.click();
		 
		 
	 }
	 
	 
/*	 public void goMessenger()
	 {
		 messenger.click();
	 }
	 
	 public void goMareketplace()
	 {
		 marketplace.click(); 
	 }*/

}
