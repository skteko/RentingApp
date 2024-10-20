package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Renting {
    private static int NEXT_ID = 0;
    private final int id;
    private LocalDate from;
    private LocalDate to;
    private Customer customer;
    private Room room;
    private Extra extra;

    public Renting(LocalDate from, LocalDate to, Customer customer, Room room, Extra extra) {
        this.id = NEXT_ID++;
        this.from = from;
        this.to = to;
        this.customer = customer;
        this.room = room;
        this.extra = extra;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public Extra getExtra() {
        return extra;
    }

    public int price() {
        int days = (int) ChronoUnit.DAYS.between(from, to);
        int roomPrice = room.getDayPrice() * days;
        int extraPrice = (extra != null) ? extra.getDayPrice() * days : 0;
        return roomPrice + extraPrice;
    }
}
