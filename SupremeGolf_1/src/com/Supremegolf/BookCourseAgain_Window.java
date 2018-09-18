package com.Supremegolf;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookCourseAgain_Window {

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
		driver.findElement(By.xpath(".//*[@id='js-tee-times']/div/div[3]/table/tbody/tr[2]//span[contains(text(), 'Book It')]")).click();//book it button
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='book_it_template']/form/div[4]/a")).click();//book instantly button
	
		//charity section
		//driver.findElement(By.className("only-number")).sendKeys("20");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("donation")).sendKeys("20");//enter amount in text field
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[6]/div[2]/div[2]/button[1]")).click();//click on APPLY AMOUNT Button
		Thread.sleep(1000);
		
		//select check boxes for terms and conditions
		driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[7]/div//input[@class= 'js-charity-tc-input']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[14]/span/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='book-now-prepare']")).click();
		System.out.println(driver.findElement(By.xpath("html/body/div[6]/div[2]/div/div[2]/div/form/div[3]/div[6]")).getText());
		

	}

}
