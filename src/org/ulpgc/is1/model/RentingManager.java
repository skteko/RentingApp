package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class RentingManager {
    private List<Customer> CustomerList;
    private List<Room> RoomList ;
    public RentingManager() {
        CustomerList = new ArrayList<>();
        RoomList = new ArrayList<>() ;
    }
    public void addCustomer(String name, String surname, CustomerType type) {
        CustomerList.add(new Customer(name, surname, type));
    }
    public List<Customer> getCustomer() {
        return CustomerList;
    }

}
