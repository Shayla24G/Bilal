package com.Bilal_AbbasIshq.Bilal_AbbasIshq;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dell_prct3 {
	@Test
	
	public void dell3 () throws Exception {
		

		ChromeOptions eb = new ChromeOptions();
		eb.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		
		//Select obj = new Select(driver.findElement(By.id("searchDropdownBox")));
		//obj.selectByVisibleText("search-alias=beauty");
		
		Actions nope = new Actions(driver);
		nope.moveToElement(driver.findElement(By.linkText("Deals"))).build().perform();
		
		driver.findElement(By.xpath("(//span[text()='Clearance'] ")).click();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,700)"); //for scroll down, executeScript is a method
		
		Thread.sleep(3000);
		driver.close();
		
		
	}
}
