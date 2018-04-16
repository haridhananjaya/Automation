package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class Flipkart {
	static 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.className("LM6RPg")).sendKeys("iphone");
		
		Thread.sleep(2000);
		
		List<WebElement> allOpt = driver.findElements(By.xpath("//a[@class='_2XvRSN']"));
		
		int n=allOpt.size();
		System.out.println(n);
		
		for(WebElement opt:allOpt)
		{
			
			String option=opt.getText();
			
			if(option.equals("iphone 7"))
					{
				opt.click();
					}
		}

	}

}
