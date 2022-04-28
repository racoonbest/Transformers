package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class AddCart {

    WebDriver driver;
    By addCart = By.cssSelector(".button-2.product-box-add-to-cart-button");
    By addCartJewel = By.cssSelector(".button-1#add-to-cart-button-71");

    public AddCart(WebDriver driver){
        this.driver=driver;
    }
    public void addMeCart(){
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.findElement(addCart).click();
    }

    public void addJewelCart(){
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.findElement(addCartJewel).click();
    }

}
