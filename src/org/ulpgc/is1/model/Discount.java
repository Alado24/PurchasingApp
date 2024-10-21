package org.ulpgc.is1.model;

import java.time.LocalDate;

public class Discount {
    private LocalDate from;
    private LocalDate to;
    private int percentage;

    public Discount(String dateFrom, String dateTo, int percentage) {
        this.from = LocalDate.parse(dateFrom);
        this.to = LocalDate.parse(dateTo);
        this.percentage = percentage;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(String date) {
        this.from = LocalDate.parse(date);
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(String date) {
        this.to = LocalDate.parse(date);
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

}
