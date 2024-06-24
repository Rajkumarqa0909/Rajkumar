package P_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;

public class W1 extends Base
{
	
	
	
	public W1() 
	{
		PageFactory.initElements(Base.driver, this);
		
	} 
	
    @FindBy(xpath="(//input[@name='userID'])[1]") private WebElement  User_ID;
	
	@FindBy(xpath="(//input[@name='password'])[1]") private WebElement  Password;
	
	@FindBy(xpath="(//input[@type='submit'])[1]") private WebElement  Submit_Button;
	
	@FindBy(xpath="(//input[@id='view'])[1]") private WebElement authorize_request;
	@FindBy(xpath="(//input[@id='view'])[2]") private WebElement status_view;
	@FindBy(xpath="//input[@id='Submit']") private WebElement submit;
	
	
	
	public void submit_Method( String uid , String pass)
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(pass);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		
	}
	
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pegasus_rajkumarg\\Desktop\\Daily_Note\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		   
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://172.22.1.83/CRA/HomePage_hp.do");
		 
		
	}
	

}
