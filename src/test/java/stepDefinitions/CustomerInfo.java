package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import pageObjects.ChangeInfoPage;
import pageObjects.Login;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class CustomerInfo {
    Login logIn;
    ChangeInfoPage changeInfo;


    @Given("Customer is on Login page")
    public void customer_is_on_login_page() {
        logIn = new Login(chrome);
        logIn.launch();
        chrome.manage().window().maximize();
    }

    @When("Customer enters login credential")
    public void customer_enters_login_credential() {
        logIn.with("simba10@gmail.com","simba1");
    }



    @When("Customer changes info under my account")
    public void customer_changes_info_under_my_account() {
        changeInfo= new ChangeInfoPage();
        changeInfo.personalDetails(RandomStringUtils.randomAlphabetic(5),
                RandomStringUtils.randomAlphabetic(5), "simba10@gmail.com");


    }

}
