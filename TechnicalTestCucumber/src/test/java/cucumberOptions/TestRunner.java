package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/SignIn.feature", glue = "stepDefinations", plugin = {
		"json:target/jsonReports/cucumber.json", "pretty", })
public class TestRunner {

}
