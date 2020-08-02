package com.nopCommerce.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;

import static org.junit.Assert.*;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(id="small-searchterms")
	WebElement txtbx_search;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btn_search;
	
	public HomePage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		 }
	
	public String getTitle() {
		 return driver.getTitle();
		
	}

	
	public void performSearch(String searchItem) {
		txtbx_search.sendKeys(searchItem);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		Reporter.addStepLog("Entered the search item : "+ searchItem);
		
	}

}
