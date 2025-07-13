package org.com.automationframework.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonSearch_PageObjects {
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchIcon;

    @FindBy(xpath = "(//*[contains(text(),'Results')])[2]")
    public WebElement resultHeader;

    @FindBy(xpath = "//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']")
    public List<WebElement> searchResults;

    @FindBy(xpath = "//span[@class='a-size-large product-title-word-break']")
    public WebElement headerinsidePage;


}
