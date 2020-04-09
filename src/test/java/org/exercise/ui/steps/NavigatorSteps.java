package org.exercise.ui.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.exercise.ui.tasks.Navigate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class NavigatorSteps {

    @Steps
    Navigate navigate;

    @Given("Navigate to Contact Page")
    public void navigateToContactPage() {
        navigate.goToContactPage();
    }
}
