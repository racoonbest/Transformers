package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ApparelShoesPage;
import pageObjects.*;
import static stepDefinitions.TestSuiteSetUp.driver;

public class PurchaseApparel {

    HomePage bars = new HomePage(driver);
    ApparelShoesPage click = new ApparelShoesPage(driver);

    @When("Customer clicks on Apparel and Shoes menu")
    public void customer_clicks_on_apparel_and_shoes_menu() {
        bars.apparelBar();
    }

    @Then("Customer is able to navigate menu items")
    public void customer_is_able_to_navigate_menu_items() {
       click.pageTitleAS(driver);
    }

    @When("Customer finds an item to be purchased")
    public void customer_finds_an_item_to_be_purchased() {
        click.item();
    }
}