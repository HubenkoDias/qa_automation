package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private static final String URL = "https://hhub-mdwm.vercel.app";
    private static final By SPECIALISTS_LINK = By.cssSelector("a[href='/browse/specialists']");

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
}
