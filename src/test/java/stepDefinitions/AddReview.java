package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import static stepDefinitions.TestSuiteSetUp.driver;


public class AddReview {

    @When("Customer searches for Health Book")
    public void customer_searches_for_health_book() throws InterruptedException {
        driver.findElement(By.cssSelector("[value = 'Search store']")).sendKeys("health book"); // search health book
        driver.findElement(By.cssSelector("[value = 'Search']")).click(); // click Search button
        Thread.sleep(1000);
    }

    @When("Customer clicks the items")
    public void customer_clicks_the_item() {
        driver.findElement(By.cssSelector(".product-title")).click();

    }

    @When("Customer clicks Add your review link")
    public void customer_clicks_add_your_review_link() {
        driver.findElement(By.linkText("Add your review")).click(); // click Add your review link
    }

    @Then("Verify text: Only registered users can write reviews")
    public void verify_text_only_registered_users_can_write_reviews() {
        boolean isDisplayed = driver.findElement(By.cssSelector(".validation-summary-errors")).isDisplayed();
        System.out.println(isDisplayed);
    }


    @When("Customer fills out the review form")
    public void customer_fills_out_the_review_form() throws InterruptedException {
        driver.findElement(By.cssSelector("#AddProductReview_Title")).sendKeys("I like this book"); // title
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#AddProductReview_ReviewText")).sendKeys("Highly recommend"); // body
        driver.findElement(By.cssSelector("#addproductrating_5")).click(); // select Excellent for rating
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[value = 'Submit review'")).click();
    }

    @Then("Verify text: Product review is successfully added")
    public void verify_text_product_review_is_successfully_added() {
        boolean isDisplayed = driver.findElement(By.cssSelector(".result")).isDisplayed();
        System.out.println(isDisplayed);
    }
}
