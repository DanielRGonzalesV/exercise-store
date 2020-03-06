package org.myStore.ui.steps.login;

import cucumber.api.java.en.Then;
import org.myStore.ui.tasks.CartSummary;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
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
}
