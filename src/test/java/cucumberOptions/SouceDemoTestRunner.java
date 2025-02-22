package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/sourceDemo/features",
        glue = {"sourceDemo/stepDefinitions"},
        plugin = {"pretty","html:target/site/cucuber-report-default","json:target/site/cucumberSouceDemo.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@createNewCustomer or @createNewCustomer2"
)
public class SouceDemoTestRunner {
}
