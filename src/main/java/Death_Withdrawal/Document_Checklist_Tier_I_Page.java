package Death_Withdrawal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;


public class Document_Checklist_Tier_I_Page extends Base
{
	
	
	 public Document_Checklist_Tier_I_Page ()
		{
			PageFactory.initElements(Base.driver, this);
		}
	 
	 // Supporting Documents
	 
	 @FindBy(xpath="//input[@id='death_doc1']") private WebElement  Checkbox_1;
	 
	 @FindBy(xpath="//input[@id='death_doc2']") private WebElement  Checkbox_2;
	 
	 @FindBy(xpath="//input[@id='death_doc3']") private WebElement  Checkbox_3;
	 
	 @FindBy(xpath="//input[@id='death_doc4']") private WebElement  Checkbox_4;
	 
	 @FindBy(xpath="//input[@id='death_doc5']") private WebElement  Checkbox_5;
	 
	 @FindBy(xpath="//input[@id='death_doc6']") private WebElement  Checkbox_6;
	 
	 @FindBy(xpath="//input[@id='death_doc7']") private WebElement  Checkbox_7;
	 
	 @FindBy(xpath="//input[@id='death_doc8']") private WebElement  Checkbox_8;
	 
	 @FindBy(xpath="//input[@id='death_doc9']") private WebElement  Checkbox_9;
	 @FindBy(xpath="//input[@id='death_doc10']") private WebElement  Checkbox_10;
	 
	 // Bank proof 
	 
	 @FindBy(xpath="//input[@id='death_doc11']") private WebElement  Cancel_check;
	 @FindBy(xpath="//input[@id='death_doc12']") private WebElement  Claimant_checkbox;
	 @FindBy(xpath="//input[@id='death_doc13']") private WebElement  Claimant_checkbox_BaP1;
	 
	
	 
	 //Proof of Identity
	 @FindBy(xpath="//input[@id='poi_nom11']") private WebElement  Valid_Passport;
	 @FindBy(xpath="//input[@id='poi_nom21']") private WebElement  Valid_Passport_Nominee2;
	
	 @FindBy(xpath="//input[@id='poi_claim1']") private WebElement  Claimant_check;
	
	 //Proof of Address
	 
	 @FindBy(xpath="//input[@id='poa_nom11']") private WebElement  Valid_Passport_GOI;
	 
	 @FindBy(xpath="//input[@id='poa_nom21']") private WebElement  Valid_Passport_GOI_Nom2;
	 
	 @FindBy(xpath="//input[@id='poa_claim1']") private WebElement  Claimant_checkbox3;
	
	
	 @FindBy(xpath="//input[@value='Save & Proceed']") private WebElement  Save_And_Proceed;
	
	 // proof of add for 20_80
	 
	 @FindBy(xpath=" (//input[@class='checkNom1PoiDoc'])[1]") private WebElement  Nominees1;
	 
	 @FindBy(xpath=" (//input[@id='poi_claim1'])[1]") private WebElement          Claimant1;
	
	 
	 public void check_Document_List()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();
		 Checkbox_10.click();
		 
		 Cancel_check.click();
		 Claimant_checkbox.click();
		
		 Valid_Passport.click();
		 Claimant_check.click();
		 Valid_Passport_GOI.click();
		 Claimant_checkbox3.click();
		 
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
		
		
	 }
	 
	// trial_method
	 public void click_on_submit()
	 {
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
	 }
	 
	 
	 public void check_Document_List_Lumpsum_100_0()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();
		 Checkbox_10.click();
		 
		 Valid_Passport.click();
		 Valid_Passport_Nominee2.click();
		 Valid_Passport_GOI.click();
		 Valid_Passport_GOI_Nom2.click();
		 
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
	 }
	 
	 public void check_Document_for20_80()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();  
		 Checkbox_10.click(); 
		 
		 Cancel_check.click();
		 Valid_Passport.click();
		 Valid_Passport_Nominee2.click();
		 Claimant_check.click();
		 Valid_Passport_GOI.click();
		 Valid_Passport_GOI_Nom2.click();
		 Claimant_checkbox3.click();
		
		 
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
		 
	 }
	 
	 public void check_Document_for20_80_Spouse_Notalive()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();  
		 Checkbox_10.click(); 
		 
		 Cancel_check.click();
		 Valid_Passport.click();
		 Valid_Passport_Nominee2.click();

		 Claimant_check.click();
		 Claimant_checkbox.click();
		 Claimant_checkbox3.click();
		 Valid_Passport_GOI.click();
		 Valid_Passport_GOI_Nom2.click();
		
		
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
		 
	 }
	 
	 
	 public void check_Document_for20_80_for_7()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();  
		 Checkbox_10.click(); 
		 
		 Cancel_check.click();
		 Valid_Passport.click();
		 Valid_Passport_Nominee2.click();
		 Claimant_check.click();
		 Valid_Passport_GOI.click();
		 Valid_Passport_GOI_Nom2.click();
		 Claimant_checkbox3.click();
		 Claimant_checkbox.click();
		 //
		// Claimant_checkbox_BaP1.click();
		 
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
		 
	 }
	 
	 
	 public void check_Document_List_20_80_Scenario_09()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();
		 Checkbox_10.click();
		 
		 Valid_Passport.click();
		 Valid_Passport_Nominee2.click();
		 Valid_Passport_GOI.click();
		 Valid_Passport_GOI_Nom2.click();
		 Cancel_check.click();
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
	 }
	 
	 
	 public void check_Document_for_End2End()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();  
		 Checkbox_10.click(); 
		 
		 Cancel_check.click();
		 Valid_Passport.click();
		 Valid_Passport_Nominee2.click();
		 Claimant_check.click();
		 Valid_Passport_GOI.click();
		 Valid_Passport_GOI_Nom2.click();
		 Claimant_checkbox3.click();
		 Claimant_checkbox.click();
		 Claimant_checkbox_BaP1.click();
		 
		
		 
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
		 
	 }
	 
	 
	 public void check_Document_List_20_80_Scenario_13()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();
		 Checkbox_10.click();
		 
		 Valid_Passport.click();
		 Valid_Passport_Nominee2.click();
		 Valid_Passport_GOI.click();
		 Valid_Passport_GOI_Nom2.click();
		 
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
	 }
	 
	 
	 public void check_Document_for20_80_14()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();  
		 Checkbox_10.click(); 
		 
		 Cancel_check.click();
		 Valid_Passport.click();
		 Valid_Passport_Nominee2.click();
		 Claimant_check.click();
		 Valid_Passport_GOI.click();
		 Valid_Passport_GOI_Nom2.click();
		 Claimant_checkbox3.click();
		 Claimant_checkbox.click();
		 //
	//	 Claimant_checkbox_BaP1.click();
		
		 
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
		 
	 }
	 
	 public void check_Document_16_22()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();  
		 Checkbox_10.click(); 
		 
		 Cancel_check.click();
		 Valid_Passport.click();
		 Valid_Passport_Nominee2.click();
		 Claimant_check.click();
		 Valid_Passport_GOI.click();
		 Valid_Passport_GOI_Nom2.click();
		 Claimant_checkbox3.click();
		 Claimant_checkbox.click();
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
		 
	 }
	 
	 
	 
	 public void check_Document_List_20_80_Scenario_17()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();  
		 Checkbox_10.click(); 
		 
		 Cancel_check.click();
		 Valid_Passport.click();
		 Valid_Passport_Nominee2.click();
		 Claimant_check.click();
		 Valid_Passport_GOI.click();
		 Valid_Passport_GOI_Nom2.click();
		 Claimant_checkbox3.click();
		 Claimant_checkbox.click();
		 
		 
		 
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
	 }
	 
	 
	 public void check_Document_List_20_80_Scenario_18()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
		 Checkbox_9.click();
		 Checkbox_10.click();
		 
		 Valid_Passport.click();
		 Valid_Passport_Nominee2.click();
		 Valid_Passport_GOI.click();
		 Valid_Passport_GOI_Nom2.click();
		 Cancel_check.click();
		 Claimant_checkbox.click();
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
	 }
	 
	 public void check_Document_List_Lumpsum_100_0_No_existingNominee()
	 {
		 Checkbox_1.click();
		 Checkbox_2.click();
		 Checkbox_3.click();
		 Checkbox_4.click();
		 Checkbox_5.click();
		 Checkbox_8.click();
    	 Valid_Passport.click();
		 Valid_Passport_GOI.click();
    	 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
	 }
	 
	 
	 public void check_Document_NonGov_Pran_100_Lumpsum_Withdrawal()
	 {
		 elementUtil.click_On_WebElement(driver, Checkbox_1, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_2, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_3, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_4, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_5, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_6, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Valid_Passport, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Valid_Passport_GOI, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_7, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_8, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Valid_Passport_Nominee2, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Valid_Passport_GOI_Nom2, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
	 }
	 
	 public void check_Document_NonGov_Pran_100_Annuity_Withdrawal()
	 {
		 elementUtil.click_On_WebElement(driver, Checkbox_1, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_2, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_3, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_4, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_5, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_6, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Valid_Passport, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Valid_Passport_GOI, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_7, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_8, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Checkbox_9, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Valid_Passport_Nominee2, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Valid_Passport_GOI_Nom2, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Claimant_check, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Claimant_checkbox3, constant.explicitWait);
		 elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
	 }
	 
	 
	

}
