package SeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaSci {
	static 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///H:/sample%20webpages/javscript.html");
		
		driver.findElement(By.id("q")).click();
		Thread.sleep(2000);
		Alert q = driver.switchTo().alert();
		Thread.sleep(2000);
		q.sendKeys("jay");
		
		Thread.sleep(2000);
		
		q.accept();	
		
		WebElement add = driver.findElement(By.id("p"));
		
		String msg=add.getText();
		
		if(msg.equals("Welcome jay"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		

	}

}
