package myrunner;

import org.junit.runner.RunWith;

import commonutils.SeleniumMethods;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/java/features"},
					glue= {"stepdefinitions"},
							plugin= {"pretty", "html:Test-output"},
							dryRun = false,
							monochrome = true,
							strict = false,
							tags = {}
					
				)

public class Runner extends SeleniumMethods{

	
	
	
}
