package Test_deathWithdrawal;

import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.Base;
import Death_Withdrawal.Annuitant_Details_Page;
import Death_Withdrawal.Declaration_Page;
import Death_Withdrawal.Document_Checklist_Tier_I_Page;
import Death_Withdrawal.Document_Upload_Page;
import Death_Withdrawal.Family_Details_Page;
import Death_Withdrawal.Nominee_Legal_Heir_Details_Page;
import Death_Withdrawal.Verify_Authorize_Request_Page;
import Death_Withdrawal.WelcomePage;
import utility.Excel_reader;
import utility.constant;

public class Test_E2E_Death_Withdrawal_Non_Gov extends Base
{
	WelcomePage w;
	Family_Details_Page f;
	Annuitant_Details_Page a;
	Nominee_Legal_Heir_Details_Page np;
	Document_Checklist_Tier_I_Page dc;
	Declaration_Page DR; 
	Document_Upload_Page dup;
	Verify_Authorize_Request_Page VA;
	
	Excel_reader excel=new Excel_reader(constant.withdrawl_excel);
	
	@BeforeMethod
	public void start() throws InterruptedException
	{
	
		Base b=new Base();
		b.initilization();
		driver.get(config.enps_withoutcapch());
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		driver.findElement(By.xpath("//input[@class='popupbutton']")).click();
		constant.pause(2000);
	}
		
	// Done
	@Test (dataProvider="dataProvider")
	public void E2E_Test_Non_Gov_100_Lumpsum(Map<String , String >data) 
	{
		w  = new WelcomePage();
		f  = new Family_Details_Page();
		np = new Nominee_Legal_Heir_Details_Page();
		dc = new Document_Checklist_Tier_I_Page();
		DR = new Declaration_Page();
		dup = new Document_Upload_Page();
		
		w.initiate_Withdrawal_Request_Non_Gov_Sector(data.get("User_ID") ,data.get("Password"),data.get("PRAN") ,data.get("DOD"), data.get("Marritualstatus"), data.get("spousestatus") );
		f.family_Details_for_non_gov(data.get("spouse_Gender"),data.get("spouseName"),data.get("spousePan"),data.get("spouseDOB"));
		np.fill_Nominee_Legal_Hair_Details(data.get("Nominee_Flag"), data.get("Nominee_Name"),data.get("Subscriberrelationwithnominee") , data.get("Percantageshare "), data.get("NomineeAge"), data.get("Major_Minor"), data.get("Pan"), data.get("RU1"), data.get("RU1"), data.get("RU1"), data.get("Address"), data.get("Pincode"), data.get("Mobilenumber"), data.get("Email"), data.get("Bnk_Acc_Type"),data.get("Bnk_Acc_Num"),data.get("confirmaccoun"), data.get("Bankifsccode"),data.get("Bankpin"));
		dc.check_Document_NonGov_Pran_100_Lumpsum_Withdrawal();
		DR.check_Declaration_and_save_and_submit_lump100();
		dup.uploadDocument_lumpsum100_0();
		
	}
	
	
	@Test (dataProvider="dataProvider")
	public void E2E_Test_Non_Gov_for_Scenarios_100_Annuity_Default_Annuity(Map<String , String >data) throws InterruptedException 
	{
		w  = new WelcomePage();
		f  = new Family_Details_Page();
		a  = new Annuitant_Details_Page();
		np = new Nominee_Legal_Heir_Details_Page();
		dc = new Document_Checklist_Tier_I_Page();
		DR = new Declaration_Page();
		dup = new Document_Upload_Page();
		
		w.initiate_Withdrawal_Request_Non_Gov_Sector_for_scenarios(data.get("User_ID") ,data.get("Password"),data.get("PRAN") ,data.get("DOD"), data.get("Marritualstatus"),data.get("spousestatus") ,data.get("motherStatus") ,data.get("fatherstatus"));
		f.family_Details_for_Non_Gov_Scenarios(data.get("spouse_Gender"), data.get("spouseName"), data.get("spousePan"), data.get("spouseDOB"), data.get("mothername"), data.get("motherpan"), data.get("motherdob"), data.get("fatherpan"),data.get("fatherdob"), data.get("Child1_Status_Drop") ,data.get("Child2_Status_Drop") ,data.get("Child3_Status_Drop"));
		a.annuitant_Details_Fill_Non_Gov(data.get("Political1Drop"), data.get("Political2Drop"), data.get("Conviction"),data.get("Flat"), data.get("Pincode"),data.get("StateDrop"), data.get("Mob"), data.get("Email"), data.get("BankAccN"), data.get("confirmBankAccN"), data.get("BankAccType"), data.get("IFSC code"), data.get("BankAddPincode"),data.get("ASPnameDropdown"), data.get("AnnuityFrequencydrop"));
		np.fill_Nominee_Legal_Hair_Details(data.get("Nominee_Flag"), data.get("Nominee_Name"),data.get("Subscriberrelationwithnominee") , data.get("Percantageshare "), data.get("NomineeAge"), data.get("Major_Minor"), data.get("Pan"), data.get("RU1"), data.get("RU1"), data.get("RU1"), data.get("Address"), data.get("Pincode"), data.get("Mobilenumber"), data.get("Email"), data.get("Bnk_Acc_Type"),data.get("Bnk_Acc_Num"),data.get("confirmaccoun"), data.get("Bankifsccode"),data.get("Bankpin"));
	    dc.check_Document_NonGov_Pran_100_Annuity_Withdrawal();
	    DR.check_Declaration_And_Submit();
	    dup.uploadDocument();
	}
	
	
	// Done
	@Test (dataProvider="dataProvider")
	public void E2E_Test_Non_Gov_for_Scenarios_100_Annuity_Other_Annuity(Map<String , String >data) throws InterruptedException 
	{
		w  = new WelcomePage();
		f  = new Family_Details_Page();
		a  = new Annuitant_Details_Page();
		np = new Nominee_Legal_Heir_Details_Page();
		dc = new Document_Checklist_Tier_I_Page();
		DR = new Declaration_Page();
		dup = new Document_Upload_Page();
		
		w.initiate_withdrawal_request_for_Non_gov_scenario_other_Annuity(data.get("User_ID") ,data.get("Password"),data.get("PRAN") ,data.get("DOD"), data.get("Marritualstatus"),data.get("spousestatus"));
		f.family_Details_for_Non_Gov_Scenarios_other_Annuity(data.get("spouse_Gender"), data.get("spouseName"), data.get("spousePan"), data.get("spouseDOB"), data.get("mothername"), data.get("motherpan"), data.get("motherdob"), data.get("fatherpan"),data.get("fatherdob"), data.get("Child1_Status_Drop") ,data.get("Child2_Status_Drop") ,data.get("Child3_Status_Drop"));
        a.annuitant_Details_Fill_Non_Gov_other_annuity_Scenarios(data.get("first_Nm"), data.get("motherpan"), data.get("motherdob"), data.get("Subscriberrelationwithnominee"), data.get("Political1Drop"), data.get("Political2Drop"), data.get("Conviction"),data.get("Flat"), data.get("Pincode"),data.get("StateDrop"), data.get("Mob"), data.get("Email"),  data.get("BankAccN"), data.get("confirmBankAccN"), data.get("BankAccType"), data.get("IFSC code"), data.get("BankAddPincode"),data.get("ASPnameDropdown"),"Annuity for life", data.get("AnnuityFrequencydrop"));
	   np.fill_Nominee_Legal_Hair_Details(data.get("Nominee_Flag"), data.get("Nominee_Name"),data.get("Subscriberrelationwithnominee") , data.get("Percantageshare "), data.get("NomineeAge"), data.get("Major_Minor"), data.get("Pan"), data.get("RU1"), data.get("RU1"), data.get("RU1"), data.get("Address"), data.get("Pincode"), data.get("Mobilenumber"), data.get("Email"), data.get("Bnk_Acc_Type"),data.get("Bnk_Acc_Num"),data.get("confirmaccoun"), data.get("Bankifsccode"),data.get("Bankpin"));
	   dc.check_Document_NonGov_Pran_100_Annuity_Withdrawal();
	   DR.check_Declaration_And_Submit();
	   dup.uploadDocument();
	}
	
	@Test (dataProvider="dataProvider")
	public void E2E_Test_Non_Gov_Scenario_lumpsum_and_annuity_Default_Annuity(Map<String , String >data) throws InterruptedException
	{
		w  = new WelcomePage();
		f  = new Family_Details_Page();
		a  = new Annuitant_Details_Page();
		np = new Nominee_Legal_Heir_Details_Page();
		dc = new Document_Checklist_Tier_I_Page();
		DR = new Declaration_Page();
		dup = new Document_Upload_Page();
		
		w.innitiate_withdrawal_non_gov_lumpsump_And_Annuity_withdrawal(data.get("User_ID") ,data.get("Password"),data.get("PRAN") ,data.get("DOD"), data.get("Marritualstatus"),data.get("spousestatus") ,data.get("motherStatus") ,data.get("fatherstatus"));
		f.family_Details_for_Non_Gov_Scenarios_Lumpsum_and_Annuity_Default_Annuity(data.get("spouse_Gender"), data.get("spouseName"), data.get("spousePan"), data.get("spouseDOB"), data.get("mothername"), data.get("motherpan"), data.get("motherdob"), data.get("fatherpan"),data.get("fatherdob"), data.get("Child1_Status_Drop") ,data.get("Child2_Status_Drop") ,data.get("Child3_Status_Drop"));
        a.annuitant_Details_Fill_Non_Gov_Scenario_lumpsum_and_annuity_default_annuity(data.get("first_Nm"), data.get("motherpan"), data.get("motherdob"), data.get("Subscriberrelationwithnominee"), data.get("Political1Drop"), data.get("Political2Drop"), data.get("Conviction"),data.get("Flat"), data.get("Pincode"),data.get("StateDrop"), data.get("Mob"), data.get("Email"),  data.get("BankAccN"), data.get("confirmBankAccN"), data.get("BankAccType"), data.get("IFSC code"), data.get("BankAddPincode"),data.get("ASPnameDropdown"),"Annuity for life", data.get("AnnuityFrequencydrop"));
	   np.fill_Nominee_Legal_Hair_Details(data.get("Nominee_Flag"), data.get("Nominee_Name"),data.get("Subscriberrelationwithnominee") , data.get("Percantageshare "), data.get("NomineeAge"), data.get("Major_Minor"), data.get("Pan"), data.get("RU1"), data.get("RU1"), data.get("RU1"), data.get("Address"), data.get("Pincode"), data.get("Mobilenumber"), data.get("Email"), data.get("Bnk_Acc_Type"),data.get("Bnk_Acc_Num"),data.get("confirmaccoun"), data.get("Bankifsccode"),data.get("Bankpin"));
	   dc.check_Document_NonGov_Pran_100_Annuity_Withdrawal();
	   DR.check_Declaration_And_Submit();
	   dup.uploadDocument();
		
		
	}
	
	
	@Test (dataProvider="dataProvider")
	public void E2E_Test_Non_Gov_Scenario_lumpsum_and_annuity_Other_Annuity(Map<String , String >data) throws InterruptedException
	{
		w  = new WelcomePage();
		f  = new Family_Details_Page();
		a  = new Annuitant_Details_Page();
		np = new Nominee_Legal_Heir_Details_Page();
		dc = new Document_Checklist_Tier_I_Page();
		DR = new Declaration_Page();
		dup = new Document_Upload_Page();
		
		w.innitiate_withdrawal_non_gov_lumpsump_And_Annuity_withdrawal_other_Annuity(data.get("User_ID") ,data.get("Password"),data.get("PRAN") ,data.get("DOD"), data.get("Marritualstatus"),data.get("spousestatus") ,data.get("motherStatus") ,data.get("fatherstatus"));
		f.family_Details_for_Non_Gov_Scenarios_other_Annuity(data.get("spouse_Gender"), data.get("spouseName"), data.get("spousePan"), data.get("spouseDOB"), data.get("mothername"), data.get("motherpan"), data.get("motherdob"), data.get("fatherpan"),data.get("fatherdob"), data.get("Child1_Status_Drop") ,data.get("Child2_Status_Drop") ,data.get("Child3_Status_Drop"));
        a.annuitant_Details_Fill_Non_Gov_other_annuity_Scenarios(data.get("first_Nm"), data.get("motherpan"), data.get("motherdob"), data.get("Subscriberrelationwithnominee"), data.get("Political1Drop"), data.get("Political2Drop"), data.get("Conviction"),data.get("Flat"), data.get("Pincode"),data.get("StateDrop"), data.get("Mob"), data.get("Email"),  data.get("BankAccN"), data.get("confirmBankAccN"), data.get("BankAccType"), data.get("IFSC code"), data.get("BankAddPincode"),data.get("ASPnameDropdown"),"Annuity for life", data.get("AnnuityFrequencydrop"));
	   np.fill_Nominee_Legal_Hair_Details(data.get("Nominee_Flag"), data.get("Nominee_Name"),data.get("Subscriberrelationwithnominee") , data.get("Percantageshare "), data.get("NomineeAge"), data.get("Major_Minor"), data.get("Pan"), data.get("RU1"), data.get("RU1"), data.get("RU1"), data.get("Address"), data.get("Pincode"), data.get("Mobilenumber"), data.get("Email"), data.get("Bnk_Acc_Type"),data.get("Bnk_Acc_Num"),data.get("confirmaccoun"), data.get("Bankifsccode"),data.get("Bankpin"));
	   dc.check_Document_NonGov_Pran_100_Annuity_Withdrawal();
	   DR.check_Declaration_And_Submit();
	   dup.uploadDocument();
		
		
	}
	
	 
	
	
	    @Test(dataProvider="dataProvider" ,dependsOnMethods = "E2E_Test_Non_Gov_Scenario_lumpsum_and_annuity_Other_Annuity")
	    public void testverify(Map<String, String >data) throws InterruptedException
	     {
		  VA = new Verify_Authorize_Request_Page();
	      VA.verify_And_Authorize(data.get("UID"),data.get("Password") , data.get("PRAN"));
     	
	     }
	  
        //////////////////For No Annuitant Page////////////////////////////////
	
        @Test(dataProvider="dataProvider" )//,dependsOnMethods = "E2E_Test_Non_Gov_100_Lumpsum")
        public void testverify_No_Annuitant_(Map<String, String >data) throws InterruptedException
        {
          VA = new Verify_Authorize_Request_Page();

          VA.verify_And_Authorize_lumpsum100_0(data.get("UID"),data.get("Pass2") , data.get("PRAN"));
        }
	
	
	
	
	@DataProvider(name="dataProvider")
	public  Object[][]dataprovide() throws InvalidFormatException
	{
		Object[][]bb=excel.getSheetData("Non_Gov");
		return bb;
	}
	
	
	

}
