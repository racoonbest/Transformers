package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class PurchaseJewelry {

    @When("Clicks on Jewelry menu")
    public void clicks_on_jewelry_menu() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(By.cssSelector(".top-menu [href$=jewelry]")).click();
    }
    @Then("Customer able to see jewelry items")
    public void customer_able_to_see_jewelry_items() {
        chrome.findElement(By.className("product-grid")).isDisplayed();
    }
    @When("Customer chooses create own jewelry")
    public void customer_chooses_create_own_jewelry() {
        chrome.findElement(By.cssSelector(".product-title [href*=create-it]")).click();
    }
    @Then("Customer is able to create personalized item")
    public void customer_is_able_to_create_personalized_item() {
       Select type = new Select(chrome.findElement(By.id("product_attribute_71_9_15")));
       type.selectByValue("46");
       chrome.findElement(By.id("product_attribute_71_10_16")).sendKeys("65");
       chrome.findElement(By.id("product_attribute_71_11_17_50")).click();
    }
    @Then("Customer sees verification message")
    public void customer_sees_verification_message(){
        String expectVerify = "Your order has been successfully processed!";
        String actualVerify = chrome.findElement(By.cssSelector(".section.order-completed .title")).getText();
        assertEquals(expectVerify, actualVerify);
    }
}
