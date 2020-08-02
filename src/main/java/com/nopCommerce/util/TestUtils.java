package com.nopCommerce.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtils {
	public static final int PAGE_TIME_OUT = 20;
	public static final int IMPLICIT_WAIT=10;

	static JavascriptExecutor js;

	public static WebElement scroll(WebElement element, WebDriver driver) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println("element visible");
		return element;

	}

	public static void clickonElement(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}

	public static WebElement waitForElement(WebElement element, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement alert_close = wait.until(ExpectedConditions.visibilityOf(element));
		return element;

	}
	
public static  String captureScreenshot(String testName,WebDriver driver) {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		String destination=System.getProperty("user.dir")+"/Screenshots/"+testName+getCurrentDate()+".png";
		
		try {
			org.openqa.selenium.io.FileHandler.copy(source, new File(destination));
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return destination;
		


	}
	
	public static String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat customFormat= new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		return customFormat.format(date);
		
	}

	public static String convertPrice(String Sprice) {
		String extractedPrice = "";
		String[] price = Sprice.split("\\.");

		for (char dig : price[0].toCharArray()) {

			if (Character.isDigit(dig)) {

				extractedPrice = extractedPrice + dig;

			}

		}
		return extractedPrice;
	}

}
