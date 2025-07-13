package org.com.automationframework.stepDefinition;

import org.com.automationframework.utils.*;
import org.com.automationframework.pageObjects.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.com.automationframework.pageMethods.AmazonSearch_PageMethods;

import static org.com.automationframework.hooks.hooks.driver;

public class AmazonSearch_Steps {
    AmazonSearch_PageObjects amazonSearchPage;
    AmazonSearch_PageMethods amazonSearchPageMethods = new AmazonSearch_PageMethods();
    String product = "Bluetooth Headphones";

    @Given("I open the Amazon Homepage")
    public void iOpenTheAmazonHomepage() {
        amazonSearchPageMethods.startapplication();
    }

    @When("I search for {string}")
    public void iSearchFor(String product) {
        amazonSearchPageMethods.searchItem(product);
    }

    @Then("I should see search results")
    public void iShouldSeeSearchResults() {
        amazonSearchPageMethods.printResults();
        browserFactory.quitDriver();
    }
}
