package stepDefinitions;

import helpers.Utilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import helpers.Status;


public class NegativeFlow {
    private Utilities utils = new Utilities();
    private JSONArray jsonArray;

    @Given("The swagger service is down")
    public void theSwaggerServiceIsDown() {

    }

    @When("I read the Json response file")
    public void iReadTheJsonResponseFile() throws IOException, ParseException {
            jsonArray = getJSONArray();
    }

    @Then("Valid resonse is received")
    public void validResonseIsReceived() {
        List<Object> response = Arrays.asList(jsonArray.stream().toArray());
        //System.out.println(response.stream().filter(utils.predicate()).count());
        Assert.assertTrue(response.stream().filter(utils.predicate(Status.AVAILABLE.toString())).count()!=0);
    }

    private JSONArray getJSONArray() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        return  (JSONArray) jsonParser.parse(new FileReader("src/test/resources/response.json"));
    }


}
