package org.exercise.api.tasks;

import io.restassured.response.Response;
import net.thucydides.core.annotations.Step;
import org.exercise.api.requests.RequestManager;
import org.exercise.api.requests.RequestSpec;

public class GetRecord {

    @Step("get student with id {string}")
    public Response withStudentId(String id) {
        String STUDENT_WITH_ID = "/student/{id}";
        String endPoint = STUDENT_WITH_ID.replace("{id}", id);
        return RequestManager.get(RequestSpec.buildRequestSpecification(), endPoint);
    }
}
