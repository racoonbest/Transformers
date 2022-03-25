package pageObjects;

import org.openqa.selenium.*;
import static stepDefinitions.TestSuiteSetUp.chrome;


public class ChangePasswordPage {

    By changePass = By.cssSelector("a[href=\"/customer/changepassword\"]");

    By oldPass = By.cssSelector("#OldPassword");
    By newPass = By.cssSelector("#NewPassword");
    By confirmPass = By.cssSelector("#ConfirmNewPassword");

    public void changeLink () {
        chrome.findElement(changePass).click(); // click change password link
    }

    public void changePass (String username, String oldPassword, String newPassword){
        chrome.findElement(oldPass).sendKeys(oldPassword);
        chrome.findElement(newPass).sendKeys(newPassword);
        chrome.findElement(confirmPass).sendKeys(newPassword);
        chrome.findElement(By.cssSelector("[value = 'Change password']")).click();
    }
}
