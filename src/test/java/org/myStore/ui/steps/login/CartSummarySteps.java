package org.myStore.ui.steps.login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.myStore.ui.tasks.CartSummary;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.*;

public class CartSummarySteps {

    CartSummary cartSummary;

    @Then("The following products should be displayed with the status availability")
    public void theFollowingProductsShouldBeDisplayedWithTheAvailability(Map<String, String>  products) {
        for (Map.Entry<String, String> entry : products.entrySet()) {
            assertThat(cartSummary.getNamesProducts(), hasItem(entry.getKey()));
            assertThat(cartSummary.getAvailabilityProduct(entry.getKey()), equalTo(entry.getValue()));
        }
    }

    @When("I remove the following products from cart")
    public void iRemoveTheFollowingProductsFromCart(List<String> products) {
        cartSummary.removeProducts(products);
    }

    @Then("The following products should not be displayed in the page")
    public void theFollowingProductsShouldNotBeDisplayedInThePage(List<String> products) {
        for (String nameProduct : products) {
            assertThat(cartSummary.getNamesProducts(), not(hasItem(nameProduct)));
        }
    }

    @And("the total amount to pay is {string}")
    public void theTotalAmountToPayIs(String expectedTotalAmount) {
        assertThat(cartSummary.totalAmount(), equalTo(expectedTotalAmount));
    }
}
