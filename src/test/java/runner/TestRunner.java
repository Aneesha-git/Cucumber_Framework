package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.nopCommerce.util.ConfigDataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue = { "stepDefinition" }, 
		dryRun = false, 
		strict = true, 
		plugin = { "pretty",
		"json:target/cucumber-reports/Cucumber.json", "junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports" ,
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentReport.html"}, 
		
		monochrome = true)

public class TestRunner {
	
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new ConfigDataProvider().getreportConfigPath());
	 }

}
