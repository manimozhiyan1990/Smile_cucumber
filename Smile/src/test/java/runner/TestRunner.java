package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/resources/testdesign"},
            glue = {"stepdefinition"},
          tags = "@sc1",
            plugin = {"pretty",
                    "html:target/testout/report.html",
                    "json:target/testout/jsonreport.json",
                    "junit:target/testout/junitreport.xml"}


    )
    public class TestRunner {
}
