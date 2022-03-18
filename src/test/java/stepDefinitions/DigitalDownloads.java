package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class DigitalDownloads {
    @When("Customer clicks on Digital Downloads")
    public void customer_clicks_on_digital_downloads() {
        chrome.findElement(By.cssSelector("a[href='/digital-downloads'")).click();

    }
    @When("Customer Adds 3rd Album to Cart")
    public void customer_adds_3rd_album_to_cart() {
        chrome.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
    }
    @When("Customer clicks on I Agree and Checkout buttons")
    public void customer_clicks_on_i_agree_and_checkout_buttons() {
        chrome.findElement(By.cssSelector("#termsofservice")).click();
        chrome.findElement(By.cssSelector("#checkout")).click();
    }
    @When("Customer confirm checkout information")
    public void customer_confirm_checkout_information() throws InterruptedException {
       chrome.findElement(By.cssSelector("#billing-buttons-container .new-address-next-step-button")).click();
       chrome.findElement(By.cssSelector("#payment-method-buttons-container .payment-method-next-step-button")).click();
       chrome.findElement(By.cssSelector("#payment-info-buttons-container .payment-info-next-step-button")).click();
        chrome.findElement(By.cssSelector("#confirm-order-buttons-container .confirm-order-next-step-button")).click();
        Thread.sleep(3000);
    }

}
