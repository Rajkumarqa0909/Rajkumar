package Test_TTS_Withdrawal;

import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.Base;
import TTS_Withdrawal.Authorize_Page;
import utility.Excel_reader;
import utility.constant;

public class Authorise_Test extends Base
{
	
	Authorize_Page a;
	Excel_reader er = new Excel_reader("./src//test//resources//CY.xlsx");
	
	
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
	
	
	@Test (dataProvider = "dp")
	public void authorise_test(Map<String , String> d)
	{
		a = new Authorize_Page();
		
		a.authorize(d.get("UserID"), d.get("Password") , "110000050030");
    }
	
	@DataProvider(name="dp")
	public Object [] [] dataprovide() throws InvalidFormatException
	{
		
		Object [][] bb =er.getSheetData("Sheet1");
		return bb;
					
    }
	
	

	
	
	
	

}
