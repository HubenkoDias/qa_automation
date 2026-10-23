package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends BasePage {

    private static final By HEADING = By.tagName("h1");

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }
    public String getHeadingText() {
        return getText(HEADING);
    }
}
