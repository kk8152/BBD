package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefile/Expractice.feature", glue="stepDefinition",monochrome=true,
format={"html:report/webReport","json:report/jsonwebReport.json"})
public class Expracticrunner {

}
