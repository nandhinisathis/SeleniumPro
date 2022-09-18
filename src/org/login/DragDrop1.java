package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\eclipse-jee-photon-R-win32-x86_64\\SeleniumFirstChrome\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dest = driver.findElement(By.id("bank"));
		
		Actions ac=new Actions(driver);
		ac.dragAndDrop(source, dest).perform();
		
		WebElement source1 = driver.findElement(By.id("fourth"));
		WebElement dest1 = driver.findElement(By.id("amt7"));
		ac.dragAndDrop(source1, dest1).perform();
		
		WebElement src = driver.findElement(By.id("credit1"));
		WebElement dst = driver.findElement(By.id("loan"));
		ac.dragAndDrop(src, dst).perform();
		
		WebElement src1 = driver.findElement(By.id("fourth"));
		WebElement desti1 = driver.findElement(By.id("amt8"));
		ac.dragAndDrop(src1, desti1).perform();
	
		
	}

}
