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


    public void personalDetails(String firstN, String lastN, String email){
        chrome.findElement(clickAccount).click();
        chrome.findElement(gender).click();
        chrome.findElement(By.cssSelector("#FirstName")).sendKeys(Keys.CONTROL+ "a" ,Keys.BACK_SPACE);
        chrome.findElement(firstName).sendKeys(firstN);
        chrome.findElement(By.cssSelector("#LastName")).sendKeys(Keys.CONTROL+ "a" ,Keys.BACK_SPACE);
        chrome.findElement(lastName).sendKeys(Keys.BACK_SPACE,lastN);
        chrome.findElement(By.cssSelector("#Email")).sendKeys(Keys.CONTROL+ "a" ,Keys.BACK_SPACE);
        chrome.findElement(newEmail).sendKeys(Keys.BACK_SPACE,email);
        chrome.findElement(By.cssSelector(".save-customer-info-button")).click();

    }
}
