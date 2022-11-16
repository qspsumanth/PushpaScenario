package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WIKIHomePage {
	public WIKIHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='vector-search-box-input']") private WebElement searchTextField;
	@FindBy(xpath = "//input[@id='searchButton']") private WebElement searchBtn;
	@FindBy(xpath = "//div[.='Release date']/ancestor::tr/child::td[@class='infobox-data']") private WebElement movieDate;
	@FindBy(xpath = "//th[.='Country']/parent::tr/child::td[@class='infobox-data']") private WebElement movieCountry;
	
	
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getMovieDate() {
		return movieDate;
	}
	public WebElement getMovieCountry() {
		return movieCountry;
	}
	
	
	public void movieDateAndCountry() {
		String date = movieDate.getText();
		System.out.println(date);
		String country = movieCountry.getText();
		System.out.println(country);
	}
	
	
	

}
