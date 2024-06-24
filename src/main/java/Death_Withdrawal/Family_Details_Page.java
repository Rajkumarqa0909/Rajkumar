package Death_Withdrawal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import utility.constant;
import utility.elementUtil;

public class Family_Details_Page extends Base

{
	public Family_Details_Page()
	{
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//select[@id='spouseGender']") private WebElement  Spouse_Gender_Dropdown;
	@FindBy(xpath="//input[@id='spouseFName']") private WebElement  Spouse_Name;
	@FindBy(xpath="//input[@id='spousePan']") private WebElement  Spouse_Pan;
    @FindBy(xpath="//input[@id='spouseDob']") private WebElement  Spouse_Dob;
    @FindBy(xpath="//input[@id='motherFName']") private WebElement  Mother_first_name;
	@FindBy(xpath="//input[@id='motherPan']") private WebElement  Mother_Pan;
	@FindBy(xpath="//input[@id='motherDob']") private WebElement  Mother_DOB;
	@FindBy(xpath="//input[@id='fatherPan']") private WebElement  Father_Pan;
	@FindBy(xpath="//input[@id='fatherDob']") private WebElement  Father_DOB;
	@FindBy(xpath="//select[@id='child1Sts']") private WebElement  Child1_Status_Dropdown;
	@FindBy(xpath="//select[@id='child2Sts']") private WebElement  Child2_Status_Dropdown;
	@FindBy(xpath="//select[@id='child3Sts']") private WebElement  Child3_Status_Dropdown;
	@FindBy(xpath="//input[@value='Save & Proceed']") private WebElement  Save_and_Proceed;
	@FindBy(xpath="//input[@value='PROCEED']") private WebElement  Annuity_Eligibility_Proceed;
	
	public void fill_Family_Details(String Spousegender ,String Name ,String Pan ,String DOb , String childstatus1 , String childstatus2 , String childstatus3)
	{
		elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
		Spouse_Name.sendKeys(Name);
		Spouse_Pan.sendKeys(Pan);
		Spouse_Dob.sendKeys(DOb);
		elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
		elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
		elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
		elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		

	}
	
	// Lumpsum100-0
	
	public void Lumpsum100_0_addfamilydetails( String Spousegender , String Name , String Pan , String DOb)
	{
		elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
		
		Spouse_Name.sendKeys(Name);
		Spouse_Pan.sendKeys(Pan);
		Spouse_Dob.sendKeys(DOb);
		
		elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
	}
	
	
	// 20-80
	
	public void withdrawal_20_80_familydetails(String Spousegender , String Name ,String Pan ,String DOb , String mothername , String motherpan , String motherdob 
			 , String fatherpan , String fatherdob , String childstatus1 , String childstatus2 , String childstatus3)
	{
		elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
		
		Spouse_Name.sendKeys(Name);
		Spouse_Pan.sendKeys(Pan);
		Spouse_Dob.sendKeys(DOb);
		Mother_first_name.sendKeys(mothername);
		Mother_Pan.sendKeys(motherpan);
		Mother_DOB.sendKeys(motherdob);
		Father_Pan.sendKeys(fatherpan);
		Father_DOB.sendKeys(fatherdob);
	    elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
		elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
		elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
		elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);

	}
	
	
	public void withdrawal_20_80_familydetails_Scenario_10(String maritualstatus ,String Motherstatusflag ,String Fatherstatusflag , String Spousegender , String Name ,String Pan ,String DOb , String mothername , String motherpan , String motherdob 
			 , String fatherpan , String fatherdob , String childstatus1 , String childstatus2 , String childstatus3)
	{
		if(maritualstatus.equalsIgnoreCase("Unmarried") && Motherstatusflag.equalsIgnoreCase("AliveandDepend") && Fatherstatusflag.equalsIgnoreCase("AliveandDepend"))
		{
		Mother_first_name.sendKeys(mothername);
		Mother_Pan.sendKeys(motherpan);
		Mother_DOB.sendKeys(motherdob);
		
		Father_Pan.sendKeys(fatherpan);
		Father_DOB.sendKeys(fatherdob);
	    elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
		elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
		elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
		elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		}
		
		else if(maritualstatus.equalsIgnoreCase("Unmarried") && Motherstatusflag.equalsIgnoreCase("AliveandDepend") && Fatherstatusflag.equalsIgnoreCase("AliveandNotDepend"))
		{
			Mother_first_name.sendKeys(mothername);
			Mother_Pan.sendKeys(motherpan);
			Mother_DOB.sendKeys(motherdob);
		    elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
			elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
			elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
			elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		}
		
		else if(maritualstatus.equalsIgnoreCase("Unmarried") && Motherstatusflag.equalsIgnoreCase("AliveandNotDepend") && Fatherstatusflag.equalsIgnoreCase("AliveandDepend"))
		{
			
			Father_Pan.sendKeys(fatherpan);
			Father_DOB.sendKeys(fatherdob);
	        elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
			elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
	     	elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
			elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		}
		
		
		else if(maritualstatus.equalsIgnoreCase("Unmarried") && Motherstatusflag.equalsIgnoreCase("AliveandNotDepend") && Fatherstatusflag.equalsIgnoreCase("AliveandNotDepend"))
		{
	     	elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		}
		

	}
	
	// method for family details page 
	
	public void subscriberfamilymemberDetails(String S , String M , String F ,String Spousegender , String Name ,String Pan ,String DOb , String mothername , String motherpan , String motherdob 
			 , String fatherpan , String fatherdob , String childstatus1 , String childstatus2 , String childstatus3)
	{
		if(S.equalsIgnoreCase("Alive")&& M.equalsIgnoreCase("AliveandDepend")&& F.equalsIgnoreCase("AliveandDepend"))
		{
			elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
			
			Spouse_Name.sendKeys(Name);
			Spouse_Pan.sendKeys(Pan);
			Spouse_Dob.sendKeys(DOb);
			Mother_first_name.sendKeys(mothername);
			Mother_Pan.sendKeys(motherpan);
			Mother_DOB.sendKeys(motherdob);
	     	Father_Pan.sendKeys(fatherpan);
			Father_DOB.sendKeys(fatherdob);
		    elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
	    	elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
			elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
			elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		}
		else if(S.equalsIgnoreCase("Alive")&& M.equalsIgnoreCase("AliveandDepend")&& F.equalsIgnoreCase("AliveandNotDepend"))
			
		{
            elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
			
			Spouse_Name.sendKeys(Name);
			Spouse_Pan.sendKeys(Pan);
			Spouse_Dob.sendKeys(DOb);
	     	Mother_first_name.sendKeys(mothername);
			Mother_Pan.sendKeys(motherpan);
			Mother_DOB.sendKeys(motherdob);
		    elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
	     	elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
	     	elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
	     	elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		}
		
		else if(S.equalsIgnoreCase("Alive")&& M.equalsIgnoreCase("AliveandNotDepend")&& F.equalsIgnoreCase("AliveandDepend"))
		{
            elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
			
			Spouse_Name.sendKeys(Name);
			Spouse_Pan.sendKeys(Pan);
			Spouse_Dob.sendKeys(DOb);
			Father_Pan.sendKeys(fatherpan);
			Father_DOB.sendKeys(fatherdob);
		    elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
			elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
			elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
			elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		}
		
		else if(S.equalsIgnoreCase("Alive")&& M.equalsIgnoreCase("AliveandNotDepend")&& F.equalsIgnoreCase("AliveandNotDepend"))
		{
            elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
			
			Spouse_Name.sendKeys(Name);
			Spouse_Pan.sendKeys(Pan);
			Spouse_Dob.sendKeys(DOb);
		    elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
			elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
			elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
	    	elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		}
		
		
		else if(S.equalsIgnoreCase("NotAlive")&& M.equalsIgnoreCase("AliveandDepend")&& F.equalsIgnoreCase("AliveandDepend"))
		{
		    elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
			
			Mother_first_name.sendKeys(mothername);
			Mother_Pan.sendKeys(motherpan);
			Mother_DOB.sendKeys(motherdob);
			Father_Pan.sendKeys(fatherpan);
			Father_DOB.sendKeys(fatherdob);
	        elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
	    	elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
	    	elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
			elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
			
		
			
		    
		}
		
		
		else if(S.equalsIgnoreCase("NotAlive")&& M.equalsIgnoreCase("AliveandDepend")&& F.equalsIgnoreCase("AliveandNotDepend"))
		{
		    elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
			
			Mother_first_name.sendKeys(mothername);
			Mother_Pan.sendKeys(motherpan);
			Mother_DOB.sendKeys(motherdob);
	        elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
	    	elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
	     	elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
	    	elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		    
		}
		
		else if(S.equalsIgnoreCase("NotAlive")&& M.equalsIgnoreCase("AliveandNotDepend")&& F.equalsIgnoreCase("AliveandDepend"))
		{
			
			
		    elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
	        Father_Pan.sendKeys(fatherpan);
			Father_DOB.sendKeys(fatherdob);
	        elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
	    	elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
			elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
			elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
			
		
			
		    
		}
		
		else if(S.equalsIgnoreCase("NotAlive")&& M.equalsIgnoreCase("AliveandNotDepend")&& F.equalsIgnoreCase("AliveandNotDepend"))
		{
			
		    elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
			elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		    
		}
		
		
		
	}
	
	public void family_Details_for_non_gov(String Spousegender ,String Name ,String Pan ,String DOb )
	{
		elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
		Spouse_Name.sendKeys(Name);
		Spouse_Pan.sendKeys(Pan);
		Spouse_Dob.sendKeys(DOb);
		elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
	}
	
	public void family_Details_for_Non_Gov_Scenarios(String Spousegender , String Name , String Pan ,String DOb ,String mothername , String motherpan , String motherdob , String fatherpan , String fatherdob
			, String childstatus1 ,String childstatus2 , String childstatus3 )
	{
		elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
		
		Spouse_Name.sendKeys(Name);
		Spouse_Pan.sendKeys(Pan);
		Spouse_Dob.sendKeys(DOb);
		Mother_first_name.sendKeys(mothername);
		Mother_Pan.sendKeys(motherpan);
		Mother_DOB.sendKeys(motherdob);
     	Father_Pan.sendKeys(fatherpan);
		Father_DOB.sendKeys(fatherdob);
	    elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
    	elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
		elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
		elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		
	}
	
	
	
	public void family_Details_for_Non_Gov_Scenarios_other_Annuity(String Spousegender , String Name , String Pan ,String DOb ,String mothername , String motherpan , String motherdob , String fatherpan , String fatherdob
			, String childstatus1 ,String childstatus2 , String childstatus3 )
	{
		elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
		
		Spouse_Name.sendKeys(Name);
		Spouse_Pan.sendKeys(Pan);
		Spouse_Dob.sendKeys(DOb);
	
		elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		
	}
	
	public void family_Details_for_Non_Gov_Scenarios_Lumpsum_and_Annuity_Default_Annuity(String Spousegender , String Name , String Pan ,String DOb ,String mothername , String motherpan , String motherdob , String fatherpan , String fatherdob
			, String childstatus1 ,String childstatus2 , String childstatus3 )
	{
		elementUtil.Select_DropDownByVisibleText(Spouse_Gender_Dropdown, Spousegender);
		
		Spouse_Name.sendKeys(Name);
		Spouse_Pan.sendKeys(Pan);
		Spouse_Dob.sendKeys(DOb);
		Mother_first_name.sendKeys(mothername);
		Mother_Pan.sendKeys(motherpan);
		Mother_DOB.sendKeys(motherdob);
     	Father_Pan.sendKeys(fatherpan);
		Father_DOB.sendKeys(fatherdob);
	    elementUtil.Select_DropDownByVisibleText(Child1_Status_Dropdown, childstatus1 );
    	elementUtil.Select_DropDownByVisibleText(Child2_Status_Dropdown, childstatus2 );
		elementUtil.Select_DropDownByVisibleText(Child3_Status_Dropdown, childstatus3 );
		elementUtil.click_On_WebElement(driver, Save_and_Proceed, constant.explicitWait);
		
	}
	
	
	
	

}
