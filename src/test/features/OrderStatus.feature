
Feature: Check the order status

  @regression
  Scenario:  Customer is able to verify placed order status
    Given Customer is in home page of DemoWebShop
    When Customer logs in
    When Customer searches for book
    When Customer clicks on Add cart button
    When Customer opens shopping cart
    When Customer clicks on Agree and Checkout buttons
    Then Customer is in checkout page
    When Customer chooses delivery methods
    When Customer confirms delivery
    Then Customer sees verification message
    When Customer clicks on order details
    Then Customer verifies order status




