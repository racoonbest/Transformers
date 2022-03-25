package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class TestSuiteSetUp {

        public static WebDriver driver;

        @Before
        public void setupSuite(){
            WebDriverManager.chromedriver().setup();
//            System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver");
            driver = new ChromeDriver();
        }

        @After
        public void lastStep(){
            driver.quit();
        }
    }
