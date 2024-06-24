package P_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;

public class W2 extends Base
{
 
	public W2() 
	{
		PageFactory.initElements(Base.driver, this);
		
	} 
	
    @FindBy(xpath="(//input[@name='userID'])[1]") private WebElement  User_ID;
	
	@FindBy(xpath="(//input[@name='password'])[1]") private WebElement  Password;
	
	@FindBy(xpath="(//input[@type='submit'])[1]") private WebElement  Submit_Button;
	
	
	public void submit_Method( String uid , String pass)
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(pass);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		
	}
	
}
