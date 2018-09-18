package com.Supremegolf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class City_SearchFlow {

				public static void main(String[] args) throws Exception 
				{
					System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver= new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://staging.supremegolf.com/letmein");
					System.out.println(driver.getCurrentUrl());// URL
					Thread.sleep(1000);
					driver.findElement(By.className("l-subheader__text")).click();
					driver.findElement(By.id("user_email")).sendKeys("desuza.ann12@gmail.com");
				    driver.findElement(By.id("user_password")).click(); 
					driver.findElement(By.id("user_password")).sendKeys("Ann123@");
					Thread.sleep(1000);
					driver.findElement(By.className("btn-orange")).click();
					Thread.sleep(2000);
					System.out.println(driver.getCurrentUrl());  //URL
					Thread.sleep(2000);
					driver.findElement(By.xpath(".//*[@id='q_home']")).sendKeys("Dallas");//search screen
					Thread.sleep(1000);
					driver.findElement(By.xpath(".//*[@id='home-search-form']/fieldset/button")).click();//search button
					System.out.println(driver.getCurrentUrl());  //url
					Thread.sleep(2000);
				/*
					//Handling Drop down
					driver.findElement(By.className("sgSort-selected")).click();
					Thread.sleep(500);
				*/
					//ascending price
					//driver.findElement(By.xpath(".//*[@id='js-tee-times']/h4/span[4]/div/ul/li[2]")).click();
					//driver.findElement(By.className("m-masthead")).click();
					//Thread.sleep(2000);
					
					
					//price
					List<WebElement> courses =driver.findElements(By.className("m-infobox--wide"));
			 		int size1=courses.size();
			 		System.out.println(size1+"\n");
			 		Thread.sleep(2000);
			 		int i=4;
			 		/*
			 		//ascending price
			 		for (int j = 0; j <= size1 - 1; j++) 
			 		{
			 			String p1 = driver.findElement(By.xpath(".//*[@id='js-tee-times']//div["+i+"]//div[@class='dollars']")).getText();
						System.out.println(p1);
						int k = i + 2;
						String p2 = driver.findElement(By.xpath(".//*[@id='js-tee-times']//div["+k+"]//div[@class='dollars']")).getText();
						i = k;
						System.out.println(p2);
						int r1 = Integer.parseInt(p1);
						int r2 = Integer.parseInt(p2);
						if (r1 <= r2) 
						{
							System.out.println(r1+" less");
						}
					}
			 		Thread.sleep(2000);
			 		//Handling Drop down
					driver.findElement(By.className("sgSort-selected")).click();
					Thread.sleep(500);
					*/
			 		/*
					//descending price
					driver.findElement(By.xpath(".//*[@id='js-tee-times']/h4/span[4]/div/ul/li[3]")).click();
					driver.findElement(By.className("m-masthead")).click();
					Thread.sleep(2000);
					
					i=4;
			 		 
			 		//descending price
			 		for (int j = 0; j <= size1 - 1; j++) 
			 		{
									
							String p1 = driver.findElement(By.xpath(".//*[@id='js-tee-times']//div["+i+"]//div[@class='dollars']")).getText();
							System.out.println(p1);
							int k = i + 2;
							String p2 = driver.findElement(By.xpath(".//*[@id='js-tee-times']//div["+k+"]//div[@class='dollars']")).getText();
							i = k;
							System.out.println(p2);
							int r1 = Integer.parseInt(p1);
							int r2 = Integer.parseInt(p2);
							// p1=p2;

							if (r1 >= r2)
							{
								System.out.println(r1+" greater");
							}
						
					}
					
					Thread.sleep(2000);
			 		//Handling Drop down
					driver.findElement(By.className("sgSort-selected")).click();
					Thread.sleep(500);
			 		*/
					/*
					//ascending name
					driver.findElement(By.xpath(".//*[@id='js-tee-times']/h4/span[4]/div/ul/li[4]")).click();
					driver.findElement(By.className("m-masthead")).click();
					Thread.sleep(2000);
					
					
					//ascending alphabetical
			 		List<WebElement> courses1=driver.findElements(By.className("m-infobox--wide"));
			 		int size2=courses1.size();
			 		System.out.println(size2+"\n");
			 		Thread.sleep(2000);
			 		int i1=4;
			 		List<WebElement> elementList=driver.findElements(By.className("m-infobox--wide"));
			 		ArrayList<String> obtainedList = new ArrayList<>(); 
					
					for(WebElement  we: elementList)
					{
						   obtainedList.add(we.getText());
					}
						ArrayList<String> sortedList = new ArrayList<>();   
						for(String s:obtainedList)
							{
								sortedList.add(s);
							}
						
						//if(order.equalsIgnoreCase("ASC"))
						//{
						//ascending sort	
						Collections.sort(sortedList);
						VerifyError.class.equals(obtainedList);
						//assertTrue(sortedList.equals(obtainedList));
						System.out.println("Asc Sort Successfully");
					*/	
						
						/*
						Thread.sleep(2000);
				 		//Handling Drop down
						driver.findElement(By.className("sgSort-selected")).click();
						Thread.sleep(500);
						
					
						//descending name
						driver.findElement(By.xpath(".//*[@id='js-tee-times']/h4/span[4]/div/ul/li[5]")).click();
						driver.findElement(By.className("m-masthead")).click();
						Thread.sleep(2000);
						
						//descending alphabetically
				 		 
							List<WebElement> courses2=driver.findElements(By.className("m-infobox--wide"));
					 		int size3=courses.size();
					 		System.out.println(size3+"\n");
					 		Thread.sleep(2000);
					 		int i2=4;
					 		List<WebElement> elementList1=driver.findElements(By.className("m-infobox--wide"));
					 		ArrayList<String> obtainedList1 = new ArrayList<>(); 
							
							for(WebElement  we: elementList1)
								{
								   obtainedList1.add(we.getText());
								}
								ArrayList<String> sortedList1 = new ArrayList<>();   
								for(String s:obtainedList1)
									{
										sortedList1.add(s);
									}
								
							//descending sort alphabetically
								Collections.sort(sortedList1);
								Collections.reverse(sortedList1);
								VerifyError.class.equals(obtainedList1);
								//Assert.assertTrue(sortedList.equals(obtainedList));
								System.out.println("Desc Sort Successfully");
								
								*/	
			 		/*
								Thread.sleep(2000);
						 		//Handling Drop down
								driver.findElement(By.className("sgSort-selected")).click();
								Thread.sleep(500);
								
								//courses rating
								driver.findElement(By.xpath(".//*[@id='js-tee-times']/h4/span[4]/div/ul/li[6]")).click();
								driver.findElement(By.className("m-masthead")).click();
														 			
						 		//ratings
								
								List<WebElement> stars1 =driver.findElements(By.className("m-infobox--wide"));
						  		int size11=stars1.size();
						 		System.out.println(size11+"\n");
						 		Thread.sleep(500);
						 		
								
								int	j=4,size21=0,j1=0,size31=0;
							
								for( j1=0;j1<=size11-1;j1++)
								  {
										//for full star
										List<WebElement> stars2 = driver.findElements(By.xpath(".//*[@id='js-tee-times']//div["+j+"]//span[@class='icon-star-full']"));
										System.out.println(".//*[@id='js-tee-times']//div["+j+"]//span[@class='icon-star-full']");
										size21=stars2.size();
										 System.out.println("star_full: "+size21);
										
									 
										//for half star
										List<WebElement> stars3 = driver.findElements(By.xpath(".//*[@id='js-tee-times']//div["+j+"]//span[@class='icon-star-half']"));
										//System.out.println("size of stars: "+" "+i1+" " +stars2.size());
										 size31=stars3.size();
										 System.out.println("star_half: "+size31+"\n");
										 j=j+2;
								  }
								  */
				
								
								//driver.findElement(By.className("sgSort-selected")).click();
								//Thread.sleep(2000);					
								//driver.findElement(By.xpath(".//*[@id='js-tee-times']/h4/span[4]/div/ul/li[5]")).click();//sort//	
								//Thread.sleep(2000);
								driver.findElement(By.xpath(".//*[@id='js-tee-times']/h4/span[3]/div/div")).click();//calendar picker
								Thread.sleep(500);
								driver.findElement(By.xpath("//*[@id=\"js-tee-times\"]/div[3]/div[22]")).click();//selected date
								Thread.sleep(500);
								driver.findElement(By.xpath(".//*[@id='course_21608']/div[2]/a/div")).click();//course image to select
								System.out.println(driver.getCurrentUrl());  //url
								driver.navigate().back();
								driver.findElement(By.xpath(".//*[@id='course_21608']/div[3]/span[2]/h3[1]/a")).click();//click on name of course
								System.out.println(driver.getCurrentUrl());  //url
								driver.navigate().back();
								Thread.sleep(2000);
								driver.findElement(By.xpath(".//*[@id='course_21613']/div[4]/a")).click();;//quick tee time
								Thread.sleep(2000);
								driver.findElement(By.className("icon-fav-course")).click();//add to favourite
								Thread.sleep(1000);
								driver.findElement(By.xpath(".//*[@id='21613']/a/div[1]")).click();//add price list
								Thread.sleep(500);
								driver.findElement(By.xpath(".//*[@id='21613']/div[2]/div/div[1]")).click();//close window for price alert
								Thread.sleep(2000);
								driver.findElement(By.xpath(".//*[@id='course_21613']/div[1]/div")).click();//select stars for review
								System.out.println(driver.getCurrentUrl());  //url
								Thread.sleep(2000);
								driver.navigate().back();
								driver.navigate().refresh();
								System.out.println(driver.getCurrentUrl());  //url
								driver.navigate().refresh();
								driver.findElement(By.xpath(".//*[@id='city-list-view']/div/div[1]/div/div[1]/div/div/div/div[2]/a[1]")).click();//social links
				
				}
}
								
													
					
					
					
					
					
					
					
					
					
					
							
			 		
			 		
			 		
			 		
				
			 		
			 		
					
					
					
			 		
			 		
			 		
			 		
			 		
			 		
			 		
					
					
					 		
					 
					
					
					
				
				
				
				
				
				
				

				

				
				





			


