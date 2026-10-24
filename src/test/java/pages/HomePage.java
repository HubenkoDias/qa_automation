package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestConfig;

public class HomePage extends BasePage {
    private static final By SPECIALISTS_LINK = By.cssSelector("a[href='/browse/specialists']");
    private static final By COMPANIES_LINK = By.cssSelector("a[href='/browse/companies']");
    private static final By JOBS_LINK = By.cssSelector("a[href='/jobs']");
    private static final By INSIGHTS_LINK = By.cssSelector("a[href='/insights']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        driver.get(TestConfig.BASE_URL);
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

    public InsightsPage openInsights () {
        click(INSIGHTS_LINK);
        waitForUrlContains("/insights");
        return new InsightsPage(driver);
    }
    public PublicPage openMenuItem(String path) {
        By link = By.cssSelector("a[href='" + path + "']");
        click(link);
        waitForUrlContains(path);
        return new PublicPage(driver);
    }
}
