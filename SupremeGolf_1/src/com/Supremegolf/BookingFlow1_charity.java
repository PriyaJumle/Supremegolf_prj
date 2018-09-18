/*package com.Supremegolf;


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

*/
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
				driver.findElement(By.xpath(".//*[@id='js-tee-times']/div/div[3]/table/tbody/tr[2]//td[9][@class='action']")).click();//book it button
				Thread.sleep(5000);
				driver.findElement(By.xpath(".//*[@id='book_it_template']/form/div[4]/a")).click();//book instantly button
				
			/*	
			 	CharityFlow charity=new CharityFlow();
				charity.abc(driver);
			*/
				//charity section
				//driver.findElement(By.className("only-number")).sendKeys("20");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.findElement(By.name("donation")).sendKeys("20");//enter amount in text field
				Thread.sleep(500);
				driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[6]/div[2]/div[2]/button[1]")).click();//click on APPLY AMOUNT Button
				Thread.sleep(1000);
				
				/*
				//total due before applying for charity
				String td1=driver.findElement(By.cssSelector(".detail-output")).getText();
				System.out.println(td1);
				String substr2 = "";
				substr2 = td1.substring(1,6);
				System.out.println("substring = " + substr2);
				float f2 = Float.parseFloat(substr2);
				System.out.println(f2);
				*/
				
				
				//checking for charity donation amount and total due by entering amount and APPLY AMOUNT Button
				String c1=driver.findElement(By.cssSelector(".js-donated-amount.detail-output")).getText(); 
				System.out.println(c1);
				String substr = "";
				substr = c1.substring(1,6);
				System.out.println("substring = " + substr);
				float f1 = Float.parseFloat(substr);
				System.out.println("Charity donation: "+ f1);
				
				//total due calculation after charity + apply amount button
				String td=driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[8]/div[2]")).getText();
				//String td=driver.findElement(By.cssSelector(".detail-output")).getText();
				System.out.println(td);
				String substr1= "";
				substr1=td.substring(1,6);
				System.out.println("substring=" + substr1);
				float f3=Float.parseFloat(substr1);
				System.out.println("Total due: "+ f3);
				
				//provider tax
				//String pt=driver.findElement(By.cssSelector(".detail-output")).getText();
				String pt=driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[4]/div[2]")).getText();
				System.out.println(pt);
				String substr2= "";
				substr2=pt.substring(1,5);
				System.out.println("substring=" + substr2);
				float f4=Float.parseFloat(substr2);
				System.out.println("provider tax: "+ f4);
				
				//GREEN FEES
				String gf=driver.findElement(By.xpath(".//*[@id='total']/span")).getText();
				System.out.println(gf);
				int r1 = Integer.parseInt(gf);
				System.out.println("Green fees: "+ r1);
				
				//Total due= green fees + charity + tax
				float totald=r1 + f1 + f4;
				if(totald == f3)
				{
					System.out.println("same");
				}
				else
					System.out.println("different");
				
				//Remove or change donation textlink
				driver.findElement(By.cssSelector(".applied-text.cancel-donation.js-cancel-donation")).click();// results in clearing the text field for entering charity amount
				System.out.println("removed charity");
				
				//round to nearest value
				driver.findElement(By.className("round-donation")).click();//click on round to nearest value button
				
				//getting value for total due 1
				String td1=driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[7]/div[2]")).getText();
				System.out.println(td1);
				String substr3= "";
				substr3=td.substring(1,6);
				System.out.println("substring=" + substr3);
				float f5=Float.parseFloat(substr3);
				System.out.println("Total due1: "+ f5);	
				
				//round due today1 up
				float upround=(float) Math.ceil(f5);
				
				//charity donation by rounding up value
				float ch=upround - f5;
				System.out.println("charity after round up: "+ch);
				
				//total due after roundup
				String total_due_r_up=driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[8]/div[2]")).getText();
				System.out.println(total_due_r_up);
				String substr4= "";
				substr4=total_due_r_up.substring(1, 6);
				float f6=Float.parseFloat(substr4);
				System.out.println("Total due after round up: "+f6);
				
				//checking for correct Total due after round up
				if(f6 == (ch+f5))
				{
					System.out.println("same");
				}
				else
					System.out.println("different");
				
				
				
				
				
				
			  
			  	//applied promo code
				/*driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[5]/div[1]/input")).sendKeys("4FORMORE");//promo code(06/09/2018)
				Thread.sleep(5000);
				driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[5]/div[2]/button")).click();
				
				//without promo code and charity
				
				driver.findElement(By.xpath(".//*[@id='complete_booking']/div[4]/div[13]/span/input")).click();//tick check box
				driver.findElement(By.xpath(".//*[@id='book-now-prepare']")).click();//click on complete booking
				driver.findElement(By.className("close")).click();//click on X 
				*/
				/*
				//check booked tee time in reservation tab		
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@class='sgDropdown']")).click();//dropdown for profile icon
				Thread.sleep(2000);
				driver.findElement(By.id("reservations-link")).click();//click on Reservation link
				*/
				
				
				
				
				
			
			
			
			}

		


	}
