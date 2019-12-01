package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featureFiles"
		,glue = {"testCases"}
		,plugin= {"html:target/cucumber-html-report"}
		)

public class TestRunner {
	

	
}

