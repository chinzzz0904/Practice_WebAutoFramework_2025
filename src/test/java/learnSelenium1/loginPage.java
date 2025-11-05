package learnSelenium1;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

	WebDriver driver;
	WebDriverWait wait;

	// Web locators using PageFactory
	@FindBy(css = "input[name='username']")
	WebElement usernameInput;

	@FindBy(css = "input[name='password']")
	WebElement passwordInput;

	@FindBy(css = "input[value='Log In']")
	WebElement loginButton;

	// Constructor
	public loginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void enterUsername(String username) {
		wait.until(ExpectedConditions.visibilityOf(usernameInput)).sendKeys(username);
	}

	public void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOf(passwordInput)).sendKeys(password);
	}

	public void clickLogin() {

		loginButton.click();
		
	}

	// Composite method
	public void login(String username, String password) throws InterruptedException {
		enterUsername(username);
		enterPassword(password);
		clickLogin();
		System.out.println("Login action performed");

	}

}
