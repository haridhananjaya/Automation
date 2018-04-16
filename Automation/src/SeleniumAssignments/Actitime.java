package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime {
	static 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String args[]) throws InterruptedException
	{
		//WebDriver driver=new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8080/login.do");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[.='TASKS']")).click();
		
		/*List<WebElement> list = driver.findElements(By.xpath("//tr[@class='taskRow noLastTrackingDate']/td/div[@class='checkbox inactive']/div[@class='img']"));
		
		int n=list.size();
		
		System.out.println(n);
		
		WebElement ele = list.get(0);
		
		ele.click();*/
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Functional testing']/../../..//div[@class='img']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='innerWrapper']/div[4]")).click();
		
		
		
	}
}
