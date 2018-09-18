package com.golf_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign_in {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.golf.com/");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.findElement(By.className("menu-button")).click(); //click on --- menu
		Thread.sleep(1000);
		driver.findElement(By.xpath("html/body/nav/div/ul/li[15]//a[contains(text(), 'Book Tee Times')]")).click();//click on BOOK TEE TIMES
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='ember590']/a")).click();//SIGN IN/UP
		Thread.sleep(1000);
		driver.findElement(By.id("field-email")).sendKeys("rupchand.jagadale@definelabs.com");
		Thread.sleep(1000);
		driver.findElement(By.id("field-password")).sendKeys("test1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ember855\"]/div[3]/input")).click();//SIGN IN Button
		
		

	}

}
