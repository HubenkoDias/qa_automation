package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestConfig;
import utils.TestUser;

public class LoginPage extends BasePage {

    private static final By EMAIL_FIELD = By.cssSelector("input[type='email']");
    private static final By PASSWORD_FIELD = By.cssSelector("input[type='password']");
    private static final By LOGIN_BUTTON = By.cssSelector("button[type='submit']");
    private static final By HEADING = By.tagName("h1");
    private static final By ERROR_MESSAGE =
            By.cssSelector("form div[class*='bg-red-500'][class*='text-red-400']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open() {
        driver.get(TestConfig.BASE_URL + "/auth/login");
        return this;
    }

    public DashboardPage loginAs(TestUser user) {
        submitCredentials(user);
        waitForUrlContains("/dashboard");
        return new DashboardPage(driver);
    }

    public LoginPage loginExpectingError(TestUser user) {
        submitCredentials(user);
        return this;
    }

    public String getHeadingText() {
        return getText(HEADING);
    }

    public String getErrorMessage() {
        return getText(ERROR_MESSAGE);
    }

    private void submitCredentials(TestUser user) {
        type(EMAIL_FIELD, user.email());
        type(PASSWORD_FIELD, user.password());
        click(LOGIN_BUTTON);
    }
}