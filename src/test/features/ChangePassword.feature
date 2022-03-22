Feature: Change Password Feature
  @regression
  Scenario: Verify the customer is able to change their password
    Given Customer is on Log in page
    When Customer fills out login form
    When Customer clicks on Email in home page
    When Customer clicks Change password in My account
    When Customer changes password
    Then Customer sees Password was changed
