package com.Appium.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/Appium/step_defs",
        tags = "@Wifi",
        dryRun = false


)
public class CukesRunner {
}


