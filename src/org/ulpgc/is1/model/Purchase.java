package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Purchase {
    private static int NEXT_ID = 0;
    private final int id;
    private LocalDate date;
    private Customer customer;
    private Product product;
    private Payment payment;
    private Address deliveryAddress;

    public Purchase(Customer customer, Product product, Address deliveryAddress, String card) {
        this.id = NEXT_ID++;
        this.date = LocalDate.now();
        this.customer = customer;
        this.product = product;
        this.deliveryAddress = deliveryAddress;
        this.payment = new Payment(price(), card);
    }

    public int price() {
        if (this.product.getDiscount() == null) {
            return this.product.getPrice();
        }
        else {
            return (this.product.getPrice() - this.product.getPrice() * (this.product.getDiscount().getPercentage() / 100));
        }
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = LocalDate.parse(date);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
