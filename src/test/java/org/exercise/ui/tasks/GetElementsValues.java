package org.exercise.ui.tasks;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.exercise.ui.pages.ThankYouContacting;
import org.exercise.ui.tasks.common.Common;

public class GetElementsValues extends UIInteractionSteps {
    Common common;


    public String getMessageThankYou() {
        return common.getText(ThankYouContacting.MESSAGE);
    }
}
