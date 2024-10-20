package org.ulpgc.is1.model;


public abstract class Extra  {
    protected int dayPrice;

    public int getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(int dayPrice) {
        this.dayPrice = dayPrice;
    }

    public abstract String getName();
}
