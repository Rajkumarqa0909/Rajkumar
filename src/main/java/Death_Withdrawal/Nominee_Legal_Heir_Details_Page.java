package Death_Withdrawal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;

public class Nominee_Legal_Heir_Details_Page extends Base
{
	 public Nominee_Legal_Heir_Details_Page()
		{
			PageFactory.initElements(Base.driver, this);
		}
		
		@FindBy(xpath="//input[@id='add-rowT1']") private WebElement  ADD_Button;
		
		@FindBy(xpath="//input[@id='wdrNomForms0.nomFstNam']") private WebElement  NomineeName;
		
		@FindBy(xpath="//input[@id='wdrNomForms1.nomFstNam']") private WebElement  NomineeName1;
		
		@FindBy(xpath="//select[@id='tier1NomDtlsList0.nomRel']") private WebElement  Subscriber_Relationwith_Nominee_Dropdown;
		
		@FindBy(xpath="//select[@id='tier1NomDtlsList1.nomRel']") private WebElement  Subscriber_Relationwith_Nominee1_Dropdown;
		
		@FindBy(xpath="//input[@id='per_t1_1']") private WebElement  Percantage_Share;
		
		@FindBy(xpath="//input[@id='per_t1_2']") private WebElement  Percantage_Share1;
		
		@FindBy(xpath="//input[@id='save-rowT1']") private WebElement  Save_Nominee_Legalheir_Button;
		
		
		@FindBy(xpath="//input[@onclick='closeSaveNewNomineePop();']") private WebElement  OK_Popup;
		
		@FindBy(xpath="//input[@onclick='closeNomineeDtlsPop();']") private WebElement  OK2_Popup;
		
		
		@FindBy(xpath="(//input[@value='Additional Details' ])[1]") private WebElement  Additional_Details;
		
		@FindBy(xpath="(//input[@value='Additional Details' ])[2]") private WebElement  Additional_Details1;
		
		// Nominee Personal Details
		
		@FindBy(xpath="//input[@id='nAge']") private WebElement  Nominee_Age;
		
		@FindBy(xpath="//select[@id='majMinFlg']") private WebElement  Major_Minor;
		
		@FindBy(xpath="//input[@id='pan']") private WebElement  Pan;
		
		@FindBy(xpath="//select[@id='polExposedFlag']") private WebElement  R_U_PEP_Dropdown;
		
		@FindBy(xpath="//select[@id='polExposedPerson']") private WebElement  R_U_Related_PEP_Dropdown;
		
		@FindBy(xpath="//select[@id='convictionFlag']") private WebElement  Do_U_Conviction_India_Abroad_Dropdown;
		
		// Address and Bank Details
		
		@FindBy(xpath="//input[@id='nomAddrLn1']") private WebElement  Address1;
		
		@FindBy(xpath="//input[@id='nomAddrPinCd']") private WebElement  Pincode;
		
		@FindBy(xpath="//select[@id='nomAddrStateCd']") private WebElement  State_Dropdown;
		
		@FindBy(xpath="//select[@id='nomAddrCountryCd']") private WebElement  Country_Dropdown;
		
		@FindBy(xpath="//input[@id='nomMbNo']") private WebElement  Mobile_Number;
		
		@FindBy(xpath="//input[@id='nomEmailId']") private WebElement  Email_Address;
		
		@FindBy(xpath="//select[@id='bankType']") private WebElement  Bank_Account_Type_Dropdown;
		
		@FindBy(xpath="//input[@id='nomBnkAccNo']") private WebElement  Bank_Account_Number;
		
		@FindBy(xpath="//input[@id='confirmNomBnkAccNo']") private WebElement  Confirm_Bank_Account_Number;
		
		@FindBy(xpath="//input[@id='nomBnkIFSCCd']") private WebElement  Bank_IFSC_Code;
		
		@FindBy(xpath="	//input[@id='nomBnkname']") private WebElement  Bank_Name;
		
		@FindBy(xpath="//textarea[@id='nomBnkBranch']") private WebElement  Branch_Name;
		
		@FindBy(xpath="//textarea[@id='nomBankAdd']") private WebElement  Bank_Address;
		
		@FindBy(xpath="//input[@id='nomBnkAddPin']") private WebElement  Bank_Address_Pin;
		
		@FindBy(xpath="//input[@value='Save']") private WebElement  Save_Button;
		
		@FindBy(xpath="//input[@value='Next']") private WebElement  Next_Button;
		
		//continue with existing nominations
		
		@FindBy(xpath="//select[@id='existingT1NomFlag']") private WebElement  Continue_with_existing_nom_Dropdown;
		
		@FindBy(xpath="(//input[@class='submit' and @type='button'])[2]") private WebElement  Tire1_NominatioiLegalHeirPOP;
		
		@FindBy(xpath="	//input[@id='otherRel']") private WebElement  Other_relationship;
		
	
		@FindBy(xpath="	(//input[@value='OK'])[1]") private WebElement  Pop_After_select_No;
		
		
		@FindBy(xpath="//input[@onclick='closeSaveNewNomineePop();']") private WebElement  Reset_Nominee_Popup;
	
	
		
		public void fill_Nominee_Legal_Hair_Details( String flag , String NomiName ,String Subscriber_relation , String percent_share , String nomnage ,
				String majmin , String pan , String pep ,String Pep1, String conviction , String addrs1 , String pin , String mob , String email , String acctype ,
				String accnum , String confirmaccnum , String ifsccode , String bankaddpincode)
		{
			
			
			elementUtil.Select_DropDownByVisibleText(Continue_with_existing_nom_Dropdown, flag);
			
			elementUtil.click_On_WebElement(driver, Pop_After_select_No, constant.explicitWait);
			
			elementUtil.click_On_WebElement(driver, ADD_Button, constant.explicitWait);
			
			NomineeName.sendKeys(NomiName);
			elementUtil.Select_DropDownByVisibleText(Subscriber_Relationwith_Nominee_Dropdown, Subscriber_relation);
			Percantage_Share.sendKeys(percent_share);
			
            elementUtil.click_On_WebElement(driver, ADD_Button, constant.explicitWait);
			
			NomineeName1.sendKeys(NomiName);
			elementUtil.Select_DropDownByVisibleText(Subscriber_Relationwith_Nominee1_Dropdown, Subscriber_relation);
			Percantage_Share1.sendKeys(percent_share);
	
			elementUtil.click_On_WebElement(driver, Save_Nominee_Legalheir_Button, constant.explicitWait );
			
			elementUtil.click_On_WebElement(driver, OK_Popup, constant.explicitWait);
			
			elementUtil.click_On_WebElement(driver, Additional_Details, constant.explicitWait);
			Nominee_Age.sendKeys(nomnage);
			elementUtil.Select_DropDownByVisibleText(Major_Minor, majmin);
			Pan.sendKeys(pan);
			
			elementUtil.Select_DropDownByVisibleText(R_U_PEP_Dropdown,pep);
			
			elementUtil.Select_DropDownByVisibleText(R_U_Related_PEP_Dropdown,Pep1);
			elementUtil.Select_DropDownByVisibleText(Do_U_Conviction_India_Abroad_Dropdown,conviction);
			
			Address1.sendKeys(addrs1);
			Pincode.sendKeys(pin);
			Mobile_Number.sendKeys(mob);
			Email_Address.sendKeys(email);//need to add emailid
			elementUtil.Select_DropDownByVisibleText(Bank_Account_Type_Dropdown, acctype);
			Bank_Account_Number.sendKeys(accnum);
			Confirm_Bank_Account_Number.sendKeys(confirmaccnum);
			Bank_IFSC_Code.sendKeys(ifsccode);
			Bank_Address_Pin.sendKeys(bankaddpincode);
		//	elementUtil.click_On_WebElement(driver, Save_Button, constant.explicitWait);
			
			constant.pause(1000);
			elementUtil.click_byJavaScript(driver, Save_Button);
			
			elementUtil.click_On_WebElement(driver, Additional_Details1, constant.explicitWait);
			
			
			Nominee_Age.sendKeys(nomnage);
			elementUtil.Select_DropDownByVisibleText(Major_Minor, majmin);
			Pan.sendKeys(pan);
			
			elementUtil.Select_DropDownByVisibleText(R_U_PEP_Dropdown,pep);
			
			elementUtil.Select_DropDownByVisibleText(R_U_Related_PEP_Dropdown,Pep1);
			elementUtil.Select_DropDownByVisibleText(Do_U_Conviction_India_Abroad_Dropdown,conviction);
			
			Address1.sendKeys(addrs1);
			Pincode.sendKeys(pin);
			Mobile_Number.sendKeys(mob);
			Email_Address.sendKeys(email);//need to add emailid
			elementUtil.Select_DropDownByVisibleText(Bank_Account_Type_Dropdown, acctype);
			Bank_Account_Number.sendKeys(accnum);
			Confirm_Bank_Account_Number.sendKeys(confirmaccnum);
			Bank_IFSC_Code.sendKeys(ifsccode);
			Bank_Address_Pin.sendKeys(bankaddpincode);
		//	elementUtil.click_On_WebElement(driver, Save_Button, constant.explicitWait);
			
			constant.pause(1000);
			elementUtil.click_byJavaScript(driver, Save_Button);
			
			
			elementUtil.click_On_WebElement(driver, Next_Button, constant.explicitWait);
		
			
			
		}
		
	//	Additional method
		
		public void nextNominee()
		{
			elementUtil.click_On_WebElement(driver, Next_Button, constant.explicitWait);
			
		}
		
		
		
		
		public void fill_Nominee_Legal_Hair_Details_for_No_existingnominee( String NomiName ,String Subscriber_relation , String percent_share , String nomnage ,
				String majmin , String pan , String pep ,String Pep1, String conviction , String addrs1 , String pin , String mob , String email , String acctype ,
				String accnum , String confirmaccnum , String ifsccode , String bankaddpincode)
		{
			
			
			
			
	//		elementUtil.Select_DropDownByVisibleText(Continue_with_existing_nom_Dropdown, flag);
			
	//		elementUtil.click_On_WebElement(driver, Pop_After_select_No, constant.explicitWait);
			
			
			
			elementUtil.click_On_WebElement(driver, ADD_Button, constant.explicitWait);
			
			NomineeName.sendKeys(NomiName);
			elementUtil.Select_DropDownByVisibleText(Subscriber_Relationwith_Nominee_Dropdown, Subscriber_relation);
			Percantage_Share.sendKeys(percent_share);
			elementUtil.click_On_WebElement(driver, Save_Nominee_Legalheir_Button, constant.explicitWait);
			
			elementUtil.click_On_WebElement(driver, OK_Popup, constant.explicitWait);
			
		//	elementUtil.click_On_WebElement(driver, OK2_Popup, constant.explicitWait);
			
			elementUtil.click_On_WebElement(driver, Additional_Details, constant.explicitWait);
			
			
			Nominee_Age.sendKeys(nomnage);
			elementUtil.Select_DropDownByVisibleText(Major_Minor, majmin);
			Pan.sendKeys(pan);
			
			elementUtil.Select_DropDownByVisibleText(R_U_PEP_Dropdown,pep);
			
			elementUtil.Select_DropDownByVisibleText(R_U_Related_PEP_Dropdown,Pep1);
			elementUtil.Select_DropDownByVisibleText(Do_U_Conviction_India_Abroad_Dropdown,conviction);
			
			Address1.sendKeys(addrs1);
			Pincode.sendKeys(pin);
			Mobile_Number.sendKeys(mob);
			Email_Address.sendKeys(email);//need to add emailid
			elementUtil.Select_DropDownByVisibleText(Bank_Account_Type_Dropdown, acctype);
			Bank_Account_Number.sendKeys(accnum);
			Confirm_Bank_Account_Number.sendKeys(confirmaccnum);
			Bank_IFSC_Code.sendKeys(ifsccode);
			Bank_Address_Pin.sendKeys(bankaddpincode);
			
		//	elementUtil.click_On_WebElement(driver, Save_Button, constant.explicitWait);
			
			constant.pause(1000);
			elementUtil.click_byJavaScript(driver, Save_Button);
			
			elementUtil.click_On_WebElement(driver, Next_Button, constant.explicitWait);
		
			
			
		}
		
		
		public void nominee_Page_Non_gov_sector_fill(String flag , String otherrelationship , String Nomineeage , String Pannum ,String pep , String Pep1 , String conviction , 
				String addrs1 , String pin , String mob ,String email,String acctype , String accnum , String confirmaccnum , String ifsccode , String bankaddpincode  )
		{
			elementUtil.Select_DropDownByVisibleText(Continue_with_existing_nom_Dropdown, flag);
			elementUtil.click_On_WebElement(driver, Tire1_NominatioiLegalHeirPOP, constant.explicitWait);
			elementUtil.click_On_WebElement(driver, Additional_Details, constant.explicitWait);
			Other_relationship.sendKeys(otherrelationship);
			Nominee_Age.sendKeys(Nomineeage);
			Pan.sendKeys(Pannum);
            elementUtil.Select_DropDownByVisibleText(R_U_PEP_Dropdown,pep);
	    	elementUtil.Select_DropDownByVisibleText(R_U_Related_PEP_Dropdown,Pep1);
			elementUtil.Select_DropDownByVisibleText(Do_U_Conviction_India_Abroad_Dropdown,conviction);
			Address1.sendKeys(addrs1);
			Pincode.sendKeys(pin);
			Mobile_Number.sendKeys(mob);
			Email_Address.sendKeys(email);    //need to add email id // Not Added the email Address
			elementUtil.Select_DropDownByVisibleText(Bank_Account_Type_Dropdown, acctype);
			Bank_Account_Number.sendKeys(accnum);
			Confirm_Bank_Account_Number.sendKeys(confirmaccnum);
			Bank_IFSC_Code.sendKeys(ifsccode);
			Bank_Address_Pin.sendKeys(bankaddpincode);
		
			constant.pause(1000);
			elementUtil.click_byJavaScript(driver, Save_Button);
			
			elementUtil.click_On_WebElement(driver, Next_Button, constant.explicitWait);
			
		}
		
		
	
		
		
		
		
		
		
		
		
		

}
