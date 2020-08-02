package com.nopCommerce.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.listener.Reporter;
import com.nopCommerce.util.TestUtils;

import static org.junit.Assert.*;

public class ShoppingCartPage {

	WebDriver driver;

	@FindBy(xpath = "//div[@class='table-wrapper']/table//tbody")
	WebElement table_shoppingcart;

	public ShoppingCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void checkPrice(String unitPrice, String searchItem) {

		String search_item = "Apple MacBook Pro 13-inch";
		String unitPrice_Actual;
		int total_Price;
		List<WebElement> rows = table_shoppingcart.findElements(By.tagName("tr"));
		List<WebElement> columns = rows.get(0).findElements(By.tagName("td"));
		
		int rowcount = rows.size();
		System.out.println(rowcount);

		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> columns1 = rows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < columns.size(); j++) {
				if (search_item.equals(columns.get(j).getText())) {
					unitPrice_Actual = columns.get(j + 1).getText();

					Reporter.addStepLog("ExtectedUnitPrice : " + unitPrice + " Actual UnitPrice : " + unitPrice_Actual);

					assertEquals(unitPrice, unitPrice_Actual);
					int col = j + 3;
					int row=i+1;
					// calculate total price
					String qty = driver.findElement(By.xpath(
							"//div[@class='table-wrapper']/table//tbody/tr[" + row + "]/td[" + col + "]/input"))
							.getAttribute("value");
					
					
					total_Price = Integer.parseInt(TestUtils.convertPrice(unitPrice)) * Integer.parseInt(qty);
					
					

					Reporter.addStepLog("ExtectedTotalPrice : " + "$" + total_Price +".00"+ "" + " Actual Total : "
							+ "$"+TestUtils.convertPrice(columns.get(j + 3).getText())+".00");
					assertEquals(total_Price + "", TestUtils.convertPrice(columns.get(j + 3).getText()));
				}
			}
		}

	}

}
