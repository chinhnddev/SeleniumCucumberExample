package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = {"steps"},
        monochrome = true, plugin = {"pretty", "json:target/JSONReports/report.json"})
public class Runner {

}