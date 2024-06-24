package test_claim_id_generator;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base;
import claim_ID_Generate_page.Claim_id_Generator;
import utility.constant;

public class Test_Claim_ID_Generator extends Base
{
	
	
	Claim_id_Generator cig;
	
	@BeforeMethod
	public void start()
	{
		
		Base b = new Base();
		b.initilization();
		driver.get("https://172.18.75.24/CRA/");
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
	//	driver.findElement(By.xpath("//input[@class='popupbutton']")).click();
		constant.pause(2000);
	
	}
	
	
	
	
	
	@Test
	public void test()
	{
		cig = new Claim_id_Generator(driver);
		
		cig.claim_id_generator("130016907","etain1234","110010124912");
		
	}
	
	
	
	@Test (dependsOnMethods = "test")
	public void authorize()
	{
		cig = new Claim_id_Generator(driver);
		
		cig.authorize_request("130016909","etain1234","110010124912");
	}
	
	
	
	
	

}
