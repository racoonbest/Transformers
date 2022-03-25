package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;

public class JewelryPage {

    WebDriver driver;
    By pageTitle = By.cssSelector(".page-title");
    By create1 = By.cssSelector(".product-title [href*=create-it]");
    By select = By.id("product_attribute_71_9_15");
    By create2 = By.id("product_attribute_71_10_16");
    By create3 = By.id("product_attribute_71_11_17_50");


    public JewelryPage(WebDriver driver){
        this.driver=driver;
    }

    public void jewTitle(){
        String expectedT = "Jewelry";
        String actualT = driver.findElement(pageTitle).getText();
        assertEquals(expectedT,actualT);
    }

    public void createJwry(){
        driver.findElement(create1).click();
        Select type = new Select(driver.findElement(select));
        type.selectByValue("46");
        driver.findElement(create2).sendKeys("65");
        driver.findElement(create3).click();


    }
}
