package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class OrderStatus {

    @When("Customer clicks on username")
    public void customer_clicks_on_username() {
        chrome.findElement(By.cssSelector(".header-links .account")).click();
    }

    @When("Customer opens orders list")
    public void customer_opens_orders_list() {
        chrome.findElement(By.cssSelector(".inactive[href*=orders]")).click();
    }

    @When("Searches for order by number")
    public void searches_for_order_by_number() {
        chrome.findElement(By.cssSelector(".page-title")).isDisplayed();
    }

    @Then("Customer verifies order status")
    public void customer_verifies_order_status() {
        String expOrderNum = "Your order";
        String actOrderNum = chrome.findElement(By.cssSelector(".section.order-item:first-child")).getText();
        assertEquals(expOrderNum,actOrderNum);
    }
}
