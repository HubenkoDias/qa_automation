package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsightsPage extends BasePage {

    private static final By INSIGHTS_HEADING = By.tagName("h1");

    protected InsightsPage(WebDriver driver) {
        super(driver);
    }
    public String getHeadingText() {
        return getText(INSIGHTS_HEADING);
    }

}
