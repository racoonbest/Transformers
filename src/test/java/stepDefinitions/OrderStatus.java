package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class OrderStatus {

    @When("Customer clicks on order details")
    public void customer_clicks_on_order_details() {
        chrome.findElement(By.cssSelector("[href*=orderdetails]")).click();
    }

    @Then("Customer verifies order status")
    public void customer_verifies_order_status() {
        String expOrderNum = "Order Number";
        String actOrderNum = chrome.findElement(By.cssSelector(".order-details span:nth-child(2)")).getText();
        assertEquals(expOrderNum,actOrderNum);
    }
}
