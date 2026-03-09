package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPreviewPage {
    WebDriver driver;

    public OrderPreviewPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "shipping-express")
    WebElement expressShippingOption;

    @FindBy(id = "warranty-1yr")
    WebElement oneYearWarrantyOption;

    @FindBy(id = "discount-code")
    WebElement discountCodeField;

    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscountButton;

    @FindBy(id = "purchase-device-btn")
    WebElement purchaseDeviceButton;

    public void selectExpressShipping() {
        expressShippingOption.click();
    }

    public void selectOneYearWarranty() {
        oneYearWarrantyOption.click();
    }

    public void enterDiscountCode(String code) {
        discountCodeField.sendKeys(code);
    }

    public void clickApplyDiscount() {
        applyDiscountButton.click();
    }

    public void clickPurchaseDevice() {
        purchaseDeviceButton.click();
    }
}
