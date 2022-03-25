package stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


import java.util.concurrent.TimeUnit;

import static stepDefinitions.TestSuiteSetUp.driver;


public class CustomerAddresses {


    @When("Customer clicks on Log in")
    public void customer_clicks_on_log_in() {
        driver.findElement(By.cssSelector(".ico-login")).click();

    }

    @Then("Customer fills out Log in info")
    public void customer_fills_out_log_in_info() {
        driver.findElement(By.cssSelector("#Email")).sendKeys("simba10@gmail.com");
        driver.findElement(By.cssSelector("#Password")).sendKeys("simba1");


    }

    @When("Customer clicks on Log in {int}")
    public void customer_clicks_on_log_in(Integer int1) {
        driver.findElement(By.cssSelector(".returning-wrapper .buttons")).click();

    }
    @Then("Customer clicks on existing Gmail")
    public void customer_clicks_on_existing_gmail() {
        driver.findElement(By.cssSelector(".header .account")).click();
    }
    @Then("Customer clicks on Addresses")
    public void customer_clicks_on_addresses() {
        driver.findElement(By.cssSelector(".list .inactive")).click();
    }
    @When("Customer clicks on Add new")
    public void customer_clicks_on_add_new() {
        driver.findElement(By.cssSelector(".add-button")).click();
    }
    @Then("Customer fills out the Addresses")
    public void customer_fills_out_the_addresses()  {
        driver.findElement(By.cssSelector("#Address_FirstName")).sendKeys("Leah");
        driver.findElement(By.cssSelector("#Address_LastName")).sendKeys("Hope");
        driver.findElement(By.cssSelector("#Address_Email")).sendKeys("simba10@gmail.com");
        Select country = new Select(driver.findElement(By.cssSelector("#Address_CountryId")));
        country.selectByValue("1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select state = new Select(driver.findElement(By.cssSelector("#Address_StateProvinceId")));
        state.selectByValue("40");
        driver.findElement(By.cssSelector("#Address_City")).sendKeys("McLean");
        driver.findElement(By.cssSelector("#Address_Address1")).sendKeys("7912 Jonas Dr");
        driver.findElement(By.cssSelector("#Address_ZipPostalCode")).sendKeys("11222");
        driver.findElement(By.cssSelector("#Address_PhoneNumber")).sendKeys("929 800 0000");
    }
    @When("Customer clicks on Save")
    public void customer_clicks_on_save() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".save-address-button")).click();
    }
    @Then("Added address Visible")
    public void added_address_visible() {

    }
}
