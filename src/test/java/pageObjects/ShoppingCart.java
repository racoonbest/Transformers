package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class ShoppingCart {

    WebDriver driver;

    public ShoppingCart(WebDriver driver){
        this.driver=driver;
    }

    public void checkOut(){
        chrome.findElement(By.cssSelector("#termsofservice")).click();
        chrome.findElement(By.cssSelector("#checkout, [value=checkout]")).click();
    }
}
