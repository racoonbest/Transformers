package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.security.Key;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class ChangeInfoPage {

    By clickAccount = By.cssSelector(".account");
    By gender = By.cssSelector("#gender-female");
    By firstName = By.cssSelector("#FirstName");
    By lastName = By.cssSelector("#LastName");
    By newEmail = By.cssSelector("#Email");
    By save = By.cssSelector(".save-customer-info-button");


    public void personalDetails(String firstN, String lastN, String email) {
        chrome.findElement(clickAccount).click();
        chrome.findElement(gender).click();
        chrome.findElement(firstName).clear();
        chrome.findElement(firstName).sendKeys(firstN);
        chrome.findElement(lastName).clear();
        chrome.findElement(lastName).sendKeys(lastN);
        chrome.findElement(newEmail).clear();
        chrome.findElement(newEmail).sendKeys(email);
        chrome.findElement(save).click();

    }
}
