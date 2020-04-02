package apiStepDefinitions;

import org.openqa.selenium.remote.Response;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class ClassSetUp {
	
	public Response resp;
	public RequestSpecification request;
	public ClassSetUp() {
		RestAssured.baseURI = "https://reqres.in/api/";
		request = RestAssured.given();
	}

}
