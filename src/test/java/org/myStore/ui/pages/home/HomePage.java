package org.myStore.ui.pages.home;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    public static final By BEST_SELLERS = By.cssSelector("[href='#blockbestsellers']");
    public static final By BEST_SELLERS_PRODUCTS = By.cssSelector("#blockbestsellers .product-name");

    public static By bestSellersDiscount(String productName) {
        return By.xpath(String.format("//ul[@id='blockbestsellers']//a[@title='%s']//ancestor::div[@class='right-block']//span[@class='price-percent-reduction']", productName));
    }

    public static By bestSellersAddToCart(String productName) {
        return By.xpath(String.format("//ul[@id='blockbestsellers']//a[@title='%s']//ancestor::div[@class='right-block']//a[@title='Add to cart']", productName));
    }
}
