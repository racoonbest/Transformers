package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class ShoppingCart {

    WebDriver driver;

    public ShoppingCart(WebDriver driver){
        this.driver=driver;
    }

    public void openCart(){
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(By.cssSelector(".ico-cart .cart-label")).click();
    }

    public void checkOut(){
        chrome.findElement(By.cssSelector("#termsofservice")).click();
        chrome.findElement(By.cssSelector("#checkout, [value=checkout]")).click();
    }
}
