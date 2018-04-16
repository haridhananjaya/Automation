package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBrick {
	static 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://home.redbrickhealth.com/");
			
			//String xp="//a[.='Solutions'][1]";
			WebElement solu = driver.findElement(By.xpath("//a[.='Solutions']"));
			
			
			
			WebElement target= driver.findElement(By.xpath("//a[text()='Problems We Solve']"));
			//act.moveToElement(solu).perform();
			
			
			Actions act=new Actions(driver);
			act.moveToElement(solu).perform();
			
			Thread.sleep(2000);
			
			target.click();
			
			
			//driver.close();
			
	}

}
