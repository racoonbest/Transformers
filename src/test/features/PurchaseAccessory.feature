Feature: Purchase an Accessory
  @regression @accessory
  Scenario: Customer is able to purchase accessories
    Given User in DemoShop home page
    When User clicks on log in link
    When User enters log in and pass and clicks log in btn
    When Navigate Computers menu and select Accessories
    When Select TCP Instructor Led Training and add to cart
    When Go to shopping cart
    When Fill out Estimated Shipping info
    When Click agreement term and click checkout
    When User fill outs billing form and clicks continue
    When User selects shipping method and clicks continue
    When User selects payment method
    When User enters payment info and clicks continue
    Then Verify message: Your order has been successfully processed!
