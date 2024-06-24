package Test_TTS_Withdrawal;

import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BaseClass.Base;
import TTS_Withdrawal.Request_Maker;
import TTS_Withdrawal.Welcome_Page;
import utility.Excel_reader;
import utility.constant;

public class Welcome_Test extends Base
{
	Request_Maker t;
	Welcome_Page w;
	
//	Excel_reader excel = new Excel_reader("C:\\Users\\pegasus_rajkumarg\\Desktop\\CY.xlsx");
	
	Excel_reader excel = new Excel_reader("./src/test/resources/CY.xlsx");
	
	@BeforeMethod
	public void start()
	
	
	{
		
		
		Base b = new Base();
		b.initilization();
		driver.get(config.drvturl());
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		driver.findElement(By.xpath("//input[@class='popupbutton']")).click();
		constant.pause(2000);
		
		
	}
	
	
	
	@Test (dataProvider = "dataProvider" , enabled = true)
	public void test_Initiate_request(Map <String,String> data)
	{
		
		t = new Request_Maker();
	    t.initiate_request(data.get("User_ID"),data.get("Password"), data.get("Pran"), data.get("Withdrawaltype"), data.get("tiretype"));
	
	}
	
	
	
	@Test (dataProvider = "dataProvider" ,enabled = true)
	public void status_Check(Map<String,String> data)
	{
		
		w = new Welcome_Page();
		
		w.status_View(data.get("UserID"), data.get("Password"),data.get("Pran"), data.get("Withdrawaltype") , data.get("tiretype"));
		
	}
	
	
	
	@DataProvider(name="dataProvider")
	public Object [] [] dataprovide() throws InvalidFormatException
	{
		Object [][] bb =excel.getSheetData("Sheet1");
		return bb;
		
	}

	
}
