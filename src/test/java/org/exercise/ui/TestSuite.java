package org.exercise.ui;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/ui/contact.feature",
        glue = "org.exercise"
)
public class TestSuite {

    @BeforeClass
    public static void globalSetup() {

    }

}
