package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AgreeAndCheckOutButton;
import pageObjects.HomePage;
import pageObjects.Login;
import pageObjects.ShoppingCartPage;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class PurchaseBook {
    Login LogIn = new Login(chrome);
    HomePage home = new HomePage(chrome);
    ShoppingCartPage shopCart = new ShoppingCartPage(chrome);
    AgreeAndCheckOutButton buttons = new AgreeAndCheckOutButton(chrome);

    @Given("Customer is in home page of DemoWebShop")
    public void customer_is_in_home_page_of_demo_web_shop() {
        home.launch();
    }

    @Then("Customer logs in")
    public void customer_logs_in(){
        LogIn.launch();
        LogIn.with("leahope@gmail.com", "p@ssword");
    }

    @When("Customer searches for book")
    public void customer_searches_for_book() {
        home.search("book");
    }

    @And("Customer clicks on Add cart button and opens shopping cart")
    public void customer_clicks_on_add_cart_button_and_opens_shopping_cart() {
        shopCart.shopCart();
    }

    @When("Customer clicks on Agree and Checkout buttons")
    public void customer_clicks_on_agree_and_checkout_buttons() {
        buttons.buttons();
    }

    @When("Customer chooses delivery methods")
    public void customer_chooses_delivery_methods()  {
        buttons.shipInfo();
    }

    @Then("Verify Text: Thank You")
    public void verify_text_thank_you() {
        buttons.thankYou();
    }

}
