package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class Screenshots {
    public static String screenshotDir = System.getProperty("user.dir") + "/target/screenshots/";

    public void takesSnapShot(WebDriver driver, String screenshotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File Destination = new File(screenshotDir, screenshotName + ".jpeg");

        try{
            FileUtils.copyFile(file, Destination);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





