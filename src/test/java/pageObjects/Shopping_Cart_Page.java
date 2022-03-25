package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class Shopping_Cart_Page {

    WebDriver chrome;

    By agreementCheckBox = By.cssSelector("input[name=\'termsofservice\']");
    By getAgreementCheck_OutBtn = By.cssSelector("button[name=\'checkout\']");
    By billingAddressBox = By.cssSelector("label[for='BillingNewAddress_Company']");
    By country_Billing_Address_DropDown = By.cssSelector("select[name=\'BillingNewAddress.CountryId\']");
    By state_Billing_Address_DropDown = By.cssSelector("select[id=\'BillingNewAddress_StateProvinceId\']");
    By city_inputBox_Billing_Address = By.cssSelector("input[id=\'BillingNewAddress_City\']");
    By address1_inputBox_Billing_Address = By.cssSelector("input[id=\'BillingNewAddress_Address1\']");
    By zipCode_inputBox_Billing_Address = By.cssSelector("input[id=\'BillingNewAddress_ZipPostalCode\']");
    By phoneNumber_inputBox_Billing_Address = By.cssSelector("input[id=\'BillingNewAddress_PhoneNumber\']");
    By continueBtn_Billing_Address = By.cssSelector(".buttons [title=\'Continue\']");
    By continueBtn_Shipping_Address = By.cssSelector(".buttons input[onclick=\'Shipping.save()\']");
    By continueBth_If_form_filled_out = By.cssSelector("input[onclick=\'Billing.save()\']");
    By creditCard_CheckBox = By.cssSelector("#paymentmethod_2");
    By getCreditCard_ContinueBtn = By.cssSelector("input[onclick=\'PaymentMethod.save()\']");
    By nextDayAir_Shipping = By.cssSelector("#shippingoption_1");
    By shippingMethod_ContinueBtn = By.cssSelector("input[onclick=\'ShippingMethod.save()\']");
    By creditCard_typeDD = By.cssSelector("#CreditCardType");
    By cardHolderName_input = By.cssSelector("#CardholderName");
    By cardNumber_inputBox = By.cssSelector("#CardNumber");
    By expirationMonth = By.cssSelector("#ExpireMonth");
    By expirationYear = By.cssSelector("#ExpireYear");
    By cardCode = By.cssSelector("#CardCode");
    By payInfo_continueBtn = By.cssSelector("input[onclick=\'PaymentInfo.save()\']");
    By billingInfo = By.cssSelector(".billing-info");
    By confirmBtn = By.cssSelector("input[onclick=\'ConfirmOrder.save()\']");
    By confirmMessage = By.cssSelector("div[class='title']");
    By continueBtn_ToHomePage = By.xpath("//input[@class= 'button-2 order-completed-continue-button']");
    By shoppingCart_Link = By.xpath("//a[@class=\'ico-cart\']");

    public Shopping_Cart_Page(WebDriver chrome) {
        this.chrome = chrome;
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void user_clicks_on_shopping_cart() throws InterruptedException {
        Thread.sleep(1000);
        chrome.findElement(shoppingCart_Link).click();
    }


    public void shopping_cart_page_should_display() {
        String title = chrome.getTitle();
        Assert.assertEquals("Demo Web Shop. Shopping Cart", title);
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void user_clicks_on_agreement_and_checkout() {
        chrome.findElement(agreementCheckBox).click();
        chrome.findElement(getAgreementCheck_OutBtn).click();
    }


    public void shippingAddress() {
        chrome.findElement(continueBtn_Shipping_Address).click();
    }

    public void user_selects_payment_method() {
        chrome.findElement(creditCard_CheckBox).click();
        chrome.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        chrome.findElement(getCreditCard_ContinueBtn).click();
    }

    public void user_selects_shipping_method_and_clicks_continue() {
        chrome.findElement(nextDayAir_Shipping).click();
        chrome.findElement(shippingMethod_ContinueBtn).click();
    }

    public void user_enters_payment_info_and_clicks_continue
            (String cartType, String CartHolderName, String cardNum, int month, String year, String code) {
        Select creditCardDD = new Select(chrome.findElement(creditCard_typeDD));
        creditCardDD.selectByVisibleText(cartType);
        chrome.findElement(cardHolderName_input).sendKeys(CartHolderName);
        chrome.findElement(cardNumber_inputBox).sendKeys(cardNum);
        Select expireMonthDD = new Select(chrome.findElement(expirationMonth));
        expireMonthDD.selectByIndex(month);
        Select expireYearDD = new Select(chrome.findElement(expirationYear));
        expireYearDD.selectByVisibleText(year);
        chrome.findElement(cardCode).sendKeys(code);
        chrome.findElement(payInfo_continueBtn).click();
    }

    public void confirm_order_and_clicks_continue()  {
        boolean result = chrome.findElement(billingInfo).isDisplayed();
        Assert.assertTrue(result);
        chrome.findElement(confirmBtn).click();
        String actual = chrome.findElement(confirmMessage).getText();
        String expected = "Your order has been successfully processed!";
        Assert.assertEquals(expected, actual);
        chrome.findElement(continueBtn_ToHomePage).click();
    }
    public void clickContinueBtn(){
        chrome.findElement(continueBth_If_form_filled_out).click();
    }

}
