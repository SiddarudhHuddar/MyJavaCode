package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java", glue="stepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
