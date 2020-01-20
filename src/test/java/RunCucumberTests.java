import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/java/Features/",
        tags = "@Search",
        plugin = "html:target/CucumberHTMLReports/cucumber-html-report",
        junit = "--step-notifications",
        monochrome = true
)
public class RunCucumberTests {
}
