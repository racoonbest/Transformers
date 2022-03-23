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
            chrome = new ChromeDriver();
        }


//       @After
//        public void lastStep(){
//            chrome.quit();
//        }
    }
