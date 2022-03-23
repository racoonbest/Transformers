package stepDefinitions;

import pageObjects.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class EmailAFriend {

    Login LogIn;

    @When("Customer logs in to the website")
    public void customer_logs_in_to_the_website() {
        LogIn = new Login(chrome);
        LogIn.launch();
        LogIn.with("jane.doe@yahoo.com", "Demoweb123!");
    }

    @When("Enter book to search")
    public void enter_book_to_search() {
        chrome.findElement(By.name("q")).sendKeys("book");
        chrome.findElement(By.cssSelector(".search-box-button")).click();
    }

    @And("Clicks the health book item")
    public void clicks_the_health_book_item() {
        chrome.findElement(By.partialLinkText("Health Book")).click();
    }

    @When("Clicks email a friend button")
    public void clicks_email_a_friend_button() {
        chrome.findElement(By.cssSelector("[value = 'Email a friend']")).click();
    }

    @And("Fills out the blanks and click send email button")
    public void fills_out_the_blanks_and_click_send_email_button() {
        chrome.findElement(By.cssSelector(".friend-email")).sendKeys("johndoe13@gmail.com"); // Friend's email
        chrome.findElement(By.cssSelector(".personal-message"))
                .sendKeys("I strongly recommend this book for your health!"); // enter message
        chrome.findElement(By.name("send-email")).click(); // click send email button
    }

    @Then("Verify text: Your message has been sent.")
    public void verify_text_your_message_has_been_sent() {
        boolean message = chrome.findElement(By.cssSelector(".result")).isDisplayed();
        System.out.println(message);
    }
}
