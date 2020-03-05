package org.myStore.ui.tasks;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.myStore.ui.pages.login.LoginPage;


public class Login extends UIInteractionSteps {

    LoginPage loginPage;

    @Step("Simple open webPage")
    public void toApp() {
        loginPage.open();
    }
}
