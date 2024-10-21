package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String surname;
    private Email email;
    private final List<Address> deliveryAddress; // Multiplicidad *
    private final List<Purchase> purchaseList; // Multiplicidad *

    public Customer(String name, String surname, Email email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.deliveryAddress = new ArrayList<>();
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

    public void addDeliveryAddress(String street, int number, int postalCode, String city) {
        Address address = new Address(street, number, postalCode, city);
        if (!deliveryAddress.contains(address)) {
            deliveryAddress.add(address);
        }
    }

    public void removeDeliveryAddress(Address address) {
        deliveryAddress.remove(address);
    }

    public List<Address> getDeliveryAddress() {
        return deliveryAddress;
    }

    public void addPurchase(Purchase purchase) {
        purchaseList.add(purchase);
    }

    public void removePurchase(Purchase purchase) {
        purchaseList.remove(purchase);
    }

    public List<Purchase> getPurchasesList() {
        return purchaseList;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer anotherCustomer = (Customer) obj;
        return (name.equals(anotherCustomer.name)) && (surname.equals(anotherCustomer.surname) && getEmail().equals(anotherCustomer.getEmail()));
    }
}
