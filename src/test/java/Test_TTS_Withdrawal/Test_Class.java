package Test_TTS_Withdrawal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test_Class {

	public static void main(String[] args) throws InterruptedException 
	{
	   //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pegasus_rajkumarg\\Desktop\\Chandrayan 4\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\pegasus_rajkumarg\\eclipse-workspace\\Chandrayan_4\\Drivers\\chromedriver.exe");
		    ChromeOptions co = new ChromeOptions();
	  //  	co.setBinary("C:\\Users\\pegasus_rajkumarg\\eclipse-workspace\\Chandrayan_4\\Drivers\\chrome.exe");
		  
	    	co.setBinary("C:\\Users\\pegasus_rajkumarg\\Desktop\\Chandrayan 4\\chrome-win64\\chrome-win64\\chrome.exe");
	    	WebDriver  driver=new ChromeDriver(co);
		    driver.get("https://172.22.1.83/CRA/");
		    driver.findElement(By.xpath("//button[@id='details-button']")).click();
		    driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		    driver.findElement(By.xpath("//input[@class='popupbutton']")).click();
		    WebElement uid = driver.findElement(By.xpath("(//input[@name='userID'])[1]"));
		  //  uid.sendKeys("Typed_Text");
		    String value = uid.getAttribute("value");
		    System.out.println(value);
		    
		 //   int i = 1;
		//    while(i<3) 
		    	
		    	for(int i=1;i<3;i++)
		    {
		    	if (i==1)
		    	{
		    		  uid.sendKeys("value_1111");
		    		  String value1 = uid.getAttribute("value");
		    		  System.out.println(value1);
		    		  Thread.sleep(1500);
		    		  
		    		  
		    	}
		    	else
		    	{
		    		 uid.clear();
		    		 uid.sendKeys("value_2222");
		    		 String value2 = uid.getAttribute("value");
		    		 System.out.println(value2);
		    	}
		    	
		    	
		    	
		    	
		    }
		    
		    	
		    	
		    
		    
		    
		    
		    
		  

	}

}
