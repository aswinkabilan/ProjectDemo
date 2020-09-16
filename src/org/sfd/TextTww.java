package org.sfd;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextTww {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aswin\\eclipse-workspace\\SeleniumFirstDay\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		
		
		
		WebElement txtFrom =driver.findElement(By.xpath("//div[@class='BHzsHc']"));
		txtFrom.click();
		
		WebElement txtEmail =driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("aswinkabilan@gmail.com");
		
		WebElement txtNext =driver.findElement(By.xpath("//div[@class='BHzsHc']"));
		txtNext.click();
		Robot r=new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);	
		
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
		
		driver.quit();
	}
	
}
WebElement txt2 = driver.findElement(By.xpath("//a[text()='Online Courses']"));

js.executeAsyncScript("arguments[0].scrollIntoView(true)",txt2);
