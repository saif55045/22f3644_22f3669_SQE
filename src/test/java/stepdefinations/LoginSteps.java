package stepdefinations;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Utilities.CSVUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private List<String[]> loginData;  // For CSV data

    @Before
    public void setUp() throws IOException {
        System.setProperty("webdriver.edge.driver", "D:\\BSSE\\demo\\drivers\\msedgedriver.exe");
        driver = new EdgeDriver();
        loginPage = new LoginPage(driver);

        // Load data from CSV
        loginData = CSVUtil.readCSVData("src\\test\\java\\data.csv.csv");
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://demowebshop.tricentis.com/login");
    }

    @When("I enter credentials from CSV")
    public void i_enter_credentials_from_csv() {
        // Loop over the CSV data to perform login for each set of credentials
        for (String[] credentials : loginData) {
            loginPage.login(credentials[0], credentials[1]);
        }
    }

    @Then("I should see appropriate result based on credentials")
    public void i_should_see_appropriate_result_based_on_credentials() {
        // Example assertion for valid and invalid credentials
        if (loginData.get(0)[0].equals("jobof31938@digopm.com")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("demowebshop.tricentis.com"));
        } else {
            Assert.assertTrue(driver.getPageSource().contains("https://demowebshop.tricentis.com/login"));
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
