package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class TestSuiteSetUp {

        public static WebDriver chrome;

        @Before
        public void setupSuite(){
            WebDriverManager.chromedriver().setup();
//            System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver");
            chrome = new ChromeDriver();
        }


   
        @After
        public void lastStep(){
            chrome.quit();
        }
    }




      

        @After
        public void lastStep(){
            chrome.quit();
        }
    }
