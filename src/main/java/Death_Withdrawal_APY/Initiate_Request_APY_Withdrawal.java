package Death_Withdrawal_APY;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;


public class Initiate_Request_APY_Withdrawal extends Base
{
	
	public Initiate_Request_APY_Withdrawal()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	
	
	@FindBy(xpath="(//input[@name='userID'])[1]") private WebElement userid ;
	@FindBy(xpath="(//input[@name='password'])[1]") private WebElement password ;
	@FindBy(xpath="//input[@id='nodelCaptchaVallogonpwd']") private WebElement ec ;
	@FindBy(xpath="//input[@name='terms']") private WebElement Declaration_checkbox ;
	@FindBy(xpath="(//input[@value='Submit'])[1]") private WebElement Submit_Button ;
	@FindBy(xpath= "//a[text()='Exit Withdrawal Request']") private WebElement exit_withdrawal_request;
	@FindBy(xpath="//a[contains(text(),'Withdrawal Request                               ')]") private WebElement withdrawal_request;
	@FindBy(xpath="//input[@name='PRAN']") private WebElement pranfield;
	@FindBy(xpath= "(//input[@class='submitbutton'])[1]") private WebElement submit_pran;
	@FindBy(xpath="//select[@name='compWdrType']") private WebElement withdrawal_due_dropdown;
	@FindBy(xpath="//input[@name='dateOfDeath']") private WebElement Date_of_death;
	@FindBy(xpath="(//input[@class='submitButton'])[1]") private WebElement Submit_date_of_death;
	
	@FindBy(xpath="//input[@class='submitbutton']") private WebElement proceed_Button;
	
	@FindBy(xpath="//input[@value='Edit']") private WebElement edit_nominee;
	
	@FindBy(xpath="(//input[@name='nomineeListShowId[0].grdFName'])[1]") private WebElement nominee1_Address1;
	
	@FindBy(xpath="(//input[@name='nomineeListShowId[0].pin'])[1]") private WebElement Nominee1_pincode;
	@FindBy(xpath="(//input[@name='nomineeListShowId[0].grdFName'])[1]") private WebElement Guardian_name_nm1;
	
	@FindBy(xpath="(//input[@name='nomineeListShowId[0].pin'])[1]") private WebElement pincode_nm1;
	// Additional web elements 
	@FindBy(xpath="(//input[@name='nomineeListShowId[0].city'])[1]") private WebElement city_nominee1;
	
	
	@FindBy(xpath="//input[@name='claimId']") private WebElement claim_ID;
	@FindBy(xpath="//input[@id='claimID']") private WebElement claim_id;
	
	@FindBy(xpath="(//select[@name='nomineeListShowId[0].state'])[1]") private WebElement state_Nominee1;
	
	@FindBy(xpath="(//select[@name='nomineeListShowId[0].contry'])[1]") private WebElement country_Nominee1_dropdown;
	@FindBy(xpath="(//input[@name='nomineeListShowId[0].mobileNo'])[1]") private WebElement Mobile_No_Nominee1;
	
	@FindBy(xpath="(//input[@name='nomineeListShowId[0].email'])[1]") private WebElement Email_n1;
	
	@FindBy(xpath="//input[@name='addNom']") private WebElement add_nominee;
	
	@FindBy(xpath="(//input[@name='nomineeListShowId[0].firstName'])[2]") private WebElement firstname_name2;
	
	@FindBy(xpath="(//input[@name='nomineeListShowId[0].midName'])[2]") private WebElement middle_name_nominee2;
	
	@FindBy(xpath="(//input[@name='nomineeListShowId[0].lastName'])[2]") private WebElement lastname_nominee2;
	
	
	// Registration Xpath
	
	//@FindBy (xpath = "(//input[@name='userID'])[2]") private WebElement Username;
	
	public void initiate_APY_Withdrawal(String uid , String pass , String pran , String with_type_drop , String dateofDeath )
	
	
	{
		
		
		userid.sendKeys(uid);
		password.sendKeys(pass);
	    elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, exit_withdrawal_request, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, withdrawal_request, constant.explicitWait);
	    pranfield.sendKeys(pran);
	    elementUtil.click_On_WebElement(driver, submit_pran, constant.explicitWait);
	    elementUtil.Select_DropDownByVisibleText(withdrawal_due_dropdown, with_type_drop);
	    Date_of_death.sendKeys(dateofDeath);
	    elementUtil.click_On_WebElement(driver, Submit_date_of_death, constant.explicitWait);
	    
	    elementUtil.click_On_WebElement(driver, proceed_Button, constant.explicitWait);
	    elementUtil.click_On_WebElement(driver, edit_nominee, constant.explicitWait);
	    
	    nominee1_Address1.sendKeys("abcd");
	    
	    Guardian_name_nm1.sendKeys("jjkingsw");
	    
	    pincode_nm1.sendKeys("400001");
	    
	    city_nominee1.sendKeys("Mumbai");
	    
	    elementUtil.Select_DropDownByVisibleText(state_Nominee1, "Maharashtra");
	    
	    elementUtil.Select_DropDownByVisibleText(country_Nominee1_dropdown, "India");
	    
	    Mobile_No_Nominee1.sendKeys("9000009909");
	    
	    elementUtil.click_On_WebElement(driver, add_nominee, constant.explicitWait);
	    
	    firstname_name2.sendKeys("acbfshajha");
	    
	    middle_name_nominee2.sendKeys("jacrkfkdlk");
	    
	    
	    lastname_nominee2.sendKeys("tanidhsl ");
	    
	    
	    
	    
	}
	
	
	public void initiate_apy(String uid , String pass , String pran , String withdrawal_due_to)
	{
		userid.sendKeys(uid);
		password.sendKeys(pass);
		elementUtil.click_On_WebElement(driver, ec,constant.explicitWait);
		constant.pause(5000);
		elementUtil.click_On_WebElement(driver, Declaration_checkbox, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, Submit_Button, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, exit_withdrawal_request, constant.explicitWait);
		elementUtil.click_On_WebElement(driver, withdrawal_request, constant.explicitWait);
		pranfield.sendKeys(pran);
		
		elementUtil.click_On_WebElement(driver, submit_pran, constant.explicitWait);
		elementUtil.Select_DropDownByVisibleText(withdrawal_due_dropdown, withdrawal_due_to);
		
		
	}

}
