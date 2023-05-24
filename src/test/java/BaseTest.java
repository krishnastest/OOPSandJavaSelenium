import driver.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.BasePage;


public class BaseTest {
    protected WebDriver webDriver;

    @BeforeTest
    public void setup() {
        this.webDriver = new DriverProvider().getWebDriver();
        new BasePage(this.webDriver);
        this.webDriver.get("https://www.saucedemo.com/?ref=hackernoon.com");
        // maximized the browser window
        webDriver.manage().window().maximize();

    }

    @AfterTest
    public void teardown() {
        this.webDriver.close();
        this.webDriver.quit();
    }
}
