package Test_Withdrawal_Page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.Base;
import P_Page.W2;

public class W2_Test extends Base
{
	W2 w2 ;
	@Test
	public void wtest()
	{
		 Base b = new Base();
			b.initilization();
			driver.get(config.drvturl());
			driver.findElement(By.xpath("//button[@id='details-button']")).click();
			driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
			driver.findElement(By.xpath("//input[@class='popupbutton']")).click();
			w2 = new W2();
			
		   w2 = new W2();
		   w2.submit_Method("1001003101", "etain1234");
	}

}
