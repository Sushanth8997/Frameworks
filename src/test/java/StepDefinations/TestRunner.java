package StepDefinations;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature", glue= {"StepDefinations"},

        // To get formatted reports		
monochrome = true,
plugin={"pretty", "html:target/HTMLReports/reports.html",
		"pretty", "json:target/JSONReports/report.json",
		"pretty", "junit:target/JUNITReports/report.xml"}
		)
public class TestRunner {

}
