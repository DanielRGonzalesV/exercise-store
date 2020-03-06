package org.myStore.ui.tasks.common;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Common extends UIInteractionSteps {

    @Step("Hover on Element")
    public void hoverOn(By element) {
        Actions builder = new Actions(getDriver());
        builder.moveToElement($(element)).build().perform();
    }
}
