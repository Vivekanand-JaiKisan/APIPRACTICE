package stepDefinations;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIresources;
import resources.TestdataBuild;
import resources.Utilies;

public class stepDefination extends Utilies{
	
	RequestSpecification res;
	TestdataBuild data=new TestdataBuild();
	ResponseSpecification resspec;
	Response response;
	String token;
	
@Given("Here Login using creditionals")
public void here_login_using_creditionals() throws IOException {
	
	res=given().spec(requestspecification()).body(data.Loginpayload());	
}

@When("user calls {string} with {string} http request")
public void user_calls_with_http_request(String resource, String method) {
	
	APIresources resourceAPI=APIresources.valueOf(resource);
	resspec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
	response=res.when().post(resourceAPI.getResource());
}

@Then("the API call is success with status code {int}")
public void the_api_call_is_success_with_status_code(Integer int1) {
	
	assertEquals(response.getStatusCode(),200);
}

@And("{string} in response body is {string}")
public void in_response_body_is(String key, String Expectedvalue) {
	
	token=getJsonPath(response,"token");
	assertEquals(getJsonPath(response,key),Expectedvalue);			
}

}
