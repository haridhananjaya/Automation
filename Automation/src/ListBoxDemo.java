import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxDemo {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/list.html");
		WebElement list = driver.findElement(By.id("mtr"));
		Select s=new Select(list);
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		
		for(WebElement o:options) 
				System.out.println(o.getText());
			
		
		for(int i=0;i<3;i++) {
		 s.selectByIndex(i);
		}
		
		
	}
}
