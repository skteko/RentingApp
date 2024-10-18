package org.ulpgc.is1.model;
import java.time.LocalDate;

public class Payment {
    private int price;
    private LocalDate date;

    public Payment(LocalDate date, int price) {
        this.date = date;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
