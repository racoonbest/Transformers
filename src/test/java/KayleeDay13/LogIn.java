package KayleeDay13;

import org.openqa.selenium.*;

public class LogIn {
    WebDriver driver;

    By emailLocator = By.cssSelector("#Email");
    By passwordLocator = By.cssSelector("#Password");

    public LogIn(WebDriver driver) {
        this.driver = driver;
    }

    public void get() {
        driver.get("http://demowebshop.tricentis.com/login");
    }

    public void with(String email, String password) {
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(passwordLocator).submit();
//        driver.findElement(By.cssSelector("login-button")).click();
    }
}

