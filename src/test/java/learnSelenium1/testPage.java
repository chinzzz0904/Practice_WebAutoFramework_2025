package learnSelenium1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utils.ScreenshotUtil;
import utils.ConfigReader;
import utils.ExtentManager;

public class testPage {

	WebDriver driver;

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	ConfigReader config = new ConfigReader();

	ExtentReports extent;

	ExtentTest test;

	@BeforeMethod
	public void setUp() {

		extent = ExtentManager.getInstance();

		config.loadProperties();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(config.getProperty("url"));

	}

	@Test
	public void testValidLogin() throws InterruptedException {
		// TODO Auto-generated method stub

		test = extent.createTest("Valid Login Test");

		config.loadProperties();

		loginPage loginPage = new loginPage(driver);

		loginPage.login(config.getProperty("username"), config.getProperty("password"));

		String expectedText = driver.findElement(By.xpath("//*[@id=\"showOverview\"]/h1")).getText();

		String actualText = "Accounts Overview";

		Assert.assertEquals(expectedText, actualText);

		newAccountPage newaccountpage_obj = new newAccountPage(driver);

		newaccountpage_obj.clicknewAccountLink();

		test.log(Status.PASS, "Open New Account link action performed successfully!");

		String screenshotPath = ScreenshotUtil.takeScreenshot(driver, "validLoginTest_success");

		test.addScreenCaptureFromPath(screenshotPath);

	}

	// @Test
	/*
	 * public void testInvalidLogin() throws InterruptedException {
	 * 
	 * loginPage loginPage = new loginPage(driver);
	 * 
	 * // Attempt login with invalid credentials
	 * loginPage.login("invalid@email.com", "wrongPassword");
	 * 
	 * Thread.sleep(3000);
	 * 
	 * // Check that "My Account" link is not present boolean isTextPresent =
	 * driver.findElements(By.xpath("//h1[text()= 'My account']")).size() > 0;
	 * 
	 * Assert.assertFalse(isTextPresent);
	 * 
	 * System.out.println("Invalid login test executed successfully."); }
	 */

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
			extent.flush(); // generates the report

		}
	}

}
