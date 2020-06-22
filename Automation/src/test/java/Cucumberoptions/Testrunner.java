package Cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features", strict=true, monochrome=true,
		glue="StepDefinitions",
	    tags= {"@SmokeTest,@Regtest"}
	    
		)


public class Testrunner {
	
	
}
