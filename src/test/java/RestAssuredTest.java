
import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTest {

	public Response response;
	 public RequestSpecification request;
	 
	 
	 @BeforeTest()
	 public void setUp() {
	  RestAssured.baseURI = "https://reqres.in/api/";
	  request = RestAssured.given();
	 }
	 
	 @Test(enabled = false)
	 public void test1() {
	  response = request
	     .given()
	     .when()
	     .get("users");
	  
	  
	  System.out.println(response.asString());
	 }
	 
	 
	 @Test(enabled = false)
	 public void test2() {
	  response = request
	     .given()
	     .pathParam("id", 2)
	     .when()
	     .get("users/{id}");
	  
	  response.then().statusCode(201);
	  
	  System.out.println(response.prettyPrint());
	 }
	 
	 @Test()
	 public void test3() {
	  
	  JSONObject json = new JSONObject();
	  
	  json.put("name", "Sergio");
	  json.put("job", "Maestro");
	  String jsonString = json.toString();
	  
	  response = request
	     .given()
	     .contentType(ContentType.JSON)
	     .body(json.toString())
	     .when()
	     .post("users");
	  
	  response.then().statusCode(201);
	  
	  System.out.println(response.prettyPrint());
	 }
	
	
}
