package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class CheckoutConfirmation {

    WebDriver driver;

    public CheckoutConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    public void isVisible(){
        chrome.findElement(By.cssSelector(".page-title")).isDisplayed();
    }

    public void checkOutSteps(){
        chrome.findElement(By.cssSelector("#billing-buttons-container .new-address-next-step-button")).click();
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(By.cssSelector("#shipping-buttons-container .new-address-next-step-button")).click();
        chrome.findElement(By.cssSelector("#shippingoption_1")).click();
        chrome.findElement(By.cssSelector("#shipping-method-buttons-container .shipping-method-next-step-button")).click();
        chrome.findElement(By.cssSelector("#payment-method-buttons-container .payment-method-next-step-button")).click();
        chrome.findElement(By.cssSelector("#payment-info-buttons-container .payment-info-next-step-button")).click();
        chrome.findElement(By.cssSelector("#confirm-order-buttons-container .confirm-order-next-step-button")).click();
    }

    public void confirmButton(){
        chrome.findElement(By.cssSelector(".confirm-order-next-step-button")).click();

    }
}
