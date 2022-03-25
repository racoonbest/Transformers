package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    String url = "http://demowebshop.tricentis.com/login";

    WebDriver driver;
    By emailLocator = By.cssSelector("#Email");
    By passwordLocator = By.cssSelector("#Password");
    By logInLink = By.cssSelector(".ico-login");


    public Login(WebDriver driver){
        this.driver = driver;
    }


        public void launch () {
            driver.get(url);
        }


        public void with(String email, String password){
            driver.findElement(logInLink).click();
            driver.findElement(emailLocator).sendKeys(email);
            driver.findElement(passwordLocator).sendKeys(password);
            driver.findElement(passwordLocator).submit();
        }

        public void clickLogInLink () {
            driver.findElement(logInLink).click();
        }


    }
}
