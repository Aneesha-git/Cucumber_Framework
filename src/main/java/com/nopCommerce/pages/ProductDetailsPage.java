package com.nopCommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.nopCommerce.util.TestUtils;

public class ProductDetailsPage {

	WebDriver driver;

	@FindBy(id = "product_enteredQuantity_4")
	WebElement txtbx_quantity;

	@FindBy(css = "input#add-to-cart-button-4")
	WebElement btn_AddToCart;

	@FindBy(xpath = "//a/span[text()='Shopping cart']")
	WebElement link_shoppingCart;

	@FindBy(xpath = "//input[@value='Go to cart']")
	WebElement btn_AddToCart_ShoppingCart;

	@FindBy(xpath = "//span[@title='Close']")
	WebElement alert;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void EnterQuantity(String qty) {

		txtbx_quantity.clear();
		txtbx_quantity.sendKeys(qty);
	}

	public void clickOn_AddToCart() {

		btn_AddToCart.click();

		// close the alert
		
		WebElement alert_close = TestUtils.waitForElement(alert, driver);
		alert_close.click();
		Reporter.addStepLog("Item added to the cart");
		Reporter.addStepLog("Alert Closed");

	}

	// Hover to shopping cart
	public void clickOnAddToCart_ShoppingCart() {

		Actions actions = new Actions(driver);
		actions.moveToElement(link_shoppingCart).perform();
		TestUtils.waitForElement(btn_AddToCart_ShoppingCart, driver).click();

	}

}
