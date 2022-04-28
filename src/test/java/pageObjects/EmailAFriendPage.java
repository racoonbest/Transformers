package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static stepDefinitions.TestSuiteSetUp.driver;

public class EmailAFriendPage {

    By clickHealthBook = By.partialLinkText("Health Book");
    By emailAFriend = By.cssSelector("[value = 'Email a friend']");
    By friendEmail = By.cssSelector(".friend-email");
    By message = By.cssSelector(".personal-message");
    By sendEmail = By.name("send-email");



    public void personalDetails(String friend, String mess){
        driver.findElement(clickHealthBook).click();
        driver.findElement(emailAFriend).click();
        driver.findElement(friendEmail).sendKeys(friend);
        driver.findElement(message).sendKeys(mess);
        driver.findElement(sendEmail).click();

    }
}
