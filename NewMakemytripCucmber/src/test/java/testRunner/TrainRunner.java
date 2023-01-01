package testRunner;



import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="FeaturesFile/train.feature",
					glue="stepDefination",
					dryRun=false,
					monochrome=true
					,tags="@train",plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/flightresult.html"})

public class TrainRunner extends AbstractTestNGCucumberTests
{

}
