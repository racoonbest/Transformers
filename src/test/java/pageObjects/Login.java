package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;

    By emailLocator = By.cssSelector("#Email");
    By passwordLocator = By.cssSelector("#Password");
    By logInLink = By.cssSelector(".ico-login");


    public Login(WebDriver driver){
        this.driver = driver;
    }


    public void with(String email, String password){
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(passwordLocator).submit();
    }
    public void clickLogInLink(){
        driver.findElement(logInLink).click();
    }


}
