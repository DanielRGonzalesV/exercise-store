package org.starWars.api.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import org.starWars.api.tasks.AddRecord;
import org.starWars.utils.templates.FieldValues;
import org.starWars.utils.templates.MergeFrom;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;

public class SampleSteps {
    private Response resp;
    private String postsData;

    @Steps
    AddRecord addRecord;

    @Given("I have the following posts data:")
    public void iHaveTheFollowingPostsData(List<Map<String, String>> postsDetails) throws IOException {
        postsData = MergeFrom.template("templates/posts.json")
                .withDefaultValuesFrom(FieldValues.in("templates/standard-posts.properties"))
                .withFieldsFrom(postsDetails.get(0));
    }

    @When("I send a {string} HTTP request with that data")
    public void iSendAHTTPRequestWithThatData(String typeService) {
        resp = addRecord.userWithDetails(postsData);
    }

    @Then("I receive valid response code {string}")
    public void iReceiveValidResponseCode(int responseCode) {
        assertThat("Response Code is not expected. ".concat(resp.body().prettyPrint()), resp.getStatusCode() == responseCode);
    }

    @And("I validate response content")
    public void iValidateResponseContent() {
        String contentType = resp.header("Content-Type");

        assertThat(contentType, equalTo("application/json; charset=utf-8"));
    }
}
