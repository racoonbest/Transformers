package pageObjects;

import static stepDefinitions.TestSuiteSetUp.chrome;

public class DemoWebShopHome {

    public static void homePage() {
        chrome.get("http://demowebshop.tricentis.com/");
        chrome.manage().window().maximize();
    }
}
