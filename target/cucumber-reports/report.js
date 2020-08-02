$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("priceCheck.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 19,
  "name": "End To End flow to check the unit and total price of an item",
  "description": "The purpose of this feature to check the unit and total price of an item by adding quantity 5 in the cart",
  "id": "end-to-end-flow-to-check-the-unit-and-total-price-of-an-item",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3160900,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Check the Unit Price and Total price of an item",
  "description": "",
  "id": "end-to-end-flow-to-check-the-unit-and-total-price-of-an-item;check-the-unit-price-and-total-price-of-an-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User search for \"Apple MacBook Pro 13-inch\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User add the Item to the cart and enter qty \"5\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User view the shopping cart",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User should see unit price \"$1,800.00\" and total price of item \"Apple MacBook Pro 13-inch\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 12017425900,
  "status": "passed"
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
  "duration": 1281274600,
  "status": "passed"
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
  "duration": 3396681200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_view_the_shopping_cart()"
});
formatter.result({
  "duration": 3695158000,
  "status": "passed"
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
  "duration": 608757100,
  "status": "passed"
});
formatter.after({
  "duration": 1110931000,
  "status": "passed"
});
});