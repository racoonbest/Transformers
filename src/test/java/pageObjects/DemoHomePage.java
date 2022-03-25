package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DemoHomePage {

    WebDriver chrome;
    String url = "http://demowebshop.tricentis.com/";

    By logInBtn = By.cssSelector("input[class=\'button-1 login-button\']");
    @FindBy(css = ".header-menu [href=\'/computers\']") WebElement computersOnMenu;
    @FindBy(xpath = "//a[@href='/accessories']") WebElement accessories;


    public DemoHomePage(WebDriver chrome) {
        this.chrome = chrome; PageFactory.initElements(chrome, this);
    }

    public void launch(){
        chrome.get(url);
    }
    public void clickLogInBtn(){
        chrome.findElement(logInBtn).click();
    }

    public void navigate_computers_menu_and_select_accessories() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions mouse = new Actions(chrome);
        mouse.moveToElement((computersOnMenu)).perform();
        accessories.click();

    }
}
