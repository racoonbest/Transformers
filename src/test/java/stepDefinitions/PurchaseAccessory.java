package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static stepDefinitions.TestSuiteSetUp.chrome;



public class PurchaseAccessory {

    @Given("User in DemoShop home page")
    public void user_in_demo_shop_home_page() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.get("http://demowebshop.tricentis.com");
    }

    @When("User clicks on log in link")
    public void user_clicks_on_log_in_link() {
        chrome.findElement(By.cssSelector("a[class=\'ico-login\']")).click();
        chrome.manage().window().maximize();
    }
    @When("Navigate Computers menu and select Accessories")
    public void navigate_computers_menu_and_select_accessories() {
        chrome.findElement(By.cssSelector(".header-menu [href=\"/computers\"]")).click();
        chrome.findElement(By.cssSelector("[alt=\"Picture for category Accessories\"]")).click();
    }

    @When("Select TCP Instructor Led Training and add to cart")
    public void select_tcp_instructor_led_training_and_add_to_cart() {
        chrome.findElement(By.partialLinkText("TCP Instructor Led Training")).click();
        chrome.findElement(By.cssSelector("input[id=\'add-to-cart-button-66\']")).click();
    }
    @When("User enters log in and pass and clicks log in btn")
    public void userEntersLogInAndPassAndClicksLogInBtn() {
        chrome.findElement(By.cssSelector("#Email")).sendKeys("john1234@gmail.com");
        chrome.findElement(By.cssSelector("#Password")).sendKeys("john1234");
        chrome.findElement(By.cssSelector("input[value=\'Log in\']")).click();
    }

    @When("Go to shopping cart")
    public void go_to_shopping_cart() {
        chrome.findElement(By.cssSelector(".ico-cart")).click();
    }

    @When("Fill out Estimated Shipping info")
    public void fill_out_estimated_shipping_info() {
        Select country = new Select(chrome.findElement(By.cssSelector("#CountryId")));
        country.selectByVisibleText("United States");
        Select state = new Select(chrome.findElement(By.cssSelector("#StateProvinceId")));
        state.selectByVisibleText("Virginia");
        chrome.findElement(By.cssSelector("#ZipPostalCode")).sendKeys("22102");
    }

    @When("Click agreement term and click checkout")
    public void click_agreement_term_and_click_checkout() {
        chrome.findElement(By.cssSelector("#termsofservice")).click();
        chrome.findElement(By.cssSelector("#checkout")).click();
    }

    @When("Fill out checkout steps")
    public void fill_out_checkout_steps() {
        chrome.findElement(By.cssSelector("input[class=\'button-1 new-address-next-step-button\']")).click();
        chrome.findElement(By.cssSelector("input[onclick=\'Shipping.save()\']")).click();
    }

    @Then("Verify message: Your order has been successfully processed!")
    public void verify_message_your_order_has_been_successfully_processed() {
        chrome.findElement(By.cssSelector("input[onclick=\'ConfirmOrder.save()\']")).click();
        String expected = "Your order has been successfully processed!";
        String actual = chrome.findElement(By.cssSelector("div[class=\'title\']")).getText();
        assertEquals(expected, actual);
    }

    @When("User selects shipping method and clicks continue")
    public void userSelectsShippingMethodAndClicksContinue() {
        chrome.findElement(By.cssSelector("#shippingoption_1")).click();
        chrome.findElement(By.cssSelector("input[onclick=\'ShippingMethod.save()\']")).click();
    }

    @When("User selects payment method")
    public void userSelectsPaymentMethod() throws InterruptedException {
        chrome.findElement(By.cssSelector("#paymentmethod_2")).click();
        Thread.sleep(1000);
        chrome.findElement(By.cssSelector("input[onclick=\'PaymentMethod.save()\']")).click();
    }

    @When("User enters payment info and clicks continue")
    public void userEntersPaymentInfoAndClicksContinue() {
        chrome.findElement(By.cssSelector("#CreditCardType"));
        Select creditCardDD = new Select(chrome.findElement(By.cssSelector("#CreditCardType")));
        creditCardDD.selectByVisibleText("Visa");
        chrome.findElement(By.cssSelector("#CardholderName")).sendKeys("John");
        chrome.findElement(By.cssSelector("#CardNumber")).sendKeys("3256 4785 4125 7856");
        chrome.findElement(By.cssSelector("#ExpireMonth"));
        Select expireMonthDD = new Select(chrome.findElement(By.cssSelector("#ExpireMonth")));
        expireMonthDD.selectByIndex(7);
        chrome.findElement(By.cssSelector("#ExpireYear"));
        Select expireYearDD = new Select(chrome.findElement(By.cssSelector("#ExpireYear")));
        expireYearDD.selectByVisibleText("2025");
        chrome.findElement(By.cssSelector("#CardCode")).sendKeys("569");
        chrome.findElement(By.cssSelector("input[onclick=\'PaymentInfo.save()\']")).click();
    }


}
