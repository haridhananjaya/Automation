package POMExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmLoginTest {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com");
		
		
		GmLoginPage glp=new GmLoginPage(driver);
		
		glp.enterUsrname("haridhana");
		
		glp.clickEnterBtn();
		
		
		
		Thread.sleep(2000);
		
       /* glp.enterUsrname("haridhana");
		
		glp.clickEnterBtn();
		
		Thread.sleep(2000);*/
		
		//glp.enterPassword("surabedh");
		
		glp.enterPassword("surabedh");
		
		glp.clickNextBtn();
		
		
		

	}

}
