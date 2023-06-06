package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

  @RunWith(Cucumber.class)   
  @CucumberOptions(features = "C:\\Users\\User\\eclipse-workspace\\Cucumber_Projects\\src\\test\\java\\feature"
  	, glue = {"stepdefitn"}, plugin = {"pretty", "html:target/Htmlreports.html"},
monochrome = true, dryRun = false)
public class Runner {

}
