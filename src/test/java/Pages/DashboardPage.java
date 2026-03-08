package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(css = "#app-root > nav > div.nav-container > div.nav-items > div:nth-child(4) > button > span.arrow")
    WebElement learnButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")
    WebElement learningMaterialsElement;

    @FindBy(css = "#tab-btn-web")
    WebElement webAutomationAdvanceElement;

    public void clickLearn() {
        learnButton.click();
    }

    public void clickLearningMaterials() {
        learningMaterialsElement.click();
    }

    public void clickWebAutomationAdvance() {
        webAutomationAdvanceElement.click();
    }
}
