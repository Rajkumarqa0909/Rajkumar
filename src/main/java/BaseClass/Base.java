package BaseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.Log;
import utility.ReadConfig;
import utility.constant;

public class Base 
{
	public static WebDriver driver;
	public static ReadConfig	config	=new ReadConfig();
	
	public static Logger log;
	
	
	public void initilization ()
	{
	//	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	//	ChromeOptions co =new ChromeOptions();
	//	co.setBinary("./chrome.exe");
		
		
	//    log=Logger.getLogger(Base.class.getName());
	//    System.setProperty("webdriver.chrome.driver", "C:\\Users\\pegasus_rajkumarg\\Desktop\\Daily_Note\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\pegasus_rajkumarg\\Desktop\\JavaSelenium\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
	//    ChromeOptions co = new ChromeOptions();
   // 	co.setBinary("C:\\Users\\pegasus_rajkumarg\\Desktop\\Chandrayan 4\\chrome-win64\\chrome-win64\\chrome.exe");
	    driver=new ChromeDriver();

   

	
		driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(constant.Page_load_TimeOut,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(constant.implicityl_wait,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
	}
	

	
	
	public static void getUrl()
	{
		driver.get(config.drvturl());
		Log.info("url opene");
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		constant.pause(1000);
		
	}
	
	
	
	
	
	public static String getScreenshot(WebDriver driver, String methodname) 
	{

		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destPath=System.getProperty("user.dir")+"/Screenshot/"+methodname+"-"+getCurrentTime()+".png";
		
		File file=new File(destPath);
		
		try {
			FileUtils.copyFile(source, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return 	destPath;	
		
		

	}
	
	public static String getCurrentTime() {
		String currentDate=new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		return currentDate;
	}
	
	
	
	
	
	
	

}
