import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/java/Features/",
        tags = "@Search",
        plugin = {  "html:target/CucumberHTMLReports/cucumber-html-report",
                    "json:target/cucumber.json",
                    "pretty:target/cucumber-pretty.txt",
                    "usage:target/cucumber-usage.json",
                    "junit:target/cucumber-results.xml"},
        junit = "--step-notifications",
        monochrome = true
)
public class RunCucumberTests {
}
