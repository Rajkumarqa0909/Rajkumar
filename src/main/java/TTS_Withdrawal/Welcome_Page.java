package TTS_Withdrawal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;
import utility.Excel_reader;

public class Welcome_Page extends Base
{
	
	Excel_reader er = new Excel_reader("./src//test//resources//CY.xlsx");
	
	
	public Welcome_Page()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	
	@FindBy(xpath="(//input[@name='userID'])[2]") private WebElement userid;
	@FindBy(xpath="(//input[@name='password'])[2]") private WebElement password;
	@FindBy(xpath="(//input[@class='submitbutton'])[2]") private WebElement submit_button;
	@FindBy(xpath="//a[text()='Exit Withdrawal Request']") private WebElement  Exit_Withdrawal_Request;
	@FindBy(xpath="//a[contains(text(),'Initiate Withdrawal Request')]") private WebElement  Initiate_Request;
	@FindBy(xpath="(//input[@name='wdrChoice'])[1]") private WebElement  Superannuation;
	@FindBy(xpath="//input[@name='PRAN']") private WebElement  Pran_field;
	@FindBy(xpath="	//input[@name='submit_validateForm']") private WebElement  Submit_Button;
	@FindBy(xpath="//select[@name='compWdrType']") private WebElement  TTS_Dropdown;
	@FindBy(xpath="	//select[@id='tierType']") private WebElement  Tire_2_TTSaver_Dropdown;
	@FindBy(xpath="	//input[@id='Submit']") private WebElement  Tire_2_TTSaver_Dropdown_Submit_Button;
	@FindBy(xpath="	//td[@style='border: none; width: auto;']") private WebElement  TTS_Value;
	@FindBy(xpath="	//input[@id='schemeList[0].wdrData']") private WebElement  Value_input;
	@FindBy(xpath="	//input[@id='schemeList[0].selectedFlag']") private WebElement  scheme_checkbox;
	@FindBy(xpath="	(//input[@id='Submit'])[1]") private WebElement  scheme_Submit;
	@FindBy(xpath="//input[@id='pran']") private WebElement  Pran_field_statusview;
	@FindBy(xpath="(//td[@style='width: 25px'])[3]") private WebElement  Ack_Num;
	@FindBy(xpath="(//input[@id='view'])[2]") private WebElement  Status_View;
	@FindBy(xpath="//input[@value='Confirm']") private WebElement  Confirm;
	@FindBy(xpath="//a[@class='approveLink']") private WebElement  Acknowledgement_Num_Status_view;
	@FindBy(xpath="//input[@id='pran']") private WebElement  Pranfield_status_view;
	@FindBy(xpath="//td//label[text()='8000421446']") private WebElement  ack_num;
	
    
	
	public void initiate_request(String uid ,String pwd , String Pran , String TTs , String Tire_2_TTS)
	{
		userid.sendKeys(uid);
		password.sendKeys(pwd);
		elementUtil.click_On_WebElement(driver, submit_button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Superannuation, constant.explicitWait);
		Pran_field.sendKeys(Pran);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.Select_DropDownByVisibleText(TTS_Dropdown, TTs);
		elementUtil.Select_DropDownByVisibleText(Tire_2_TTSaver_Dropdown, Tire_2_TTS);
		elementUtil.click_On_WebElement(driver, Tire_2_TTSaver_Dropdown_Submit_Button, constant.explicitWait);
		String value = TTS_Value.getText();
		System.out.println(value);
		Value_input.sendKeys(value);
		elementUtil.click_On_WebElement(driver, scheme_checkbox, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, scheme_Submit, constant.explicitWait);
		
	//	elementUtil.click_On_WebElement(driver, Confirm, constant.explicitWait);
	//	elementUtil.click_On_WebElement(driver, Status_View, constant.explicitWait);
	//	Pranfield_status_view.sendKeys("110000050030");
	//	elementUtil.click_On_WebElement(driver, Tire_2_TTSaver_Dropdown_Submit_Button, constant.explicitWait);
	//  elementUtil.click_On_WebElement(driver, Acknowledgement_Num_Status_view, constant.explicitWait);
	
		
		
	}
	
	
	public void status_View(String uid ,String pwd , String Pran , String TTs , String Tire_2_TTS)
	
	{
		
		
		userid.sendKeys(uid);
		password.sendKeys(pwd);
		elementUtil.click_On_WebElement(driver, submit_button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Superannuation, constant.explicitWait);
		Pran_field.sendKeys(Pran);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.Select_DropDownByVisibleText(TTS_Dropdown, TTs);
		elementUtil.Select_DropDownByVisibleText(Tire_2_TTSaver_Dropdown, Tire_2_TTS);
		elementUtil.click_On_WebElement(driver, Status_View, constant.explicitWait);
		Pranfield_status_view.sendKeys("110000050030");
		elementUtil.click_On_WebElement(driver, Tire_2_TTSaver_Dropdown_Submit_Button, constant.explicitWait);
		String acknum = Acknowledgement_Num_Status_view.getText();
		er.setCellData("Sheet1", "AckNo", 2, acknum);
	    elementUtil.click_On_WebElement(driver, Acknowledgement_Num_Status_view, constant.explicitWait);
	    
	    
	    
	}
	
	

}
