package org.starWars.api.requests;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class RequestSpec {

    public static RequestSpecification buildRequestSpecification() {
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        EnvironmentSpecificConfiguration specificConfig = EnvironmentSpecificConfiguration.from(variables);

        return new RequestSpecBuilder()
                .setBaseUri(specificConfig.getProperty("webdriver.base.url"))

                .build();
                       //.addHeader("Content-Type", "application/json")
    }
}
