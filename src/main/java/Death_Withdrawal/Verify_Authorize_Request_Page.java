package Death_Withdrawal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;

public class Verify_Authorize_Request_Page extends Base
{
	
	 public Verify_Authorize_Request_Page()
		{
			PageFactory.initElements(Base.driver, this);
		}
	 
	@FindBy(xpath="(//input[@name='userID'])[1]") private WebElement  User_ID;
		
	@FindBy(xpath="(//input[@name='password'])[1]") private WebElement  Password;
		
	@FindBy(xpath="(//input[@type='submit'])[1]") private WebElement  Submit_Button_Login;
	
    @FindBy(xpath="//a[text()='Exit Withdrawal Request']") private WebElement  Exit_Withdrawal_Request;
	
	@FindBy(xpath="//a[text()='Initiate Withdrawal Request                                           ']")	private WebElement  Initiate_Withdrawal_Request;
	
	@FindBy(xpath="//input[@id='maker']") private WebElement  Initiate_Request_Button;
	
	@FindBy(xpath="//input[@value='deathWdr']") private WebElement  Death_Withdrawal;
	
	@FindBy(xpath="//input[@id='auth']") private WebElement  Verify_Authorize_Request;
	
	//input[@value='deathWdr']
	
	@FindBy(xpath="	//input[@id='pran']") private WebElement  PRAN_Textfield;
	
	@FindBy(xpath="	//input[@id='ackId']") private WebElement  Acknowledgement_Number;
	
	@FindBy(xpath="	//input[@id='claimId']") private WebElement  Claim_ID;
	
	@FindBy(xpath="	//input[@id='fromDate']") private WebElement  From_date;
	
	@FindBy(xpath="	//input[@id='toDate']") private WebElement  To_Date;
	
	@FindBy(xpath="	//input[@id='submitbtn']") private WebElement  Submit_Button;
	
	@FindBy(xpath="	//a[text()='Accept/Reject']") private WebElement  Accept_Reject;
	
	@FindBy(xpath="	//input[@class='frt']") private WebElement  Family_Details_Forward_Button;
	
	@FindBy(xpath="	//input[@class='frt']") private WebElement  Annuitant_Details_Forward_Button;
	
	@FindBy(xpath="	//input[@class='frt']") private WebElement  Nominee_LegalHier_Details_Forward_Button;
	
	@FindBy(xpath="	//input[@class='frt']") private WebElement  DocumentChecklistTire1_Forward_Button;
	
	@FindBy(xpath="	//input[@class='frt']") private WebElement  Declaration_Forward_Button;
	
	@FindBy(xpath="	//input[@value='Approve/ Reject']") private WebElement  Approve_Reject;
	
	@FindBy(xpath="	//input[@id='status1']") private WebElement  Accept;
	
	@FindBy(xpath="	//input[@id='submitbtn']") private WebElement  Approve;
	
	@FindBy(xpath="	//input[@id='proceedBtn']") private WebElement  Proceed_PopUp;
	
	@FindBy(xpath="	//input[@value='Close']") private WebElement  Close;
	
	
	// Non Government Sector
	
	@FindBy(xpath="//input[@id='xyz1']") private WebElement Digital_certificate;
	@FindBy(xpath="(//input[@name='userID'])[3]") private WebElement UID_Digital_certificate;
	@FindBy(xpath="//input[@id='receiptNo']") private WebElement Reciept_No;
	@FindBy(xpath="//input[@onclick='signUsingNss(userID.value);']") private WebElement Submit_DC;
	@FindBy(xpath="//input[@name='cancelBtn']") private WebElement Resolve_Later;
	
	
	// For Ac No
	
	@FindBy(xpath = "((//div[@class='popupWindow'])[3]//table[@class='formTable']//label)[4]") private WebElement act_num;
	
	
	public void verify_And_Authorize(String usrid , String pass , String pran) throws InterruptedException
	
	{
		User_ID.sendKeys(usrid);
		Password.sendKeys(pass);
		Thread.sleep(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button_Login, constant.explicitWait);
	//	Submit_Button.click();
		
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		
	//	Exit_Withdrawal_Request.click();
		
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
	//	Initiate_Withdrawal_Request.click();
		
	//	elementUtil.click_On_WebElement(driver, Initiate_Request_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
	
		
		elementUtil.click_On_WebElement(driver, Verify_Authorize_Request, constant.explicitWait);
		PRAN_Textfield.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Accept_Reject, constant.explicitWait);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Family_Details_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Annuitant_Details_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Nominee_LegalHier_Details_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, DocumentChecklistTire1_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Declaration_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Approve_Reject, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Accept, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Approve, constant.explicitWait);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Proceed_PopUp, constant.explicitWait);
		
	}
	
	
	
	
	
	
public void verify_And_Authorize_lumpsum100_0(String usrid , String pass , String pran) throws InterruptedException
	
	{
		User_ID.sendKeys(usrid);
		Password.sendKeys(pass);
		Thread.sleep(1000);
		elementUtil.click_On_WebElement(driver, Submit_Button_Login, constant.explicitWait);
	//	Submit_Button.click();
		
		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
		
	//	Exit_Withdrawal_Request.click();
		
		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
	//	Initiate_Withdrawal_Request.click();
		
	//	elementUtil.click_On_WebElement(driver, Initiate_Request_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
	
		
		elementUtil.click_On_WebElement(driver, Verify_Authorize_Request, constant.explicitWait);
		PRAN_Textfield.sendKeys(pran);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Accept_Reject, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Family_Details_Forward_Button, constant.explicitWait);
		
		elementUtil.click_On_WebElement(driver, Nominee_LegalHier_Details_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, DocumentChecklistTire1_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Declaration_Forward_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Approve_Reject, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Accept, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Approve, constant.explicitWait);
		constant.pause(1000);
		elementUtil.click_On_WebElement(driver, Proceed_PopUp, constant.explicitWait);
		
		
		
	}

   

       
        public void Verify_and_Authorize_Non_Government_DC(String usrid , String pass , String pran)
        {
        	
        		constant.pause(2000);
        		elementUtil.click_byJavaScript(driver, Digital_certificate);
        	
        		UID_Digital_certificate.sendKeys(usrid);
        		constant.pause(8000);
        		elementUtil.click_On_WebElement(driver, Submit_DC, constant.explicitWait);
        		
        		constant.pause(2000);
        		elementUtil.click_On_WebElement(driver, Resolve_Later, constant.explicitWait);
        		elementUtil.click_On_WebElement(driver, Exit_Withdrawal_Request, constant.explicitWait);
        		elementUtil.click_On_WebElement(driver, Initiate_Withdrawal_Request, constant.explicitWait);
        		elementUtil.click_On_WebElement(driver, Death_Withdrawal, constant.explicitWait);
        		
        		
        		elementUtil.click_On_WebElement(driver, Verify_Authorize_Request, constant.explicitWait);
         		PRAN_Textfield.sendKeys(pran);
        		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
        		elementUtil.click_On_WebElement(driver, Accept_Reject, constant.explicitWait);
        		elementUtil.click_On_WebElement(driver, Family_Details_Forward_Button, constant.explicitWait);
      		
       	    	elementUtil.click_On_WebElement(driver, Nominee_LegalHier_Details_Forward_Button, constant.explicitWait);
       		    elementUtil.click_On_WebElement(driver, DocumentChecklistTire1_Forward_Button, constant.explicitWait);
       	    	elementUtil.click_On_WebElement(driver, Declaration_Forward_Button, constant.explicitWait);
         		elementUtil.click_On_WebElement(driver, Approve_Reject, constant.explicitWait);
        		elementUtil.click_On_WebElement(driver, Accept, constant.explicitWait);
        		elementUtil.click_On_WebElement(driver, Approve, constant.explicitWait);
        		constant.pause(1000);
        		elementUtil.click_On_WebElement(driver, Proceed_PopUp, constant.explicitWait);
        		
       
        
        
        }


       
	
	
	
	



}
