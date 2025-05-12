package stepdefinition.API;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

public class GetAPISteps {
    Response response;
    @When("the user sends a GET request to {string}")
    public void user_sends_get_request(String url) {
        response = RestAssured.get(url);
    }

    @Then("the API response status code should be {int}")
    public void api_response_should_be(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

}