package org.exercise.ui.tasks;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.exercise.ui.pages.ContactPage;
import org.exercise.ui.tasks.common.Common;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class FillContactForm extends UIInteractionSteps {

    Common common;
    String value;


    public void with(Map<String, String> salesData) {
        Map<String, Runnable> formInfo = new HashMap<>();

        formInfo.put("First Name", () -> common.set(ContactPage.FIRST_NAME, value));
        formInfo.put("Last Name", () -> common.set(ContactPage.LAST_NAME, value));
        formInfo.put("Job Title", () -> common.set(ContactPage.JOB_TITLE, value));
        formInfo.put("Company", () -> common.set(ContactPage.COMPANY, value));
        formInfo.put("Email Address", () -> common.set(ContactPage.EMAIL_ADDRESS, value));
        formInfo.put("Business Phone", () -> common.set(ContactPage.BUSINESS_PHONE, value));
        formInfo.put("Country", () -> common.select(ContactPage.COUNTRY, value));
        formInfo.put("Contact Department", () -> common.select(ContactPage.CONTACT_DEPARTMENT, value));
        formInfo.put("Message", () -> common.set(ContactPage.MESSAGE, value));

        for (Map.Entry<String, String> entry : salesData.entrySet()) {
            value = entry.getValue();
            formInfo.get(entry.getKey()).run();
        }
    }

    public void submit() {
        common.focusElement(ContactPage.ELEMENT_VIEW);
        common.clickOnElement(ContactPage.SUBMIT);
    }
}
