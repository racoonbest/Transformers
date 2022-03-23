Feature: Send an email to a friend to recommend the book
  @regression
  Scenario: As a customer I should be able to use email a friend feature

    Given Customer is on Log in page
    When Customer logs in to the website
    When Enter book to search
    And Clicks the health book item

    When Clicks email a friend button
    And Fills out the blanks and click send email button

    Then Verify text: Your message has been sent.