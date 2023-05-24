package pages;

import entities.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class HomePage extends BasePage {

    // single element - fetches only first element if there is more than one element with same locator
    @FindBy(className = "app_logo")
    private WebElement logo;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public HomePage clickLogo() {
        waitUntilElementIsVisible(logo);
        click(logo);
        return this;
    }

    public void switchWindow() {
        String currentWindow = webDriver.getWindowHandle(); //window1
        click(logo);//window2
        Set<String> windowHandles = webDriver.getWindowHandles();
        windowHandles.forEach(window -> {
            if (!window.equals(currentWindow))
                webDriver.switchTo().window(window);
        });
    }

    public String getLogoText() {
        return logo.getText();
    }

}

