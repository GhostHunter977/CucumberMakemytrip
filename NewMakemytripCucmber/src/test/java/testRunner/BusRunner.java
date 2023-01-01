package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeaturesFile/buses.feature",
					glue="stepDefination",
					dryRun=false
					,tags="@buses",plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/flightresult.html"})


public class BusRunner {

}
