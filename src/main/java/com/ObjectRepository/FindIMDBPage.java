package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindIMDBPage {
	
	public FindIMDBPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[.='Pushpa: The Rise - Part 1']") private WebElement movieName;

	public WebElement getMovieName() {
		return movieName;
	}
}
