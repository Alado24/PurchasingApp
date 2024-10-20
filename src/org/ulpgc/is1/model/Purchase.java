package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Purchase {
    private static int NEXT_ID = 0;
    private final int id;
    private final LocalDate date;
    private final Customer customer;
    private final List<Product> products = new ArrayList<>(); // Multiplicidad 1..* para productos

    public Purchase(Customer customer) {
        this.id = NEXT_ID++;
        this.date = LocalDate.now();
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }
}
