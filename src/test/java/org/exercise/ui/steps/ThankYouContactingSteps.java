package org.exercise.ui.steps;

import cucumber.api.java.en.Then;
import org.exercise.ui.tasks.GetElementsValues;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ThankYouContactingSteps {
    GetElementsValues getElementsValues;

    @Then("The message {string} is displayed")
    public void theMessageIsDisplayed(String titleExpected) {
        assertThat(getElementsValues.getMessageThankYou(), equalTo(titleExpected));
    }
}
