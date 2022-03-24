package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;
import static stepDefinitions.TestSuiteSetUp.driver;

public class OrderStatus {

    CheckoutConfirmation click = new CheckoutConfirmation(driver);

    @When("Customer clicks on order details")
    public void customer_clicks_on_order_details() {
        click.orderDetails();
    }

    @Then("Customer verifies order status")
    public void customer_verifies_order_status() {
       click.orderStatus();
    }
}
