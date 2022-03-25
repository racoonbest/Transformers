package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DesktopPage;
import pageObjects.Login;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.By.cssSelector;
import static stepDefinitions.TestSuiteSetUp.driver;

public class PurchaseDesktop {
    Login logIn = new Login(driver);
    DesktopPage desktopPage = new DesktopPage();
    WebDriverWait wait = new WebDriverWait(driver, 10);


    @When("Customer is on Log in page")
    public void customer_is_on_log_in_page() {
        logIn.launch();
        driver.manage().window().maximize();
    }

    @When("Customer fills out login form")
    public void customer_fills_out_login_form() {
        logIn.with("simba10@gmail.com","simba1");
    }

    @When("Customer adds desktop to cart")
    public void customer_adds_desktop_to_cart() {
        desktopPage.addToCart("Computer");

    }

     @Then("Customer sees verify message")
      public void customer_sees_verify_message() {
         String expected = "The product has been added to your shopping cart";
         wait.until(ExpectedConditions.textToBe(By.cssSelector(".bar-notification .content"), expected));
        String actual = driver.findElement(By.cssSelector(".bar-notification .content")).getText();
        assertEquals(expected, actual);


    }
    @When("Customer clicks on Shopping cart")
    public void customer_clicks_on_shopping_cart() throws InterruptedException {
        WebElement ele = driver.findElement(cssSelector("#topcartlink"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(cssSelector("#topcartlink")).click();
    }
    @When("Customer fills out Estimate shipping field")
    public void customer_fills_out_estimate_shipping_field() {
        Select country = new Select(driver.findElement(cssSelector("#CountryId")));
        country.selectByValue("1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select state = new Select(driver.findElement(cssSelector("#StateProvinceId")));
        state.selectByValue("40");
        driver.findElement(cssSelector("#ZipPostalCode")).sendKeys("11230");
    }
    @When("Customer clicks on Estimate shipping and Checkout buttons")
    public void customer_clicks_on_estimate_shipping_and_checkout_buttons() {
       driver.findElement(cssSelector(".estimate-shipping-button")).click();
       driver.findElement(cssSelector("#termsofservice")).click();
       driver.findElement(cssSelector("#checkout")).click();
    }
    @When("Customer clicks on Checkout continue buttons")
    public void customer_clicks_on_checkout_continue_buttons() throws InterruptedException {
       driver.findElement(cssSelector("#billing-buttons-container .new-address-next-step-button")).click();
       driver.findElement(cssSelector("#shipping-buttons-container .new-address-next-step-button")).click();
       driver.findElement(cssSelector("#shippingoption_1")).click();
       driver.findElement(cssSelector("#shipping-method-buttons-container .shipping-method-next-step-button")).click();
       driver.findElement(cssSelector("#payment-method-buttons-container .payment-method-next-step-button")).click();
       driver.findElement(cssSelector("#payment-info-buttons-container .payment-info-next-step-button")).click();
       driver.findElement(cssSelector("#confirm-order-buttons-container .confirm-order-next-step-button")).click();
    }
    @Then("Customer sees Thank You")
    public void customer_sees_thank_you() throws InterruptedException {
        String expected = "Thank you";
        wait.until(ExpectedConditions.textToBe(By.cssSelector(".page-title"), expected));
        String actual = driver.findElement(By.cssSelector(".page-title")).getText();
        assertEquals(actual, expected);


    }





}
