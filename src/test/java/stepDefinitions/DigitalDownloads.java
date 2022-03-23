package stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static stepDefinitions.TestSuiteSetUp.driver;

public class DigitalDownloads {
    @When("Customer clicks on Digital Downloads")
    public void customer_clicks_on_digital_downloads() {
        driver.findElement(By.cssSelector("a[href='/digital-downloads'")).click();

    }
    @When("Customer Adds 3rd Album to Cart")
    public void customer_adds_3rd_album_to_cart() {
        driver.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
    }
    @When("Customer clicks on I Agree and Checkout buttons")
    public void customer_clicks_on_i_agree_and_checkout_buttons() {
        driver.findElement(By.cssSelector("#termsofservice")).click();
        driver.findElement(By.cssSelector("#checkout")).click();
    }
    @When("Customer confirm checkout information")
    public void customer_confirm_checkout_information() throws InterruptedException {
        driver.findElement(By.cssSelector("#billing-buttons-container .new-address-next-step-button")).click();
        driver.findElement(By.cssSelector("#payment-method-buttons-container .payment-method-next-step-button")).click();
        driver.findElement(By.cssSelector("#payment-info-buttons-container .payment-info-next-step-button")).click();
        driver.findElement(By.cssSelector("#confirm-order-buttons-container .confirm-order-next-step-button")).click();
        Thread.sleep(4000);
    }

}
