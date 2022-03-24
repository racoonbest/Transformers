package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
    String url = "http://demowebshop.tricentis.com/login";
    By emailLocator = By.cssSelector("#Email");
    By passwordLocator = By.cssSelector("#Password");
    By loginBtn = By.cssSelector(".ico-login");

    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void launch(){
        driver.get(url);
    }

    public void with(String email, String password){
        driver.findElement(loginBtn).click();
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(passwordLocator).submit();
    }
}