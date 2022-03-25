package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static stepDefinitions.TestSuiteSetUp.driver;

public class DesktopPage {
    By searchBar = By.cssSelector("#small-searchterms");
    By clickSearch = By.cssSelector(".product-grid .product-item .product-title");
    By processor = By.cssSelector("#product_attribute_72_5_18_65");
    By ram = By.cssSelector("#product_attribute_72_6_19_55");
    By hdd = By.cssSelector("#product_attribute_72_3_20_58");
    By software = By.cssSelector("#product_attribute_72_8_30_94");
    By addToCart = By.cssSelector("#add-to-cart-button-72");




    public void addToCart(String search){
        driver.findElement(searchBar).sendKeys(search + Keys.ENTER);
        driver.findElement(clickSearch).click();
        driver.findElement(processor).click();
        driver.findElement(ram).click();
        driver.findElement(hdd).click();
        driver.findElement(software).click();
        driver.findElement(addToCart).click();
    }
}
