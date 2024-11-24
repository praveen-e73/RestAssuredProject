package stepdefinition;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import junit.framework.Assert;
import utilities.RestUtils;

public class stepdef {
	public static String url;
	public static Response response;

	@Given("I enter the car")
	public void i_enter_the_car() {
		System.out.println("I entered the car");
	}
	
	
	@When("I put the keys in")
	public void i_put_the_keys_in() {
		System.out.println("I put on the keys");
	}
	
	@When("turn on the keys")
	public void turn_on_the_keys() {
		System.out.println("I turn on the keys");
	}
	
	@Then("it should start")
	public void it_should_start() {
		System.out.println("it should start");
	}
	


	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) {
		
		System.out.println(string);

	}
	@When("I check for the {string} in step")
	public void i_check_for_the_in_step(String string) {
		System.out.println(string);
	}
	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) {
		System.out.println(string);
	}

	@Given("the url is ready")
	public void the_url_is_ready() {
		url = "https://fake-json-api.mock.beeceptor.com/users"; 
	}

	@When("i do a get request on the url")
	public void i_do_a_get_request_on_the_url() {
		response = RestUtils.getMethod(url);
	}

	@Then("the status code is {string}")
	public void the_status_code_is(String stat_code) {
		Integer statusCode = response.getStatusCode();
		Assert.assertEquals(stat_code,String.valueOf(statusCode));
	    
	}

	@Then("the response should have {string}")
	public void the_response_shhould_have(String expVal) {
		
		if(response.getBody().asString().contains(expVal)) {
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		};
	}



    





}
