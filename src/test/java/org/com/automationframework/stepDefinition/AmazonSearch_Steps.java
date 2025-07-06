package org.com.automationframework.stepDefinition;

import org.com.automationframework.utils.browserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.com.automationframework.hooks.hooks.driver;

public class AmazonSearch {
    @Given("I open the Amazon Homepage")
    public void iOpenTheAmazonHomepage() {

        driver = browserFactory.getDriver();
        driver.get("https://www.amazon.in/");
    }

    @When("I search for {string}")
    public void iSearchFor(String arg0) {
        
    }

    @Then("I should see search results")
    public void iShouldSeeSearchResults() {
    }
}
