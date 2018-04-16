package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//To select options and to display

public class RedBrickOpt {
	static 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://home.redbrickhealth.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String xp="//a[.='Solutions'][1]";
		//List<WebElement> solu = driver.findElements(By.xpath("//div[@id='navbarNav']/ul/li[2]//ul/li"));
		//List<WebElement> solu = driver.findElements(By.xpath("//div[@id='navbarNav']/ul/li[2]//ul/li/a"));
		List<WebElement> solu = driver.findElements(By.xpath("(//a[.='Solutions'])[1]/..//li"));
		
		 //List<WebElement> solu = driver.findElements(By.xpath("//div[@id='navbarNav']/ul/li[2]//ul"));
		 
		 int cnt = solu.size();	
		WebElement sing = solu.get(0);
		String str = sing.getText();
		System.out.println(str);
		 
		 System.out.println(cnt);
		 
		 for(WebElement opt:solu)
		 {
			 System.out.println("hi");
			 String option=opt.getText();
			 System.out.println(option);
		 }
		 
		 
		
		

	}

}
