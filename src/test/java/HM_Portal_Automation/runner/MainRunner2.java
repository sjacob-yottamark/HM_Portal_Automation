package HM_Portal_Automation.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = {"src/test/java/HM_Portal_Automation/FeatureFiles/"},
		glue = {"HM_Portal_Automation.Steps"},
		monochrome = true,
		dryRun = false,
		tags = {"@insightslinks"},
		plugin = {"pretty", 
				  "html:output/cucumber",
				  "json:output/cucumber.json", 
				  "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
		)

public class MainRunner2 {
	
}
