package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "html:cucumber-reports/htmlreprt.html", "json:cucumber-reports/report.json" },
		features = {"C:\\Users\\sayan.bhandari\\eclipse-workspace\\CucumberTraining_17-10-2022\\src\\test\\resources\\features\\tagFeature.feature" },
		glue = { "stepdefinitions" },
		tags = "@uitag1",
		dryRun = false)

public class TestRunner1 {

}