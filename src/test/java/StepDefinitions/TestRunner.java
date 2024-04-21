package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
                 glue = "StepDefinitions",
                 tags="@E2E",
                 plugin= {"pretty"
                         ,"html:target/report/report.html"

                 })
public class TestRunner {
}
