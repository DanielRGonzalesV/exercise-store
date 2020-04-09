package org.exercise.api.requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RequestManager {
    public RequestSpecification requestSpecification;

    private RequestManager() {
    }

    /**
     * Build the Get method request
     *
     * @param endPoint route of the get end point.
     * @return the response body
     */
    public static Response get(RequestSpecification requestSpecification, final String endPoint) {
        return given().spec(requestSpecification)
                .when()
                .get(endPoint);
    }


    /**
     * Build the Post method request with body request
     *
     * @param body Json data.
     * @return the response body
     */
    public static Response post(RequestSpecification requestSpecification, final String body, String endpoint) {
        return given().spec(requestSpecification).log().method()
                .contentType(ContentType.JSON).log().method()
                .body(body).log().method()
                .when().log().method()
                .post(endpoint);
    }
}
