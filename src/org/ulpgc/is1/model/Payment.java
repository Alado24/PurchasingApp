package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Payment {
    private LocalDate date;
    private int amount;
    private String card;

    public Payment(int amount, String card) {
        this.date = LocalDate.now();
        this.amount = amount;
        this.card = card;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = LocalDate.parse(date);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
