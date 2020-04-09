package org.exercise.api.tasks;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import org.exercise.api.requests.RequestManager;
import org.exercise.api.requests.RequestSpec;

public class AddRecord {
    private Response postResponse;

    @Step("Add a new user")
    public Response userWithDetails(String userData) {
        postResponse = RequestManager.post(RequestSpec.buildRequestSpecification(), userData, "/posts");
        return postResponse;
    }
}
