package stepdefinations;

import org.junit.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import pageobjects.SearchPage;
import tests.BaseTest;

public class SearchSteps extends BaseTest {
    private SearchPage searchPage;

    @Before
    public void setUp() {
        super.setUp(); // Call the setup in BaseTest
        searchPage = new SearchPage(driver); // Initialize SearchPage here
    }

    @Given("I am on the home page")
    @Step("Navigate to the home page")
    @Description("User navigates to the home page of the web shop.")
    public void i_am_on_the_home_page() {
        driver.get("https://demowebshop.tricentis.com");
    }

    @When("I search for {string}")
    @Step("Search for {string}")
    @Description("User searches for a product using the query: {string}.")
    public void i_search_for(String query) {
        searchPage.searchFor(query);
    }

    @Then("I should see the search results")
    @Step("Verify that search results are displayed.")
    @Description("Check if the search results are displayed after performing a search.")
    @Severity(SeverityLevel.NORMAL) // Adjust severity as needed
    public void i_should_see_the_search_results() {
        Assert.assertTrue(searchPage.isResultDisplayed());
    }

    @After
    public void tearDown() {
        super.tearDown(); // Call the teardown in BaseTest
    }
}