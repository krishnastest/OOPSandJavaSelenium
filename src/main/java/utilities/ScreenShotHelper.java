package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShotHelper {

    public void takeScreenshot(WebDriver webDriver) {
        TakesScreenshot screenshot = (TakesScreenshot) webDriver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("../screenshots/" + new Date().getTime() + ".png");
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
