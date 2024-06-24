package TTS_Withdrawal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import BaseClass.Base;
import utility.elementUtil;
import utility.constant;

public class Request_Maker extends Base
{
	public Request_Maker()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(xpath="(//input[@name='userID'])[2]") private WebElement userid;
	@FindBy(xpath="(//input[@name='password'])[2]") private WebElement password;
	@FindBy(xpath="(//input[@class='submitbutton'])[2]") private WebElement submit_button;
	@FindBy(xpath="//a[text()='Exit Withdrawal Request']") private WebElement  Exit_Withdrawal_Request;
	@FindBy(xpath="//a[contains(text(),'Initiate Withdrawal Request')]") private WebElement  Initiate_request;
	@FindBy(xpath="(//input[@name='wdrChoice'])[1]") private WebElement superannuiation;
	@FindBy(xpath="//input[@name='PRAN']") private WebElement PRAN;
	@FindBy(xpath="//input[@name='submit_validateForm']") private WebElement Submit_Pran;
	@FindBy(xpath="//select[@name='compWdrType']") private WebElement withdrawaltypedropdown;
	@FindBy(xpath="//select[@id='tierType']") private WebElement Tier_type;
	@FindBy(xpath="//input[@id='Submit']") private WebElement Submit_tiertype_button;
	@FindBy(xpath="//td[@style='border: none; width: auto;']") private WebElement Amount_box;
	@FindBy(xpath="//input[@id='schemeList[0].wdrData']") private WebElement Schemefield;
	@FindBy(xpath="//input[@id='schemeList[0].selectedFlag']") private WebElement SchemeFlag;
	@FindBy(xpath="(//input[@id='Submit'])[1]") private WebElement Submit_scheme;
	@FindBy(xpath="(//input[@id='Submit'])[2]") private WebElement Confirm_Button;
	
	
	
	
	

	
	public void initiate_request(String uid , String pass , String pran , String withdrawaltype , String tire_type)
	{
	  userid.sendKeys(uid);
	  password.sendKeys(pass);
	  elementUtil.click_On_WebElement(driver, submit_button, constant.explicitWait);
	  elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
	  elementUtil.click_On_WebElement(driver, Initiate_request, constant.explicitWait);
	  elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
	  elementUtil.click_On_WebElement(driver, superannuiation, constant.explicitWait);
	  PRAN.sendKeys(pran);
	  elementUtil.click_On_WebElement(driver, Submit_Pran, constant.explicitWait);
	  elementUtil.Select_DropDownByVisibleText(withdrawaltypedropdown, withdrawaltype);
	  elementUtil.Select_DropDownByVisibleText(Tier_type, tire_type);
	  elementUtil.click_On_WebElement(driver, Submit_tiertype_button, constant.explicitWait);
	  String amount = Amount_box.getText();
	  System.out.println(amount);
	  Schemefield.sendKeys(amount);
	  elementUtil.click_On_WebElement(driver, SchemeFlag, constant.explicitWait);
	  elementUtil.click_On_WebElement(driver, Submit_scheme, constant.explicitWait);
	
	  
	}
	
	
	public void authorize_Request(String uid2 , String pass )
	{
	  userid.sendKeys(uid2);
	  password.sendKeys(pass);
	  elementUtil.click_On_WebElement(driver, submit_button, constant.explicitWait);
	  elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
	  elementUtil.click_On_WebElement(driver, Initiate_request, constant.explicitWait);
	  elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
	  elementUtil.click_On_WebElement(driver, superannuiation, constant.explicitWait);
	 
	}
	
	
	
}
