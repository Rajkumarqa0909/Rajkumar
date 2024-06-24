package TTS_Withdrawal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.Base;
import utility.elementUtil;
import utility.Excel_reader;
import utility.constant;

public class Authorize_Page extends Base
{
	
	Excel_reader er = new Excel_reader("./src//test//resources//CY.xlsx");
	
	public Authorize_Page()
	{
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(xpath="(//input[@name='userID'])[2]") private WebElement uid2;
	@FindBy(xpath="(//input[@name='password'])[2]") private WebElement pass2;
	@FindBy(xpath="(//input[@type='submit'])[2]") private WebElement submit;
	@FindBy(xpath="//a[text()='Exit Withdrawal Request']") private WebElement Exit_withdrawal_Request;
	@FindBy(xpath="//a[contains(text(),'Initiate Withdrawal')]") private WebElement Initiate_withdrawal_request;
	@FindBy(xpath="(//input[@name='wdrChoice'])[1]") private WebElement Superannuitation;
	@FindBy(xpath="//input[@name='PRAN']") private WebElement PranField;
	@FindBy(xpath="//input[@name='submit_validateForm']") private WebElement Submit_Pran;
	@FindBy(xpath="//select[@name='compWdrType']") private WebElement Withdrawal_type_drop;
	@FindBy(xpath="(//input[@name='funcSelection'])[2]") private WebElement Authorize_request;
	@FindBy(xpath="//input[@id='pran']") private WebElement Authorize_Pranfield;
	@FindBy(xpath="//input[@id='Submit']") private WebElement Submit_Pranfield;
	@FindBy(xpath="//a[@class='approveLink']") private WebElement aprrove_link;
	
	
	
	//
	
	public void authorize(String uid_2 , String pass_2 ,String pran )
	{
		uid2.sendKeys(uid_2);
		pass2.sendKeys(pass_2);
		elementUtil.click_On_WebElement(driver, submit, constant.explicitWait );
		elementUtil.click_On_WebElement(driver, Exit_withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_withdrawal_request, constant.explicitWait );
		elementUtil.click_On_WebElement(driver, Superannuitation, constant.explicitWait );
		PranField.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Pran, constant.explicitWait);
		
		Select sel = new Select(Withdrawal_type_drop);
		sel.selectByVisibleText("Tier 2 Tax Saver");
		elementUtil.click_On_WebElement(driver, Authorize_request, constant.explicitWait);
		Authorize_Pranfield.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Authorize_Pranfield, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Submit_Pranfield, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, aprrove_link, constant.explicitWait);
		
		
		
		
		
		
	}

}
