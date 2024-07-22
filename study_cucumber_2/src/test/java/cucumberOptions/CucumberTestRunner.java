package cucumberOptions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        monochrome = true,
        plugin = {"pretty","html:target/site/cucuber-report-default","json:target/site/cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@displayed"
)
public class CucumberTestRunner {
}
