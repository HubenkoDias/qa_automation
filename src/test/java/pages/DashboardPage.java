package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestConfig;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    private static final By DASHBOARD_HEADING = By.tagName("h1");

    public String getHeadingText() {
        return getText(DASHBOARD_HEADING);
    }

    public LoginPage openWithoutLogin() {
        driver.get(TestConfig.BASE_URL + "/dashboard");
        waitForUrlContains("/auth/login");
        return new LoginPage(driver);
    }
}
