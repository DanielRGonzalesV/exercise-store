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
}
