package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReleaseInfoPage {
	
	public ReleaseInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//table[@class='ipl-zebra-list ipl-zebra-list--fixed-first release-dates-table-test-only']/descendant::a[contains(.,'India')]") private WebElement countryName;
	@FindBy(xpath = "//table[@class='ipl-zebra-list ipl-zebra-list--fixed-first release-dates-table-test-only']/descendant::a[contains(.,'India')]/ancestor::tr[@class='ipl-zebra-list__item release-date-item']/td[@class='release-date-item__date']") private WebElement releaseDate;
	
	public WebElement getCountryName() {
		return countryName;
	}
	public WebElement getReleaseDate() {
		return releaseDate;
	}
	
	public void CountryName() {
		String country = countryName.getText();
		System.out.println(country);
	}
	
	public void ReleaseDate() {
		String date = releaseDate.getText();
		System.out.println(date);
	}
	
	

}
