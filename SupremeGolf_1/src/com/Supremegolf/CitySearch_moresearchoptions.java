package com.Supremegolf;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CitySearch_moresearchoptions
	{
	public static void main(String[] args) throws Exception {
		
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
		driver.findElement(By.xpath(".//*[@id='q_home']")).sendKeys("Aguila golf course");//search screen
		Thread.sleep(1000);
		System.out.println("course name entered");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div")).click();//click anywhere
		//for More search options dropdown
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='home-search-form']/div/p")).click();//clicked on dropdown 
		Thread.sleep(1000);
		//sort by dropdown (mid)
		driver.findElement(By.xpath(".//*[@id='tee-time-select']/p")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[@id='js-search-dropdown']/ul/li[3]")).click();
		Thread.sleep(1000);
		/*driver.findElement(By.xpath(".//*[@id='home-search-form']/div/div/div[3]/label[1]/p")).click();
		Thread.sleep(1000);*/
		driver.findElement(By.xpath(".//*[@id='home-search-form']/fieldset/button")).click();//search button
		System.out.println(driver.getCurrentUrl());  //url
		Thread.sleep(2000);
		System.out.println("sorted by tee time");
		Thread.sleep(1000);
		//back
		driver.navigate().back();
		//for More search options dropdown
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='home-search-form']/div/p")).click();//clicked on dropdown 
		Thread.sleep(1000);
		//sort by dropdown (aftrenoon)
		driver.findElement(By.xpath(".//*[@id='tee-time-select']/p")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath(".//*[@id='js-search-dropdown']/ul/li[4]")).click();
		Thread.sleep(1000);
		
		
		
	}
	

	
	

	}


/*
@BeforeSuite(alwaysRun = true)
public void setupSuite()
{
	WebDriver driver= new ChromeDriver();
}

@BeforeClass(description = "Set capabilities for your Chrome browser and set time it should wait for a page to load.")

public static void chromeSetUp() throws MalformedURLException {

DesiredCapabilities capability = DesiredCapabilities.firefox();
driver = new ChromeDriver(capability);
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.manage().window().maximize();

}





@BeforeMethod
public void enterUrl() 
{
	System.out.println("BeforeMethod Enter URL");
	driver.get("https://staging.supremegolf.com/letmein");
	System.out.println(driver.getCurrentUrl());
	
}

@BeforeTest
public void LoginMethod() throws Exception 
{
	System.out.println("BeforeTest Login method");
	Thread.sleep(1000);
	driver.findElement(By.className("l-subheader__text")).click();
	driver.findElement(By.id("user_email")).sendKeys("desuza.ann12@gmail.com");
	driver.findElement(By.id("user_password")).click(); 
	driver.findElement(By.id("user_password")).sendKeys("Ann123@");
	Thread.sleep(1000);
	driver.findElement(By.className("btn-orange")).click();//sign-in
}

@Test
public void googlePage()
{
	System.out.println("Test1 supremegolf page");
	driver.findElement(By.xpath(".//*[@id='q_home']")).sendKeys("Dallas");//search screen
	Thread.sleep(1000);
	driver.findElement(By.xpath(".//*[@id='home-search-form']/fieldset/button")).click();//search button
	System.out.println(driver.getCurrentUrl());  //url
	Thread.sleep(2000);
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

@AfterClass(description = "close your chrome driver")

public void afterclass(){
driver.close();
}


@AfterSuite(alwaysRun = true)
public void tearDown() {
driver().close();
}

}
*/
