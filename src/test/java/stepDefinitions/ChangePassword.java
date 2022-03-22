package stepDefinitions;

import pageObjects.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class ChangePassword {

    Login LogIn;

    @Given("Customer is on Login page")
    public void customer_is_on_login_page() {
        LogIn = new Login(chrome);
        LogIn.launch();
        chrome.manage().window().maximize();
    }

    @When("Customer enters login credential")
    public void customer_enters_login_credential() {
        LogIn.with("simba10@gmail.com", "simba11");
    }

    @When("Customer clicks on Email on homepage")
    public void customer_clicks_on_email_on_homepage() {
        chrome.findElement(By.cssSelector(".account")).click();
    }

    @When("Customer clicks Change password in My account")
    public void customer_clicks_change_password_in_my_account() {
        chrome.findElement(By.partialLinkText("Change password")).click();
    }

    @When("Customer changes password")
    public void customer_changes_password() {
        chrome.findElement(By.cssSelector("#OldPassword")).sendKeys("simba11");
        chrome.findElement(By.cssSelector("#NewPassword")).sendKeys("simba1");
        chrome.findElement(By.cssSelector("#ConfirmNewPassword")).sendKeys("simba1");
        WebDriverWait wait = new WebDriverWait(chrome, 20);
        chrome.findElement(By.cssSelector("[value = 'Change password']")).click();
    }

    @Then("Verify Text: Password was changed")
    public void verify_text_password_was_changed() {
        boolean message = chrome.findElement(By.cssSelector(".result")).isDisplayed();
        System.out.println(message);
    }
}
