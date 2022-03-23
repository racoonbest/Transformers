package stepDefinitions;

import cucumber.api.java.en.Then;

import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.TestRunner;
import pageObjects.Login;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static utility.CucumberRunner.driver;


public class PurchaseDesktop {
    Login  logIn = new Login(driver);


    @When("Customer is on Log in page")
    public void customer_is_on_log_in_page() {
        logIn.launch();
        driver.manage().window().maximize();
    }

    @When("Customer fills out login form")
    public void customer_fills_out_login_form() {
        logIn.with("simba10@gmail.com","simba1");
    }

    //@Given("Customer is on DemoShop home page")
    //public void customer_is_on_demo_shop_home_page() {
      //  driver.get("http://demowebshop.tricentis.com");
        //driver.manage().window().maximize();
    //}

    @When("Customer enters desktop to search")
    public void customer_enters_desktop_to_search() {
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Computer"+ Keys.ENTER);

    }
    @When("Customer clicks first desktop")
    public void customer_clicks_first_desktop() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".product-grid .product-item .product-title")).click();
    }
    @When("Customer fills out own goods")
    public void customer_fills_out_own_goods() {
        driver.findElement(By.cssSelector("#product_attribute_72_5_18_65")).click();
        driver.findElement(By.cssSelector("#product_attribute_72_6_19_55")).click();
        driver.findElement(By.cssSelector("#product_attribute_72_3_20_58")).click();
        driver.findElement(By.cssSelector("#product_attribute_72_8_30_94")).click();
    }
    @When("Customer clicks on Add to Cart")
    public void customer_clicks_on_add_to_cart() {
       driver.findElement(By.cssSelector("#add-to-cart-button-72")).click();
    }
     @Then("Customer sees verify message")
      public void customer_sees_verify_message() {
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String actual = driver.findElement(By.cssSelector(".bar-notification .content")).getText();
        String expected = "The product has been added to your shopping cart";
        assertEquals(expected, actual);


    }
    @When("Customer clicks on Shopping cart")
    public void customer_clicks_on_shopping_cart() throws InterruptedException {
        WebElement ele = driver.findElement(By.cssSelector("#topcartlink"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#topcartlink")).click();
    }
    @When("Customer fills out Estimate shipping field")
    public void customer_fills_out_estimate_shipping_field() {
        Select country = new Select(driver.findElement(By.cssSelector("#CountryId")));
        country.selectByValue("1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select state = new Select(driver.findElement(By.cssSelector("#StateProvinceId")));
        state.selectByValue("40");
        driver.findElement(By.cssSelector("#ZipPostalCode")).sendKeys("11230");
    }
    @When("Customer clicks on Estimate shipping and Checkout buttons")
    public void customer_clicks_on_estimate_shipping_and_checkout_buttons() {
       driver.findElement(By.cssSelector(".estimate-shipping-button")).click();
       driver.findElement(By.cssSelector("#termsofservice")).click();
       driver.findElement(By.cssSelector("#checkout")).click();
    }
    @When("Customer clicks on Checkout continue buttons")
    public void customer_clicks_on_checkout_continue_buttons() throws InterruptedException {
       driver.findElement(By.cssSelector("#billing-buttons-container .new-address-next-step-button")).click();
       driver.findElement(By.cssSelector("#shipping-buttons-container .new-address-next-step-button")).click();
       driver.findElement(By.cssSelector("#shippingoption_1")).click();
       driver.findElement(By.cssSelector("#shipping-method-buttons-container .shipping-method-next-step-button")).click();
       driver.findElement(By.cssSelector("#payment-method-buttons-container .payment-method-next-step-button")).click();
       driver.findElement(By.cssSelector("#payment-info-buttons-container .payment-info-next-step-button")).click();
       driver.findElement(By.cssSelector("#confirm-order-buttons-container .confirm-order-next-step-button")).click();
       Thread.sleep(3000);
    }
    @Then("Customer sees Thank You")
    public void customer_sees_thank_you() throws InterruptedException {
        String actual = driver.findElement(By.cssSelector(".page-title")).getText();
        String expected = "Thank you";
        assertEquals(actual, expected);


    }





}
