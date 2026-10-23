package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utils.TestUser;

public class ProfileTest extends BaseTest {

    @Test
    public void profileChangesArePersistedAfterSave() {
        String newBio = "Autotest bio " + System.currentTimeMillis();

        DashboardPage dashboardPage = new LoginPage(driver)
                .open()
                .loginAs(TestUser.QA)
                .setBio(newBio)
                .saveProfile()
                .reload();

        Assert.assertEquals(dashboardPage.getBioValue(), newBio,
                "Bio should stay changed after saving and reloading the page");
    }
}