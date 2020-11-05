package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\KIIT\\eclipse-workspace\\FreeCrmBDDFramework\\src\\main\\java\\features\\tagging.feature"
		,glue = {"stepdefinitions"},
		plugin= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		dryRun = false,
		monochrome = true,
		tags = {"@SmokeTest","~@RegressionTest"}
		)
public class TestRunner {

}
