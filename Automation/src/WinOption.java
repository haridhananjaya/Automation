import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WinOption {
	static 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in");
		
	    driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Qspiders");
	    
	    Thread.sleep(2000);
	    
	    List<WebElement> allOpts = driver.findElements(By.className("sbqs_c"));
	    
	    int cnt=allOpts.size();
	    
	    System.out.println(cnt);
	    
	    for(WebElement opt:allOpts)
	    {
	    	String str=opt.getText();
	    	System.out.println(str);
	    	
	    	if(str.equals("qspiders branches in bangalore"))
	    	{
	    		opt.click();
	    	}
	    }
	    
	    
		
		
		
		

	}

}
