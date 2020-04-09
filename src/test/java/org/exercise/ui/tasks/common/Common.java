package org.exercise.ui.tasks.common;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Common extends UIInteractionSteps {

    public void clickOnElement(By by) {
        focusElement(by);
        $(by).click();
    }
    public void set(By element, String value) {
        $(element).type(value);
    }

    public void select(By element, String value) {
        $(element).selectByValue(value);
    }

    public void focusElement(By element) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement($(element));
        actions.perform();
    }

    public String getText(By element) {
        return find(element).getText();
    }
}
