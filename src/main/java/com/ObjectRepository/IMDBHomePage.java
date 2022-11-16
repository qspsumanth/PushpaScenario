package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDBHomePage {
	
	public IMDBHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver	, this);
	}
		
		@FindBy(xpath = "//input[@type='text']") private WebElement searchTextField;		
		@FindBy(xpath = "//button[@id='suggestion-search-button']") private WebElement searchBtn;
		
		public WebElement getSearchTextField() {
			return searchTextField;
		}
		public WebElement getSearchBtn() {
			return searchBtn;
		}

		
	}


