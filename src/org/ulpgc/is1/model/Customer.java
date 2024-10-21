package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String surname;
    private Email email;
    private List<Address> deliveryAddresses; // Multiplicidad *
    private List<Purchase> purchaseList; // Multiplicidad *

    public Customer(String name, String surname, Email email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.deliveryAddresses = new ArrayList<>();
        this.purchaseList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Email getEmail() { // Cambiado de "getAccount" a "getEmail"
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void addDeliveryAddress(Address address) {
        deliveryAddresses.add(address);
    }

    public List<Address> getDeliveryAddresses() {
        return deliveryAddresses;
    }

    public void addPurchase(Purchase purchase) {
        purchaseList.add(purchase);
    }

    public List<Purchase> getPurchasesList() {
        return purchaseList;
    }

}
