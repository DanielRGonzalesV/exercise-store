package org.myStore.ui.tasks.home;

import org.myStore.ui.pages.home.HomePage;

import java.util.List;

public class BestSeller extends Home {
    Home home;

    public List<String> getProductsList() {
        return home.productsList(HomePage.BEST_SELLERS_PRODUCTS);
    }

    public String getDiscountProduct(String productName) {
        return $(HomePage.bestSellersDiscount(productName)).getText();
    }
}
