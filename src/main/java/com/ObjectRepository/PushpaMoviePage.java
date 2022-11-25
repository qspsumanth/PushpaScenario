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
//	@FindBy(xpath = "//a[.='Release date']/parent::li[@role='presentation']/descendant::ul[@role='presentation']") private WebElement movieDate;
//	@FindBy(xpath = "//button[.='Country of origin']/parent::li[@role='presentation']/descendant::ul[@role='presentation']") private WebElement movieCountry;

	public WebElement getReleaseDate() {
		return releaseDate;
	}
	
	public void ReleaseDate() {
		releaseDate.click();
	}
//	public WebElement getMovieDate() {
//		return movieDate;
//	}
//	public WebElement getMovieCountry() {
//		return movieCountry;
//	}
//	
//	public void movieDateAndCountry() {
//	String date = movieDate.getText();
//	System.out.println(date);
//	String country = movieCountry.getText();
//	System.out.println(country);
//	}
	

}
