package org.sfd;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDaySelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aswin\\eclipse-workspace\\SeleniumFirstDay\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shopclues.com/");
		
		WebElement txtSearch=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		txtSearch.click();
		
		

		WebElement txtElectric=driver.findElement(By.xpath("//a[contains(href(),'search?g=Mobiles']"));
		txtElectric.click();
		
		
		WebElement submit = driver.findElement(By.xpath("//div[@class='continue_btn']"));
		submit.click();
		
		WebElement login = driver.findElement(By.xpath("//input[@id='Button2']"));
		login.click();

		Alert a=driver.switchTo().alert();
		a.accept();TakesScreenshot tk=(TakesScreenshot) driver;
		
		File s =tk.getScreenshotAs(OutputType.FILE);
		
		File d=new File("E:\\greens\\Qs2.png");
		FileUtils.copyFile(s, d);
		WebElement txtEmail = driver.findElement(By.xpath("//a[text()='Java']"));
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		//////////////////////////////
		package com.test;

		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.IOException;
		import java.util.List;

		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class SampleTwo {
			public static void main(String[] args) throws IOException {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Aswin\\eclipse-workspace\\SeleniumFirstDay\\drivers\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();
				driver.get("https://www.w3schools.com/html/html_tables.asp");

				driver.manage().window().maximize();
				WebElement webTable = driver.findElement(By.id("customers"));
				List<WebElement> firstRow = webTable.findElements(By.tagName("tr"));
				
				int rSize = firstRow.size();
				System.out.println(rSize);

				File fileLoc = new File("C:\\Users\\Aswin\\eclipse-workspace\\FacebookAutomation\\excel\\NewFile.xlsx");
				FileInputStream stream = new FileInputStream(fileLoc);
				Workbook w = new XSSFWorkbook(stream);
				Sheet s = w.getSheet("Test");
				for (int i = 0; i < rSize; i++) {
					WebElement webRows = firstRow.get(i);
					List<WebElement> webHead = webRows.findElements(By.tagName("th"));
					Row excelr = s.getRow(i);

					for (int j = 0; j < webHead.size(); j++) {
						WebElement webHeadData = webHead.get(j);
						String htext = webHeadData.getText();
						System.out.println(htext);
						Cell crCell =excelr.getCell(j);
						crCell.setCellValue(htext);
					}
				}

				for (int i = 0; i < rSize; i++) {
					WebElement wRows = firstRow.get(i);
					List<WebElement> wCell = wRows.findElements(By.tagName("td"));
					Row eRow = s.getRow(i);
					for (int j = 0; j < wCell.size(); j++) {

						WebElement wData = wCell.get(j);
						if (j == 0) {

							String wText = wData.getText();
							System.out.println(wText);
							Cell eCell = eRow.createCell(j);
							eCell.setCellValue(wText);

						}
					}
				}

				FileOutputStream o = new FileOutputStream(fileLoc);

				w.write(o);
				System.out.println("Done........");

			}

		}
////////////////////////////////////////////
		package com.base;

		import java.io.File;
		import java.io.FileInputStream;
		import java.io.IOException;
		import java.text.SimpleDateFormat;

		import org.apache.poi.ss.usermodel.Cell;
		import org.apache.poi.ss.usermodel.DateUtil;
		import org.apache.poi.ss.usermodel.Row;
		import org.apache.poi.ss.usermodel.Sheet;
		import org.apache.poi.ss.usermodel.Workbook;
		import org.apache.poi.xssf.usermodel.XSSFWorkbook;

		public class Base {
			private static int type;

			public static String getData(int noRow,int noCell) throws IOException {
				String data=null;
				File fLoc=new File(System.getProperty("C:\\Users\\Aswin\\eclipse-workspace\\FacebookAutomation\\excel\\Automation.xlsx"));
				FileInputStream stream=new FileInputStream(fLoc);
				Workbook workbook=new XSSFWorkbook(stream);
				Sheet sheet = workbook.getSheet("Data");
				Row excelRow = sheet.getRow(noRow);
				Cell excelCell = excelRow.getCell(noCell);
				int cellType = excelCell.getCellType();
				
				if (type==1) {
					data = excelCell.getStringCellValue();
					
				}
				if (type==0) {
					if (DateUtil.isCellDateFormatted(excelCell)) {
							data=new SimpleDateFormat("dd-MMM-YY").format(excelCell.getStringCellValue());
						
					}else {
						//data=String.valueOf(() excelCell.getNumericCellValue());
						data=String.valueOf((long)excelCell.getNumericCellValue());
					}
					
					
					
				}
				return data;
				
			}

		}


		
		
	}

}

