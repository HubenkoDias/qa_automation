package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompaniesPage extends BasePage {

    private static final By COMPANIES_HEADING = By.tagName("h1");

    public CompaniesPage(WebDriver driver) {
        super(driver);
    }

    public String getHeadingText() {
        return getText(COMPANIES_HEADING);
    }

}
