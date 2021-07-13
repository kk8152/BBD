package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefile/php.feature", glue="stepDefinition",dryRun= true,
monochrome=true) 
//format={"html:report/weReport","json:report/jsonweReport.json"})
public class Phprunner {


}
