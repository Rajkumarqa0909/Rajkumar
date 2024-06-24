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


public class Test_DW_Group_Non_Gov_Execution extends Base
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
	
	
	
	
	 //////////////////For No Annuitant Page////////////////////////////////
	
    @Test(dataProvider="dataProvider" ,dependsOnMethods = "E2E_Test_Non_Gov_100_Lumpsum")
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
