package pom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Twitter.Config.ConfigJava;

public class TwitLandingPage
{
	WebDriver driver;

	public TwitLandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
@FindBy(xpath=ConfigJava.profile)

public WebElement profile;

@FindBy(xpath=ConfigJava.tweet)
 
public WebElement tweet;

@FindBy(xpath=ConfigJava.following)

public WebElement following;

@FindBy(xpath=ConfigJava.followers)

public WebElement followers;



public TwitMyProfile goToProfile()
{
	profile.click();
	
	return PageFactory.initElements(driver, TwitMyProfile.class);
}

public void goToTweet()
{
	tweet.click();
}

public void goToFollowing()
{
	following.click();
}

public void goToFollower()
{
	followers.click();
}
}


