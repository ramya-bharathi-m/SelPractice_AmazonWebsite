package org.com.automationframework.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
            features = "src/test/java/org/com/automationframework/features/amazonSearch.feature",
            glue = "org.com.automationframework.stepDefinition",
            plugin = {
                    "pretty",
                    "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                    "json:target/cucumber.json"
            },
            monochrome = true
    )

    public class amazonSearchRunner extends AbstractTestNGCucumberTests {

}
