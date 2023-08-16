package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources"
        ,glue = "stepdefinition"
        ,tags = "@test1"
        ,monochrome = true
        ,publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
