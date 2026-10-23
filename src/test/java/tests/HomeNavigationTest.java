package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CompaniesPage;
import pages.HomePage;
import pages.JobsPage;
import pages.SpecialistsPage;

public class HomeNavigationTest extends BaseTest {

    @Test
    public void specialistsLinkOpensSpecialistsPage() {
        SpecialistsPage specialistsPage = new HomePage(driver)
                .open()
                .openSpecialists();

        Assert.assertEquals(specialistsPage.getHeadingText(), "QA Specialists",
                "Naming is not right");
        Assert.assertTrue(driver.getCurrentUrl().contains("/browse/specialists"),
                "Specialists page should be opened");
    }

    @Test
    public void companiesLinkOpensCompaniesPage() {
        CompaniesPage companiesPage = new HomePage(driver)
                .open()
                .openCompanies();
        Assert.assertEquals(companiesPage.getHeadingText(), "Companies Hiring",
                "Naming is not right");
        Assert.assertTrue(driver.getCurrentUrl().contains("/browse/companies"),
                "Companies page should be opened");
    }
    @Test
    public void JobsPageOpensJobsPage () {
        JobsPage jobsPage = new HomePage(driver)
                .open()
                .openJobs();
        Assert.assertEquals(jobsPage.getHeadingText(), "QA Job Board",
                "Naming is not right");
        Assert.assertTrue(driver.getCurrentUrl().contains("/jobs"),
                "Jobs page should be opened");
    }
}