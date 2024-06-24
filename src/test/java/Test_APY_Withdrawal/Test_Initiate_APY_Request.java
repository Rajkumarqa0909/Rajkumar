package Test_APY_Withdrawal;

import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.Base;
import Death_Withdrawal_APY.Initiate_Request_APY_Withdrawal;
import utility.Excel_reader;
import utility.constant;

public class Test_Initiate_APY_Request extends Base
{
	
	Initiate_Request_APY_Withdrawal ir;
	
	Excel_reader er = new Excel_reader("C:\\Users\\pegasus_rajkumarg\\Desktop\\APY_for_trial_chandrayan_P.xlsx");
	
	
	@BeforeMethod
	public void start()
	{
		Base b = new Base();
		b.initilization();
		driver.get(config.cra_lite());
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();

		constant.pause(2000);		
	}
	
	
	
	
	@Test (dataProvider = "dp")
	public void initiate_Test(Map<String , String > data)
	{
		
		ir = new Initiate_Request_APY_Withdrawal();
		
		ir.initiate_APY_Withdrawal( data.get("UserId"), data.get("Password"), data.get("pran") ,data.get("Withdrawal_type"), "24/11/2023");
		
		
	}
	
	
	
	
	@DataProvider(name="dp")
	
	public Object [] [] dataprovide() throws InvalidFormatException
	{
		
		Object[][] bb = er.getSheetData("Sheet1");
		return bb;
		
	}
	
	
	

}
