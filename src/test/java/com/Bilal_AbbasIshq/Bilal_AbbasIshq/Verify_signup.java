package com.Bilal_AbbasIshq.Bilal_AbbasIshq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_signup {

	@Test
	public void signup () throws Exception  {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Chrome_Driver\\chromedriver.exe");
		 ChromeOptions he = new ChromeOptions();
		 he.addArguments ("--remote-allow-origins=*");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.demoblaze.com/");
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.linkText("Sign up")).click();
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("sign-username")).sendKeys("CTG2024");
		 driver.findElement(By.id("sign-password")).sendKeys("sign-password");
		 driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		 Thread.sleep(6000);
		 
		 driver.switchTo().alert().accept();
			
	     boolean love = driver.findElement(By.xpath("//a[text()='Welcome CTG2024']")).isDisplayed(); //isDidplayed is method for verifying
	     Thread.sleep(3000);
		 
	     Assert.assertTrue(love);   //Verify user login successfully
		 //Thread.sleep(7000);
		 driver.close();
		 
		 
	}
	 
}
