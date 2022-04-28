package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DemoHomePage {

    WebDriver driver;
    String url = "http://demowebshop.tricentis.com/";

    By logInBtn = By.cssSelector("input[class=\'button-1 login-button\']");
    @FindBy(css = ".header-menu [href=\'/computers\']") WebElement computersOnMenu;
    @FindBy(xpath = "//a[@href='/accessories']") WebElement accessories;


    public DemoHomePage(WebDriver driver) {
        this.driver = driver; PageFactory.initElements(driver, this);
    }

    public void launch(){
        driver.get(url);
    }
    public void clickLogInBtn(){
        driver.findElement(logInBtn).click();
    }

    public void navigate_computers_menu_and_select_accessories() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions mouse = new Actions(driver);
        mouse.moveToElement((computersOnMenu)).perform();
        accessories.click();

    }
}
