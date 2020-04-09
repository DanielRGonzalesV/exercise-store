package org.exercise.api.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import org.exercise.api.tasks.AddRecord;
import org.exercise.api.tasks.GetRecord;
import org.exercise.utils.templates.FieldValues;
import org.exercise.utils.templates.MergeFrom;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;

public class StudentSteps {
    private Response resp;
    private String postsData;

    @Steps
    AddRecord addRecord;
    GetRecord getRecord;

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

    @Given("I send GET request for student with ID {string}")
    public void iSetGETRequestForStudentWithID(String id) {
        resp = getRecord.withStudentId(id);
    }

    @Given("I have the following student data:")
    public void iHaveTheFollowingStudentData(List<Map<String, String>> postsDetails) throws IOException {
        postsData = MergeFrom.template("templates/posts.json")
                .withDefaultValuesFrom(FieldValues.in("templates/standard-posts.properties"))
                .withFieldsFrom(postsDetails.get(0));
    }
}
