package Base;

import Pages.LoginPage;
import Utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected BrowserFactory browserFactory;
    protected WebDriver driver;
    protected LoginPage loginPage;

    public final String url = "https://ndosisimplifiedautomation.vercel.app/";
    public final String browserChoice = "chrome";

    @BeforeTest
    public void setUp() {
        browserFactory = new BrowserFactory();
        driver = browserFactory.startBrowser(browserChoice, url);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    /*
    @AfterTest
    public void tearDown() {
        if (driver != null) {
            browserFactory.closeBrowser();
        }
    }
    */
}



