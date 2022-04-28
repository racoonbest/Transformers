package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

import static stepDefinitions.TestSuiteSetUp.driver;

public class ChangeInfoPage {

    By clickAccount = By.cssSelector(".account");
    By gender = By.cssSelector("#gender-female");
    By firstName = By.cssSelector("#FirstName");
    By lastName = By.cssSelector("#LastName");
    By newEmail = By.cssSelector("#Email");
    By save = By.cssSelector(".save-customer-info-button");


    public void personalDetails(String firstN, String lastN, String email) {
        driver.findElement(clickAccount).click();
        driver.findElement(gender).click();
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(firstN);
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(lastN);
        driver.findElement(newEmail).clear();
        driver.findElement(newEmail).sendKeys(email);
        driver.findElement(save).click();

    }
}
