import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DupCount {
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
			
			HashMap<String, Integer> hm=new HashMap<>();
			
			int i=1;
			for(WebElement opt:allOpt)
			{
				String str=opt.getText();
				if(!(hm.containsKey(str)))
						{
							hm.put(str, 1);
						}
				else
				{
					hm.put(str,hm.get(str)+1);
				}
			
					
			}
			
			System.out.println(hm);
			
			
			
			
			
			for(WebElement opt:allOpt) {
				String str1=opt.getText();
				
				
				
			}

	}

}
