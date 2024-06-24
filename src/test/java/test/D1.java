package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1 
{
	public static void main (String [] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/testng-tutorials/import-data-from-excel-and-pass-to-data-provider");
		
		
		
		
	}

}
