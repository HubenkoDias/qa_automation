package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SetupCheckTest {

    @Test
    public void openSiteAndCheckTitle() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.saucedemo.com");
            Assert.assertEquals(driver.getTitle(), "Swag Labs");
        } finally {
            driver.quit();
        }
    }
}