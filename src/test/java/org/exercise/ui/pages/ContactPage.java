package org.exercise.ui.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ContactPage extends PageObject {
    public static final By FIRST_NAME = By.cssSelector("#FirstName");
    public static final By LAST_NAME = By.cssSelector("#LastName");
    public static final By JOB_TITLE = By.cssSelector("#Title");
    public static final By COMPANY = By.cssSelector("#Company");
    public static final By EMAIL_ADDRESS = By.cssSelector("#Email");
    public static final By BUSINESS_PHONE = By.cssSelector("#Phone");
    public static final By COUNTRY = By.cssSelector("#Country");
    public static final By CONTACT_DEPARTMENT = By.cssSelector("#Division_Department__c");
    public static final By MESSAGE = By.cssSelector("#comment_capture");
    public static final By SUBMIT = By.cssSelector("button[type='submit']");
    public static final By ELEMENT_VIEW = By.cssSelector(".features-item__image--sm[src='/-/media/niceincontact/module-content/features/customer-community.ashx']");
        }
