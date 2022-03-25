package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;
    String url = "http://demowebshop.tricentis.com/";
    By apparelShoes = By.cssSelector(".top-menu [href*=apparel-shoes]");




    @FindBy(css = ".search-box-button")
    WebElement go;

    @FindBy(name = "q")
    WebElement search;

    @FindBy(css = ".account") // click email address on the main page
    WebElement email;


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
        email.click();
    }


}
