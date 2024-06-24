package utility;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class elementUtil 
{
	public static WebDriver driver;
	
	public static void click_On_WebElement (WebDriver driver , WebElement element , long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		WebElement elements=null;
		elements=wait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
	}
	
	public static void click_On_WebElement2(WebDriver driver,WebElement element, WebElement element2 ,long timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		WebElement elements=null;
		elements=wait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
	}
	
	public static void actions_performTab(WebDriver driver)
	{
		 Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();;
	}
	
	public static void Allert_Accept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	// This method for getting text value
	public static String get_TextValue(WebDriver driver,WebElement element, long timeout)
			{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		WebElement elements=null;
		elements=wait.until(ExpectedConditions.visibilityOf(element));
		return elements.getText();
			}
	

	// getting multiple data 
	public static void get_MultipleTextValue(WebDriver driver,List<WebElement> element, long timeout)
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	List<WebElement> elements=null;
	elements=wait.until(ExpectedConditions.visibilityOfAllElements(element));
	for(WebElement element1:element)
	{
		System.out.println(element1.getText()); 
	}
	 

	}
	

	// dropdown util
	public static void Select_DropDownByVisibleText(WebElement element, String text) 
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	


	// Select Dropdown by Value
	public static void Select_DropDownByValue(WebElement element, String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}


	// Select Dropdown from List of element 
	public void Select_DropDown(WebElement element , String value) 
	{
		Select select = new Select(element);

		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList)
		{
			String text = e.getText();
		//	System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}



	public static String Select_DropDownByVisibleText_OptionIsSelected(WebElement element, String text) 
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
		WebElement selected = select.getFirstSelectedOption();
		String result = selected.getText();
		
		return result;
	}









	// this Method for dropdown Validation
	public static void Select_dropdowon_validation(WebElement element, String []a )
	{
		
		Select select = new Select(element);

		List<WebElement> optionsList = select.getOptions();
		 for(WebElement allelement:optionsList)  
		 {  
			//System.out.println(we.getText());
		  boolean match = false;
		  for (int i=0; i<a.length; i++)
		  {
		      if (allelement.getText().equals(a[i]))
		      {
		    	  System.out.println("Actual Value is=="  +allelement.getText());
		        match = true;
		    
		     
		      }
		    }
		  Assert.assertTrue(match);
		 }  
		
	}





	// Java Script executer for click Operation
	public static void click_byJavaScript( WebDriver driver,WebElement element) 
	{
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", element);
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", element);
	}



	public static void move_to_Element( WebDriver driver,WebElement element)
	{
		
		Actions action= new Actions(driver);
		
		action.moveToElement(element).build().perform();
	}





	// Method for future Date
	public static void  select_Future_Date(List<WebElement> element)
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("d");
		
		
		 // Create a calendar object with today date. Calendar is in java.util pakage.
	   Calendar calendar = Calendar.getInstance();

	   // Move calendar to yesterday
	   calendar.add(Calendar.DATE, +2);

	   // Get current date of calendar which point to the yesterday now
	   Date future = (Date) calendar.getTime();
	   String futureDate=dateFormat.format(future);
		for(WebElement elem:element)
		{
			//System.out.println(elem.getText());
			 if (elem.getText().equals(futureDate))
		        {
				 elem.click();
		           break;
		        }
		}
	}










	//Method for Today
	public static void select_CurrentDate(List<WebElement> element) 
	{

		SimpleDateFormat dateFormat = new SimpleDateFormat("d");
//		Date d=new Date();
		java.util.Date today = Calendar.getInstance().getTime();
		String date = dateFormat.format(today);
		
		 for (WebElement cell : element)
	  {
	     if (cell.getText().equals(date))
	     {
	        cell.click();
	        break;
	     }
	  } 
	}





}
