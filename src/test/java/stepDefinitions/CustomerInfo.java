package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import pageObjects.ChangeInfoPage;
import pageObjects.Login;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class CustomerInfo {
    Login logIn = new Login(chrome);
    ChangeInfoPage changeInfo= new ChangeInfoPage();
    String fName;
    String lName;


    @Given("Customer is on Login page")
    public void customer_is_on_login_page() {
        logIn.launch();
        chrome.manage().window().maximize();
    }

    @When("Customer enters login credential")
    public void customer_enters_login_credential() {
        logIn.with("simba10@gmail.com","simba1");
    }



    @When("Customer changes info under my account")
    public void customer_changes_info_under_my_account() {
        fName = RandomStringUtils.randomAlphabetic(5);
        lName = RandomStringUtils.randomAlphabetic(5);
        changeInfo.personalDetails(fName, lName, "simba10@gmail.com");
    }

    @Then("Customer info should get updated")
    public void customer_info_should_get_updated() {

    }

}
