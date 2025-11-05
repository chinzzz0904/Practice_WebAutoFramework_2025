package learnSelenium1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class newAccountPage {

	WebDriver driver;

	WebDriverWait wait;

	public By newAccountLink1 = By.xpath("//a[text()='Open New Account']");

	// Constructor
	public newAccountPage(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}

	// Action method
	public void clicknewAccountLink() {

		WebElement newAccountLink = wait.until(ExpectedConditions.elementToBeClickable(newAccountLink1));
	
		newAccountLink.click();
	}

}
