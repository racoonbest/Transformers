package PageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    String url = "http://demowebshop.tricentis.com/";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void launch(){
        driver.get(url);
    }
}
