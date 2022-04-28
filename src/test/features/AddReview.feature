Feature: Add a Review
  @regression @review
  Scenario: Verify only registered customer can leave a review
    Given Customer is in home page of DemoWebShop
    When Customer searches for book
    When Customer clicks the item
    When Customer clicks Add your review link
    Then Verify text: Only registered users can write reviews
    When Customer logs in
    When Customer searches for book
    When Customer clicks the item
    When Customer clicks Add your review link
    When Customer fills out the review form
    Then Verify text: Product review is successfully added