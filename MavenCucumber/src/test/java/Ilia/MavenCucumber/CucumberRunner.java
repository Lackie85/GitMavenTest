package Ilia.MavenCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
		glue = {"Ilia.MavenCucumber.Tests"}
		)
public class CucumberRunner {

}
