package Death_Withdrawal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;

public class Annuitant_Details_Page extends Base
{
	
	 public Annuitant_Details_Page()
		{
			PageFactory.initElements(Base.driver, this);
		}
	 
	 //Annuitant Contact Details
	 
	 @FindBy(xpath="//input[@id='nomAddrLn1']") private WebElement  Flat_Room_Door_Block_No;
	 
	 @FindBy(xpath="//input[@id='nomAddrPinCd']") private WebElement  Pincode;
	 
	 @FindBy(xpath="//input[@id='nomAddrPinSearchBtn']") private WebElement  Pincode_Search_Button;
	
	 @FindBy(xpath="//select[@id='nomAddrStateCd']") private WebElement  State_Dropdown;
	 
	 @FindBy(xpath="//select[@id='nomAddrCountryCd']") private WebElement  Country_Dropdown;
	 
	 @FindBy(xpath="//input[@id='nomMbNo']") private WebElement  Mobile_No;
	
	 @FindBy(xpath="//input[@id='nomEmailId']") private WebElement  Email_ID;
	 
	 //Annuitant Bank Details
	 
	 @FindBy(xpath="//input[@id='confirmNomBnkAccNo']") private WebElement  Bank_Account_No;
	
	 @FindBy(xpath="//input[@id='nomBnkAccNo']") private WebElement  Confirm_Bank_Account_No;
	
	 @FindBy(xpath="//select[@id='bankType']") private WebElement  Bank_Account_Type_Dropdown;
	
	 @FindBy(xpath="//input[@id='nomBnkIFSCCd']") private WebElement  IFSC_code;
	 
	 @FindBy(xpath="//input[@id='srchbtn2']") private WebElement  IFSC_code_SearchButton;

	 @FindBy(xpath="//input[@id='nomBnkname']") private WebElement  Bank_Name;
	 
	 @FindBy(xpath="//textarea[@id='nomBnkBranch']") private WebElement  Bank_Branch;
	 
     @FindBy(xpath="//textarea[@id='nomBankAdd']") private WebElement  Bank_Address;
     
     @FindBy(xpath=" //input[@id='nomBnkAddPin']") private WebElement  Bank_Address_Pin_Code;
     
     // Annuitant Details
     
     @FindBy(xpath=" //select[@id='polExposedFlag']") private WebElement  Politically_Exposed_Person_Dropdown;
   
     @FindBy(xpath="  //select[@id='polExposedPerson']") private WebElement  Are_u_Politically_Exposed_Person_Dropdown;
  
     @FindBy(xpath="  //select[@id='convictionFlag']") private WebElement  Conviction_india_or_Abroad_Dropdown;
     
     
     @FindBy(xpath="//input[@onclick='saveAnnuitant()']") private WebElement  Annuitant_Save_and_Proceed_Button;
   
     //Section D Claimant Annuity Details 
     
     @FindBy(xpath="//select[@id='aspId']") private WebElement  ASP_Names_Dropdown;
     
   
     @FindBy(xpath="//select[@id='aspFrequency']") private WebElement  Annuity_Frequency_Dropdown;
     
     @FindBy(xpath="//input[@onclick='submitASPDetails()']") private WebElement  Annuity_Submit_Button_Final_;
   
     
     //Nominee/Legal Heir Details
     
     @FindBy(xpath="//input[@value='Next']") private WebElement  Next_Button_Nominee_Heir_Details;
     
     @FindBy(xpath=" //input[@class='frt']") private WebElement  NextButtonNominee;
  
     //Non Government sector
     @FindBy(xpath="//input[@id='nomFstNam']") private WebElement  First_Name;
     @FindBy(xpath="//input[@id='pan']") private WebElement  PAN;
     @FindBy(xpath="//input[@id='nomDob']") private WebElement  DOB;
     @FindBy(xpath=" //input[@id='nomRel']") private WebElement  Relationship_With_Subscriber;
     @FindBy(xpath="//select[@id='aspSchemeId']") private WebElement  SchemeNames_Drop;
   
  
     
   
   
     
   
     public void fillAnnuitant_Details( String flatnum ,String Pin , String state , String mob , String emailid , String pep ,String pep1 ,String convictdrop, String bnk_acc_Num , String confirm_bnk_acc_Num ,
    		 String acc_Type , String ifsc , String bankaddpincode , String aspdrop , String annuity_frq) throws InterruptedException
     {
    	 
    	 //Contact_Details
    	 Flat_Room_Door_Block_No.sendKeys(flatnum);
    	 elementUtil.click_On_WebElement(driver, Pincode, constant.explicitWait);
    	 Pincode.sendKeys(Pin);
    	 elementUtil.Select_DropDownByVisibleText(State_Dropdown, state);
   // 	 elementUtil.Select_DropDownByVisibleText(Country_Dropdown, "India");
    	 Mobile_No.sendKeys(mob);
    	 Email_ID.sendKeys(emailid);
    	 
    	 //Annuitanat_Details
    	 
    	 elementUtil.Select_DropDownByVisibleText(Politically_Exposed_Person_Dropdown, pep);
    	 
    	 elementUtil.Select_DropDownByVisibleText(Are_u_Politically_Exposed_Person_Dropdown, pep1);
    	 
    	 elementUtil.Select_DropDownByVisibleText(Conviction_india_or_Abroad_Dropdown,convictdrop );
    	 
    	 //Bank Account Details
    	 
    	 Bank_Account_No.sendKeys(bnk_acc_Num);
    	 
    	 Confirm_Bank_Account_No.sendKeys(confirm_bnk_acc_Num);
    	 
    	 elementUtil.Select_DropDownByVisibleText(Bank_Account_Type_Dropdown, acc_Type);
    	 
    	 IFSC_code.sendKeys(ifsc);
    	 
    	 constant.pause(1000);
    	 
    	 Bank_Address_Pin_Code.sendKeys(bankaddpincode);
    	 
    //	 elementUtil.click_On_WebElement(driver, Annuitant_Save_and_Proceed_Button, constant.explicitWait);
    	 
    	 Thread.sleep(2000);
    	 
    	 elementUtil.click_byJavaScript(driver, Annuitant_Save_and_Proceed_Button);
    	 
    	
    	 elementUtil.Select_DropDownByVisibleText(ASP_Names_Dropdown, aspdrop);
    	 
    	 elementUtil.Select_DropDownByVisibleText(Annuity_Frequency_Dropdown, annuity_frq);
    	
    //	 elementUtil.click_On_WebElement(driver, Annuity_Submit_Button_Final_, constant.explicitWait);
    	 constant.pause(1000);
    	 elementUtil.click_byJavaScript(driver, Annuity_Submit_Button_Final_);
     }
     
    // Additional method for trial
     
     public void annuitytrial( String aspdrop , String annuity_frq)
     {
         elementUtil.Select_DropDownByVisibleText(ASP_Names_Dropdown, aspdrop);
    	 
    	 elementUtil.Select_DropDownByVisibleText(Annuity_Frequency_Dropdown,annuity_frq );
    	 
    	 elementUtil.click_On_WebElement(driver, Annuity_Submit_Button_Final_, constant.explicitWait);
    	 
    	
     }
     
     //
     
     public void nextAnnuity()
     {
    	 constant.pause(2000);
    	 elementUtil.click_On_WebElement(driver, NextButtonNominee, constant.explicitWait);
     }
     
     
     public void annuitant_Details_Fill_Non_Gov( String pep , String pep1 , String convictdrop , String flatnum , String Pin ,String state , String mob , String emailid ,
    		 String bnk_acc_Num ,String confirm_bnk_acc_Num , String acc_Type ,String ifsc ,String bankaddpincode , String aspdrop ,String annuity_frq  ) throws InterruptedException
     {
         elementUtil.Select_DropDownByVisibleText(Politically_Exposed_Person_Dropdown, pep);
    	 elementUtil.Select_DropDownByVisibleText(Are_u_Politically_Exposed_Person_Dropdown, pep1);
    	 elementUtil.Select_DropDownByVisibleText(Conviction_india_or_Abroad_Dropdown,convictdrop );
    	 Flat_Room_Door_Block_No.sendKeys(flatnum);
    	 elementUtil.click_On_WebElement(driver, Pincode, constant.explicitWait);
    	 Pincode.sendKeys(Pin);
    	 elementUtil.Select_DropDownByVisibleText(State_Dropdown, state);
      	 Mobile_No.sendKeys(mob);
    	 Email_ID.sendKeys(emailid);
         Bank_Account_No.sendKeys(bnk_acc_Num);
    	 Confirm_Bank_Account_No.sendKeys(confirm_bnk_acc_Num);
         elementUtil.Select_DropDownByVisibleText(Bank_Account_Type_Dropdown, acc_Type);
    	 IFSC_code.sendKeys(ifsc);
    	 constant.pause(1000);
    	 Bank_Address_Pin_Code.sendKeys(bankaddpincode);
     	 Thread.sleep(2000);
    	 elementUtil.click_byJavaScript(driver, Annuitant_Save_and_Proceed_Button);
         elementUtil.Select_DropDownByVisibleText(ASP_Names_Dropdown, aspdrop);
    	 elementUtil.Select_DropDownByVisibleText(Annuity_Frequency_Dropdown, annuity_frq);
     	 constant.pause(1000);
    	 elementUtil.click_byJavaScript(driver, Annuity_Submit_Button_Final_);
   	 
     }
     
     public void annuitant_Details_Fill_Non_Gov_other_annuity_Scenarios(String firstname ,String pan , String dob , String relation ,String pep ,String pep1 ,String convictdrop
    		,String flatnum,String Pin,String state ,String mob,String emailid,String bnk_acc_Num ,String confirm_bnk_acc_Num ,String acc_Type, String ifsc ,String bankaddpincode ,String aspdrop,String Schemename,String annuity_frq ) throws InterruptedException
     {
    	 First_Name.sendKeys(firstname);
    	 PAN.sendKeys(pan);
    	 DOB.sendKeys(dob);
    	 Relationship_With_Subscriber.sendKeys(relation);
	     elementUtil.Select_DropDownByVisibleText(Politically_Exposed_Person_Dropdown, pep);
    	 elementUtil.Select_DropDownByVisibleText(Are_u_Politically_Exposed_Person_Dropdown, pep1);
     	 elementUtil.Select_DropDownByVisibleText(Conviction_india_or_Abroad_Dropdown,convictdrop );
    	 Flat_Room_Door_Block_No.sendKeys(flatnum);
    	 elementUtil.click_On_WebElement(driver, Pincode, constant.explicitWait);
    	 Pincode.sendKeys(Pin);
    	 elementUtil.Select_DropDownByVisibleText(State_Dropdown, state);
      	 Mobile_No.sendKeys(mob);
    	 Email_ID.sendKeys(emailid);
         Bank_Account_No.sendKeys(bnk_acc_Num);
     	 Confirm_Bank_Account_No.sendKeys(confirm_bnk_acc_Num);
          elementUtil.Select_DropDownByVisibleText(Bank_Account_Type_Dropdown, acc_Type);
     	 IFSC_code.sendKeys(ifsc);
     	 constant.pause(1000);
     	 Bank_Address_Pin_Code.sendKeys(bankaddpincode);
      	 Thread.sleep(2000);
     	 elementUtil.click_byJavaScript(driver, Annuitant_Save_and_Proceed_Button);
         elementUtil.Select_DropDownByVisibleText(ASP_Names_Dropdown, aspdrop);
         elementUtil.Select_DropDownByVisibleText(SchemeNames_Drop, Schemename);
     	 elementUtil.Select_DropDownByVisibleText(Annuity_Frequency_Dropdown, annuity_frq);
      	 constant.pause(1000);
     	 elementUtil.click_byJavaScript(driver, Annuity_Submit_Button_Final_);
   	 
     } 
     
     public void annuitant_Details_Fill_Non_Gov_Scenario_lumpsum_and_annuity_default_annuity(String firstname ,String pan , String dob , String relation ,String pep ,String pep1 ,String convictdrop
     		,String flatnum,String Pin,String state ,String mob,String emailid,String bnk_acc_Num ,String confirm_bnk_acc_Num ,String acc_Type, String ifsc ,String bankaddpincode ,String aspdrop,String Schemename,String annuity_frq ) throws InterruptedException
      {
     	
 	     elementUtil.Select_DropDownByVisibleText(Politically_Exposed_Person_Dropdown, pep);
     	 elementUtil.Select_DropDownByVisibleText(Are_u_Politically_Exposed_Person_Dropdown, pep1);
      	 elementUtil.Select_DropDownByVisibleText(Conviction_india_or_Abroad_Dropdown,convictdrop );
     	 Flat_Room_Door_Block_No.sendKeys(flatnum);
     	 elementUtil.click_On_WebElement(driver, Pincode, constant.explicitWait);
     	 Pincode.sendKeys(Pin);
     	 elementUtil.Select_DropDownByVisibleText(State_Dropdown, state);
       	 Mobile_No.sendKeys(mob);
     	 Email_ID.sendKeys(emailid);
         Bank_Account_No.sendKeys(bnk_acc_Num);
      	 Confirm_Bank_Account_No.sendKeys(confirm_bnk_acc_Num);
         elementUtil.Select_DropDownByVisibleText(Bank_Account_Type_Dropdown, acc_Type);
      	 IFSC_code.sendKeys(ifsc);
      	 constant.pause(1000);
      	 Bank_Address_Pin_Code.sendKeys(bankaddpincode);
       	 Thread.sleep(2000);
      	 elementUtil.click_byJavaScript(driver, Annuitant_Save_and_Proceed_Button);
         elementUtil.Select_DropDownByVisibleText(ASP_Names_Dropdown, aspdrop);
      // Default it select Scheme names
     //  elementUtil.Select_DropDownByVisibleText(SchemeNames_Drop, Schemename);
      	 elementUtil.Select_DropDownByVisibleText(Annuity_Frequency_Dropdown, annuity_frq);
       	 constant.pause(1000);
      	 elementUtil.click_byJavaScript(driver, Annuity_Submit_Button_Final_);
    	 
      }
     
     
     
     
     
   
	
	
	 
	
	

}
