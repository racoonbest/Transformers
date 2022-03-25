Feature: Purchase a Notebook
  @regression @notebook
  Scenario: As a customer I should be able to purchase a Notebook
    Given Customer is on DemoShop home page
    When Customer clicks Log In
    When Navigate Computers menu and select Notebooks
    When Customer clicks the item
    When Add the item to the cart
    When Customer clicks shopping cart
    When Fill out Estimated Shipping information
    When Customer clicks on Agree and Checkout buttons
    When Select Billing Address
    When Select Shipping Address and In-store pickup
    When Select Payment Method
    When Verify payment information
    When Verify email address
    Then Verify text: Your order has been successfully processed!
    When Click "Click here for order details." link
    When Go back to the previous page and click continue button
    Then Log out and close the browser
