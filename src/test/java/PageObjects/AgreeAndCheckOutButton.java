package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class AgreeAndCheckOutButton {
    WebDriver driver;

    By agree = By.cssSelector("#termsofservice");
    By checkout = By.cssSelector("#checkout, [value=checkout]");
    By billing = By.cssSelector("#billing-address-select .new-address-next-step-button");
    By shipping = By.cssSelector("#shipping-address-select .new-address-next-step-button");
    By shipMethod = By.cssSelector("#shippingoption_1 .shipping-method-next-step-button");
    By payMethod = By.cssSelector("#paymentmethod_1 .payment-method-next-step-button");
    By payInfo = By.cssSelector(".section payment-info .payment-info-next-step-button");
    By confirm = By.cssSelector(".confirm-order-next-step-button");

    public AgreeAndCheckOutButton(WebDriver driver){
        this.driver = driver;
    }

    public void buttons() {
        driver.findElement(agree).click();
        driver.findElement(checkout).click();
    }

    public void shipInfo() {
        driver.findElement(billing).click();
        driver.findElement(shipping).click();
        driver.findElement(shipMethod).click();
        driver.findElement(payMethod).click();
        driver.findElement(payInfo).click();
        driver.findElement(confirm).click();
    }

    public void thankYou() {
        String actual = chrome.findElement(By.cssSelector(".page-title")).getText();
        String expect = "Thank You";
        assertEquals(actual, expect);
    }
}
