

  Feature: Book purchase

    Scenario: Customer is able to purchases a book successfully
      Given Customer is in home page of DemoWebShop
      When Customer clicks on Login button
      Then Customer enters valid credentials
      When Customer searches for book
      Then Customer clicks on Add cart button
      When Customer opens shopping cart
      Then Customer clicks on Agree and Checkout buttons
      When Customer is in checkout page
      Then Customer chooses delivery methods
      Then Customer confirms delivery

