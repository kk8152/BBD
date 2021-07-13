package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefile/Examples.feature", glue="stepDefinition",monochrome=true)
public class Examplerunner {

}
