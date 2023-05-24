import entities.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class HomePageTest extends BaseTest {

    @Test
    public void validateTitleWhenLogoIsClicked() {
        User user = User.builder()
                .userName("standard_user")
                .password("secret_sauce")
                .build();

        String logoText = new LoginPage(webDriver).login(user).getLogoText();

        Assert.assertEquals(logoText, "Swag Labs");
    }
}
