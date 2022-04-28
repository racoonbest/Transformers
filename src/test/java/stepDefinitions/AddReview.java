package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddReviewPage;
import static stepDefinitions.TestSuiteSetUp.driver;


public class AddReview {

    AddReviewPage click = new AddReviewPage(driver);

    @When("Customer clicks the item")
    public void customer_clicks_the_item() {
        click.productTitle();
    }

    @When("Customer clicks Add your review link")
    public void customer_clicks_add_your_review_link() {
        click.addReview();
    }

    @Then("Verify text: Only registered users can write reviews")
    public void verify_text_only_registered_users_can_write_reviews() {
       click.errorMsg();
    }

    @When("Customer fills out the review form")
    public void customer_fills_out_the_review_form() {
        click.reviewForm();
    }

    @Then("Verify text: Product review is successfully added")
    public void verify_text_product_review_is_successfully_added() {
       click.acceptMsg();
    }
}
