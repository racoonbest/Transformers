package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.DigitalDownloadsPage;
import pageObjects.HomePage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.driver;



public class DigitalDownloads {

    HomePage home = new HomePage(driver);
    DigitalDownloadsPage downloads = new DigitalDownloadsPage(driver);

    @When("Customer clicks on Digital Downloads")
    public void customer_clicks_on_digital_downloads() {
        home.goToDigitalDownloads();

    }
    @When("Customer Adds 3rd Album to Cart")
    public void customer_adds_3rd_album_to_cart() {
        downloads.addToCartThirdAlbum();
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
    }

}
