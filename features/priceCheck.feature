#Author: aneeshamol Ismail

Feature: End To End flow to check the unit and total price of an item
The purpose of this feature to check the unit and total price of an item by adding quantity 5 in the cart


  Scenario: Check the Unit Price and Total price of an item
  
    Given User is on Home Page
    When User search for "Apple MacBook Pro 13-inch"
   	And User add the Item to the cart and enter qty "5"
    When User view the shopping cart
    Then User should see unit price "$1,800.00" and total price of item "Apple MacBook Pro 13-inch"