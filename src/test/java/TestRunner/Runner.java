package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions
        (
		    features= {"src/test/java/Features/Search.feature"},
		    glue= {"StepDefinition", "CucumberHooks"},
		    plugin= {"pretty"},
		    monochrome = true
		)
public class Runner 
{

}
