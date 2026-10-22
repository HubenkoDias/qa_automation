package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobsPage extends BasePage {

    private static final By JOBS_HEADING = By.tagName("h1");

    public JobsPage(WebDriver driver) {
        super(driver);
    }

    public String getHeadingText() {
        return getText(JOBS_HEADING);
    }

}
