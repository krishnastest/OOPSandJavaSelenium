package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverProvider {

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
//        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--window-size=1280,800");
        this.webDriver = new ChromeDriver(chromeOptions);
        return this.webDriver;
    }

    private void setup() {
        WebDriverManager.chromedriver().setup();
    }
}
