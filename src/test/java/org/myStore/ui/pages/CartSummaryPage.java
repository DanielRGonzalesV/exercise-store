package org.myStore.ui.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartSummaryPage extends PageObject {
    public static final By NAME_PRODUCTS = By.cssSelector(".cart_description .product-name a");
    public static final By TOTAL_AMOUNT = By.cssSelector("#total_price");

    public static By availabilityProduct(String productName) {
        return By.xpath(String.format("//a[text()='%s']//ancestor::tr[contains(@class, 'cart_item')]//span[@class='label label-success']", productName));
    }

    public static By removeItem(String productName) {
        return By.xpath(String.format("//a[text()='%s']//ancestor::tr[contains(@class, 'cart_item')]//a[@title='Delete']", productName));
    }
}
