 package com.Bilal_AbbasIshq.Bilal_AbbasIshq;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class windowhandle {
 
	@Test
	
	public void WindowHandles() throws Exception {
		
		    ChromeOptions eb = new ChromeOptions();
			eb.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.paychex.com/");
			driver.manage().window().maximize();
			
			WebElement loging = driver.findElement(By.linkText("Login")); //log in is owner[WebElement is IN ,holding this webelement 
			loging.click();												//(driver.findElement(By.linkText("Login")) with this WebElement]
			
			WebElement loging2 = driver.findElement(By.linkText("Paychex Flex login"));
			loging2.click();
			
			Set<String> window = driver.getWindowHandles(); //[ for handaling window, getWindowHandles is method, getWindowHandles give set of string
			Iterator<String> ite= window.iterator(); 		//ite is variable, Iterator is a method given by set,
															//Iterator job is moving.moving from 1 window to another window]
			
			String fatherwindow = ite.next(); //Iterator is given one of method next
			String childwindow = ite.next(); //fisrt go childwindow then go to fatherwindow 
			Thread.sleep(3000);
			
			driver.switchTo().window(childwindow);  // selenium given one of method by switchTo().window
			Thread.sleep(4000);
			System.out.println("Let's print something");
			
			//boolean namePassword = driver.findElement(By.linkText("Forgot Username or Password?")).isDisplayed(); ////isDidplayed is method for verifying
			//Assert.assertTrue(namePassword);
			Thread.sleep(3000);
			
			driver.switchTo().window(fatherwindow);
			System.out.println("Let's print something again");
			Thread.sleep(5000);
			driver.quit();  
			
	}
	
}
