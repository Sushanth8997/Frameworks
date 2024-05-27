package StepDefinations;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/BackgroundFeature/Background.feature",

		glue= {"StepDefinationsBackGround"},
				plugin={"pretty", "html:target/HTMLReports/reports.html",
						"pretty", "json:target/JSONReports/report.json",
						"pretty", "junit:target/JUNITReports/report.xml"}
				
		)
public class TestRunnerBackground {

}
