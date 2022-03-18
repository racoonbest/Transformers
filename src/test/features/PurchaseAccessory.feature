Feature: Purchase an Accessory
  Scenario: Customer is able to purchase accessories
    When Navigate Computers menu and select Accessories
    When Click TCP Instructor Led Training
    When Customer Add this item to Cart
    When Go to shopping cart
    When Fill out Estimated Shipping info
    When Click agreement term and click checkout
    When Fill out checkout steps
    Then Verify messge: Your order has been successfully processed!
