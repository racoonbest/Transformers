Feature: Change Password Feature
  @regression
  Scenario: Verify the customer is able to change their password
    Given Customer is on Login page
    When Customer enters login credential
    When Customer clicks on Email on homepage
    When Customer clicks Change password in My account
    When Customer changes password
    Then Verify Text: Password was changed
    And Log out and close the window
