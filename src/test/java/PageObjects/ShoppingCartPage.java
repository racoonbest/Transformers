package pageObjects;


import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    WebDriver driver;

    By shoppingCart = By.cssSelector("[value = 'Add to cart']"); // add to cart
    By cartOpen = By.cssSelector(".cart-label"); // open shopping cart


    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
    }

    public void shopCart() {
        driver.findElement(shoppingCart).click();
        driver.findElement(cartOpen).click();
    }
}
