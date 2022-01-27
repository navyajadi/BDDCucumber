package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {".\\src\\test\\java\\feature\\Sample.feature"},
		tags="@regressiontest or @smoketest",
		glue= {"StepDefinition_Sample", "Hooks"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		)

public class TestRunner extends AbstractTestNGCucumberTests  {
	
}
