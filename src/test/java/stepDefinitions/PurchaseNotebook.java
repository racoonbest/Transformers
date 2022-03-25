package stepDefinitions;

import io.cucumber.java.en.When;
import pageObjects.HomePage;
import static stepDefinitions.TestSuiteSetUp.driver;

public class PurchaseNotebook {

    HomePage start = new HomePage(driver);
    @When("Customer searches for laptop")
    public void customer_searches_for_laptop(){
        start.search("laptop");
    }

}