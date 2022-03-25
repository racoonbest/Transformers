package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    String url = "http://demowebshop.tricentis.com/";

    @FindBy(css = ".account") // click email address on the main page
    WebElement email;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void launch(){
        driver.get(url);
    }

    public void emailAddress() {
        email.click();
    }
}
