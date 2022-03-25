package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class AddCart {

    WebDriver driver;
    By addCart = By.cssSelector(".button-2.product-box-add-to-cart-button");

    public AddCart(WebDriver driver){
        this.driver=driver;
    }
    public void addMeCart(){
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.findElement(addCart).click();

    }


}
