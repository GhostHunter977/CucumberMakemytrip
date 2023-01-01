package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeaturesFile/hotels.feature",
					glue="stepDefination",
					dryRun=false
					,tags="@hotels",plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/flightresult.html"})



public class HotelsRunner {

}
