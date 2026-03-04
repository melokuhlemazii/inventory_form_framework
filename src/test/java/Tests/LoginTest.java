package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

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
}
