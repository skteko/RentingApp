package org.ulpgc.is1.model;

import java.util.Date;
import java.util.List;

public class Renting {
    private static int NEXT_ID = 0;
    private final int id;
    private Date from;
    private Date to;
    private Customer customer;
    private List<Extra> extras;
    private Payment payment;


    public Renting(int id, Date from, Date to, Customer customer, List<Extra> extras) {
        this.id = NEXT_ID++;
        this.from = from;
        this.to = to;
        this.customer = customer;
        this.extras = extras;
    }

    public int getId() {
        return id;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
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

    public void setPayment(int price, Date date) {
        this.payment = new Payment(date, price);
    }
}
