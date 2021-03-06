package com.Supremegolf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Promocode_AceDeal {

	public static void main(String[] args) throws Exception {
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
		
		
		// change date to 15-09-2018 for ace deal
		driver.findElement(By.xpath(".//*[@id='js-tee-times']/h4/span[3]/a/span")).click();//Calendar
		//Thread.sleep(1000);
		WebDriverWait wait=new WebDriverWait(driver,30); 
		WebElement Element = ((FluentWait<WebDriver>) wait).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='tee_time_663634185']/td[9]/a/span")));
		
		driver.findElement(By.xpath(".//*[@id='tee_time_663634185']/td[9]/a/span")).click();//book it button
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='book_it_template']/form/div[4]/a")).click();//book instantly button
		
		
		/*
		//applied charity + default promocode
		WebDriverWait wait1=new WebDriverWait(driver, 30);
		WebElement Element1=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='complete_booking']/div[4]/div[7]/div[2]/div[1]/input")));
		
		driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[7]/div[2]/div[1]/input")).sendKeys("20");
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[7]/div[2]/div[2]/button[1]")).click();
		*/
		
		/*
		//remove promo code + apply charity
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[5]/div[2]/button")).click(); //remove code button
		Thread.sleep(1000);
		*/
		
		//apply amount + default promo code
		//driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[7]/div[2]/div[1]/input")).sendKeys("20");
		
		//no thanks button
		Thread.sleep(1000);
		//driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[7]//button[@class = 'js-hide-charity']")).click();
		//driver.findElement(By.cssSelector(".js-charity-section > div.charity-actions-web-container > div.detail-output.cust-amount.cust-amount-btn > button.btn.btn-gray.hide-charity-btn.js-hide-charity")).click();
		
		

	}

}
