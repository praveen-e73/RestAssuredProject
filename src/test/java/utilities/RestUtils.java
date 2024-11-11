package utilities;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestUtils {
	
	public static String hostName = "https://fake-json-api.mock.beeceptor.com/users";
	
	public static Response getMethod(String hostName) {
		RestAssured.baseURI = hostName;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		
		//System.out.println(response.getStatusCode());
		return response;
		
		
		
	}
	
	public static String postMethod() {
		return null;
		
	}
	
	
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = hostName;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET);
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
		
		
	}
}
