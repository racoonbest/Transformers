  Feature: Book purchase
    @regression @checkout
    Scenario: Customer is able to purchases a book successfully
      Given Customer is in home page of DemoWebShop
      When Customer logs in
      When Customer searches for book
      And Customer clicks on Add cart button and opens shopping cart
      When Customer clicks on Agree and Checkout buttons
      When Customer chooses delivery methods
      Then Verify Text: Thank You

