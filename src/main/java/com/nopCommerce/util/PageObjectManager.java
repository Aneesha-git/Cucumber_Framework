package com.nopCommerce.util;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.WebDriver;

import com.nopCommerce.pages.HomePage;
import com.nopCommerce.pages.ProductDetailsPage;
import com.nopCommerce.pages.SearchResultsPage;
import com.nopCommerce.pages.ShoppingCartPage;

public class PageObjectManager {

	private WebDriver driver;

	private HomePage homePage;
	private ProductDetailsPage productDetailsPage;
	private SearchResultsPage searchResultPage;
	private ShoppingCartPage shoppingCartPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}

	public HomePage getHomePage() {

		return (homePage == null) ? homePage = new HomePage(driver) : homePage;

	}

	public ProductDetailsPage getproductDetailsPage() {
		return (productDetailsPage == null) ? productDetailsPage = new ProductDetailsPage(driver) : productDetailsPage;

	}
	
	public SearchResultsPage getSearcResultPage() {
		return (searchResultPage == null) ? searchResultPage = new SearchResultsPage(driver) : searchResultPage;
		
	}
	
	public ShoppingCartPage getShoppingCartPage() {
		return (shoppingCartPage == null) ? shoppingCartPage = new ShoppingCartPage(driver) : shoppingCartPage;
		
		
	}
}
