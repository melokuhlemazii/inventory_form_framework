package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")
    WebElement loginButton;

    @FindBy(id = "login-email")
    WebElement loginEmailField;

    @FindBy(id = "login-password")
    WebElement loginPasswordField;

    @FindBy(id = "login-submit")
    WebElement loginSubmitButton;

    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section")
    WebElement dashboardElement;

    public void clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void enterEmailAddress(String email) {
        wait.until(ExpectedConditions.visibilityOf(loginEmailField)).sendKeys(email);
    }

    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(loginPasswordField)).sendKeys(password);
    }

    public void clickSubmitButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginSubmitButton)).click();
    }

    public void verifyLoginSuccess() {
        if(!wait.until(ExpectedConditions.visibilityOf(dashboardElement)).isDisplayed()) {
            throw new AssertionError ("Login failed - Dashboard not visible!");
        }
    }
}
