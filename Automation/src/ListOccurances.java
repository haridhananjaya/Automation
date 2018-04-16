import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListOccurances {
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
		
		List<WebElement> dishes = sel.getOptions();
		
		Map<String, Integer> m=new HashMap();
		
		for(WebElement obj:dishes)
		{
			String dish = obj.getText();
			
			if(m.containsKey(dish))
			{
				Integer v = m.get(dish);
				v++;
				m.put(dish, v);
			}
			else
			{
				m.put(dish, 1);
			}
		}
		
		Set<String> allkeys = m.keySet();
		for(String keys:allkeys)
		{
			Integer v = m.get(keys);
			System.out.println(keys+".....>"+v);
			
		}

	}

}
