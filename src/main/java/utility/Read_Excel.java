package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel 
{
	public void readexcel(int row , int column) throws IOException
	{
		String path="./src/test/resources/CY.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
	   
		DataFormatter df = new DataFormatter();
	    String uid = df.formatCellValue(sheet.getRow(row).getCell(column));
	//	String uid = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(uid);
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		
		Read_Excel er = new Read_Excel();
		er.readexcel(1,0);
		er.readexcel(1,1);
		er.readexcel(1,2);
		
	}

}
