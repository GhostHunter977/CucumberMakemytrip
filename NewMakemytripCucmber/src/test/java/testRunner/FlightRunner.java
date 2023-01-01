package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="FeaturesFile/makeFeature.feature",
						glue="stepDefination",
						dryRun=false,tags="@Flightbooking",plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/flightresult.html"})
	public class FlightRunner
	{
	
	//plugin= {"com.cucumber.listener.ExtentCucumberFormatter:reports/flightresult.html"}
	}


