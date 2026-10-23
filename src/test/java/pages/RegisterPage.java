package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestConfig;

public class RegisterPage extends BasePage {

    private static final By HEADING = By.tagName("h1");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public String getHeadingText() {
        return getText(HEADING);
    }
}
