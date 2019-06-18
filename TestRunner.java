package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\UpradeK\\workspace\\MercuryBDDFrmWrk\\src\\main\\java\\Feature"},
               glue={"StepDefinition"}
                           		)

public class TestRunner {

}
