package com.nopCommerce.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.nopCommerce.util.TestUtils;

public class SearchResultsPage {
	
	WebDriver driver;	
	
	@FindBy(xpath="//input[@value='Add to cart' and @type='button']")
	WebElement btn_AddTOCart;
	
	@FindBy(xpath="//div[@class='details']//a[contains(text(),'Apple MacBook Pro 13-inch')]")
	WebElement searchItem;
	
	public SearchResultsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOn_AddToCart() {			
		TestUtils.clickonElement(btn_AddTOCart);
	}
	
	public String verifySearhResult() {
		TestUtils.scroll(btn_AddTOCart, driver);	
		return searchItem.getText();
	}

}
