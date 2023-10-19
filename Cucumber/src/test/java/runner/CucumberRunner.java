package runner;

import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = "src/test/java/features", glue = "steps", monochrome = true, publish = true)
public class CucumberRunner extends BaseClass {

}

/*
 * "features" attribute is used to connect the .feature files with the runner.
 * "glue" attribute is used to connect the StepDeifinition file with the runner.
 * "monochrome" atrribute is used to remove junk text in the eclipse IDE console.
 * "publish" attribute is used to publish the report (self-destrucrtable in 24 hrs).
 */

// AbstractTestNGCucumberTests - an abstract class which runs each cucumber scenario found in the features as seperated test