package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import pages.RegisterPage;
import utils.TestUser;

public class LoginAndRegistrationTest extends BaseTest {
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
    @Test
    public void signUpLinkOpensRegistrationPage() {
        RegisterPage registerPage = new LoginPage(driver)
                .open()
                .openSignUp();

        Assert.assertEquals(registerPage.getHeadingText(), "Create account",
                "User should be redirected to the registration page");
    }
    @Test
    public void forgotPasswordLinkOpensForgotPasswordPage() {
        ForgotPasswordPage forgotPasswordPage = new LoginPage(driver)
                .open()
                .openForgotPassword();

        Assert.assertEquals(forgotPasswordPage.getHeadingText(), "Forgot password?",
                "User should be redirected to the \"Forgot password\" page");
    }
}



