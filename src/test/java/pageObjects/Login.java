package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;

    By emailLocator = By.cssSelector("#Email");
    By passwordLocator = By.cssSelector("#Password");

    public Login(WebDriver driver) {
        this.driver=driver;
    }


    public void get(){
        driver.get("http://demowebshop.tricentis.com/login");
    }

    public void with(String email, String password){
        driver.findElement(emailLocator).sendKeys(email);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(passwordLocator).submit();
    }
}
