package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ScreenShotHelper;

import java.time.Duration;

public class BasePage {

    protected WebDriver webDriver;
    protected WebDriverWait wait;
    ScreenShotHelper screenShotHelper;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.wait = new WebDriverWait(this.webDriver, Duration.ofMillis(10));
        this.screenShotHelper = new ScreenShotHelper();
        ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete");
    }

    protected void waitUntilElementIsVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void click(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        screenShotHelper.takeScreenshot(webDriver);
    }
}
