package com.TestGolf;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGolf {
	
	/*BeforeSuite -- setup system browser
	BeforeTest -- Login method
	BeforeClass -- Launch chrome browser
	BeforeMethod -- Enter URL
	Test1 -- Google page
	AfterMethod -- LOg out method
	BeforeMethod --  Enter URL
	Test2 -- Yahoo page
	AfterMethod -- LOg out method
	AfterClass -- close Browser
	AfterTest -- deleted cookies
	PASSED: googlePage
	PASSED: yahooPage

	===============================================
	    Default test
	    Tests run: 2, Failures: 0, Skips: 0
	===============================================

	AfterSuite -- Test Report*/
	
	
	@BeforeSuite
	public void setup() {
		System.out.println("BeforeSuite setup system browser");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BeforeClass Launch chrome browser");
		
	}
	
	@BeforeMethod
	public void enterUrl() 
	{
		System.out.println("BeforeMethod Enter URL");
		
	}
	
	@BeforeTest
	public void LoginMethod() 
	{
		System.out.println("BeforeTest Login method");
	}
	
	@Test
	public void googlePage()
	{
		System.out.println("Test1 Google page");
	}
	
	@Test
	public void yahooPage()
	{
		System.out.println("Test2 Yahoo page");
	}
	
	@AfterMethod
	public void logout() 
	{
		System.out.println("AfterMethod LOg out method");
	}
	
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("AfterTest deleted cookies");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AfterClass close Browser");
	}
	
	@AfterSuite
	public void generateTestrReport()
	{
		System.out.println("AfterSuite Test Report");
	}
	
	
	
	
	

}
