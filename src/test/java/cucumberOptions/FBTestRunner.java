package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/facebook/features",
        glue = "facebook/Definitions",
        plugin = {"pretty","html:target/site/cucuber-report-default","json:target/site/cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@fb"
)
public class FBTestRunner {
}
