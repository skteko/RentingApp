package org.ulpgc.is1.model;

public class Translator extends Extra {
    private String name;
    private String surname;

    public Translator(String name, String surname, int dayPrice) {
        this.name = name;
        this.surname = surname;
        this.dayPrice = dayPrice;
    }

    @Override
    public String getName() {
        return name + " " + surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
