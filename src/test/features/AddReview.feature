Feature: Add a Review
  Scenario: Verify only registered customer can leave a review
    Given Customer is on DemoShop home page
    When Customer searches for Health Book
    Then Customer clicks the item
    When Customer clicks Add your review link
    Then Verify text: Only registered users can write reviews

    When Customer clicks Log In
    Then Customer enters credentials and clicks Log In button

    When Customer searches for Health Book
    Then Customer clicks the item
    When Customer clicks Add your review link
    Then Customer fills out the review form
    Then Verify text: Product review is successfully added