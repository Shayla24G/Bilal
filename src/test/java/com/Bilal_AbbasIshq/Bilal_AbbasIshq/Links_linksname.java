package com.Bilal_AbbasIshq.Bilal_AbbasIshq;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Links_linksname {

	@Test
	
	public void alllinks () throws Exception {
		
		 	ChromeOptions eb = new ChromeOptions();
			eb.addArguments("--remote-allow-origins=*");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.dell.com/en-us");
			driver.manage().window().maximize();
			
				//for printing number of links
			List<WebElement> links = driver.findElements(By.tagName("a")); // links is variable name
				System.out.println("Totall links of Dell are " + links.size());
			Thread.sleep(3000);
			
				//for printing 1 by 1 links name (adv loop)
			for(int i = 0; i<=links.size();i++) {
				System.out.println(links.get(i).getAttribute("href")); //[to see all the value we use or list giving us all the value is "get" method
																		//attribute name is always "href"]
			}
			
			Thread.sleep(3000);
			driver.quit();
			
	}
}
