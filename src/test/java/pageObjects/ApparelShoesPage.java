package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class ApparelShoesPage {

    WebDriver driver;

    By belt = By.cssSelector(".picture a[href$=casual-belt]");
    By addCart = By.cssSelector(".button-1#add-to-cart-button-40");

    public ApparelShoesPage(WebDriver driver){
        this.driver=driver;
    }

    public void pageTitleAS(WebDriver driver){
        String expectedTitle = "Apparel & Shoes";
        String actualTitle = driver.findElement(By.cssSelector(".page-title")).getText();
        assertEquals(expectedTitle, actualTitle);
    }

    public void item(){
        driver.findElement(belt).click();
        driver.findElement(addCart).click();
    }


}
