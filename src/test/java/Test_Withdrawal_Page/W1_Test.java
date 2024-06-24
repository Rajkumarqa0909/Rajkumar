package Test_Withdrawal_Page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.Base;
import P_Page.W1;
import P_Page.Withdrawal_Page;

public class W1_Test extends Base
{
   W1 w1 ;
   
   
   @Test
   public void wtest()
   {
	   Base b = new Base();
		b.initilization();
		driver.get(config.drvturl());
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		driver.findElement(By.xpath("//input[@class='popupbutton']")).click();
		w1 = new W1();
		
	   w1 = new W1();
	   w1.submit_Method("1001003100", "etain1234");
   }
}
