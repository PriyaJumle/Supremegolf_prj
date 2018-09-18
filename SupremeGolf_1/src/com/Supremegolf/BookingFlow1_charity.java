package com.Supremegolf;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.sourceforge.htmlunit.corejs.javascript.regexp.SubString;

public class BookingFlow1_charity extends CharityFlow{


			public static void main(String[] args) throws Exception 
			{
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://staging.supremegolf.com/letmein");
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(1000);
				driver.findElement(By.className("l-subheader__text")).click();
				driver.findElement(By.id("user_email")).sendKeys("desuza.ann12@gmail.com");
				driver.findElement(By.id("user_password")).click(); 
				driver.findElement(By.id("user_password")).sendKeys("Ann123@");
				Thread.sleep(1000);
				driver.findElement(By.className("btn-orange")).click();//sign-in
						
				Thread.sleep(5000);
				
				driver.findElement(By.xpath(".//*[@id='q_home']")).sendKeys("Aguila Golf Course");//entered name of course
				Thread.sleep(5000);
				driver.findElement(By.xpath(".//*[@id='home-search-form']/fieldset/button")).click();//clicked on search icon
				Thread.sleep(5000);
				driver.findElement(By.xpath(".//*[@id='js-tee-times']/div/div[3]/table/tbody/tr[2]//span[contains(text(), 'Book It')]")).click();//book it button
				Thread.sleep(5000);
				driver.findElement(By.xpath(".//*[@id='book_it_template']/form/div[4]/a")).click();//book instantly button
				
				// change date to 14-09-2018 for ace deal
				driver.findElement(By.xpath(".//*[@id='js-tee-times']/h4/span[3]/a/span")).click();//Calendar
				driver.findElement(By.xpath(".//*[@id='js-tee-times']/h4/span[3]/a/span")).click();//Calendar
				
			}

		


	}

