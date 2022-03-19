package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn {

   static WebDriver driver;

   static By emailLocator = By.cssSelector("#Email");
   static By passwordLocator = By.cssSelector("#Password");


    public void get(){
        driver.get("http://demowebshop.tricentis.com");
    }

    public static void with(String email, String password){
        driver.findElement((emailLocator)).sendKeys(email);
        driver.findElement((passwordLocator)).sendKeys(password);
        driver.findElement((passwordLocator)).submit();
    }

}
