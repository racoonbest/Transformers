package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static stepDefinitions.TestSuiteSetUp.driver;
/*
public class PurchaseNotebook {

    @When("Customer click Log In")
    public void customer_clicks_log_in() {
        driver.findElement(By.cssSelector(".ico-login")).click();
        driver.findElement(By.cssSelector("#Email")).sendKeys("jane.doe@yahoo.com");
        driver.findElement(By.cssSelector("#Password")).sendKeys("Demoweb123!");
        driver.findElement(By.cssSelector("[value = 'Log in']")).click();
    }

    @When("Navigate Computers menu and select Notebooks")
    public void navigate_computers_menu_and_select_notebooks() {
        driver.findElement(By.partialLinkText("Computers")).click();
        driver.findElement(By.partialLinkText("Notebooks")).click();
    }

    @When("Customer clicks the item")
    public void customer_clicks_the_item() {
        driver.findElement(By.linkText("14.1-inch Laptop")).click(); // click the item
    }

    @When("Add the item to the cart")
    public void add_the_item_to_the_cart() {
        driver.findElement(By.cssSelector("[value = 'Add to cart']")).click();
    }

    @When("Customer clicks shopping cart")
    public void customer_clicks_shopping_cart() {
        driver.findElement(By.cssSelector(".cart-label")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
    }

    @When("Fill out Estimated Shipping information")
    public void fill_out_estimated_shipping_information() {


        Select country = new Select(driver.findElement(By.cssSelector("#CountryId")));
        country.selectByVisibleText("United States");
        Select state = new Select(driver.findElement(By.cssSelector("#StateProvinceId")));
        state.selectByVisibleText("Virginia");
        driver.findElement(By.cssSelector("#ZipPostalCode")).sendKeys(""); // is already filled in
        WebDriverWait wait = new WebDriverWait(driver, 20);
    }

    @When("Customer clicks on Agree and Checkout buttons")
    public void customer_clicks_on_agree_and_checkout_buttons() {

        driver.findElement(By.cssSelector("#termsofservice")).click(); // click the agreement checkbox
        driver.findElement(By.cssSelector("#checkout")).click(); // click checkout button
    }

    @When("Select Billing Address")
    public void select_billing_address() { // select Jane Doe address
        driver.findElement(By.cssSelector("#billing-address-select"))
                .sendKeys("Jane Doe, 7921 Jones Branch Dr., McLean, Virginia 22102, United States");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("[value = 'Continue']")).click(); // click continue button

    }

    @When("Select Shipping Address and In-store pickup")
    public void select_shipping_address_and_in_store_pickup() { // select Jane Doe address
        driver.findElement(By.cssSelector("#shipping-address-select"))
                .sendKeys("Jane Doe, 7921 Jones Branch Dr., McLean, Virginia 22102, United States");
        driver.findElement(By.cssSelector("#PickUpInStore")).click(); // select In-store Pickup checkbox
        driver.findElement(By.cssSelector("#shipping-buttons-container .new-address-next-step-button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
    }

    @When("Select Payment Method")
    public void select_payment_method() {
        driver.findElement(By.cssSelector("#paymentmethod_1")).click(); // select Check / Money Order option
        driver.findElement(By.cssSelector(".payment-method-next-step-button")).click();
    }

    @When("Verify payment information")
    public void verify_payment_information() {
        boolean isDisplayed = driver.findElement(By.cssSelector(".info")).isDisplayed();
        System.out.println(isDisplayed); // verify the info table is available

        driver.findElement(By.cssSelector(".payment-info-next-step-button")).click();
    }

    @When("Verify email address")
    public void verify_email_address() {

        boolean isDisplayed = driver.findElement(By.cssSelector(".email")).isDisplayed();
        System.out.println(isDisplayed);

        driver.findElement(By.cssSelector(".confirm-order-next-step-button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
    }

    @Then("Verify text: Your order has been successfully processed!")
    public void verify_text_your_order_has_been_successfully_processed() {

        boolean isDisplayed = driver.findElement(By.cssSelector(".title")).isDisplayed();
        System.out.println(isDisplayed);
    }

    @When("Click \"Click here for order details.\" link")
    public void click_click_here_for_order_details_link() {

        driver.findElement(By.linkText("Click here for order details.")).click();
        boolean orderNum = driver.findElement(By.cssSelector(".order-overview .order-number")).isDisplayed();
        System.out.println(orderNum);
        WebDriverWait wait = new WebDriverWait(driver, 100);
    }

    @When("Go back to the previous page and click continue button")
    public void go_back_to_the_previous_page_and_click_continue_button() {
        driver.navigate().back();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBe(By.cssSelector(".page-title"), "Thank you"));
        driver.findElement(By.cssSelector(".order-completed-continue-button")).click();
    }

    @Then("Log out and close the browser")
    public void log_out_and_close_the_browser() {
        driver.findElement(By.cssSelector(".ico-logout")).click(); // log out
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }
}
*/