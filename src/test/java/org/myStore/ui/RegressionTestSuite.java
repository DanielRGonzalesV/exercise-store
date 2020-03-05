package org.myStore.ui;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/ui/loginTest.feature",
        glue = "org.myStore"
)
public class RegressionTestSuite {

    @BeforeClass
    public static void globalSetup() {

    }

}
