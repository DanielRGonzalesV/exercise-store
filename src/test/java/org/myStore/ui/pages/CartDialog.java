package org.myStore.ui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class CartDialog extends PageObject {
    public static final By CONTINUE_SHOPPING = By.cssSelector("[title='Continue shopping']");
}
