package pom.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestGamilLogin {

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver","D:\\latest Selenium config\\chrome latest exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		GmailLoginPage lp=PageFactory.initElements(driver, GmailLoginPage.class);
		
		lp.doLogin("naveenk","test@123");
		
		
		
		
	}

}
