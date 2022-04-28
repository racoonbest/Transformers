package stepDefinitions;


import io.cucumber.datatable.internal.difflib.StringUtills;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

@CucumberOptions(
        features = {"src/test/features"},
        glue = {"stepDefinitions"},
        tags = "@regression",
        plugin = { "pretty", "html:target/cucumber-reports.html" },
        )

public class TestSuiteSetUp extends AbstractTestNGCucumberTests {

        public static WebDriver driver;
        @Parameters({"browser"})
        @BeforeTest
        public void setUp(String browser){
            if(StringUtils.equalsIgnoreCase(browser, "chrome")){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }else if(StringUtils.equalsIgnoreCase(browser, "firefox")){
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }else if(StringUtils.equalsIgnoreCase(browser, "edge")){
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            } else{
                throw new RuntimeException("Can't resolve to any browser");
            }
        }

        @AfterTest
        public void tearDown(){
            driver.quit();
        }



    }




