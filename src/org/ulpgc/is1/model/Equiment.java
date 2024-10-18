package org.ulpgc.is1.model;

public class Equiment extends Extra {
    private String name;

    public Equiment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
