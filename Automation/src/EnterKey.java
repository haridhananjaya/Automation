import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterKey {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\J2EE Softwares\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("haridhananjaya");
		
		driver.findElement(By.id("pass")).sendKeys("surabe");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("u_0_2")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("userNavigationLabel")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//form[@id='u_e_5']")).click();

	}

}
