package org.myStore.ui.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.myStore.ui.pages.CartSummaryPage;

import java.util.List;
import java.util.stream.Collectors;


public class CartSummary extends UIInteractionSteps {

    public List<String> getNamesProducts() {
        List<String> listOfNamesProducts;
        List<WebElementFacade> nameElements = findAll(CartSummaryPage.NAME_PRODUCTS);
        listOfNamesProducts = nameElements.stream()
                .map(WebElementFacade::getText)
                .collect(Collectors.toList());
        return listOfNamesProducts;
    }

    public String getAvailabilityProduct(String productName) {
        return $(CartSummaryPage.availabilityProduct(productName)).getText();
    }

    public void removeProducts(List<String> products) {
        products.forEach(
                productName -> {
                    List<String> listOfNamesProductsFirst = getNamesProducts();
                    $(CartSummaryPage.removeItem(productName)).click();
                    waitForAngularRequestsToFinish();
                    verifyElements(listOfNamesProductsFirst.size(), 15);
                }
        );
    }

    private void verifyElements(int sizeFirst, int count) {
        List<String> listOfNamesProductsSecond = getNamesProducts();
        if (listOfNamesProductsSecond.size() == sizeFirst && count > 0) {
            verifyElements(sizeFirst, count - 1);
        }
    }

    public String totalAmount() {
        return $(CartSummaryPage.TOTAL_AMOUNT).getText();
    }
}
