package com.Supremegolf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CharityFlow {
/*
	 void abc(WebDriver driver)  {
			
//			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
//			WebDriver driver= new ChromeDriver();
	*/		
			public static void main(String[] args) throws Exception  {
				
				WebDriver driver=new ChromeDriver();
				//Entering amount in text field click on Apply amount
				driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[6]/div[2]/div[1]/input")).sendKeys("20");
				driver.findElement(By.className("btn-orange")).click();
				Thread.sleep(1000);
				
			}
			
			
		 
		 

	}

	


