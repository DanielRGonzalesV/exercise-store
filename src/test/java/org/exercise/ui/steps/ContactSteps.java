package org.exercise.ui.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.exercise.ui.tasks.FillContactForm;
import org.exercise.ui.tasks.common.Common;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class ContactSteps {

    @Steps
    FillContactForm fillForm;

    @When("I fill the Sales Inquiry form with the following data:")
    public void iFillTheSalesInquiryFormWithTheFollowingData(Map<String, String> salesData) {
        fillForm.with(salesData);
    }

    @And("I submit the form")
    public void iSubmitTheForm() {
        fillForm.submit();
    }
}
