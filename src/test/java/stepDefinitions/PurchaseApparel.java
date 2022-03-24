package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class PurchaseApparel {

    @When("Customer clicks on Apparel and Shoes menu")
    public void customer_clicks_on_apparel_and_shoes_menu(){
        chrome.findElement(By.cssSelector(".top-menu [href*=apparel-shoes]")).click();
    }

    @Then("Customer is able to navigate menu items")
    public void customer_is_able_to_navigate_menu_items(){
        String expectedTitle = "Apparel & Shoes";
        String actualTitle = chrome.findElement(By.cssSelector(".page-title")).getText();
        assertEquals(expectedTitle, actualTitle);
    }

    @Then ("Customer finds an item to be purchased")
    public void customer_finds_an_item_to_be_purchased(){
        String expName="Casual Golf Belt";
        String actName=chrome.findElement(By.cssSelector(".product-title [href*=casual-belt]")).getText();
        assertEquals(expName, actName);
    }





}
