package Base;

import Pages.*;
import Utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected BrowserFactory browserFactory;
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected InventoryPage inventoryPage;
    protected InvoicePage  invoicePage;
    protected OrderPreviewPage orderPreviewPage;

    public final String url = "https://ndosisimplifiedautomation.vercel.app/";
    public final String browserChoice = "chrome";

    @BeforeTest
    public void setUp() {
        browserFactory = new BrowserFactory();
        driver = browserFactory.startBrowser(browserChoice, url);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        inventoryPage = PageFactory.initElements(driver, InventoryPage.class);
        invoicePage = PageFactory.initElements(driver, InvoicePage.class);
        orderPreviewPage = PageFactory.initElements(driver, OrderPreviewPage.class);
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



