package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class PurchasingManager {
    private final List<Customer> customerList;
    private final List<Product> productList;

    public PurchasingManager() {
        this.customerList = new ArrayList<>();
        this.productList = new ArrayList<>();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void addCustomer(String name, String surname, Email email) {
        Customer customer = new Customer(name, surname, email);
        if (!this.customerList.contains(customer)) {
            this.customerList.add(customer);
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(int id, String name, String description, int price, ProductCategory category, String dateFrom, String dateTo, int percentage) {
        Product product = new Product(id, name, description, price, category, dateFrom, dateTo, percentage);
        if (!this.productList.contains(product)) {
            this.productList.add(product);
        }
    }

    public void addProduct(int id, String name, String description, int price, ProductCategory category) {
        Product product = new Product(id, name, description, price, category);
        if (!this.productList.contains(product)) {
            this.productList.add(product);
        }
    }

    public List<Purchase> getPurchaseList(Customer customer) {
        return customer.getPurchaseList();
    }

    public void purchase(Customer customer, Product product, Address deliveryAddress, String card) {
        Purchase purchase = new Purchase(customer, product, deliveryAddress, card);
        if (!customer.getPurchaseList().contains(purchase)) {
            customer.addPurchase(purchase);
        }
    }
}
