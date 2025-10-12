package day3framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import day2_Framework.Logout_ORHM;

public class DataDrivenFramework {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	 	
		Login_ORHM_pageFact lin = new Login_ORHM_PageFact(driver);
		Logout_ORHM lout=new Logout_ORHM(driver);
		lin.url();
		
		 String filepath = "C:\\ExcelreadandWrite\\TestDataKeyword_ORHM.xlsx";
	        FileInputStream fis = new FileInputStream(filepath);
	        

	        XSSFWorkbook workbook = new XSSFWorkbook(fis);
	        XSSFSheet sheet = workbook.getSheet("Data");

	        int rowCount = sheet.getLastRowNum();
	        System.out.println("Total Rows: " +rows);
	        
	        for(int i=1;i<rows;i++) {
	        	XSSFRow row=sheet.getRow(i);
	        	XSSFCell un=row.getCell(0);
	        	XSSFCell pw=row.getCell(1);
	        	
	        	System.out.println("username ------->"+un+"password---->"+pw);
	        lin.enterUserName(un.toString());
	        lin.enterPassword(pw.toString());
	        lin.clickOnLoginBTN();
	        lin.clickOnProfile();
	        lin.clickOnLogout();
        
	}
	        fis.close();

}
}
