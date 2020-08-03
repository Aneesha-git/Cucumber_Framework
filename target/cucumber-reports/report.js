$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("priceCheck.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: aneeshamol Ismail"
    }
  ],
  "line": 3,
  "name": "End To End flow to check the unit and total price of an item",
  "description": "The purpose of this feature to check the unit and total price of an item by adding quantity 5 in the cart",
  "id": "end-to-end-flow-to-check-the-unit-and-total-price-of-an-item",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4425800,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Check the Unit Price and Total price of an item",
  "description": "",
  "id": "end-to-end-flow-to-check-the-unit-and-total-price-of-an-item;check-the-unit-price-and-total-price-of-an-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User search for \"Apple MacBook Pro 13-inch\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User add the Item to the cart and enter qty \"5\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User view the shopping cart",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should see unit price \"$1,800.00\" and total price of item \"Apple MacBook Pro 13-inch\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 156256000,
  "error_message": "org.openqa.selenium.WebDriverException: Cannot find firefox binary in PATH. Make sure firefox is installed. OS appears to be: WIN10\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027RENI-XPS13\u0027, ip: \u0027192.168.1.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.1\u0027\nDriver info: driver.version: FirefoxDriver\r\n\tat org.openqa.selenium.firefox.FirefoxBinary.\u003cinit\u003e(FirefoxBinary.java:116)\r\n\tat org.openqa.selenium.firefox.FirefoxOptions.getBinary(FirefoxOptions.java:218)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.toExecutor(FirefoxDriver.java:155)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:120)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:98)\r\n\tat com.nopCommerce.base.TestBase.startApplication(TestBase.java:33)\r\n\tat stepDefinition.Steps.user_is_on_Home_Page(Steps.java:32)\r\n\tat ✽.Given User is on Home Page(priceCheck.feature:9)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple MacBook Pro 13-inch",
      "offset": 17
    }
  ],
  "location": "Steps.user_search_for(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 45
    }
  ],
  "location": "Steps.user_add_the_Item_to_the_cart_and_enter_qty(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.user_view_the_shopping_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "$1,800.00",
      "offset": 28
    },
    {
      "val": "Apple MacBook Pro 13-inch",
      "offset": 64
    }
  ],
  "location": "Steps.user_should_see_unit_price_and_total_price_of_item(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1784500,
  "error_message": "java.lang.NullPointerException\r\n\tat com.nopCommerce.base.TestBase.quitBrowser(TestBase.java:49)\r\n\tat stepDefinition.Hooks.afterScenario(Hooks.java:32)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
});