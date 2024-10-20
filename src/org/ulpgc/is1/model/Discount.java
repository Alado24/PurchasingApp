package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Discount {
    private final LocalDate from;
    private final LocalDate to;
    private final int percentage;

    public Discount(LocalDate from, LocalDate to, int percentage) {
        this.from = from;
        this.to = to;
        this.percentage = percentage;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public int getPercentage() {
        return percentage;
    }

}
