package POMExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmLoginPage {

	@FindBy(id="identifierId")
	private WebElement unTB;
	
	@FindBy(xpath="//span[.='Next']")
	//@FindBy(xpath="//input[@id='u_0_2']")
	private WebElement etrBtn;
	
	@FindBy(xpath="//input[@class='whsOnd zHQkBf']")
	private WebElement pwTB;
	
	@FindBy(xpath="//span[.='Next']")
	//@FindBy(xpath="//input[@id='u_0_2']")
	private WebElement lgnBtn;	
	
	
	public GmLoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub1
		PageFactory.initElements(driver, this);
	}

	public void enterUsrname(String un) 
	{
		unTB.sendKeys(un);
	}
	
	public void clickEnterBtn()
	{
		etrBtn.click();
	}
	
	public void clickNextBtn()
	{
		lgnBtn.click();
	}

	public void enterPassword(String pw) {
		// TODO Auto-generated method stub
		pwTB.sendKeys(pw);
	}
}
