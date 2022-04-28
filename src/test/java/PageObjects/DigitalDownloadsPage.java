package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsPage {

    @FindBy(css = ".product-box-add-to-cart-button")
    WebElement addToCartThirdAlbum;


    public DigitalDownloadsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addToCartThirdAlbum(){
        addToCartThirdAlbum.click();
    }
}
