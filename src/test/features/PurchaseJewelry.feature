  Feature: Purchase jewelry
    @regression @jewelry
    Scenario: Customer successfully purchases jewelry

      Given Customer is in home page of DemoWebShop
      When Customer logs in
      And Clicks on Jewelry menu
      Then Customer able to see jewelry items
      When Customer chooses create own jewelry
      And Customer is able to create personalized item
      When Customer clicks on Add cart button
      When Customer opens shopping cart
      When Customer clicks on Agree and Checkout buttons
      When Customer chooses delivery methods
      When Customer confirms delivery
      Then Customer sees verification message