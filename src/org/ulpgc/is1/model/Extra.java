package org.ulpgc.is1.model;


public abstract class Extra  {
    private int dayPrice;
    private String name;

    public int getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(int dayPrice) {
        this.dayPrice = dayPrice;
    }

    public abstract String getName();
}
