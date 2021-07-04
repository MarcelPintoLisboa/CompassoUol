package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        strict = true,
        glue={""},
          
   		tags = {"@tag"}, 
   				plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
   						
		monochrome = true)
 

public class RunnerTest {

	  }

