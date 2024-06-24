package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class TrialClassSelenium {
	
	public static void main(String[] args) throws IOException 
	{     

	   	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\pegasus_rajkumarg\\Desktop\\JavaSelenium\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		 
		  driver.manage().window().maximize();
		  
		  
		
		  driver.get("https://172.22.1.83/CRA/HomePage_hp.do");
		  
		  driver.findElement(By.xpath("//button[@id='details-button']")).click();
		  
		  driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		  
		  
		   
		  
		
	}
	

}
