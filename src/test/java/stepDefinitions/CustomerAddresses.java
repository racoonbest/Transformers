package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;


public class CustomerAddresses {


    @When("Customer clicks on Log in")
    public void customer_clicks_on_log_in() {
        chrome.findElement(By.cssSelector(".ico-login")).click();

    }

    @Then("Customer fills out Log in info")
    public void customer_fills_out_log_in_info() {
        chrome.findElement(By.cssSelector("#Email")).sendKeys("simba10@gmail.com");
        chrome.findElement(By.cssSelector("#Password")).sendKeys("simba1");


    }

    @When("Customer clicks on Log in {int}")
    public void customer_clicks_on_log_in(Integer int1) {
        chrome.findElement(By.cssSelector(".returning-wrapper .buttons")).click();

    }
    @Then("Customer clicks on existing Gmail")
    public void customer_clicks_on_existing_gmail() {
        chrome.findElement(By.cssSelector(".header .account")).click();
    }
    @Then("Customer clicks on Addresses")
    public void customer_clicks_on_addresses() {
        chrome.findElement(By.cssSelector(".list .inactive")).click();
    }
    @When("Customer clicks on Add new")
    public void customer_clicks_on_add_new() {
        chrome.findElement(By.cssSelector(".add-button")).click();
    }
    @Then("Customer fills out the Addresses")
    public void customer_fills_out_the_addresses()  {
        chrome.findElement(By.cssSelector("#Address_FirstName")).sendKeys("Leah");
        chrome.findElement(By.cssSelector("#Address_LastName")).sendKeys("Hope");
        chrome.findElement(By.cssSelector("#Address_Email")).sendKeys("simba10@gmail.com");
        Select country = new Select(chrome.findElement(By.cssSelector("#Address_CountryId")));
        country.selectByValue("1");
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select state = new Select(chrome.findElement(By.cssSelector("#Address_StateProvinceId")));
        state.selectByValue("40");
        chrome.findElement(By.cssSelector("#Address_City")).sendKeys("McLean");
        chrome.findElement(By.cssSelector("#Address_Address1")).sendKeys("7912 Jonas Dr");
        chrome.findElement(By.cssSelector("#Address_ZipPostalCode")).sendKeys("11222");
        chrome.findElement(By.cssSelector("#Address_PhoneNumber")).sendKeys("929 800 0000");
    }
    @When("Customer clicks on Save")
    public void customer_clicks_on_save() {
        chrome.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chrome.findElement(By.cssSelector(".save-address-button")).click();
    }
    @Then("Added address Visible")
    public void added_address_visible() {

    }
}
