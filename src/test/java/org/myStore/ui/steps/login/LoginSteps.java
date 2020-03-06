package org.myStore.ui.steps.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.myStore.ui.tasks.home.Home;
import org.myStore.ui.tasks.Login;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LoginSteps {

    @Steps
    Login login;
    Home home;

    @Given("I open the My Store Page")
    public void iOpenTheMyStorePage() {
        login.open();
    }

    @Then("Verify the page title {string}")
    public void verifyThePageTitle(String pageTitle) {
        assertThat(home.title(), equalTo(pageTitle));
    }
}
