import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoooo {

	public static void main(String[] args) {
	
			
			System.setProperty("webdriver.chrome.driver","H:\\J2EE Softwares\\Softwares\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Users/HP/Desktop/link.html");
			
			
			List<WebElement> allLink = driver.findElements(By.xpath("//a"));
			//List<WebElement> allLink = driver.findElements(By.);
			
			int n=allLink.size();
			 try{
				    // Create file 
				 File f1=new File("H:\\Links.txt");
				    FileWriter fstream = new FileWriter(f1);
				        BufferedWriter out = new BufferedWriter(fstream);
			
			for(int i=0;i<n;i++)
			{
				 WebElement lnk = allLink.get(i);
				 String txt=lnk.getText();
				 System.out.println(txt);
				
				
					    out.write(txt);
					    //Close the output stream
					   
			}
			 out.close();
			    }catch (Exception e){//Catch exception if any
			      System.err.println("Error: " + e.getMessage());
			    }
			
		//	driver.findElement(By.xpath("//div[.='Login ']")).click();
			//String str1=driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]")).getText();
			
			//System.out.println(str1);	
			
			
			
		}

	

}
