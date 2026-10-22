package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialistsPage extends BasePage {

    private static final By HEADING = By.tagName("h1");

    public SpecialistsPage(WebDriver driver) {
        super(driver);
    }
    public String getHeadingText () {
        return getText(HEADING);
    }

}
