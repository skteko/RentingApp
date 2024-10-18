package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.util.List;

public class Renting {
    private static int NEXT_ID = 0;
    private final int id;
    private LocalDate from;
    private LocalDate to;
    private Customer customer;
    private List<Extra> extras;
    private Payment payment;


    public Renting(int id, LocalDate from, LocalDate to, Customer customer, List<Extra> extras) {
        this.id = NEXT_ID++;
        this.from = from;
        this.to = to;
        this.customer = customer;
        this.extras = extras;
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

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public void setExtras(List<Extra> extras) {
        this.extras = extras;
    }

    public void setPayment(int price, LocalDate date) {
        this.payment = new Payment(date, price);
    }
}
