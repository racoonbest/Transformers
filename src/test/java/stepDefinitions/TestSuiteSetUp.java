package stepDefinitions;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSuiteSetUp {

        public static WebDriver chrome;
        WebDriver fireFox;

        @Before
        public void setupSuite(){
            System.setProperty("webdriver.chrome.driver", "src\\test\\drivers\\chromedriver.exe");
          //  System.setProperty("webdriver.gecko.driver", "src\\test\\drivers\\geckodriver.exe");
            //WebDriverManager.chromedriver().setup();
            chrome = new ChromeDriver();
           // chrome = new FirefoxDriver();
            //fireFox = new FirefoxDriver();
        }


//        @After
//        public void lastStep(){
//            chrome.quit();
//        }
    }




