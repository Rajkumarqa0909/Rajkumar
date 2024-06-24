package Death_Withdrawal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;

public class Declaration_Page extends Base
{
	 public Declaration_Page()
		{
			PageFactory.initElements(Base.driver, this);
		}
	 
		@FindBy(xpath="//input[@id='checks1']") private WebElement  Declaration_By_Annuitant_Checkbox;
		
		@FindBy(xpath="//input[@id='checks2']") private WebElement  Declaration_By_Claimant_Checkbox;
		
		@FindBy(xpath="//input[@id='checks3']") private WebElement  Declaration_By_NodalofficePOP_Checkbox;
		
		@FindBy(xpath="//input[@value='Save & Proceed']") private WebElement  Save_And_Proceed;
		
		@FindBy(xpath="//input[@value='OK']") private WebElement  OK_Popup;
		
		public void check_Declaration_And_Submit()
		{
			Declaration_By_Annuitant_Checkbox.click();
			Declaration_By_Claimant_Checkbox.click();
			Declaration_By_NodalofficePOP_Checkbox.click();
			elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
			elementUtil.click_On_WebElement(driver, OK_Popup, constant.explicitWait);
		}
		
		
		
		//Additional trial method 
		
		public void clickandsubmit()
		{
			Save_And_Proceed.click();
			elementUtil.click_On_WebElement(driver, OK_Popup, constant.explicitWait);
			
		}
		
		public void check_Declaration_and_save_and_submit_lump100()
		{
			Declaration_By_Annuitant_Checkbox.click();//checkbox  1 declaration by claimant
			Declaration_By_Claimant_Checkbox.click(); // checkbox 2 declaration by nodal pop
			elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
			elementUtil.click_On_WebElement(driver, OK_Popup, constant.explicitWait);
		}
		
		
		public void check_Declaration_and_save_and_submit_20_80_SMF_Notalive()
		{
			Declaration_By_Annuitant_Checkbox.click();//checkbox  1 declaration by claimant
			Declaration_By_Claimant_Checkbox.click(); // checkbox 2 declaration by nodal pop
			elementUtil.click_On_WebElement(driver, Save_And_Proceed, constant.explicitWait);
			elementUtil.click_On_WebElement(driver, OK_Popup, constant.explicitWait);
		}

}
