Feature: Purchase a Notebook
  @regression @notebook
  Scenario: As a customer I should be able to purchase a Notebook
    Given Customer is in home page of DemoWebShop
    When Customer logs in
    When Customer searches for laptop
    When Customer clicks on Add cart button
    When Customer opens shopping cart
    When Customer clicks on Agree and Checkout buttons
    Then Customer is in checkout page
    When Customer chooses delivery methods
    When Customer confirms delivery
    Then Customer sees verification message
