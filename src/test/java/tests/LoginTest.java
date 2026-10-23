package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;
import utils.TestConfig;
import utils.TestUser;

public class LoginTest extends BaseTest {
    @Test
    public void qaSpecialistCanLogin() {
        DashboardPage dashboardPage = new LoginPage(driver)
                .open()
                .loginAs(TestUser.QA);

        Assert.assertEquals(dashboardPage.getHeadingText(), "My Profile",
                "Profile should be opened");
    }
    @Test
    public void wrongPasswordShowsError() {
        LoginPage loginPage = new LoginPage(driver)
                .open()
                .loginExpectingError(TestUser.WRONG_CREDS);

        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid login credentials",
                "An input error should appear if the data is incorrect");
    }

    @Test
    public void dashboardRedirectsToLoginWithoutAuth() {
        LoginPage loginPage = new DashboardPage(driver).openWithoutLogin();

        Assert.assertEquals(loginPage.getHeadingText(), "Welcome back",
                "An unauthorized user should be redirected to the login page");
    }
}
