package stepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import helpers.Status;
import helpers.Utilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class MyStepdefs {

    private ValidatableResponse VResponse;
    private final RequestSpecBuilder requestBuilder = new RequestSpecBuilder();
    private RequestSpecification requestSpec;
    private Response response;
    private Utilities utils = new Utilities();

    @Given("The base URL is set")
    public void the_base_url_is_set() {
        requestBuilder.setBaseUri("https://petstore.swagger.io/v2");
    }

    @When("I send GET request to {string}")
    public void i_send_get_request_to_with_query_parm_available(String requestPath) throws JsonProcessingException {
        requestBuilder.setBasePath(requestPath);
        requestBuilder.setContentType(ContentType.JSON);
        requestSpec = requestBuilder.build();
        response =RestAssured.given()
                .spec(requestSpec)
                .get();
    }

    @Then("Valid response is received")
    public void valid_respond_is_received() {
        List<Map<String,String>> responses = response.jsonPath().getList("$");
        Assert.assertTrue(responses.stream().filter(utils.predicate(Status.AVAILABLE.toString())).count()!=0);
    }
}
