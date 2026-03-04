package DefaultTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DefaultLoginTest {
    WebDriver driver;

    @Test
    public void loginWithValidDetails(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#overview");
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        driver.findElement(By.id("login-email")).sendKeys("melomazibuko8@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("Mwelase@1031");
        driver.findElement(By.id("login-submit")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By dashboardElement = By.xpath("//*[@id=\"app-main-content\"]/section");

        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboardElement));

        boolean isDashboardVisible = driver.findElement(dashboardElement).isDisplayed();
        Assert.assertTrue(isDashboardVisible, "Login failed - Dashboard not visible");
    }
}
