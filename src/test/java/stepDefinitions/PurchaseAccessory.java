package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class PurchaseAccessory {

    @Given("Customer is on DemoShop home page")
    public void customer_is_on_demo_shop_home_page() {
        chrome.get("http://demowebshop.tricentis.com/");
        chrome.manage().window().maximize();
    }
}
