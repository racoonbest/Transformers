package pageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.Keys.ENTER;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class HomePage {

    WebDriver driver;
    String url = "http://demowebshop.tricentis.com/";


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void launch(){
        driver.get(url);
    }

    public void searchFor(String product){
        chrome.findElement(By.name("q")).sendKeys((product), ENTER);
    }
}
