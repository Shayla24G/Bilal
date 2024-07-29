package com.Bilal_AbbasIshq.Bilal_AbbasIshq;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dell_prct {

	@Test
	
	public void dell () throws Exception {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Chrome_Driver\\chromedriver.exe");
		
		ChromeOptions eb = new ChromeOptions();
		eb.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
		
		Actions ab = new Actions(driver); //ab is objct
		ab.moveToElement(driver.findElement(By.xpath("//span[text()='APEX']"))).build().perform();
		
		driver.findElement(By.linkText("APEX High Performance Computing")).click();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		
		Thread.sleep(4000);
		driver.close();
	}
		
}
