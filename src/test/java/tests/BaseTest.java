package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
    protected WebDriver driver;

    @Before
    public void setUp() {
        String browser = System.getProperty("browser", "edge");
        switch (browser.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "D:\\BSSE\\demo\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "edge":
            default:
                System.setProperty("webdriver.edge.driver", "D:\\BSSE\\demo\\drivers\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
