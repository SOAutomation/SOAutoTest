package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\main\\resources\\AppFeatures"},
		glue = { "StepDefinations", "AppHooks" }, 
		tags = "@32962",
		monochrome = true,
		dryRun = true,
		plugin = {"pretty",
				"html:target/HTMLReporthtml/htmlreport.html",
				
				
		}
	)

public class runner {
	 

}

