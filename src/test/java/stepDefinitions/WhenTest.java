package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.When;
import pageObjects.LogInPage;

public class WhenTest {

//	WebDriver driver = GivenTest.driver;
	public static WebDriver driver = SetUpClass.driver;
	LogInPage lg;
	Actions actions = new Actions(driver);

	@When("User enters username as {string}")
	public void user_enters_username_as(String email) {

		lg = new LogInPage(driver);
		lg.sendEmail(email);
	//		WebElement lbEmail = driver.findElement(By.name("email"));
	//		lbEmail.sendKeys(string);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String psw) {
		lg = new LogInPage(driver);
		lg.sendPassword(psw);
//		WebElement lblPassword = driver.findElement(By.id("passwd"));
//		lblPassword.sendKeys(string);
	}

	@When("User click on sign in button")
	public void user_click_on_sign_in_button() { 
		lg = new LogInPage(driver);
		lg.clkSubmit();
//		WebElement btnSignIn = driver.findElement(By.id("SubmitLogin"));
//		btnSignIn.click();
	}

	@When("User clicks on Women Tag")
	public void user_clicks_on_Women_Tag() {
		lg = new LogInPage(driver);
		lg.clkWomenTab();
	}

	
	@When("User hovers on a dress")
	public void user_hovers_on_a_dress() {
		lg = new LogInPage(driver);
		lg.clkImgDrs();
	}
	@When("User clicks on Add To Cart in a product")
	public void user_clicks_on_Add_To_Cart_in_a_product() {
	lg = new LogInPage(driver);
//		lg.clkImgDrs();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		lg.btnAddToCart();
	}

	@When("User clicks on Proceed to checkout")
	public void user_clicks_on_Proceed_to_checkout() {
		lg = new LogInPage(driver);
		lg.btnCheckOut();
	}

	@When("User clicks on Proceed to checkout again in Summary page")
	public void user_clicks_on_Proceed_to_checkout_again_in_Summary_page() {
		lg = new LogInPage(driver);
		lg.btnCheckOut();
	}

	@When("User clicks on Proceed to checkout again in Addres page")
	public void user_clicks_on_Proceed_to_checkout_again_in_Addres_page() {
		lg = new LogInPage(driver);
		lg.btnCheckOut();
	}

	@When("User clicks on Agree to the terms of service checkbox")
	public void user_clicks_on_Agree_to_the_terms_of_service_checkbox() {
		lg = new LogInPage(driver);
		lg.chkBxTerms();
	}

	@When("User clicks on Proceed to checkout again in Shipping page")
	public void user_clicks_on_Proceed_to_checkout_again_in_Shipping_page() {
		lg.btnCheckOut();
	}

	@When("User clicks on Pay by check option")
	public void user_clicks_on_Pay_by_check_option() {
		lg.clkCheckbtn();
	}

}
