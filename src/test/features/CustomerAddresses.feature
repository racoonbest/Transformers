Feature: Customer Addresses
  @regression @addresses
  Scenario: User should be able to add addresses under My Account
    Given Customer is in home page of DemoWebShop
    When Customer logs in
    Then Customer clicks on existing Gmail
    Then Customer clicks on Addresses
    When Customer clicks on Add new
    Then Customer fills out the Addresses
    When Customer clicks on Save

