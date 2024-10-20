package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Payment {
    private final LocalDate date;
    private final int amount;
    private final String card;

    public Payment(LocalDate date, int amount, String card) {
        this.date = date;
        this.amount = amount;
        this.card = card;
    }


    public LocalDate getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public String getCard() {
        return card;
    }
}
