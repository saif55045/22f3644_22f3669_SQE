package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    // private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "small-searchterms")
    private WebElement searchField;

    @FindBy(xpath = "//input[@value='Search']")
    private WebElement searchButton;

    @FindBy(css = ".search-results")
    private WebElement searchResults;

    public SearchPage(WebDriver driver) {
        // this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public void searchFor(String query) {
        wait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys(query);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }

    public boolean isResultDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(searchResults));
        return searchResults.isDisplayed();
    }
}
