Feature: Purchase desktop
  Scenario:  Customer should be able to purchase a desktop
    Given Customer is on DemoShop home page
    When Customer clicks on Log in
    When Customer fills out Log in info
    When Customer clicks on Log in 2
    When Customer enters desktop to search
    When Customer clicks first desktop
    When Customer fills out own goods
    When Customer clicks on Add to Cart
    Then Customer sees verify message
    When Customer clicks on Shopping cart
    When Customer fills out Estimate shipping field
    When Customer clicks on Estimate shipping and Checkout buttons
    When Customer clicks on Checkout continue buttons
    Then Customer sees Thank You
