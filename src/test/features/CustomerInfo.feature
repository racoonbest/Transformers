Feature: Customer info
  @regression @info
  Scenario: Verify the customer is able to change their info
    Given Customer is on Login page
    When Customer enters login credential
    When Customer changes info under my account
    When log out and log in back
    Then Customer info should get updated

