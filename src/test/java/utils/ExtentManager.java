package utils;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	private static ExtentReports extent;

	public static ExtentReports getInstance() {
		if (extent == null) {
			String reportPath = System.getProperty("user.dir") + "/reports/ExtentReport.html";
			ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
			spark.config().setDocumentTitle("Automation Test Report");
			spark.config().setReportName("Login Test Suite");
			spark.config().setTheme(com.aventstack.extentreports.reporter.configuration.Theme.STANDARD);

			extent = new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("Tester", "Rakshit Ogra");
			extent.setSystemInfo("Environment", "QA");
			extent.setSystemInfo("Browser", "Chrome");
		}
		return extent;
	}
}
