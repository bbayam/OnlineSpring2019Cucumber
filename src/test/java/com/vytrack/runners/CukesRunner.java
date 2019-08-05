package com.vytrack.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "/Users/busrabayam/IdeaProjects/OnlineSpring2019Cucumber/src/test/java/resources/features" //to specify where are the features
        },
        //feature contains scenarios
        //every scenario is like a test
        //where is the implementation for features
        glue = {"/src/test/java/com/vytrack/step_definitions/LoginStepDefinitions.java"},
        //dry tun - to generate step definitions automatically
        //you will see them in the console output
        dryRun = true
)
public class CukesRunner {

}
