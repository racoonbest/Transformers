package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class PurchaseDesktop {
    @When("Customer enters desktop to search")
    public void customer_enters_desktop_to_search() {
        chrome.findElement(By.cssSelector("#small-searchterms")).sendKeys("Computer"+ Keys.ENTER);

    }
    @When("Customer clicks first desktop")
    public void customer_clicks_first_desktop() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(By.cssSelector(".product-grid .product-item .product-title")).click();
    }
    @When("Customer fills out own goods")
    public void customer_fills_out_own_goods() {
        chrome.findElement(By.cssSelector("#product_attribute_72_5_18_65")).click();
        chrome.findElement(By.cssSelector("#product_attribute_72_6_19_55")).click();
        chrome.findElement(By.cssSelector("#product_attribute_72_3_20_58")).click();
        chrome.findElement(By.cssSelector("#product_attribute_72_8_30_94")).click();
    }
    @When("Customer clicks on Add to Cart")
    public void customer_clicks_on_add_to_cart() {
       chrome.findElement(By.cssSelector("#add-to-cart-button-72")).click();
    }
    @Then("Customer sees verify message")
    public void customer_sees_verify_message() {
        String verification = chrome.findElement(By.cssSelector(".bar-notification .content")).getText();
        System.out.println(verification);

    }
    @When("Customer clicks on Shopping cart")
    public void customer_clicks_on_shopping_cart() throws InterruptedException {
        WebElement ele = chrome.findElement(By.cssSelector("#topcartlink"));
        Actions action = new Actions(chrome);
        action.moveToElement(ele).perform();
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(By.cssSelector("#topcartlink")).click();
    }
    @When("Customer fills out Estimate shipping field")
    public void customer_fills_out_estimate_shipping_field() {
        Select country = new Select(chrome.findElement(By.cssSelector("#CountryId")));
        country.selectByValue("1");
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select state = new Select(chrome.findElement(By.cssSelector("#StateProvinceId")));
        state.selectByValue("40");
        chrome.findElement(By.cssSelector("#ZipPostalCode")).sendKeys("11230");
    }
    @When("Customer clicks on Estimate shipping and Checkout buttons")
    public void customer_clicks_on_estimate_shipping_and_checkout_buttons() {
       chrome.findElement(By.cssSelector(".estimate-shipping-button")).click();
       chrome.findElement(By.cssSelector("#termsofservice")).click();
       chrome.findElement(By.cssSelector("#checkout")).click();
    }
    @When("Customer clicks on Checkout continue buttons")
    public void customer_clicks_on_checkout_continue_buttons() {
       chrome.findElement(By.cssSelector("#billing-buttons-container .new-address-next-step-button")).click();
       chrome.findElement(By.cssSelector("#shipping-buttons-container .new-address-next-step-button")).click();
       chrome.findElement(By.cssSelector("#shippingoption_1")).click();
       chrome.findElement(By.cssSelector("#shipping-method-buttons-container .shipping-method-next-step-button")).click();
       chrome.findElement(By.cssSelector("#payment-method-buttons-container .payment-method-next-step-button")).click();
       chrome.findElement(By.cssSelector("#payment-info-buttons-container .payment-info-next-step-button")).click();
       chrome.findElement(By.cssSelector("#confirm-order-buttons-container .confirm-order-next-step-button")).click();
    }
    @Then("Customer sees Thank You")
    public void customer_sees_thank_you() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String thankYou = chrome.findElement(By.cssSelector(".page-title")).getText();
        System.out.println(thankYou);

    }





}
