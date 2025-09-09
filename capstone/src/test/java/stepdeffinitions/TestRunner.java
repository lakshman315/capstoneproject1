package stepdeffinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
                 glue={"stepdeffinitions"},
                 plugin= {"pretty","html:target/HTML/htmlreport1.html",
		                           "json:target/JSON/jsonreport",
		                           "junit:target/JUNIT/junitreport"}
                 )


public class TestRunner {

}
