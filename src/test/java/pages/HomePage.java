package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private static final String URL = "https://hhub-mdwm.vercel.app";
    private static final By SPECIALISTS_LINK = By.cssSelector("a[href='/browse/specialists']");
    private static final By COMPANIES_LINK = By.cssSelector("a[href='/browse/companies']");
    private static final By JOBS_LINK = By.cssSelector("a[href='/jobs']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get(URL);
        return this;
    }

    public SpecialistsPage openSpecialists() {
        click(SPECIALISTS_LINK);
        waitForUrlContains("/browse/specialists");
        return new SpecialistsPage(driver);
    }

    public CompaniesPage openCompanies() {
        click(COMPANIES_LINK);
        waitForUrlContains("/browse/companies");
        return new CompaniesPage(driver);
    }

    public JobsPage openJobs() {
        click(JOBS_LINK);
        waitForUrlContains("/jobs");
        return new JobsPage(driver);
    }
}
