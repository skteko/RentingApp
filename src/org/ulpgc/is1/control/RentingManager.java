package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RentingManager {
    private List<Customer> customers = new ArrayList<>();
    private List<Room> rooms = new ArrayList<>();
    private List<Extra> extras = new ArrayList<>();
    private List<Renting> rentings = new ArrayList<>();

    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        } else {
            System.out.println("Customer already exists: " + customer.getName() + " " + customer.getSurname());
        }
    }

    public Customer getCustomer(String name, String surname) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name) && customer.getSurname().equals(surname)) {
                return customer;
            }
        }
        return null;
    }

    public void addRoom(Room room) {
        if (!rooms.contains(room)) {
            rooms.add(room);
        } else {
            System.out.println("Room already exists: " + room.getName());
        }
    }

    public Room getRoom(String name) {
        for (Room room : rooms) {
            if (room.getName().equals(name)) {
                return room;
            }
        }
        return null;
    }

    public void addEquipment(Equipment equipment) {
        if (!extras.contains(equipment)) {
            extras.add(equipment);
        } else {
            System.out.println("Equipment already exists: " + equipment.getName());
        }
    }

    public Equipment getEquipment(String name) {
        for (Extra extra : extras) {
            if (extra instanceof Equipment && extra.getName().equals(name)) {
                return (Equipment) extra;
            }
        }
        return null;
    }


    public void addTranslator(Translator translator) {
        if (!extras.contains(translator)) {
            extras.add(translator);
        } else {
            System.out.println("Translator already exists: " + translator.getName());
        }
    }


    public Translator getTranslator(String name) {
        for (Extra extra : extras) {
            if (extra instanceof Translator && extra.getName().equals(name)) {
                return (Translator) extra;
            }
        }
        return null;
    }

    public void rent(Customer customer, Room room, Extra extra, LocalDate from, LocalDate to) {
        Renting renting = new Renting(from, to, customer, room, extra);
        rentings.add(renting);
    }

    public List<Renting> getRentingList() {
        return rentings;
    }

    public void showRentingsForRoom(Room room) {
        System.out.println("***********************");
        System.out.println("Alquileres " + room.getName());
        System.out.println("***********************");
        System.out.println("-Nombre: " + room.getName());
        System.out.println("-Capacidad: " + room.getCapacity());
        System.out.println("-Tipo: " + room.getType());
        System.out.println("-Precio por dia: " + room.getDayPrice());
        System.out.println("-----------------------");
        for (Renting renting : rentings) {
            if (renting.getRoom().equals(room)) {
                System.out.println("Datos del alquiler: ");
                System.out.println("Renting ID: " + renting.getId());
                System.out.println("Customer: " + renting.getCustomer().getName() + " " + renting.getCustomer().getSurname());
                System.out.println("From: " + renting.getFrom() + " To: " + renting.getTo());
                System.out.println("Price: " + renting.price() + " EUR");
                Extra extra = renting.getExtra();
                if (extra != null) {
                    System.out.println("Extra: " + extra.getName() + " (Price per day: " + extra.getDayPrice() + " EUR)");
                }
                System.out.println("---------------------------");
            }
        }
    }
}

