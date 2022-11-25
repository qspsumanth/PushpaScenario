package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PushpaMoviePage {
	
	public PushpaMoviePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[.='Release date']") private WebElement releaseDate;

	public WebElement getReleaseDate() {
		return releaseDate;
	}
	
	public void ReleaseDate() {
		releaseDate.click();
	}

	

}
