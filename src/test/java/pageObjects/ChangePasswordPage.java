package pageObjects;

import org.openqa.selenium.*;
import static stepDefinitions.TestSuiteSetUp.driver;


public class ChangePasswordPage {

    By changePass = By.cssSelector("a[href='/customer/changepassword']");

    By oldPass = By.cssSelector("#OldPassword");
    By newPass = By.cssSelector("#NewPassword");
    By confirmPass = By.cssSelector("#ConfirmNewPassword");

    public void changeLink () {
        driver.findElement(changePass).click(); // click change password link
    }

    public void changePass (String username, String oldPassword, String newPassword){
        driver.findElement(oldPass).sendKeys(oldPassword);
        driver.findElement(newPass).sendKeys(newPassword);
        driver.findElement(confirmPass).sendKeys(newPassword);
        driver.findElement(By.cssSelector("[value = 'Change password']")).click();
    }
}
