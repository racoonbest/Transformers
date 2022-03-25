package stepDefinitions;

import pageObjects.EmailAFriendPage;
import pageObjects.HomePage;
import pageObjects.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.chrome;

public class EmailAFriend {

    Login LogIn = new Login(chrome);;
    HomePage home = new HomePage(chrome);
    EmailAFriendPage emailAFriend = new EmailAFriendPage();

    @When("Customer logs in to the website")
    public void customer_logs_in_to_the_website() {

        LogIn.launch();
        LogIn.with("jane.doe@yahoo.com", "Demoweb123!");
    }

    @When("Enter book to search")
    public void enter_book_to_search() {
        home.search("book");
    }

    @When("Customer Emails a friend")
    public void customer_emails_a_friend() {
        emailAFriend.personalDetails("hellofriend@gmail.com","you can try if you like buy me one!");

    }

    @Then("Verify text: Your message has been sent.")
    public void verify_text_your_message_has_been_sent() {
        String actual = chrome.findElement(By.cssSelector(".result")).getText();
        String expect = "Your message has been sent.";
        assertEquals(actual, expect);
    }
}
