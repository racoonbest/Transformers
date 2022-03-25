package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;
import static stepDefinitions.TestSuiteSetUp.driver;

public class PurchaseBook {

    HomePage demoWeb = new HomePage(driver);
    Login login=new Login(driver);
    AddCart button = new AddCart(driver);
    ShoppingCart click = new ShoppingCart(driver);
    CheckoutConfirmation continues = new CheckoutConfirmation(driver);

    @Given("Customer is in home page of DemoWebShop")
    public void customer_is_in_home_page_of_demo_web_shop() {
        demoWeb.launch();
    }

    @When("Customer logs in")
    public void customer_logs_in() {
        login.launch();
        login.with("leahope@gmail.com", "p@ssword");
    }

    @When("Customer searches for book")
    public void customer_searches_for_book() {
        demoWeb.searchFor("book"); }

    @Then("Customer clicks on Add cart button")
    public void customer_clicks_on_add_cart_button() {
        button.addMeCart();
           }


    @When("Customer opens shopping cart")
    public void customer_opens_shopping_cart() {
        click.openCart();
    }

    @When("Customer clicks on Agree and Checkout buttons")
    public void customer_clicks_on_agree_and_checkout_buttons() {
       click.checkOut();
           }

    @Then("Customer is in checkout page")
    public void customer_is_in_checkout_page() {
        continues.pageTitle();
    }

    @When("Customer chooses delivery methods")
    public void customer_chooses_delivery_methods()  {
        continues.checkOutSteps();
            }

    @When("Customer confirms delivery")
    public void customer_confirms_delivery() {
        continues.confirmButton();
    }

    @Then("Customer sees verification message")
    public void customer_sees_verification_message(){
       click.verification();
    }
}
