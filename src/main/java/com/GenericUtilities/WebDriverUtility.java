package com.GenericUtilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Sumanth H A
 *
 */
public class WebDriverUtility {
	/**
	 * to maximize the browser
	 * @param driver
	 */
	public void maximizeTheWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * to get navigate to next page
	 * @param driver
	 */
	public void forwardToNextPage(WebDriver driver, String url)
	{
		driver.navigate().to(url);
	}
	
	/**
	 * it is used to perform scrollBar Actions
	 * @param driver
	 */
	public void scrollBarAction(WebDriver driver)
	{
		JavascriptExecutor javaScript = (JavascriptExecutor)driver;
		javaScript.executeScript("window.scrollBy(0,7500)");
	}
	/**
	 *it will wait for 10 seconds till the page gets load.
	 * @param driver
	 */
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IConstants.implicitlyWaitDuration));
	}
}
