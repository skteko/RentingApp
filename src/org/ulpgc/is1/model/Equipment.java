package org.ulpgc.is1.model;

public class Equipment extends Extra {
    private String name;

    public Equipment(String name, int dayPrice) {
        this.name = name;
        this.dayPrice = dayPrice;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
