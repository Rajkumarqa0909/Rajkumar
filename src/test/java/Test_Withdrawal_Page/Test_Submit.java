package Test_Withdrawal_Page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.Base;
import P_Page.Withdrawal_Page;

public class Test_Submit extends Base 

{
	Withdrawal_Page wp ;
	
	
	
	@Test
	public void testSubmitMethod()
	{
		Base b = new Base();
		b.initilization();
		driver.get(config.drvturl());
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		driver.findElement(By.xpath("//input[@class='popupbutton']")).click();
		wp = new Withdrawal_Page();
		
		wp.submit_Method("1001003100", "etain1234");
	}
	
	
	@Test
	public void testSubmitMethod1()
	{
		Base b = new Base();
		b.initilization();
		driver.get(config.drvturl());
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		driver.findElement(By.xpath("//input[@class='popupbutton']")).click();
		wp = new Withdrawal_Page();
		
		wp.submit_Method("1001007200", "etain1234");
	}

	@Test
	public void testSubmitMethod2()
	{
		Base b = new Base();
		b.initilization();
		driver.get(config.drvturl());
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		driver.findElement(By.xpath("//input[@class='popupbutton']")).click();
		wp = new Withdrawal_Page();
		
		wp.submit_Method("1001003101", "etain1234");
		
	}
}
