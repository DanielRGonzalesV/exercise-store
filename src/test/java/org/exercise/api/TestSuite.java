package org.exercise.api;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/api/student.feature",
        glue = "org.exercise"
)
public class TestSuite {

    @BeforeClass
    public static void globalSetup() {

    }

}
