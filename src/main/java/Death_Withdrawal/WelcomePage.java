package Death_Withdrawal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;

public class WelcomePage extends Base
{

	 public WelcomePage()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="(//input[@name='userID'])[1]") private WebElement  User_ID;
	
	@FindBy(xpath="(//input[@name='password'])[1]") private WebElement  Password;
	
	@FindBy(xpath="(//input[@type='submit'])[1]") private WebElement  Submit_Button;
	
	@FindBy(xpath="//input[@name='cancelBtn']") private WebElement  Attention_Resolve_later;
	
	
	@FindBy(xpath="//a[text()='Exit Withdrawal Request']") private WebElement  Exit_Withdrawal_Request;
	
	@FindBy(xpath="//a[text()='Initiate Withdrawal Request                                           ']")	private WebElement  Initiate_Withdrawal_Request;
	
	@FindBy(xpath="//input[@id='maker']") private WebElement  Initiate_Request_Button;
	
	@FindBy(xpath="//input[@value='deathWdr']") private WebElement  Death_Withdrawal;

	
	
	
	
	//@FindBy(xpath="//input[@id='view']") private WebElement  View_Request_Status;
	
	@FindBy(xpath="//input[@id='pran']") private WebElement  Pran_Text_Field;
	
	@FindBy(xpath="//input[@class='submit' and @type='button']") private WebElement  Submit_Button_Pran;
	
	@FindBy(xpath="//input[@value='Reset']") private WebElement  Reset_Button_Pran;
	
	@FindBy(xpath="//input[@id='checks1']") private WebElement  Checkbox1;
	
	@FindBy(xpath="//input[@type='submit' and @class='submit']") private WebElement  Ok_Button_After_Checkbox;
	
	
	@FindBy(xpath="//input[@id='dateOfDeath']") private WebElement  Date_Of_Death;
	
	@FindBy(xpath="//input[@id='valSubmit']") private WebElement  Submit_Date_Of_Death_Button;
	
	@FindBy(xpath="//input[@id='wdrPercDisp']") private WebElement  Claimant_withdrawl_Tier1;
	
	@FindBy(xpath="//input[@id='aspPercDisp']") private WebElement  Annuity_Tier_1;
	
	@FindBy(xpath="//select[@id='maritalStatus']") private WebElement  Marital_Status;
	
	@FindBy(xpath="//select[@id='spouseSts']") private WebElement  Spouse_Status;
	
	@FindBy(xpath="//select[@id='motherSts']") private WebElement  Mother_Status;
	
	@FindBy(xpath="//select[@id='fatherSts']") private WebElement  Father_Status;
	
	@FindBy(xpath="//input[@class='submit' and @onclick='openNominationMsgPopup()']") private WebElement  Family_Member_Details_Submit_Button;
	
	@FindBy(xpath="//input[@onclick='openConfirmBeforeSavePopup()']") private WebElement  Nomination_Details_popup;
	
	@FindBy(xpath="//input[@onclick='finalConfirmSave()']	") private WebElement  valuation_Final_confirm;
	//input[@value='CONFIRM']
	
	@FindBy(xpath="//input[@onclick='closeAckConfirmPopup()']") private WebElement  Acknowledgement_OK;
	
	// lumpsum valuation pop
	
	@FindBy(xpath="(//input[@onclick='closeShowValuationPopup()'])[1]") private WebElement  Lumpsum_100_valueation_POPuP;
	
	// popup after not alive alivend alivend
	
	@FindBy(xpath="//input[@value='CLOSE']") private WebElement  Popup_close_afer_all_not_alive;
	// for trial 
	@FindBy(xpath="//input[@class='frt']") private WebElement  Family_Details_Forward_Button;
	
	// For Non Governments Sector
	
	@FindBy(xpath="//input[@id='wdrOption1']") private WebElement A_100_Lumpsum_Withdrawal;
	@FindBy(xpath="//input[@id='wdrOption2']") private WebElement B_100_Annuity_Withdrawal;
	@FindBy(xpath="//input[@id='wdrOption3']") private WebElement C_100_Lumpsum_And_Annuity_Withdrawal;
	@FindBy(xpath="//input[@id='annuityOptionDisp1']") private WebElement NPs_Family_Income_Option_Defualt_Annuity;
	@FindBy(xpath="//input[@id='annuityOptionDisp2']") private WebElement Other_Annuity_Option;
	@FindBy(xpath="//input[@id='xyz1']") private WebElement Digital_certificate;
	@FindBy(xpath="(//input[@name='userID'])[3]") private WebElement UID_Digital_certificate;
	@FindBy(xpath="//input[@id='receiptNo']") private WebElement Reciept_No;
	@FindBy(xpath="//input[@onclick='signUsingNss(userID.value);']") private WebElement Submit_DC;
	@FindBy(xpath="//input[@name='cancelBtn']") private WebElement Resolve_Later;
	@FindBy(xpath="//i[text()='Dear Claimant,']") private WebElement Message_dear_claimant;
	
	
	
	public void initiate_Death_WithdrwalRequest(String uid , String password , String pran , String dob ,String maritualstatus , String spousestatus , String motherstatus , String fatherstatus ) throws InterruptedException
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(password);
		Thread.sleep(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
	    Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
	    elementUtil.Select_DropDownByVisibleText(Marital_Status, "Married");
	    elementUtil.Select_DropDownByVisibleText(Spouse_Status, "Alive");
	    elementUtil.Select_DropDownByVisibleText(Mother_Status, "Not Alive");
	    elementUtil.Select_DropDownByVisibleText(Father_Status, "Not Alive");
		elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
	    elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
	    
	}
	
	
	
	public void initiate_withdrawal_Request_lumpsum100( String uid , String Pass , String pran , String dob , String lumpsumpercantage , String Annuitypercantage ,String Marritualstatus , String spousestatus) throws InterruptedException
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(Pass);
		Thread.sleep(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
	    Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Lumpsum_100_valueation_POPuP, constant.explicitWait);
		
		Claimant_withdrawl_Tier1.sendKeys(lumpsumpercantage);
		
		Annuity_Tier_1.sendKeys(Annuitypercantage);
	    elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
	    elementUtil.Select_DropDownByVisibleText(Spouse_Status, spousestatus );
	    elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
	    elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
	    constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
		
	}
	
	
	// login trial 
	
	public void login( String uid , String Pass , String pran) throws InterruptedException
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(Pass);
		Thread.sleep(2000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
	    Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
	
	}
	
	public void initiate_withdrawal_Request_lumpsum20_80( String uid , String Pass , String pran , String dob ,String Marritualstatus , String spousestatus , String Motherstatus , String fatherstatus) throws InterruptedException
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(Pass);
		Thread.sleep(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
    	Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
        elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
	    elementUtil.Select_DropDownByVisibleText(Spouse_Status, spousestatus );
	    elementUtil.Select_DropDownByVisibleText(Mother_Status, Motherstatus);
	    elementUtil.Select_DropDownByVisibleText(Father_Status, fatherstatus);
		elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
		constant.pause(1000);
	    
		elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
		
		
	}
	
	
	public void initiate_withdrawal_Request_lumpsum20_80_For_notalive_SMF( String uid , String Pass , String pran , String dob ,String Marritualstatus , String spousestatus , String Motherstatus , String fatherstatus) throws InterruptedException
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(Pass);
		Thread.sleep(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
		Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
    	elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
		elementUtil.Select_DropDownByVisibleText(Spouse_Status, spousestatus );
	    elementUtil.Select_DropDownByVisibleText(Mother_Status, Motherstatus);
	    elementUtil.Select_DropDownByVisibleText(Father_Status, fatherstatus);
		elementUtil.click_byJavaScript(driver, Popup_close_afer_all_not_alive);
		elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
		
	}
	
	
	public void initiate_withdrawal_Request_lumpsum20_80_For_Scenario_09( String uid , String Pass , String pran , String dob ,String Marritualstatus , String spousestatus , String Motherstatus , String fatherstatus) throws InterruptedException
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(Pass);
		Thread.sleep(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
		Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
    	elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
		elementUtil.Select_DropDownByVisibleText(Spouse_Status, spousestatus );
	    elementUtil.Select_DropDownByVisibleText(Mother_Status, Motherstatus);
		elementUtil.Select_DropDownByVisibleText(Father_Status, fatherstatus);
	    elementUtil.click_byJavaScript(driver, Popup_close_afer_all_not_alive);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
	    elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
		
	}
	
	public void initiate_withdrawal_Request_lumpsum20_80_For_Scenario_10( String maritualstatus ,String Motherstatusflag ,String Fatherstatusflag, String uid , String Pass , String pran , String dob ,String Marritualstatus , String spousestatus , String Motherstatus , String fatherstatus) throws InterruptedException
	{
		if(maritualstatus.equalsIgnoreCase("Unmarried") && Motherstatusflag.equalsIgnoreCase("AliveandDepend") && Fatherstatusflag.equalsIgnoreCase("AliveandDepend"))
		{
		User_ID.sendKeys(uid);
		Password.sendKeys(Pass);
		Thread.sleep(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
    	elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
		Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
     	elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
	    elementUtil.Select_DropDownByVisibleText(Mother_Status, Motherstatus);
		elementUtil.Select_DropDownByVisibleText(Father_Status, fatherstatus);
		elementUtil.click_byJavaScript(driver, Popup_close_afer_all_not_alive);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
		elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
		
		}
		
		else if(maritualstatus.equalsIgnoreCase("Unmarried") && Motherstatusflag.equalsIgnoreCase("AliveandDepend") && Fatherstatusflag.equalsIgnoreCase("AliveandNotDepend"))
		{
		User_ID.sendKeys(uid);
		Password.sendKeys(Pass);
		Thread.sleep(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
		Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
    	elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
	    elementUtil.Select_DropDownByVisibleText(Mother_Status, Motherstatus);
		elementUtil.Select_DropDownByVisibleText(Father_Status, fatherstatus);
		elementUtil.click_byJavaScript(driver, Popup_close_afer_all_not_alive);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
		
		}
		
		else if(maritualstatus.equalsIgnoreCase("Unmarried") && Motherstatusflag.equalsIgnoreCase("AliveandNotDepend") && Fatherstatusflag.equalsIgnoreCase("AliveandDepend"))
		{
		User_ID.sendKeys(uid);
		Password.sendKeys(Pass);
		Thread.sleep(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
		Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
     	elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
	    elementUtil.Select_DropDownByVisibleText(Mother_Status, Motherstatus);
		elementUtil.Select_DropDownByVisibleText(Father_Status, fatherstatus);
		elementUtil.click_byJavaScript(driver, Popup_close_afer_all_not_alive);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
		elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
		
		}
		
		else if(maritualstatus.equalsIgnoreCase("Unmarried") && Motherstatusflag.equalsIgnoreCase("AliveandNotDepend") && Fatherstatusflag.equalsIgnoreCase("AliveandNotDepend"))
		{
		User_ID.sendKeys(uid);
		Password.sendKeys(Pass);
		Thread.sleep(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
		Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
    	elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
	    elementUtil.Select_DropDownByVisibleText(Mother_Status, Motherstatus);
		elementUtil.Select_DropDownByVisibleText(Father_Status, fatherstatus);
		elementUtil.click_byJavaScript(driver, Popup_close_afer_all_not_alive);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
		elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
		
		}
		
		
		
		
	}
	
	
	public void initiate_Withdrawal_Request_Non_Gov_Sector(String uid , String password , String pran , String dob ,String MarritualStatus , String Spousestatus)
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(password);
		constant.pause(1000);
	    elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
	    Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
	    elementUtil.Select_DropDownByVisibleText(Marital_Status, MarritualStatus);
	    elementUtil.Select_DropDownByVisibleText(Spouse_Status, Spousestatus);
	    elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
		constant.pause(1000);
	    elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
	    
	}
	
	public void initiate_Withdrawal_Request_Non_Gov_Sector_for_scenarios(String uid , String password ,String pran , String dob , String Marritualstatus , String spousestatus , String Motherstatus , String fatherstatus  )
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(password);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request ,constant.explicitWait );
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
		Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, B_100_Annuity_Withdrawal, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, NPs_Family_Income_Option_Defualt_Annuity, constant.explicitWait);
		elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
	    elementUtil.Select_DropDownByVisibleText(Spouse_Status, spousestatus );
	    elementUtil.Select_DropDownByVisibleText(Mother_Status, Motherstatus);
	    elementUtil.Select_DropDownByVisibleText(Father_Status, fatherstatus);
	    elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
	    constant.pause(1000);
	    elementUtil.click_On_WebElement(driver, Nomination_Details_popup, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
		constant.pause(1000);
	    elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
	    
	 
	}
	
	public void initiate_withdrawal_request_for_Non_gov_scenario_other_Annuity( String uid ,String password,String pran , String dob , String Marritualstatus,String spousestatus )
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(password);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request ,constant.explicitWait );
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
		Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, B_100_Annuity_Withdrawal, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Other_Annuity_Option, constant.explicitWait);
		elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
	    elementUtil.Select_DropDownByVisibleText(Spouse_Status, spousestatus );
	    elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
	    constant.pause(1000);
	    elementUtil.click_On_WebElement(driver, Nomination_Details_popup, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
		constant.pause(1000);
        elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
		
	}
	
	public void innitiate_withdrawal_non_gov_lumpsump_And_Annuity_withdrawal( String uid ,String password,String pran , String dob , String Marritualstatus,String spousestatus ,String Motherstatus ,String fatherstatus )
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(password);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request ,constant.explicitWait );
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
		Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, C_100_Lumpsum_And_Annuity_Withdrawal, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, NPs_Family_Income_Option_Defualt_Annuity, constant.explicitWait);
	    Claimant_withdrawl_Tier1.clear();
	    Claimant_withdrawl_Tier1.sendKeys("20");
	    elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
	    elementUtil.Select_DropDownByVisibleText(Spouse_Status, spousestatus );
	    elementUtil.Select_DropDownByVisibleText(Mother_Status, Motherstatus);
  		elementUtil.Select_DropDownByVisibleText(Father_Status, fatherstatus);
	    elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
	    constant.pause(1000);
	 //   elementUtil.click_On_WebElement(driver, Nomination_Details_popup, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
		constant.pause(1000);
        elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
		
	
	}
	
	public void innitiate_withdrawal_non_gov_lumpsump_And_Annuity_withdrawal_other_Annuity( String uid ,String password,String pran , String dob , String Marritualstatus,String spousestatus ,String Motherstatus ,String fatherstatus )
	{
		User_ID.sendKeys(uid);
		Password.sendKeys(password);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request ,constant.explicitWait );
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
		Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, C_100_Lumpsum_And_Annuity_Withdrawal, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Other_Annuity_Option, constant.explicitWait);
	    Claimant_withdrawl_Tier1.clear();
	    Claimant_withdrawl_Tier1.sendKeys("20");
	    elementUtil.Select_DropDownByVisibleText(Marital_Status, Marritualstatus);
	    elementUtil.Select_DropDownByVisibleText(Spouse_Status, spousestatus );
	    elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
	    constant.pause(1000);
   //   elementUtil.click_On_WebElement(driver, Nomination_Details_popup, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
		constant.pause(1000);
        elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
		
	
	}
	
	
	
	public void non_government_lumpsum_100_0_DC(String uid , String password , String pran , String dob ,String reciept_no ,String MarritualStatus , String Spousestatus)
	{
	//	User_ID.sendKeys(uid);
	//	Password.sendKeys(password);
		
		//input[@id='xyz1']
		
	//  elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		constant.pause(2000);
		elementUtil.click_byJavaScript(driver, Digital_certificate);
	//	elementUtil.click_On_WebElement(driver, Digital_certificate, constant.explicitWait);
		UID_Digital_certificate.sendKeys(uid);
		constant.pause(5000);
		elementUtil.click_On_WebElement(driver, Submit_DC, constant.explicitWait);
		
		constant.pause(2000);
		elementUtil.click_On_WebElement(driver, Resolve_Later, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
	    Pran_Text_Field.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button_Pran, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Checkbox1, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Ok_Button_After_Checkbox, constant.explicitWait);
		constant.pause(2000);
		Date_Of_Death.sendKeys(dob);
		elementUtil.click_On_WebElement(driver,Submit_Date_Of_Death_Button, constant.explicitWait);
		Reciept_No.sendKeys(reciept_no);
	    elementUtil.Select_DropDownByVisibleText(Marital_Status, MarritualStatus);
	    elementUtil.Select_DropDownByVisibleText(Spouse_Status, Spousestatus);
	    elementUtil.click_On_WebElement(driver, Family_Member_Details_Submit_Button, constant.explicitWait);
		elementUtil.click_byJavaScript(driver, valuation_Final_confirm);
	    elementUtil.click_On_WebElement(driver, Acknowledgement_OK, constant.explicitWait);
	    
		
	}
	
	
	
	
	
	

}
