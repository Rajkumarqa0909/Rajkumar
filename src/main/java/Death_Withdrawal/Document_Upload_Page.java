package Death_Withdrawal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.Excel_reader;
import utility.constant;
import utility.elementUtil;

public class Document_Upload_Page extends Base
{
	
	
	Excel_reader excel = new Excel_reader(constant.withdrawl_excel);
	
	public Document_Upload_Page()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	//Document upload
	
	@FindBy(xpath="//input[@id='annuitantDocFile']") private WebElement  Withdrawal_form;
	
	@FindBy(xpath="//input[@id='nomTier1DocFile']") private WebElement  KYC_Other_document_Tier1;
	
	@FindBy(xpath="//input[@id='bankProofDocFile']") private WebElement  Bank_Proof;
	
	@FindBy(xpath="//input[@value='Upload']") private WebElement  Upload;
	
	@FindBy(xpath="//input[@value='Confirm & Proceed']") private WebElement  Confirm_And_Proceed;
	
	@FindBy(xpath="//input[@id='proceedBtn']") private WebElement  final_Proceed;
	
	
	//Next tab
	
	@FindBy(xpath="//a[text()='Family Details']") private WebElement  Family_Details;
	@FindBy(xpath="//input[@class='frt']") private WebElement  Family_Details_Forward_Button;
	
	@FindBy(xpath="//input[@class='frt']") private WebElement  Annuitant_Details_Forward_Button;
	
	@FindBy(xpath="//input[@class='frt']") private WebElement  Nominee_Details_Forward_Button;
	@FindBy(xpath="//input[@class='frt']") private WebElement Documentchecklist_Forward_Button;
	@FindBy(xpath="//input[@class='frt']") private WebElement  Declaration_Forward_Button;
	
	// final confirm_button after document upload
	
	@FindBy(xpath="//input[@value='Confirm']") private WebElement  Final_confirm;
	
	@FindBy(xpath="//input[@id='proceedBtn']") private WebElement  Final_Proceed;
	
	@FindBy(xpath="(//input[@onclick='closeApprovePopUp()' ])[1]") private WebElement  Withdrawal_Request_Pop_close;
	
	
	// Withdrawal message
	
	@FindBy(xpath="//p[@class='error_wrapper']") private WebElement  Withdrawal_message;
	
	public void uploadDocument()
	{
		Withdrawal_form.sendKeys(constant.withdrawal_form);
		KYC_Other_document_Tier1.sendKeys(constant.KYC_Other_Documents);
		Bank_Proof.sendKeys(constant.Bank_Proof);
		
		elementUtil.click_On_WebElement(driver, Upload, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Confirm_And_Proceed, constant.explicitWait);
		
		elementUtil.click_On_WebElement(driver, Family_Details, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Family_Details_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Annuitant_Details_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Nominee_Details_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Documentchecklist_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Declaration_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Final_confirm, constant.explicitWait);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Final_Proceed, constant.explicitWait);
		String message = Withdrawal_message.getText();
		System.out.println(message);
		excel.setCellData("Sheet4", "Withdrawal_message", 2, message);
	//	elementUtil.click_On_WebElement(driver, Withdrawal_Request_Pop_close, constant.explicitWait);
		
	
	}
	
	public void uploadDocument_lumpsum100_0()
	{
		Withdrawal_form.sendKeys(constant.withdrawal_form);
		KYC_Other_document_Tier1.sendKeys(constant.KYC_Other_Documents);
		Bank_Proof.sendKeys(constant.Bank_Proof);
		
		elementUtil.click_On_WebElement(driver, Upload, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Confirm_And_Proceed, constant.explicitWait);
		
		elementUtil.click_On_WebElement(driver, Family_Details, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Family_Details_Forward_Button, constant.explicitWait);
	
		elementUtil.click_On_WebElement(driver, Nominee_Details_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Documentchecklist_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Declaration_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Final_confirm, constant.explicitWait);
		
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Final_Proceed, constant.explicitWait);
		
	//	elementUtil.click_On_WebElement(driver, Withdrawal_Request_Pop_close, constant.explicitWait);
		
	
	}
	
	
	
	

}
