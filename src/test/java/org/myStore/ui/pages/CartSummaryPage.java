package org.myStore.ui.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WithByLocator;
import org.openqa.selenium.By;

public class CartSummaryPage extends PageObject {
    public static final By NAME_PRODUCTS = By.cssSelector(".cart_description .product-name a");

    public static By availabilityProduct(String productName) {
        return By.xpath(String.format("//a[text()='%s']//ancestor::tr[contains(@class, 'cart_item')]//span[@class='label label-success']", productName));
    }
}
