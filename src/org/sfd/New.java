package org.sfd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aswin\\eclipse-workspace\\SeleniumFirstDay\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	
		WebElement txtSign=driver.findElement(By.xpath("//a[@class='x4bK8']"));
		txtSign.click();
		
		WebElement txtMobile=driver.findElement(By.id("mobile"));
		txtMobile.sendKeys("7339224554");
		
		WebElement txtLogIn=driver.findElement(By.xpath("//a[@class='a-ayg']"));
		txtLogIn.click();
		
		WebElement txtName=driver.findElement(By.id("name"));
		txtName.sendKeys("Aswin");
		
		
		WebElement element2 =driver.findElement(By.xpath("//input[@id='pass']"));
		String Text2 = element2.getText();
		Actions ac = new Actions(driver);
		ac.moveToElement(txtBank).perform();
	}

}