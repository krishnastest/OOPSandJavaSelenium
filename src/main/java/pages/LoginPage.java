package pages;

import entities.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    @FindBy(id = "user-name")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement submit;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public HomePage login(User user) {
        username.sendKeys(user.getUserName());
        password.sendKeys(user.getPassword());
        click(submit);
        return new HomePage(webDriver);
    }
}
