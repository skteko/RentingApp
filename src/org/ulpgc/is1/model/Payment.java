package org.ulpgc.is1.model;

import java.util.Date;

public class Payment {
    private int price;
    private Date date;

    public Payment(Date date, int price) {
        this.date = date;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
