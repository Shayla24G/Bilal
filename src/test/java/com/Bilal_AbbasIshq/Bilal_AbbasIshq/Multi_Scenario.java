package com.Bilal_AbbasIshq.Bilal_AbbasIshq;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Multi_Scenario {
	
	@Test
	public void  Scenario () throws Exception {
		    ChromeOptions eb = new ChromeOptions();
			eb.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.dell.com/en-us");
			driver.manage().window().maximize();
			
			WebElement Search = driver.findElement(By.id("mh-search-input"));
			Search.sendKeys(Keys.SHIFT,"monitor");
			Search.sendKeys(Keys.ENTER);
			
			Thread.sleep(4000);
			driver.quit();
	}
	
	
	
}
