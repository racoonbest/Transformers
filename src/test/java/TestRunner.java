import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

<<<<<<< Updated upstream
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features/"},
        plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json" }
)

public class TestRunner {


=======
    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/features/"},
            plugin = { "pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json" }
    )
    public class TestRunner {
>>>>>>> Stashed changes
}
