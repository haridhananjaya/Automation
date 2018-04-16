import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DupOccurances {
	static 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("file:///H:/sample%20webpages/listcollection.html");
		
		WebElement hotel = driver.findElement(By.xpath("//select[@id='empire']"));
		
		Select sel=new Select(hotel);
		List<WebElement> allOpt = sel.getOptions();
		
		HashSet<String> hs=new HashSet<>();
		
		for(WebElement opt:allOpt)
		{
			String str1=opt.getText();
			if(!(hs.add(str1)))
			{
				System.out.println(str1);
			}
		}
		
		//System.out.println(hs);

	}

}
