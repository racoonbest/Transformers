package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class ShoppingCart {

    WebDriver driver;
    By clickCart = By.cssSelector(".ico-cart .cart-label");
    By agreeBox = By.cssSelector("#termsofservice");
    By takeMeCart = By.cssSelector("#checkout, [value=checkout]");

    public ShoppingCart(WebDriver driver){
        this.driver=driver;
    }

    public void openCart(){
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(clickCart).click();
    }

    public void checkOut(){
        chrome.findElement(agreeBox).click();
        chrome.findElement(takeMeCart).click();
    }

    public void verification(){
        String expected = "Your order has been successfully processed!";
        String actual = chrome.findElement(By.cssSelector(".section.order-completed .title")).getText();
        assertEquals(expected, actual);
    }
}
