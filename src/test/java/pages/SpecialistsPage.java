package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialistsPage extends BasePage {

    private static final By SPECIALISTS_HEADING = By.tagName("h1");

    public SpecialistsPage(WebDriver driver) {
        super(driver);
    }

    public String getHeadingText() {
        return getText(SPECIALISTS_HEADING);
    }

}
