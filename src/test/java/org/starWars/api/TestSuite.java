package org.starWars.api;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/api/sample.feature",
        glue = "org.starWars"
)
public class TestSuite {

    @BeforeClass
    public static void globalSetup() {

    }

}
