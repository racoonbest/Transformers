package pageObjects;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static org.openqa.selenium.Keys.ENTER;
import static stepDefinitions.TestSuiteSetUp.driver;

public class HomePage {

    WebDriver driver;
    String url = "http://demowebshop.tricentis.com/";
    By apparelShoes = By.cssSelector(".top-menu [href*=apparel-shoes]");




    @FindBy(css = ".search-box-button")
    WebElement go;

    @FindBy(name = "q")
    WebElement search;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void launch(){
        driver.get(url);
    }


    public void apparelBar(){
        driver.findElement(apparelShoes).click();

    }

    public void search(String product){
    search.sendKeys(product);
      go.click();
    }

    public void emailAddress() {
    }


}
