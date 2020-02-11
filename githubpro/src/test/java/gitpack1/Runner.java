package gitpack1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"json:/src/test/java/report/output/cucumber.json"}
		)
public class Runner {

}
