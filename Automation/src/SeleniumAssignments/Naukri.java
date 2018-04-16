package SeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {
	static 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		//driver.findElement(By.id("uploadBtnCont")).click();
		
		driver.findElement(By.id("input_resumeParser")).sendKeys("H:\\DhanuResumefinal.doc");
		//driver.findElement(By.xpath("//input[@class='plainBtn']")).click();
		//driver.findElement(By.className("plainBtn")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='bd_adv_workExp_year']")).click();
		
		driver.findElements(By.xpath("//div[@class='sDrop']"));

	}

}
