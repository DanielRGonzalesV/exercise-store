package org.starWars.api.tasks;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import org.starWars.api.requests.RequestManager;
import org.starWars.api.requests.RequestSpec;

public class AddRecord {
    private Response postResponse;

    @Step("Add a new user")
    public Response userWithDetails(String userData) {
        postResponse = RequestManager.post(RequestSpec.buildRequestSpecification(), userData, "/posts");
        return postResponse;
    }
}
