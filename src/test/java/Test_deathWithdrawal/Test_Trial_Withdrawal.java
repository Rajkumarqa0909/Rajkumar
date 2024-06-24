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

public class Test_Trial_Withdrawal extends Base
{
	WelcomePage w;
	Family_Details_Page f;
	Annuitant_Details_Page A;
	Nominee_Legal_Heir_Details_Page N;
	Document_Checklist_Tier_I_Page DC;
	Declaration_Page DR; 
	Document_Upload_Page DU;
	Verify_Authorize_Request_Page VA;
	
	Excel_reader excel=new Excel_reader(constant.withdrawl_excel);
	
	@BeforeMethod
	public void start() throws InterruptedException
	{
	
		Base b=new Base();
		b.initilization();
	//	driver.get(config.enps_withoutcapch());
		driver.get("https://172.18.75.24/CRA/HomePage_hp.do");
		
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	//	driver.findElement(By.xpath("//input[@class='popupbutton']")).click();
		constant.pause(2000);
	}
	
	
	@Test (dataProvider="dataProvider")
	public void Test_End_to_end_lumpsum100(Map<String , String >data) throws InterruptedException
	{
		w = new WelcomePage();
		f = new Family_Details_Page();
		N = new Nominee_Legal_Heir_Details_Page();
		DC = new Document_Checklist_Tier_I_Page();
		DR = new Declaration_Page();
		DU = new Document_Upload_Page();
		VA = new Verify_Authorize_Request_Page();
		
		w.initiate_withdrawal_Request_lumpsum100(data.get("User_ID"), data.get("Password"), data.get("PRAN"), data.get("DOD"), data.get("lumpsumpercantage"), data.get("AnnuityPercantage"), data.get("Marritualstatus"), data.get("spousestatus"));
	    f.Lumpsum100_0_addfamilydetails(data.get("spouse_Gender"), data.get("spouseName"), data.get("spousePan"),data.get("spouseDOB"));
		N.fill_Nominee_Legal_Hair_Details(data.get("Nominee_Flag"), data.get("Nominee_Name"),data.get("Subscriberrelationwithnominee") , data.get("Percantageshare "), data.get("NomineeAge"), data.get("Major_Minor"), data.get("Pan"), data.get("RU1"), data.get("RU1"), data.get("RU1"), data.get("Address"), data.get("Pincode"), data.get("Mobilenumber"), data.get("Email"), data.get("Bnk_Acc_Type"),data.get("Bnk_Acc_Num"),data.get("confirmaccoun"), data.get("Bankifsccode"),data.get("Bankpin"));
	
	//	N.fill_Nominee_Legal_Hair_Details_for_No_existingnominee(data.get("Nominee_Name"),data.get("Subscriberrelationwithnominee") , data.get("Percantageshare "), data.get("NomineeAge"), data.get("Major_Minor"), data.get("Pan"), data.get("RU1"), data.get("RU1"), data.get("RU1"), data.get("Address"), data.get("Pincode"), data.get("Mobilenumber"), data.get("Email"), data.get("Bnk_Acc_Type"),data.get("Bnk_Acc_Num"),data.get("confirmaccoun"), data.get("Bankifsccode"),data.get("Bankpin"));
		
	//	DC.check_Document_List_Lumpsum_100_0_No_existingNominee();
		 
	
		
		
		DC.check_Document_List_Lumpsum_100_0();
		
		DR.check_Declaration_and_save_and_submit_lump100();
		
		DU.uploadDocument_lumpsum100_0();
		
		
		
	}
	
	
	
	@Test(dataProvider="dataProvider" ,dependsOnMethods = "Test_End_to_end_lumpsum100")
	public void testverify(Map<String, String >data) throws InterruptedException
	{
		VA = new Verify_Authorize_Request_Page();
		
		VA.verify_And_Authorize_lumpsum100_0(data.get("UID"), data.get("Password"),  data.get("PRAN"));
	}
	
	
	
	@DataProvider(name="dataProvider")
	public  Object[][]dataprovide() throws InvalidFormatException
	{
		Object[][]bb=excel.getSheetData("Lump100");
		return bb;
	}
	

}
