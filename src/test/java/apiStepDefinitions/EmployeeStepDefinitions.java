package apiStepDefinitions;

import apiPageObjects.GetEmployees;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class EmployeeStepDefinitions {
	
	Response resp;
	GetEmployees employees;
	
	@Given("User set a valid auth key")
	public void user_set_a_valid_auth_key() {
	  System.out.println("given");
	}

	@When("User send a Get request on {string}")
	public void user_send_a_Get_request_on_https_reqres_in_api(String url) {
	 System.out.println("when");
	 employees = new GetEmployees(url);
	}

	@Then("User should get 	status code {int}")
	public void user_should_get_status_code(Integer int1) {
	   System.out.println("then");
	   System.out.println(employees.response.asString()); 
	}
	
	
	@Given("User send an id of {int}")
	public void user_send_an_id_of(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
