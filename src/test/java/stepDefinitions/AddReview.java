package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;

import static stepDefinitions.TestSuiteSetUp.chrome;


public class AddReview {

    @When("Customer searches for Health Book")
    public void customer_searches_for_health_book() throws InterruptedException {
        chrome.findElement(By.cssSelector("[value = 'Search store']")).sendKeys("health book"); // search health book
        chrome.findElement(By.cssSelector("[value = 'Search']")).click(); // click Search button
        Thread.sleep(1000);
    }

    @When("Customer clicks the item")
    public void customer_clicks_the_item() {
        chrome.findElement(By.cssSelector(".product-title")).click(); // click the item
    }

    @When("Customer clicks Add your review link")
    public void customer_clicks_add_your_review_link() {
        chrome.findElement(By.linkText("Add your review")).click(); // click Add your review link
    }

    @Then("Verify text: Only registered users can write reviews")
    public void verify_text_only_registered_users_can_write_reviews() {
        boolean isDisplayed = chrome.findElement(By.cssSelector(".validation-summary-errors")).isDisplayed();
        System.out.println(isDisplayed);
    }

    @When("Customer clicks Log In")
    public void customer_clicks_log_in() {
        chrome.findElement(By.cssSelector(".ico-login")).click();
    }

    @When("Customer enters credentials and clicks Log In button")
    public void customer_enter_credentials_and_clicks_log_in_button() {
        chrome.findElement(By.cssSelector("#Email")).sendKeys("jane.doe@yahoo.com");
        chrome.findElement(By.cssSelector("#Password")).sendKeys("Demoweb123!");
        chrome.findElement(By.cssSelector("[value = 'Log in']")).click();
    }

    @When("Customer fills out the review form")
    public void customer_fills_out_the_review_form() throws InterruptedException {
        chrome.findElement(By.cssSelector("#AddProductReview_Title")).sendKeys("I like this book"); // title
        Thread.sleep(1000);
        chrome.findElement(By.cssSelector("#AddProductReview_ReviewText")).sendKeys("Highly recommend"); // body
        chrome.findElement(By.cssSelector("#addproductrating_5")).click();
        Thread.sleep(1000);
        chrome.findElement(By.cssSelector("[value = 'Submit review'")).click();
    }

    @Then("Verify text: Product review is successfully added")
    public void verify_text_product_review_is_successfully_added() {
        boolean isDisplayed = chrome.findElement(By.cssSelector(".result")).isDisplayed();
        System.out.println(isDisplayed);
    }
}
