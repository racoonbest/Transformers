package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class EmailAFriendPage {

    By clickHealthBook = By.partialLinkText("Health Book");
    By emailAFriend = By.cssSelector("[value = 'Email a friend']");
    By friendEmail = By.cssSelector(".friend-email");
    By message = By.cssSelector(".personal-message");
    By sendEmail = By.name("send-email");



    public void personalDetails(String friend, String mess){
        chrome.findElement(clickHealthBook).click();
        chrome.findElement(emailAFriend).click();
        chrome.findElement(friendEmail).sendKeys(friend);
        chrome.findElement(message).sendKeys(mess);
        chrome.findElement(sendEmail).click();

    }
}
