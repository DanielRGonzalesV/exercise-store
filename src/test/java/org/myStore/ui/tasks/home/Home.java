package org.myStore.ui.tasks.home;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.myStore.ui.pages.home.HomePage;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class Home extends UIInteractionSteps {

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
}
