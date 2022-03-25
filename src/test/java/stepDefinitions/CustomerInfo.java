package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import pageObjects.ChangeInfoPage;
import pageObjects.Login;

import static org.junit.Assert.assertEquals;
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
    @When("log out and log in back")
    public void log_out_and_log_in_back() {
        chrome.findElement(By.cssSelector("a[href='/logout'")).click();
        logIn.with("simba10@gmail.com","simba1");
        chrome.findElement(By.cssSelector(".account")).click();

    }

    @Then("Customer info should get updated")
    public void customer_info_should_get_updated() {
        String actual = chrome.findElement(By.cssSelector("#LastName")).getAttribute("value");
        String expected = lName;
        assertEquals(expected, actual);


    }

}
