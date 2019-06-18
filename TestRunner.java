package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\UpradeK\\workspace\\MercuryToursBDDFrameWork\\src\\main\\java\\featureFile"},
               glue={"stepDefination"}
                           		)


public class TestRunner {
	


	

}
