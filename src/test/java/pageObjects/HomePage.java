package pageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.ENTER;
import static stepDefinitions.TestSuiteSetUp.driver;

public class HomePage {

    WebDriver driver;
    String url = "http://demowebshop.tricentis.com/";
    By apparelShoes = By.cssSelector(".top-menu [href*=apparel-shoes]");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void launch(){
        driver.get(url);
    }

    public void apparelBar(){
        driver.findElement(apparelShoes).click();

    }
}
