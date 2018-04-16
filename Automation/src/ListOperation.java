import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListOperation {
	static 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("file:///H:/sample%20webpages/listcollection.html");
		
		WebElement hotel = driver.findElement(By.xpath("//select[@id='empire']"));
		
		Select sel=new Select(hotel);
		//Operation on Single Select
		//sel.selectByIndex(3);
		//sel.selectByValue("mb");
		
		//To displayoptions and display
		/*
		
		List<WebElement> allOpt = sel.getOptions();
		
		for(WebElement apt:allOpt)
		{
			String txt=apt.getText();
			System.out.println(txt);
			
		}*/
		
		/*
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByIndex(4);
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		
		List<WebElement> allOpt = sel.getAllSelectedOptions();
		
		for(WebElement apt:allOpt)
		{
			String txt=apt.getText();
			System.out.println(txt);
			
		}*/
		
		ArrayList<String> arrlst=new ArrayList<>();
		
		List<WebElement> allOpt = sel.getOptions();
		
		for(WebElement apt:allOpt)
		{
			String txt=apt.getText();
			arrlst.add(txt);
			
		}
		ArrayList<String> arrlstcopy=new ArrayList<>(arrlst);
		
		Collections.sort(arrlst);
		
		System.out.println(arrlst);
		
		
		
		
		System.out.println(arrlst.equals(arrlstcopy));
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
		
	}

}
