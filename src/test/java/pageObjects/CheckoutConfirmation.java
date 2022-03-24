package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

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
    By details = By.cssSelector("a[href*=orderdetails]");


    public CheckoutConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    public void pageTitle(){
        String expTitle = "Checkout";
        String actTitle = driver.findElement(By.cssSelector(".page-title")).getText();
        assertEquals(expTitle,actTitle);
    }

    public void checkOutSteps(){
        driver.findElement(checkoutOne).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(checkoutTwo).click();
        driver.findElement(checkoutThree).click();
        driver.findElement(checkoutFour).click();
        driver.findElement(checkoutFive).click();
        driver.findElement(checkoutSix).click();
        driver.findElement(checkoutSeven).click();
    }

    public void confirmButton(){
        driver.findElement(confirmButton).click();

    }

    public void orderDetails(){
        driver.findElement(details).click();
    }

    public void orderStatus(){
        String expOrderNum = "Order Status: Pending";
        String actOrderNum = driver.findElement(By.cssSelector(".order-details span:nth-child(2)")).getText();
        assertEquals(expOrderNum,actOrderNum);
    }
}
