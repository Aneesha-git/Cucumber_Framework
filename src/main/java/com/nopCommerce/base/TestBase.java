package com.nopCommerce.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.nopCommerce.util.ConfigDataProvider;
import com.nopCommerce.util.PageObjectManager;
import com.nopCommerce.util.TestUtils;



public class TestBase {
	public static WebDriver driver;
	public ConfigDataProvider configdata;
	public PageObjectManager pageObjectManager;
	
	public TestBase() {
		configdata = new ConfigDataProvider();
	}
	
	public  void startApplication(String browserName,String url) {
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir" )+"/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir" )+"/Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("browser not supported");
		}
		
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_TIME_OUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		//return driver;
		
	
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
	
	
	
	

}
