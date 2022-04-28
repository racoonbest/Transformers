package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccessoriesPage;
import pageObjects.DemoHomePage;
import pageObjects.Login;
import pageObjects.Shopping_Cart_Page;

import java.util.concurrent.TimeUnit;

import static stepDefinitions.TestSuiteSetUp.driver;

public class PurchaseAccessory {

    DemoHomePage homePage = new DemoHomePage(driver);
    AccessoriesPage accessoriesPage = new AccessoriesPage(driver);
    Shopping_Cart_Page shoppingCartPage = new Shopping_Cart_Page(driver);
    Login login = new Login(driver);


    @When("Navigate Computers menu and select Accessories")
    public void navigate_computers_menu_and_select_accessories() {
        homePage.navigate_computers_menu_and_select_accessories();

    }

    @When("Select TCP Instructor Led Training and add to cart")
    public void select_tcp_instructor_led_training_and_add_to_cart() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       accessoriesPage.select_tcp_instructor_led_training_and_add_to_cart();

    }

    @When("Go to shopping cart")
    public void go_to_shopping_cart() throws InterruptedException {
        shoppingCartPage.user_clicks_on_shopping_cart();

    }

    @When("Fill out Estimated Shipping info")
    public void fill_out_estimated_shipping_info() {

    }

    @When("Click agreement term and click checkout")
    public void click_agreement_term_and_click_checkout() {
        shoppingCartPage.user_clicks_on_agreement_and_checkout();

    }

    @Given("User in DemoShop home page")
    public void userInDemoShopHomePage() {
        homePage.launch();
    }

    @When("User clicks on log in link")
    public void userClicksOnLogInLink() {
        login.clickLogInLink();

    }

    @When("User enters log in and pass and clicks log in btn")
    public void userEntersLogInAndPassAndClicksLogInBtn() {
        login.with("john1234@gmail.com","john1234");
    }

    @When("User selects shipping method and clicks continue")
    public void userSelectsShippingMethodAndClicksContinue() {
        shoppingCartPage.user_selects_shipping_method_and_clicks_continue();
    }

    @When("User selects payment method")
    public void userSelectsPaymentMethod() {
        shoppingCartPage.user_selects_payment_method();
    }

    @When("User enters payment info and clicks continue")
    public void userEntersPaymentInfoAndClicksContinue() {
        shoppingCartPage.user_enters_payment_info_and_clicks_continue
                ("Visa","John","3256 4785 4125 7856", Integer.parseInt("7"),"2025","563");
    }

    @Then("Verify message: Your order has been successfully processed!")
    public void verifyMessageYourOrderHasBeenSuccessfullyProcessed() {
        shoppingCartPage.confirm_order_and_clicks_continue();
    }

    @When("User fill outs billing form and clicks continue")
    public void userFillOutsBillingFormAndClicksContinue() {
        shoppingCartPage.clickContinueBtn();
        shoppingCartPage.shippingAddress();
    }
}
