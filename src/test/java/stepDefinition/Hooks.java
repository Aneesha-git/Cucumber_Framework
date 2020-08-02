package stepDefinition;

import java.io.IOException;

import com.cucumber.listener.Reporter;
import com.nopCommerce.base.TestBase;
import com.nopCommerce.util.TestUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestBase {

	@Before
	public void beforeScenario(Scenario scenario) {
		Reporter.assignAuthor("nopCommerce -  - Aneeshamol Ismail");
	}

	@After()
	public void afterScenario(Scenario scenario) {

		
		try {
			System.out.println(TestUtils.captureScreenshot(scenario.getName(),driver));
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			Reporter.addScreenCaptureFromPath(screenshotName);
		} catch (Exception e) {
			
			e.getMessage();
		}
		quitBrowser(driver);

	}
	
	}