package org.myStore.ui.tasks.home;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.myStore.ui.pages.CartDialog;
import org.myStore.ui.pages.home.HomePage;
import org.myStore.ui.tasks.ViewCart;
import org.myStore.ui.tasks.common.Common;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class Home extends UIInteractionSteps {

    ViewCart cart;
    Common common;

    public String title() {
        return getDriver().getTitle();
    }

    public void clickOnBestSellers() {
        $(HomePage.BEST_SELLERS).click();
    }

    protected List<String> productsList(By elements) {
        List<String> listOfNamesProducts;
        List<WebElementFacade> nameElements = findAll(elements);
        listOfNamesProducts = nameElements.stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
        return listOfNamesProducts;
    }


    @Step("Add products to the Cart and Continue shopping")
    public void addToCart(List<String> products) {
        products.forEach(
                productName -> {
                    common.hoverOn(HomePage.imageProduct(productName));
                    $(HomePage.bestSellersAddToCart(productName)).click();
                    $(CartDialog.CONTINUE_SHOPPING).click();
                }
        );
    }

    public void clickCheckoutFromCart() {
        cart.clickOnCheckOut();
    }
}
