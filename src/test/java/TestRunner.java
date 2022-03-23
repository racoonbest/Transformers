import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/features/"},
        plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json" }
)

public class TestRunner {


}

