Feature: Purchase desktop
<<<<<<< HEAD
@regression
=======
  @regression @desktop
>>>>>>> 0778a617590e980f5e2542998203e38f5fb39a24
  Scenario:  Customer should be able to purchase a desktop
    Given Customer is in home page of DemoWebShop
    When Customer logs in
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
