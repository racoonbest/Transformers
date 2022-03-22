package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.CheckoutConfirmation;
import pageObjects.HomePage;
import pageObjects.Login;
import pageObjects.ShoppingCart;
import java.util.concurrent.TimeUnit;
import static org.openqa.selenium.Keys.ENTER;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class PurchaseBook {

    HomePage demoWeb;
    Login login;
    ShoppingCart click;
    CheckoutConfirmation continues;

    @Given("Customer is in home page of DemoWebShop")
    public void customer_is_in_home_page_of_demo_web_shop() {
        demoWeb = new HomePage(chrome);
        demoWeb.launch();
    }

    @Then("Customer logs in")
    public void customer_logs_in() {
        login=new Login(chrome);
        login.launch();
        login.with("leahope@gmail.com", "p@ssword");
        }
    @When("Customer searches for book")
    public void customer_searches_for_book() {
        chrome.findElement(By.name("q")).sendKeys("book", ENTER);
    }

    @Then("Customer clicks on Add cart button")
    public void customer_clicks_on_add_cart_button() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button")).click();
    }

    @When("Customer opens shopping cart")
    public void customer_opens_shopping_cart() {
        chrome.findElement(By.cssSelector(".ico-cart .cart-label")).click();
    }

    @Then("Customer clicks on Agree and Checkout buttons")
    public void customer_clicks_on_agree_and_checkout_buttons() {
       click = new ShoppingCart(chrome);
       click.checkOut();
           }

    @When("Customer is in checkout page")
    public void customer_is_in_checkout_page() {
        continues = new CheckoutConfirmation(chrome);
        continues.isVisible();
    }

    @When("Customer chooses delivery methods")
    public void customer_chooses_delivery_methods()  {
        continues.checkOutSteps();
            }

    @Then("Customer confirms delivery")
    public void customer_confirms_delivery() {
        continues.confirmButton();
    }

    @Then("Customer sees verification message")
    public void customer_sees_verification_message(){
    }
}
