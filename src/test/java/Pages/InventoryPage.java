package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage {
    WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "deviceType")
    WebElement deviceTypeField;

    @FindBy(xpath = "//*[@id=\"deviceType\"]/option[2]")
    WebElement mobileOption;

    @FindBy(id = "brand")
    WebElement brandField;

    @FindBy(xpath = "//*[@id=\"brand\"]/option[2]")
    WebElement appleOption;

    @FindBy(id = "storage-128GB")
    WebElement storage128GBOption;

    @FindBy(id = "color")
    WebElement colorField;

    @FindBy(xpath = "//*[@id=\"color\"]/option[4]")
    WebElement blueOption;

    @FindBy(id = "quantity")
    WebElement quantityField;

    @FindBy(id = "address")
    WebElement addressField;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton;

    public void selectDeviceType() {
        deviceTypeField.click();
        mobileOption.click();
    }

    public void selectBrand() {
        brandField.click();
        appleOption.click();
    }

    public void selectStorage() {
        storage128GBOption.click();
    }

    public void selectColor() {
        colorField.click();
        blueOption.click();
    }

    public void enterQuantity(String quantity) {
        quantityField.sendKeys(quantity);
    }

    public void enterAddress(String address) {
        addressField.sendKeys(address);
    }

    public void clickNextButton() {
        nextButton.click();
    }
}
