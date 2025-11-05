package utils;

import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

	public static String takeScreenshot(WebDriver driver, String testName) {
		
		// Create timestamp for unique file names
		
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String filePath = System.getProperty("user.dir") + "/screenshots/" + testName + "_" + timestamp + ".png";

		// Take screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(filePath);
		try {
			FileUtils.copyFile(src, dest);
			System.out.println("Screenshot saved: " + filePath);
		} catch (IOException e) {
			System.out.println("Failed to save screenshot: " + e.getMessage());
		}
		return filePath;
	}
}
