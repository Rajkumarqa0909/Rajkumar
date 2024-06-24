package Test_APY_Withdrawal;

import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.Base;
import Death_Withdrawal_APY.Authorize_Request;
import utility.Excel_reader;

public class Test_Authorize_APY extends Base {

	Excel_reader er = new Excel_reader("C:\\Users\\pegasus_rajkumarg\\Desktop\\Trial\\APY_Authorize_Trial.xlsx");

	Authorize_Request ar;

	@BeforeTest
	public void start() {
		Base b = new Base();
		b.initilization();
		driver.get(config.cra_lite());
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();

	}

	@Test(dataProvider = "dp")
	public void test_Authorize_Request(Map<String, String> data) {
		ar = new Authorize_Request();

		ar.authorize_request(data.get("User_ID"), data.get("Password"));
		ar.authorize_req1(data.get("Pran"), data.get("Withdrawal_type"), data.get("Withdrawal_type"),
				data.get("withdrawal_subtype"));
	}

	@DataProvider(name = "dp")
	public Object[][] dataprovide() throws InvalidFormatException {

		Object[][] bb = er.getSheetData("Sheet1");
		return bb;

	}

}
