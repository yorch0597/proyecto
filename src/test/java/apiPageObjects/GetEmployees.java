package apiPageObjects;



import apiStepDefinitions.ClassSetUp;
import io.restassured.response.Response;

public class GetEmployees extends ClassSetUp {

	public Response response;

	public GetEmployees(String endPoint) {
		super();
		runApi(endPoint);
	}

	public GetEmployees(String endPoint, int id) {
		super();
		runApi(endPoint, id);
	}

	private void runApi(String endPoint) {
		response = request
				.given()
				.when()
				.get(endPoint);

	}

	private void runApi(String endPoint, int id) {

		response = request
				.given().
				pathParam("id", id)
				.when()
				.get(endPoint);
	}

}
