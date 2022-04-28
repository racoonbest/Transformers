package stepDefinitions; import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.*;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.ENTER;
import static stepDefinitions.TestSuiteSetUp.driver;


import static stepDefinitions.TestSuiteSetUp.driver; public class PurchaseBook {



    HomePage demoWeb = new HomePage(driver);
    Login login=new Login(driver);
    AddCart button = new AddCart(driver);
    ShoppingCart click = new ShoppingCart(driver);
    CheckoutConfirmation continues = new CheckoutConfirmation(driver);
    WebDriverWait wait = new WebDriverWait(driver, 10);



    @Given("Customer is in home page of DemoWebShop")
    public void customer_is_in_home_page_of_demo_web_shop() {
        demoWeb.launch(); }

    HomePage demoWeb;
    Login login;

    @Given("Customer is in home page of DemoWebShop")
    public void customer_is_in_home_page_of_demo_web_shop() {
        demoWeb = new HomePage(driver);
        demoWeb.launch();
    }



    @When("Customer logs in")
    public void customer_logs_in() {

        login.launch(); login.with("leahope@gmail.com", "p@ssword"); }
    @When("Customer searches for book")
    public void customer_searches_for_book() {
        demoWeb.search("book"); }



    @Then("Customer clicks on Add cart button")
    public void customer_clicks_on_add_cart_button() {
        button.addMeCart(); }



    @When("Customer opens shopping cart")
    public void customer_opens_shopping_cart() {
        wait.until(ExpectedConditions.textToBe(demoWeb.getQuantity(),"(1)"));
        click.openCart();

        login=new Login(driver);
        login.launch();
        login.with("leahope@gmail.com", "p@ssword");
        }
    @When("Customer searches for book")
    public void customer_searches_for_book() {
        driver.findElement(By.name("q")).sendKeys("book", ENTER);
    }

    @Then("Customer clicks on Add cart button")
    public void customer_clicks_on_add_cart_button() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".product-box-add-to-cart-button")).click();
    }

    @When("Customer opens shopping cart")
    public void customer_opens_shopping_cart() {
        driver.findElement(By.cssSelector(".ico-cart .cart-label")).click();

    }



    @When("Customer clicks on Agree and Checkout buttons")
    public void customer_clicks_on_agree_and_checkout_buttons() {

        click.checkOut(); }


        driver.findElement(By.cssSelector("#termsofservice")).click();
        driver.findElement(By.cssSelector("#checkout, [value=checkout]")).click();
    }



    @Then("Customer is in checkout page")
    public void customer_is_in_checkout_page() {

        continues.pageTitle(); }



    @When("Customer chooses delivery methods")
    public void customer_chooses_delivery_methods() {
        continues.checkOutSteps(); }



        driver.findElement(By.cssSelector(".page-title")).isDisplayed();
    }

    @When("Customer chooses delivery methods")
    public void customer_chooses_delivery_methods()  {
        driver.findElement(By.cssSelector("#billing-buttons-container .new-address-next-step-button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#shipping-buttons-container .new-address-next-step-button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#shippingoption_1")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#shipping-method-buttons-container .shipping-method-next-step-button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#payment-method-buttons-container .payment-method-next-step-button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#payment-info-buttons-container .payment-info-next-step-button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#confirm-order-buttons-container .confirm-order-next-step-button")).click();
    }


    @When("Customer confirms delivery")
    public void customer_confirms_delivery() {

        continues.confirmButton(); }



        driver.findElement(By.cssSelector(".confirm-order-next-step-button")).click();
    }


    @Then("Customer sees verification message")
    public void customer_sees_verification_message(){
        click.verification(); }
}