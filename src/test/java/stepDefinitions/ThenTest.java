package stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ThenTest {
	
	WebDriver driver= GivenTest.driver;
	
	@Then("User should be logged correctly")
	public void user_should_be_logged_correctly() {
		assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=my-account"));
		
//		WebElement lblHead=	driver.findElement(By.className("page-heading"));
//		Assert.assertTrue(lblHead.getText().equals("MY ACCOUNT"));
		driver.quit();		
	}
	
	@Then("User should be logged Incorrectly")
	public void user_should_be_logged_Incorrectly() {
		WebElement lblHead  = driver.findElement(By.xpath("//*[@id=\"center_column\"]//div//p"));
		Assert.assertTrue(lblHead.getText().equals("There is 1 error"));
		driver.quit();	
	}

	@Then("User should be on Order Summary page")
	public void user_should_be_on_Order_Summary_page() {
		assertTrue(driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=my-account"));
	}
}
