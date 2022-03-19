package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import pageObjects.HomePage;
import pageObjects.Login;

import static stepDefinitions.TestSuiteSetUp.chrome;


public class AddReview {

    Login login;
    HomePage homePage;

    @Given("Customer is on DemoShop home page")
    public void customer_is_on_demo_shop_home_page() {
        homePage = new HomePage(chrome);
        homePage.launch();

    }

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
        login = new Login(chrome);
        login.launch();
    }

    @When("Customer enters credentials and clicks Log In button")
    public void customer_enter_credentials_and_clicks_log_in_button() {
        login.with("jane.doe@yahoo.com", "Demoweb123!");
    }

    @When("Customer fills out the review form")
    public void customer_fills_out_the_review_form() throws InterruptedException {
        chrome.findElement(By.cssSelector("#AddProductReview_Title")).sendKeys("I like this book"); // title
        Thread.sleep(1000);
        chrome.findElement(By.cssSelector("#AddProductReview_ReviewText")).sendKeys("Highly recommend"); // body
        chrome.findElement(By.cssSelector("#addproductrating_5")).click(); // select Excellent for rating
        Thread.sleep(1000);
        chrome.findElement(By.cssSelector("[value = 'Submit review'")).click();
    }

    @Then("Verify text: Product review is successfully added")
    public void verify_text_product_review_is_successfully_added() {
        boolean isDisplayed = chrome.findElement(By.cssSelector(".result")).isDisplayed();
        System.out.println(isDisplayed);
    }
}
