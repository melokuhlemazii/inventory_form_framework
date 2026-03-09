package Tests;

import Base.BaseTest;
import Pages.InventoryPage;
import org.testng.annotations.Test;

public class InventoryPurchaseTest extends BaseTest {

    @Test
    public void loginWithValidDetails() throws InterruptedException {
        loginPage.clickLoginButton();
        Thread.sleep(5000);
        loginPage.enterEmailAddress("melomazibuko8@gmail.com");
        loginPage.enterPassword("Mwelase@1031");
        Thread.sleep(5000);
        loginPage.clickSubmitButton();
        Thread.sleep(5000);
        loginPage.verifyLoginSuccess();

    }

    @Test(dependsOnMethods = "Tests.LoginTest.loginWithValidDetails")
    public void navigateToWebAutomationAdvance() throws InterruptedException {
        dashboardPage.clickLearn();
        Thread.sleep(1000);
        dashboardPage.clickLearningMaterials();
        Thread.sleep(1000);
        dashboardPage.clickWebAutomationAdvance();
        Thread.sleep(1000);
    }

    @Test(dependsOnMethods = "Tests.InventoryPurchaseTest.navigateToWebAutomationAdvance")
    public void selectDeviceInformation() throws InterruptedException {
        inventoryPage.selectDeviceType();
        Thread.sleep(1000);
        inventoryPage.selectBrand();
        Thread.sleep(1000);
        inventoryPage.selectStorage();
        Thread.sleep(1000);
        inventoryPage.selectColor();
        Thread.sleep(1000);
        inventoryPage.enterQuantity("1");
        Thread.sleep(1000);
        inventoryPage.enterAddress("123 Test Street");
        Thread.sleep(1000);
        inventoryPage.clickNextButton();
        Thread.sleep(1000);
    }
}






