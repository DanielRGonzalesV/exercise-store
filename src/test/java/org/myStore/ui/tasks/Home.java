package org.myStore.ui.tasks;

import net.serenitybdd.core.steps.UIInteractionSteps;

public class Home extends UIInteractionSteps {
    public String title() {
        return getDriver().getTitle();
    }
}
