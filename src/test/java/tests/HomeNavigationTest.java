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
                "Назва не спiвпала");
        Assert.assertTrue(driver.getCurrentUrl().contains("/browse/specialists"),
                "Должна открыться страница компаний");
    }

    @Test
    public void companiesLinkOpensCompaniesPage() {
        CompaniesPage companiesPage = new HomePage(driver)
                .open()
                .openCompanies();
        Assert.assertEquals(companiesPage.getHeadingText(), "Companies Hiring",
                "Назва не спiвпала");
        Assert.assertTrue(driver.getCurrentUrl().contains("/browse/companies"),
                "Должна открыться страница компаний");
    }
    @Test
    public void JobsPageOpensJobsPage () {
        JobsPage jobsPage = new HomePage(driver)
                .open()
                .openJobs();
        Assert.assertEquals(jobsPage.getHeadingText(), "QA Job Board",
                "Назва не спiвпала");
        Assert.assertTrue(driver.getCurrentUrl().contains("/jobs"),
                "Должна открыться страница компаний");
    }
}