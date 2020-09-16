package org.sfd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zzaz {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aswin\\eclipse-workspace\\SeleniumFirstDay\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("one pluse8",Keys.ENTER);

		WebElement productlink=driver.findElement(By.xpath("//span[text()='OnePlus 8 (Glacial Green 6GB RAM+128GB Storage)']"));
		productlink.click();
		
		WebElement addcart=driver.findElement(By.id("add-to-cart-button"));
		addcart.click();

		driver.quit();
	}
}