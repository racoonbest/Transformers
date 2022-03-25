Feature: Send an email to a friend to recommend the book
  @regression @email
  Scenario: As a customer I should be able to use email a friend feature
    Given Customer is on Log in page
    When Customer logs in to the website
    When Enter book to search
    When Customer Emails a friend
    Then Verify text: Your message has been sent.