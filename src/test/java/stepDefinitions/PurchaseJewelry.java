package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;
import static stepDefinitions.TestSuiteSetUp.driver;

public class PurchaseJewelry {

    HomePage start = new HomePage(driver);
    JewelryPage click = new JewelryPage(driver);
    AddCart button = new AddCart(driver);

    @When ("Customer clicks on Add cart button 2")
    public void customer_clicks_on_add_cart_button_2(){
    button.addJewelCart();
    }

    @And("Clicks on Jewelry menu")
    public void clicks_on_jewelry_menu() {
        start.jewelryBar();
    }
    @Then("Customer able to see jewelry items")
    public void customer_able_to_see_jewelry_items() {
        click.jewTitle();
    }
    @When("Customer creates personalized jewelry")
    public void customer_creates_personalized_jewelry() {
        click.createJwry();
    }
}
