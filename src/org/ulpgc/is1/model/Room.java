package org.ulpgc.is1.model;

public class Room {
    private String name;
    private int capacity;
    private int dayPrice;
    private RoomType type;

    public Room(String name, int capacity, int dayPrice, RoomType type) {
        this.name = name;
        this.capacity = capacity;
        this.dayPrice = dayPrice;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(int dayPrice) {
        this.dayPrice = dayPrice;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }
}
