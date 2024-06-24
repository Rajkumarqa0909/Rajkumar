package Browser_Launch_Trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import utility.ReadConfig;

public class Launch_Options 
{
	
	public static void main (String [] args)
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\pegasus_rajkumarg\\Desktop\\Chandrayan 4\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		    ChromeOptions co = new ChromeOptions();
	    	co.setBinary("C:\\Users\\pegasus_rajkumarg\\Desktop\\Chandrayan 4\\chrome-win64\\chrome-win64\\chrome.exe");
		    WebDriver  driver =new ChromeDriver(co);
		    driver.manage().window().maximize();
			ReadConfig config = new ReadConfig();
		    driver.get(config.enps_withoutcapch());
		     WebElement proceedlink = driver.findElement(By.id("details-button"));
		    System.out.println(proceedlink.getText());
		    proceedlink.click();
		    WebElement linktext = driver.findElement(By.id("proceed-link"));
		    System.out.println( linktext.getText());
		    linktext.click();
		    
		    
		    
		    driver.findElement(By.id("otpButton")).click();
		    
		    
		     
		
	}

}
