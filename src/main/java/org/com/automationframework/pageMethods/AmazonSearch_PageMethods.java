package org.com.automationframework.pageMethods;

import org.com.automationframework.utils.*;
import org.com.automationframework.utils.ValidationUtils;
import org.com.automationframework.utils.browserFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static org.com.automationframework.hooks.hooks.driver;
import org.com.automationframework.pageObjects.*;
import org.openqa.selenium.support.PageFactory;
public class AmazonSearch_PageMethods {

    AmazonSearch_PageObjects amazonSearchPageObjects;
    ValidationUtils validationUtils;
    public AmazonSearch_PageMethods() {
        amazonSearchPageObjects = PageFactory.initElements(browserFactory.getDriver(), AmazonSearch_PageObjects.class);
    }

    public void startapplication() {
        driver = browserFactory.getDriver();
        driver.get("https://www.amazon.in/");
    }

    public void searchItem(String element) {
        amazonSearchPageObjects.searchButton.sendKeys(element);
        amazonSearchPageObjects.searchIcon.click();
        if(amazonSearchPageObjects.resultHeader.isDisplayed()){
            System.out.println("results header is present");
        }
    }

    public void printResults() {
        if (amazonSearchPageObjects.searchResults != null && !amazonSearchPageObjects.searchResults.isEmpty()) {
            for (WebElement ele : amazonSearchPageObjects.searchResults) {
                System.out.println(ele.getText());
            }
        } else {
            System.out.println("No search results found.");
        }
    }

    public void clickheaderandvalidate(){

        int i = 0;
        for(WebElement result: amazonSearchPageObjects.searchResults) {
            i++;
            if (i == 2) {
                String actualhomepage = result.getText();
                result.click();
                String actualpdp = amazonSearchPageObjects.headerinsidePage.getText();
                validationUtils.doValidationPartial(actualhomepage, actualpdp, "bluetoothheadphone");
            }

        }
    }

}