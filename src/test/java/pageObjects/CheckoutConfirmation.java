package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class CheckoutConfirmation {

    WebDriver driver;
    By checkoutOne = By.cssSelector("#billing-buttons-container .new-address-next-step-button");
    By checkoutTwo = By.cssSelector("#shipping-buttons-container .new-address-next-step-button");
    By checkoutThree = By.cssSelector("#shippingoption_1");
    By checkoutFour = By.cssSelector("#shipping-method-buttons-container .shipping-method-next-step-button");
    By checkoutFive = By.cssSelector("#payment-method-buttons-container .payment-method-next-step-button");
    By checkoutSix = By.cssSelector("#payment-info-buttons-container .payment-info-next-step-button");
    By checkoutSeven = By.cssSelector("#confirm-order-buttons-container .confirm-order-next-step-button");
    By confirmButton = By.cssSelector(".confirm-order-next-step-button");
    By checkoutTitle = By.cssSelector(".page-title");
    
    public CheckoutConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    public void pageTitle(){
        chrome.findElement(checkoutTitle).isDisplayed();
    }

    public void checkOutSteps(){
        chrome.findElement(checkoutOne).click();
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(checkoutTwo).click();
        chrome.findElement(checkoutThree).click();
        chrome.findElement(checkoutFour).click();
        chrome.findElement(checkoutFive).click();
        chrome.findElement(checkoutSix).click();
        chrome.findElement(checkoutSeven).click();
    }

    public void confirmButton(){
        chrome.findElement(confirmButton).click();

    }
}
