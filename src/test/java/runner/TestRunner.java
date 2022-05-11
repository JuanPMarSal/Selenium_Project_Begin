package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        monochrome = false,
        dryRun = false,
        glue = "stepsdefinitions",
       /*plugin = {"html:target/cucumber-report/report.html",
                "pretty:target/cucumber-report/cucumber-pretty.txt",
                "junit:target/cucumber-report/cucumber-results.xml",
                "json:target/cucumber-report/cucumber.json"},*/
        tags = "@Test")

public class TestRunner {

    

}
