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

public class Test_DW_GS_20_80 extends Base
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
	
	

	
	@Test(dataProvider="dataProvider")
	public void Test_20_80_ForScenarioOF_2_3_4_5(Map<String, String >data) throws InterruptedException
	{
		
		w   = new WelcomePage();
		f   = new Family_Details_Page();
		a   = new Annuitant_Details_Page();
		np  = new Nominee_Legal_Heir_Details_Page();
		dc  = new Document_Checklist_Tier_I_Page();
		DR  = new Declaration_Page();
		dup = new Document_Upload_Page();
		
	
		w.initiate_withdrawal_Request_lumpsum20_80(data.get("User_ID"),data.get("Password") , data.get("PRAN"), data.get("DOD"), data.get("Marritualstatus"), data.get("spousestatus"),data.get("motherStatus"), data.get("fatherstatus"));
		f.subscriberfamilymemberDetails( data.get("S"),data.get("M"),data.get("F"),data.get("spouse_Gender"), data.get("spouseName"), data.get("spousePan"), data.get("spouseDOB"), data.get("mothername"), data.get("motherpan"), data.get("motherdob"), data.get("fatherpan"),data.get("fatherdob"), data.get("Child1_Status_Drop") ,data.get("Child2_Status_Drop") ,data.get("Child3_Status_Drop"));
	    a.fillAnnuitant_Details(data.get("Flat"), data.get("Pincode"),data.get("StateDrop"), data.get("Mob"), data.get("Email"), data.get("Political1Drop"), data.get("Political2Drop"), data.get("Conviction"), data.get("BankAccN"), data.get("confirmBankAccN"), data.get("BankAccType"), data.get("IFSC code"), data.get("BankAddPincode"), data.get("ASPnameDropdown"), data.get("AnnuityFrequencydrop"));
		np.fill_Nominee_Legal_Hair_Details(data.get("Nominee_Flag"), data.get("Nominee_Name"),data.get("Subscriberrelationwithnominee") , data.get("Percantageshare "), data.get("NomineeAge"), data.get("Major_Minor"), data.get("Pan"), data.get("RU1"), data.get("RU1"), data.get("RU1"), data.get("Address"), data.get("Pincode"), data.get("Mobilenumber"), data.get("Email"), data.get("Bnk_Acc_Type"),data.get("Bnk_Acc_Num"),data.get("confirmaccoun"), data.get("Bankifsccode"),data.get("Bankpin"));
		dc.check_Document_for20_80();
		DR.check_Declaration_And_Submit();
		dup.uploadDocument();
			
	}
	
	
	@Test(dataProvider="dataProvider" ,dependsOnMethods = "Test_20_80_ForScenarioOF_2_3_4_5")
	public void testverify(Map<String, String >data) throws InterruptedException
	{
		VA = new Verify_Authorize_Request_Page();
		
		VA.verify_And_Authorize(data.get("UID"),data.get("Password") , data.get("PRAN"));
     	
	}
	
	
	
	@DataProvider(name="dataProvider")
	public  Object[][]dataprovide() throws InvalidFormatException
	{
		Object[][]bb=excel.getSheetData("Sheet4");
		return bb;
	}

}