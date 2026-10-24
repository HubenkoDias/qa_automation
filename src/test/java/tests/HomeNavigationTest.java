package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.*;

public class HomeNavigationTest extends BaseTest {

    @DataProvider(name = "menuPaths")
    public Object[][] menuPaths() {
        return new Object[][]{{"/browse/specialists", "QA Specialists"},
                {"/browse/companies", "Companies Hiring"},
                {"/jobs", "QA Job Board"},
                {"/insights", "QA insights.\n" +
                        "Real-world expertise."}
        };
    }
    @Test(dataProvider = "menuPaths")
    public void menuLinkOpensCorrectPage(String path, String expectedHeading) {

        PublicPage publicPage = new HomePage(driver)
                .openHomePage()
                .openMenuItem(path);

        Assert.assertEquals(publicPage.getHeadingText(), expectedHeading,
                "Heading of " + path + " page is not as expected");

    }
}