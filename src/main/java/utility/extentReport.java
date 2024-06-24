package utility;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReport implements ITestListener
{

	ExtentSparkReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	private WebDriver driver;
	
	static Date date = new Date();  
    static Timestamp ts=new Timestamp(date.getTime());  
    static SimpleDateFormat timestamp = new SimpleDateFormat("yyyy-MM-dd HH_mm_ss");  
   // System.out.println(formatter.format(ts));     
	
    private static String reportFileName = "Test-Automaton-Report "+timestamp.format(ts)+".html";
    private static String fileSeperator = System.getProperty("file.separator");
    private static String reportFilepath = System.getProperty("user.dir") +fileSeperator+ "TestReport";
    private static String reportFileLocation =  reportFilepath +fileSeperator+ reportFileName;
	
    
   
	public void configureReport()
	{
		reporter= new ExtentSparkReporter(reportFileLocation);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		
		// Adding system information / environment ifo
		extent.setSystemInfo("Window Ip:", "172.19.66.58");
		extent.setSystemInfo("OS:", "Window");
		extent.setSystemInfo("QA Name:", "Rameshwar");
		extent.setSystemInfo("Project:", "CRA");
		extent.setSystemInfo("Server :", "eNPS-Lite (172.18.75.72)");
		
		
		// configuration to change looks
		reporter.config().setDocumentTitle(reportFileName);
		reporter.config().setReportName(reportFileName);
	//	reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setTheme(Theme.DARK);
	}
	
	 public void onStart(ITestContext context) 
	  {
		  configureReport();
		  System.out.println("*** Test Suite " + context.getName() + " started ***");
	 }

	 
	public  void onTestStart(ITestResult result) 
	{
		
		System.out.println(("*** Running test method - " + result.getName() + "..."));
		
	}
	

	 
	  public void onTestSuccess(ITestResult result) 
	  {
		  System.out.println("*** Executed _ " + result.getName() + " test successfully...");
			test=  extent.createTest(result.getName());
			test.log(Status.PASS, MarkupHelper.createLabel("Test Passed  "+result.getName(), ExtentColor.GREEN));
		  
		  
	  }

	
	
	  public void onTestFailure(ITestResult result)
	  {
		  
		  System.out.println("*** Test execution - " + result.getName() + " failed...");
		test=  extent.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Test Failed  "+result.getName(), ExtentColor.RED));

	  }

	 
	  public void onTestSkipped(ITestResult result) 
	  {
		  System.out.println("*** Test -" + result.getName() + " skipped...");
		  test=  extent.createTest(result.getName());
		  test.log(Status.SKIP, MarkupHelper.createLabel("Test Skipped  "+result.getName(), ExtentColor.YELLOW));
	  }

	  
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	  {
		  
		  
	  }
	  
	  public void onFinish(ITestContext context) 
	  {
		  System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		  extent.flush();
		
	 }

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  public static String getScreenshot(WebDriver driver) {

			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			String path = System.getProperty("user.dir") + "/extentScreenshot/" + System.currentTimeMillis() + ".png";
			File destination = new File(path);

			try {
				FileUtils.copyFile(srcFile, destination);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return path;

		}
		
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
