import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Birhdate {
	static 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver=new ChromeDriver();
				FirefoxDriver driver=new FirefoxDriver();
				
				driver.get("https://www.facebook.com/");
				
				WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
				
				Select sel=new Select(day);
				
				sel.selectByValue("22");
				
				Thread.sleep(1000);
				
				
				WebElement day1 = driver.findElement(By.xpath("//select[@id='month']"));
				
				Select sel1=new Select(day1);
				
				sel1.selectByValue("6");
				
				Thread.sleep(1000);
				
				
				WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
				
				Select sel2=new Select(year);
				
				sel2.selectByValue("1992");
				
				Thread.sleep(1000);
				
				
		

	}

}
