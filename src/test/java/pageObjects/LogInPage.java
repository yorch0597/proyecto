package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.SetUpClass;

public class LogInPage {
	public static WebDriver driver = SetUpClass.driver;
	Actions actions = new Actions(driver);

	public LogInPage(WebDriver driver) {
		// queda "escuchando" todo cambio que se genere en tu objeto de la página
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	WebElement lblEmail;

	@FindBy(id = "passwd")
	WebElement lblPassword;

	@FindBy(id = "SubmitLogin")
	WebElement btnSubmit;

	@FindBy(xpath = "//a[@title=\"Women\"]")
	WebElement tabWomen;

	@FindBy(xpath = "//img[@src=\"http://automationpractice.com/img/p/1/1-home_default.jpg\"]")
	WebElement imgDress;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
	WebElement btnAddToCart;

	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	WebElement checkOut1;

	@FindBy(xpath = "//span[text()=\"Proceed to checkout\"]")
	WebElement checkOut2;

	@FindBy(xpath = "//span[text()=\"Proceed to checkout\"]")
	WebElement checkOut3;

	@FindBy(id = "cgv")
	WebElement chkBoxTermsOfService;

	@FindBy(className = "cheque")
	WebElement btnPayByCheck;

	public void clkWomenTab() {
		tabWomen.click();
	}

	public void clkImgDrs() {
		actions.moveToElement(imgDress);
//		imgDress.click();
	}

	public void btnAddToCart() {
		btnAddToCart.click();
	}

	public void btnCheckOut() {
		checkOut1.click();
	}

	public void chkBxTerms() {
		chkBoxTermsOfService.click();
	}

	public void sendEmail(String email) {
		lblEmail.sendKeys(email);
	}

	public void sendPassword(String password) {
		lblPassword.sendKeys(password);
	}

	public void clkSubmit() {
		btnSubmit.click();
	}

	public void clkCheckbtn() {
		btnPayByCheck.click();
	}

	public void logInAutomated(String email, String psw) {

		LogInPage lg = new LogInPage(driver);
		lg.sendEmail(email);
		lg.sendPassword(psw);
		lg.clkSubmit();

	}

}
