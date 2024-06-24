package Test_APY_Withdrawal;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.Base;
import Death_Withdrawal_APY.Initiate_Request_APY_Withdrawal;
import utility.constant;

public class Test_APY extends Base
{
	Initiate_Request_APY_Withdrawal IR ;
	
	
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
	
	
	@Test
	public void test_APY()
	{
		IR = new Initiate_Request_APY_Withdrawal();
		
	//	IR.initiate_APY_Withdrawal("160003001", "etain1234");
		
	}
	
	
	
	

}
