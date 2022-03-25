package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pageObjects.*;
import static stepDefinitions.TestSuiteSetUp.driver;

public class PurchaseJewelry {

    HomePage start = new HomePage(driver);
    JewelryPage click = new JewelryPage(driver);

    @And("Clicks on Jewelry menu")
    public void clicks_on_jewelry_menu() {

    }
    @Then("Customer able to see jewelry items")
    public void customer_able_to_see_jewelry_items() {
        driver.findElement(By.className("product-grid")).isDisplayed();
    }
    @When("Customer chooses create own jewelry")
    public void customer_chooses_create_own_jewelry() {
        driver.findElement(By.cssSelector(".product-title [href*=create-it]")).click();
    }
    @And("Customer is able to create personalized item")
    public void customer_is_able_to_create_personalized_item() {
       Select type = new Select(driver.findElement(By.id("product_attribute_71_9_15")));
       type.selectByValue("46");
       driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("65");
       driver.findElement(By.id("product_attribute_71_11_17_50")).click();
    
    }
}
