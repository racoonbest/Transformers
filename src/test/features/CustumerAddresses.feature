Feature: Customer Adresses
  Scenario: User should be able to add addresses under My Account
    Given Customer is on DemoShop home page
    When Customer clicks on Log in
    Then Customer fills out Log in info
    When Customer clicks on Log in 2
    Then Customer clicks on existing Gmail
    Then Customer clicks on Addresses
    When Customer clicks on Add new
    Then Customer fills out the Addresses
    When Customer clicks on Save

