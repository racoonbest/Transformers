package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class ChangePasswordPage {

    By oldPass = By.cssSelector("#OldPassword");
    By newPass = By.cssSelector("#NewPassword");
    By confirmPass = By.cssSelector("#ConfirmNewPassword");

    public void changePass (String username, String oldPassword, String newPassword){
        chrome.findElement(oldPass).sendKeys(oldPassword);
        chrome.findElement(newPass).sendKeys(newPassword);
        chrome.findElement(confirmPass).sendKeys(newPassword);
        chrome.findElement(By.cssSelector("[value = 'Change password']")).click();
    }
}