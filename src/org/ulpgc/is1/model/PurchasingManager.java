package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class PurchasingManager {
    private List<Customer> customerList;
    private List<Product> productList;
    private List<Purchase> purchaseList;

    public PurchasingManager() {
        this.customerList = new ArrayList<>();
        this.productList = new ArrayList<>();
        this.purchaseList = new ArrayList<>();
    }
}
