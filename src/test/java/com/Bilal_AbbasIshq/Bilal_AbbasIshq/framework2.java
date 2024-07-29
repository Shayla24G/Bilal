package com.Bilal_AbbasIshq.Bilal_AbbasIshq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class framework2 {
	
	@Test
	
	public void frame () throws Exception {
		ChromeOptions eb = new ChromeOptions();
		eb.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("Index")).click();
		Thread.sleep(4000);
	}
}
