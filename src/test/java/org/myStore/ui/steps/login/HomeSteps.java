package org.myStore.ui.steps.login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.myStore.ui.tasks.home.BestSeller;
import org.myStore.ui.tasks.home.Home;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class HomeSteps {
    @Steps
    Home home;
    BestSeller bestSeller;

    @Then("The {string} item is displayed")
    public void theItemIsDisplayed(String itemName) {
        assertThat(bestSeller.getProductsList(), hasItem(itemName));
    }

    @And("The discount price showed for {string} should be {string}")
    public void theDiscountPriceShowedForShouldBe(String nameProduct, String expectedDiscount) {
        assertThat(bestSeller.getDiscountProduct(nameProduct), equalTo(expectedDiscount));
    }

    @When("I click on BEST SELLERS")
    public void iClickOnBestSellers() {
        home.clickOnBestSellers();
    }

    @When("I add the following products to cart")
    public void iAddTheFollowingProductsToCart(List<String> products) {
     //   bestSeller.addToCart(products);
    }
}
