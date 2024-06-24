package Death_Withdrawal_APY;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;

public class Authorize_Request extends Base
{
	
	
	public Authorize_Request()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	
	
	@FindBy (xpath ="//input[@name='userID']") private WebElement User_ID;
	@FindBy (xpath ="//input[@name='password']") private WebElement Password;
	@FindBy (xpath ="(//input[@class='submitbutton'])[1]") private WebElement submit_button;
	@FindBy (xpath ="(//input[@class='submitbutton'])[2]") private WebElement reset;
	@FindBy (xpath="//a[text()='Exit Withdrawal Request']") private WebElement exit_withdrawal_request;
	@FindBy (xpath="//a[text()='Withdrawal Request                                                    ']") private WebElement withdrawal_request;
	@FindBy (xpath ="//input[@name='PRAN']") private WebElement Pran_field;
	@FindBy (xpath ="(//input[@class='submitbutton'])[1]") private WebElement submit_pran_Button;
	
	@FindBy (xpath ="(//input[@class='submitbutton'])[2]") private WebElement reset_Button;
	@FindBy (xpath = "//a[text()='Authorize Request']") private WebElement Authorize_request;
	@FindBy (xpath ="//a[contains(text(),'Subscriber  ')]") private WebElement Subscriber;
	@FindBy (xpath ="//select[@name='compWdrType']") private WebElement withdrawal_due_to;
	@FindBy (xpath ="//select[@name='transactionType']") private WebElement transaction_type_dropdown;
	@FindBy (xpath ="//a[text()='CRA Home']") private WebElement CRAHome;
	
	@FindBy (xpath ="(//a[@class='maroon'])[1]") private WebElement popmessage;
	@FindBy(xpath="//select[@id='wdrType']") private WebElement withdrawal_subtype;
	@FindBy (xpath ="//input[@class='submitButton']") private WebElement search_Button;
	
	
	public void authorize_request( String userID , String password)
	{
		
		User_ID.sendKeys(userID);
		
		Password.sendKeys(password);
		
		elementUtil.click_On_WebElement(driver, submit_button, constant.explicitWait);
		
	}
	
	
	
	public void authorize_req1(String pran , String withdrawal_Type , String transtype_drop_value , String subtype_withdrawal )
	{
		elementUtil.click_On_WebElement(driver, exit_withdrawal_request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, withdrawal_request, constant.explicitWait);
		Pran_field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, submit_pran_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Authorize_request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Subscriber, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, CRAHome, constant.explicitWait);
		
		
		Set<String> windows = driver.getWindowHandles(); 
		
		String parenwindow = driver.getWindowHandle();
		java.util.Iterator<String> it = windows.iterator();
		it.next();
		
		String childID = it.next();
		driver.switchTo().window(childID);
		
		String txtvalue = popmessage.getText();
		System.out.println(txtvalue);
		
		String value =txtvalue;
		
		Assert.assertEquals(txtvalue, value);
		
		driver.switchTo().window(parenwindow);
		
		
		Pran_field.sendKeys(pran);
		
		elementUtil.Select_DropDownByVisibleText(transaction_type_dropdown, transtype_drop_value);
		elementUtil.Select_DropDownByVisibleText(withdrawal_subtype, subtype_withdrawal);
		
		elementUtil.click_On_WebElement(driver, search_Button, constant.explicitWait);
	
		
		
	}
	
	
	
	

}
