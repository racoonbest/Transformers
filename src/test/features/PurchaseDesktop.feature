Feature: Purchase desktop
  @regression @desktop
  Scenario:  Customer should be able to purchase a desktop
    Given Customer is in home page of DemoWebShop
    When Customer logs in
    When Customer adds desktop to cart
    Then Customer sees verify message
    When Customer clicks on Shopping cart
    When Customer fills out Estimate shipping field
    When Customer clicks on Estimate shipping and Checkout buttons
    When Customer clicks on Checkout continue buttons
    Then Customer sees Thank You
