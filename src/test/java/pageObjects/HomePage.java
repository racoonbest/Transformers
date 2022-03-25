package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    @FindBy(name = "q")
    WebElement search; // search an item

    @FindBy(css = ".search-box-button")
    WebElement go; // click search button

    WebDriver driver;
    String url = "http://demowebshop.tricentis.com/";



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
<<<<<<< Updated upstream
  
    public void search(String product){
    search.sendKeys(product);
      go.click();
    } 
=======

    public void search(String product) {
        search.sendKeys(product);
        go.click();
    }

    public void emailAddress() {
        email.click();
    }
>>>>>>> Stashed changes
}
