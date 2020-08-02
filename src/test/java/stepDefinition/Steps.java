package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;
import com.nopCommerce.base.TestBase;
import com.nopCommerce.pages.HomePage;
import com.nopCommerce.pages.ProductDetailsPage;
import com.nopCommerce.pages.SearchResultsPage;
import com.nopCommerce.pages.ShoppingCartPage;
import com.nopCommerce.util.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends TestBase {

	//WebDriver driver;
	HomePage homePage;
	SearchResultsPage searchResultsPage;
	ProductDetailsPage productDetailsPage;;
	PageObjectManager pageObjectManager;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {

		  startApplication(configdata.getBrowser(), configdata.getUrl());
		Reporter.addStepLog("Application launched");

		 pageObjectManager = new PageObjectManager(driver);

	}

	@When("^User search for \"([^\"]*)\"$")
	public void user_search_for(String searchItem) {

		homePage = pageObjectManager.getHomePage();
		String title = homePage.getTitle();
		Assert.assertEquals("nopCommerce demo store", title);
		
		homePage.performSearch(searchItem);

	}

	@When("^User add the Item to the cart and enter qty \"([^\"]*)\"$")
	public void user_add_the_Item_to_the_cart_and_enter_qty(String qty) {

		searchResultsPage = pageObjectManager.getSearcResultPage();
		productDetailsPage = pageObjectManager.getproductDetailsPage();
		
		// verify the item is displayed on the Search Result Page
		String serachResult = searchResultsPage.verifySearhResult();
		Assert.assertEquals("Apple MacBook Pro 13-inch", serachResult);

		searchResultsPage.clickOn_AddToCart();
		productDetailsPage.EnterQuantity(qty);
		productDetailsPage.clickOn_AddToCart();


	}

	@When("^User view the shopping cart$")
	public void user_view_the_shopping_cart() {

		productDetailsPage.clickOnAddToCart_ShoppingCart();
	}

	@Then("^User should see unit price \"([^\"]*)\" and total price of item \"([^\"]*)\"$")
	public void user_should_see_unit_price_and_total_price_of_item(String unitPrice, String SarchItem) {

		ShoppingCartPage shoppingCartPage =pageObjectManager.getShoppingCartPage();
		shoppingCartPage.checkPrice(unitPrice, SarchItem);
		
	}

}
