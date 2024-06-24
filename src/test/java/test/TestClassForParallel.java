package test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base;
import Death_Withdrawal_APY.Initiate_Request_APY_Withdrawal;
import utility.constant;

public class TestClassForParallel extends Base
{
	
	Initiate_Request_APY_Withdrawal ir ;
	
	@BeforeMethod
	public void start ()
	{
		Base b = new Base();
		b.initilization();
		driver.get(config.cra_lite());
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();

		constant.pause(2000);
	}
	
	
	
	@Test
	public void apyDeath_Withdrawal()
	{
		ir = new Initiate_Request_APY_Withdrawal();
		
	//	ir.initiate_apy("5008976", "etain1234");
		
		
		
	}

}
