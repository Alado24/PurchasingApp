package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final String surname;
    private final Email email; // Cambiado de "account" a "email"
    private final List<Address> deliveryAddresses = new ArrayList<>(); // Multiplicidad 1..*
    private final List<Purchase> purchases = new ArrayList<>(); // Multiplicidad 1..*

    public Customer(String name, String surname, Email email) { // Cambiado de "account" a "email"
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Email getEmail() { // Cambiado de "getAccount" a "getEmail"
        return email;
    }

    public void addDeliveryAddress(Address address) {
        deliveryAddresses.add(address);
    }

    public List<Address> getDeliveryAddresses() {
        return deliveryAddresses;
    }

    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

}
