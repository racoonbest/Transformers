Feature:Digital Downloads
  Scenario:  Customer should be able to purchase Digital Downloads
    Given Customer is on DemoShop home page
    When Customer clicks on Log in
    When Customer fills out Log in info
    When Customer clicks on Log in 2
    When Customer clicks on Digital Downloads
    When Customer Adds 3rd Album to Cart
    Then Customer sees verify message
    When Customer clicks on Shopping cart
    When Customer clicks on I Agree and Checkout buttons
    When Customer confirm checkout information
    Then Customer sees Thank You
