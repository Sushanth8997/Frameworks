package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/GroupsFeatures/Tags.feature", 
glue= {"StepDefinations"},
	
tags=" @AllTags"
)
public class TestRunnerTAGS {

}
