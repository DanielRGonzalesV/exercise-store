package org.myStore.ui.tasks;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.myStore.ui.pages.home.HomePage;
import org.myStore.ui.pages.home.ViewCartPage;
import org.myStore.ui.tasks.common.Common;
import org.myStore.ui.tasks.home.Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ViewCart extends UIInteractionSteps {
    Common common;

    @Step("Hover on View Cart and Click Checkout")
    public void clickOnCheckOut() {
        common.hoverOn(HomePage.VIEW_CART);
        $(ViewCartPage.CHECKOUT).click();
    }
}
