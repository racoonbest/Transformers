package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.CheckoutConfirmation;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class OrderStatus {

    CheckoutConfirmation click, verify;

    @When("Customer clicks on order details")
    public void customer_clicks_on_order_details() {
        click.orderDetails();
    }

    @Then("Customer verifies order status")
    public void customer_verifies_order_status() {
       verify.orderStatus();
    }
}
