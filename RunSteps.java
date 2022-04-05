package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;


@CucumberOptions(features = "src/test/java/feature/CreateLead.feature",
glue = "steps",
monochrome = true,
publish=true
//tags= "@smoke and @sanity"
		)


public class RunSteps extends BaseClass {

}
