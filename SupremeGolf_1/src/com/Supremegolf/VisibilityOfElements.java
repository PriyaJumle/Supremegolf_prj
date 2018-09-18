package com.Supremegolf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityOfElements {

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
		
		//visibility of elements
		// providers
		List<WebElement> providers = driver.findElements(By.cssSelector("body > div.l-home-index.js-homepage > div.m-grid.m-grid--home.hidden-xs.hidden-sm.tab-grid > div > ul"));
        for(WebElement i:providers)
        {
            System.out.println(i.getText());
        } 
		
		
       //1
       List<WebElement> myList=driver.findElements(By.cssSelector("body > div.l-home-index.js-homepage > div.m-grid.m-grid--home.hidden-xs.hidden-sm.tab-grid > div > div > div > ul > li:nth-child(3)"));
       System.out.println(myList);
       
       
       //courses , cities
       System.out.println("courses");
      	 List<WebElement> courses = driver.findElements(By.cssSelector(".col-top-100-golf-courses"));
          for(WebElement i:courses)
          {
              System.out.println(i.getText());
          } 
          System.out.println("\n");
          
          Thread.sleep(1000);
          
          System.out.println("cities");
          List<WebElement> citys = driver.findElements(By.className("col-top-golf-cities"));
          for(WebElement i:citys)
          {
              System.out.println(i.getText());
          } 
  		
          //mobile add
         if(driver.findElement(By.xpath("html/body/div[2]/div[8]/div/div")).isDisplayed())
         {
        	 System.out.println("\n"+"mobile add displayed"+"\n");
         }
        	 
      
         //tee time deal near you
        List<WebElement> deals= driver.findElements(By.xpath("html/body/div[2]/div[9]/div[1]"));
        for(WebElement i:deals)
        {
            System.out.println(i.getText()+"\n");
        }
        
        //slider1
       //1st image
        WebElement ImageFile = driver.findElement(By.xpath("//img[contains(@class,'golf-dark')]"));
        
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
             System.out.println("Image 1 not displayed.\n");
        }
        else
        {
            System.out.println("Image 1 displayed.\n");
        }
        
        Thread.sleep(1000);
        //2nd image
       WebElement ImageFile1 = driver.findElement(By.xpath("//img[contains(@class,'birdieable')]"));
        
        Boolean ImagePresent1 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent1)
        {
             System.out.println("Image 2 not displayed.\n");
        }
        else
        {
            System.out.println("Image 2 displayed.\n");
        }
        
        //3rd image
WebElement ImageFile2 = driver.findElement(By.xpath("//img[contains(@class,'tnooz')]"));
        
        Boolean ImagePresent2 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent2)
        {
             System.out.println("Image 3 not displayed.\n");
        }
        else
        {
            System.out.println("Image 3 displayed.\n");
        }
        
        //4th image
        WebElement ImageFile3= driver.findElement(By.xpath("//img[contains(@class,'swing-logo')]"));
        
        Boolean ImagePresent3 = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent3)
        {
             System.out.println("Image 4 not displayed.\n");
        }
        else
        {
            System.out.println("Image 4 displayed.\n");
        }
         
        //text1
        List<WebElement> sliding2=driver.findElements(By.className("slider-item"));
        for (WebElement j: sliding2)
        {
        	System.out.println(j.getText());
        }
        System.out.println("\n");
       Thread.sleep(1000);
       
       //text2
       List<WebElement> sliding3=driver.findElements(By.xpath("html/body/div[2]/div[7]/div/div/div/ul//li[2][@data-duration='4000']"));
       for (WebElement j: sliding3)
       {
       	System.out.println(j.getText());
       }
       System.out.println("\n");
      Thread.sleep(4000);
      
      //header text
      System.out.println("header");
      List<WebElement> header=driver.findElements(By.cssSelector(".m-grid__row"));
      for (WebElement j: header)
      {
      	System.out.println(j.getText());
      }
      System.out.println("\n");
     Thread.sleep(4000);
     
     //heading + profile
     System.out.println("heading + profile");
     List<WebElement> header_p=driver.findElements(By.cssSelector(".m-navbar__sitename.col-sm-12"));
     for (WebElement j: header_p)
     {
     	System.out.println(j.getText());
     }
     System.out.println("\n");
    Thread.sleep(1000); 
    
    //search box n all
    System.out.println("search box n all");
    List<WebElement> search=driver.findElements(By.xpath(".//*[@id='js-home-search']"));
    for (WebElement j: search)
    {
    	System.out.println(j.getText());
    }
    System.out.println("\n");
   Thread.sleep(1000); 
   
   //fewer options
   Thread.sleep(1000);
    System.out.println("fewer options");
    driver.findElement(By.className("m-home-search__advanced")).click();
    Thread.sleep(1000);
   List<WebElement> opt=driver.findElements(By.cssSelector(".m-home-search__advanced"));
   for (WebElement j: opt)
   {
   	System.out.println(j.getText());
   }
   System.out.println("\n");
  Thread.sleep(1000);    
	}

	}

