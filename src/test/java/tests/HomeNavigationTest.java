package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SpecialistsPage;

public class HomeNavigationTest extends BaseTest {

    @Test
    public void specialistsLinkOpensSpecialistsPage() {
        SpecialistsPage specialistsPage = new HomePage(driver)
                .open()
                .openSpecialists();

        Assert.assertEquals(specialistsPage.getHeadingText(), "QA Specialists",
        "Назва не спiвпала");
    }
}