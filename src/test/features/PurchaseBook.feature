

  Feature: Book purchase

    Scenario: Customer is able to purchases a book successfully
      Given Customer is in home page of DemoWebShop
      When Customer logs in
      When Customer searches for book
      Then Customer clicks on Add cart button
      When Customer opens shopping cart
      Then Customer clicks on Agree and Checkout buttons
      When Customer is in checkout page
      When Customer chooses delivery methods
      When Customer confirms delivery
      Then Customer sees verification message


