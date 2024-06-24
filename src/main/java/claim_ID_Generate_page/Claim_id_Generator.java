package claim_ID_Generate_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;

public class Claim_id_Generator extends Base
{
	
	

	public Claim_id_Generator(WebDriver driver)
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(xpath="(//input[@name='userID'])[2]") private WebElement userid;
	@FindBy(xpath="(//input[@name='userID'])[3]") private WebElement userid_using_digital_certificate;
	@FindBy(xpath="(//input[@name='password'])[2]") private WebElement password;
	@FindBy(xpath="(//input[@class='submitbutton'])[2]") private WebElement submit_button;
	@FindBy(xpath="//a[text()='Exit Withdrawal Request']") private WebElement  Exit_Withdrawal_Request;
	@FindBy(xpath="//a[contains(text(),'Initiate Generate/Cancel Claim ID')]") private WebElement  Initiate_Generate_Claim_id;
	@FindBy(xpath="//input[@name='pran']") private WebElement pranfield;
	@FindBy(xpath="(//input[@name='claimReqType' ])[1]") private WebElement Generate_Claim_ID;
	@FindBy(xpath="(//input[@class='submitbutton'])[1]") private WebElement Submit_Pran;
	@FindBy(xpath="//select[@name='wdrType']") private WebElement Withdrawal_due_to_drop;
	@FindBy(xpath="//input[@value='Confirm']") private WebElement confirm_button;
	
	@FindBy(xpath="//input[@name='cancelBtn']") private WebElement resolve_later;
	
	
	
	// Authorize_
	
	@FindBy(xpath="//a[contains(text(),'Authorize Generate/Cancel Claim ID ')]") private WebElement Authorize_generate_claim_id;
	@FindBy(xpath="//input[@name='pran']") private WebElement pranfield_authorize;
	@FindBy(xpath="//input[@id='searchId']") private WebElement Submit_authorize_pran;
	@FindBy(xpath="(//td[@class='tabledetails'])[2]") private WebElement claim_id_ack_no;
	@FindBy(xpath="//input[@class='submitbutton']") private WebElement submit_authorize_request;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]") private WebElement understant_checkbox;
	
	@FindBy(xpath="//a[text()='Logout']") private WebElement logout;
	
	@FindBy(xpath="//input[@id='abc1']") private WebElement Digital_certificate;
	
	@FindBy(xpath="(//input[@type='button'])[1]") private WebElement submit_usrid_using_digital_certificate;
	
	
	public void claim_id_generator(String user_id , String pass , String pran)
	{
		
		elementUtil.click_On_WebElement(driver, Digital_certificate, constant.explicitWait);
		userid_using_digital_certificate.sendKeys(user_id);
		//password.sendKeys(pass);
		constant.pause(10000);
	//	elementUtil.click_On_WebElement(driver, understant_checkbox, constant.explicitWait);
	//	elementUtil.click_On_WebElement(driver, submit_button, constant.explicitWait);
		
		elementUtil.click_On_WebElement(driver, submit_usrid_using_digital_certificate, constant.explicitWait);
		constant.pause(10000);
		elementUtil.click_On_WebElement(driver, resolve_later, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Generate_Claim_id, constant.explicitWait);
		pranfield.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Generate_Claim_ID, constant.explicitWait);
		elementUtil.Select_DropDownByVisibleText(Withdrawal_due_to_drop, "Incapacitation");
		
		//Incapacitation ,Premature Exit,Death ,Exit at 60/SuperAnnuation 
		
		elementUtil.click_On_WebElement(driver, Submit_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, confirm_button, constant.explicitWait);
		
		
		
		
	}
	
	
	public void authorize_request(String user_id , String pass ,String pran)
	{
		elementUtil.click_On_WebElement(driver, Digital_certificate, constant.explicitWait);
		userid_using_digital_certificate.sendKeys(user_id);
	//	userid.sendKeys(user_id);
	//	password.sendKeys(pass);
		constant.pause(10000);
		elementUtil.click_On_WebElement(driver, submit_usrid_using_digital_certificate, constant.explicitWait);
		constant.pause(10000);
	//	elementUtil.click_On_WebElement(driver, understant_checkbox, constant.explicitWait);
	//	elementUtil.click_On_WebElement(driver, submit_button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, resolve_later, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Authorize_generate_claim_id, constant.explicitWait);
		pranfield_authorize.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_authorize_pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, claim_id_ack_no, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, submit_authorize_request, constant.explicitWait);
		
		
	}
	
	
	public void initiate_using_digital_certificate( String user_id , String pran  )
	{
		elementUtil.click_On_WebElement(driver, Digital_certificate, constant.explicitWait);
		userid_using_digital_certificate.sendKeys(user_id);
	
		constant.pause(10000);
	
		
		elementUtil.click_On_WebElement(driver, submit_usrid_using_digital_certificate, constant.explicitWait);
		constant.pause(10000);
		elementUtil.click_On_WebElement(driver, resolve_later, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Generate_Claim_id, constant.explicitWait);
		pranfield.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Generate_Claim_ID, constant.explicitWait);
		elementUtil.Select_DropDownByVisibleText(Withdrawal_due_to_drop, "Incapacitation");
		
		
		
		elementUtil.click_On_WebElement(driver, Submit_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, confirm_button, constant.explicitWait);
		
	
		
	}
	
	
	public void authorize_using_digital_certificate( String user_id , String pran)
	{

		elementUtil.click_On_WebElement(driver, Digital_certificate, constant.explicitWait);
		userid_using_digital_certificate.sendKeys(user_id);
	
		constant.pause(10000);
		elementUtil.click_On_WebElement(driver, submit_usrid_using_digital_certificate, constant.explicitWait);
		constant.pause(10000);
		elementUtil.click_On_WebElement(driver, resolve_later, constant.explicitWait);
	
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Authorize_generate_claim_id, constant.explicitWait);
		pranfield_authorize.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_authorize_pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, claim_id_ack_no, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, submit_authorize_request, constant.explicitWait);
		
		
	
	}
	
	
	
	
}
