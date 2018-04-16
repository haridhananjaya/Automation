package POMExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// Declaration
	@FindBy(id="email")
	private WebElement unTB;
	
	@FindBy(id="pass")
	private WebElement pwTB;
	
	@FindBy(xpath="//input[@value='Log In']")
	//@FindBy(xpath="//input[@id='u_0_2']")
	private WebElement lgnBtn;
	
	@FindBy(id="u_0_i")
	//@FindBy(xpath="//div[@class='_5dbb _5634']")
	private WebElement fsTB;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lsTB;
	
	
	//Initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	
	public void enterUsrname(String un) 
	{
		unTB.sendKeys(un);
	}
	
	public void enterPasswrd(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLoginBtn()
	{
		lgnBtn.click();
	}
	
	public void clearMeth()
	{
		unTB.clear();
	}
	/*public void enterFirstname(String fs)
	{
		fsTB.sendKeys(fs);
	}

	public void enterLastname(String ls)
	{
		lsTB.sendKeys(ls);
	}*/
}
