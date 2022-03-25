package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static stepDefinitions.TestSuiteSetUp.driver;

public class AccessoriesPage {
    WebDriver driver;

    By ledTraining_AddToCart = By.xpath("(//input[@value='Add to cart'])[2]");

    public AccessoriesPage(WebDriver chrome) {
        this.driver = chrome;
    }

    public void select_tcp_instructor_led_training_and_add_to_cart() {
        driver.findElement(ledTraining_AddToCart).click();

    }

}
