
Feature: Apparel purchase

  Scenario: Customer is able to purchase item from Apparel&Shoes
    Given Customer is in home page of DemoWebShop
    When Customer clicks on Login button
    When Customer enters valid credentials
    When Customer clicks on Apparel&Shoes menu
    Then Customer is able to navigate menu items
    When Customer finds an item to be purchased
    Then Customer clicks on Add cart button
    When Customer opens shopping cart
    When Customer clicks on Agree and Checkout buttons
    When Customer is in checkout page
    When Customer chooses delivery methods
    Then Customer confirms delivery
