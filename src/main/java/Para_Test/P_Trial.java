package Para_Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P_Trial 
{
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("here the before method");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("here the after method");
	}
	@Test
	public void test()
	{
		System.out.println("here the test");
	}
	
	@Test
	public void test1()
	{
		System.out.println("here the test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("here the test2");
	}
	
	
	
	@Test
	public void validate_Authorize_Message()
	{
		String message         ="Withdrawal request has been successfully initiated."
				              + " Request is pending for Authorisation from Nodal Office.";
		
	    String Actual_message="Withdrawal request has been successfully initiated. "
	    		              + "Request is pending for Authorisation from Nodal Office." ;
	    
	    Assert.assertEquals(message, Actual_message);
	    
	    SoftAssert softassert = new SoftAssert();
	    
	    softassert.assertAll();
	    
	    
	}
	
	
	
	
	
	

}
