package POMExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.enterUsrname("haridhananjaya");
		lp.enterPasswrd("sura");
		lp.clickLoginBtn();
		
		
		Thread.sleep(2000);
		lp.clearMeth();
		lp.enterUsrname("haridhananjaya");
		lp.enterPasswrd("surabe");
		lp.clickLoginBtn();
		
		//lp.enterFirstname("Dhanu");

		//lp.enterLastname("jay");

	}

}
