package com.GenericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass{
	public static WebDriver driver;
	
	@BeforeClass
	public void launchTheBrowser() throws Throwable
	{  
	
		WebDriverUtility wlib=new WebDriverUtility();
		FileUtility flib=new FileUtility();
		String baseURL = flib.getPropertKeyValue("baseURL");
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get(baseURL);
		wlib.waitForPageToLoad(driver);
		driver.manage().window().maximize();
	
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
