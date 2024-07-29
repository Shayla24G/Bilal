package com.Bilal_AbbasIshq.Bilal_AbbasIshq;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ebay_prct {
	 
	@Test
	 
	public void  dropdown () throws Exception {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Chrome_Driver\\chromedriver.exe");
		
		ChromeOptions eb = new ChromeOptions();
		eb.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		Select obj = new Select (driver.findElement(By.id("gh-cat")));
		//obj.selectByValue("11450");
		obj.selectByVisibleText("Health & Beauty");
		
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		
		Thread.sleep(3000);
		driver.close();
	}
}
