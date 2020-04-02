package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import pageObjects.LogInPage;

public class GivenTest {

	public static WebDriver driver = SetUpClass.driver;
	LogInPage lg;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
	}

	@Given("LoginPage Already {string} and {string}")
	public void loginpage_Already_and(String email, String psw) {

		lg = new LogInPage(driver);

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();

		lg.sendEmail(email);
		lg.sendPassword(psw);
		lg.clkSubmit();

//		lg.logInAutomated(email, psw);
	}

}
