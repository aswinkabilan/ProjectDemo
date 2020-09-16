package org.sfd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSelenium {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aswin\\eclipse-workspace\\SeleniumFirstDay\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	
	WebElement txtQs=driver.findElement(By.id("heading20"));
	txtQs.click();
	
	WebElement txtCts=driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
	txtCts.click();

}
WebElement txtJava=driver.findElement(By.xpath( "(//a[@href='http://traininginchennai.in/core%20java%20material.pdf'])[2]"));
txtJava.click();