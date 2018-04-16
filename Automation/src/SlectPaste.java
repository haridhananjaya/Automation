import java.io.BufferedWriter;
		import java.io.File;
		import java.io.FileWriter;
		import java.io.IOException;
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
public class SlectPaste {

	public static void main(String[] args) throws IOException {
	
			{
				   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				   WebDriver driver=new ChromeDriver();	
				   driver.get("https://www.seleniumhq.org");	
				   List<WebElement> we = driver.findElements(By.xpath("//a"));
				   int size = we.size();
		           System.out.println(size);
		           File f1=new File("H:/Sample1.txt"); 
		           f1.createNewFile(); 
		           FileWriter FWriter=new FileWriter(f1);
		           BufferedWriter FBufWrite=new BufferedWriter(FWriter);
		           for(int i=0;i<we.size();i++)
		           {
		        	   WebElement wb=we.get(i);
		        	   String s=wb.getText();
		        	   System.out.println(s);
		        	   FBufWrite.write(s);
		           }
		           FBufWrite.close();
		           driver.close();
			}

		}

	

}
