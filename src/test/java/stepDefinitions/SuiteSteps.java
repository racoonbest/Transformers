package stepDefenition;

import org.junit.After;
import org.junit.Before;

public class SuiteSteps {
    public static WebDriver chrome;
    private Object application;
    @Before
    public void setupSuite(){
        WebDriverManager.chromedriver().setup();
        chrome = new ChromeDriver();

    }


    @After
    public void lastStep(){
        chrome.quit();
    }
}
