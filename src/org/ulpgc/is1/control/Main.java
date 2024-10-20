package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        RentingManager manager = new RentingManager();

        // i) Add two clients
        Customer customer1 = new Customer("John", "Doe", CustomerType.SILVER);
        Customer customer2 = new Customer("Jane", "Smith", CustomerType.GOLD);
        manager.addCustomer(customer1);
        manager.addCustomer(customer2);

        // ii) Add two rooms
        Room room1 = new Room("Sala Marconi", 50, 100, RoomType.CONFERENCE_ROOM);
        Room room2 = new Room("Sala Tokyo", 30, 80, RoomType.MEETING_ROOM);
        manager.addRoom(room1);
        manager.addRoom(room2);

        // iii) Create Equipment
        Equipment equipment = new Equipment("TV", 10);
        manager.addEquipment(equipment);

        // iv) Hacer un alquiler para el primer cliente para la segunda sala sin extras
        LocalDate fromDate1 = LocalDate.of(2024, 10, 25);
        LocalDate toDate1 = LocalDate.of(2024, 10, 28);
        manager.rent(customer1, room2, null, fromDate1, toDate1);

        // v) Hacer un alquiler para el segundo cliente de la segunda sala con un equipo
        LocalDate fromDate2 = LocalDate.of(2024, 11, 1);
        LocalDate toDate2 = LocalDate.of(2024, 11, 4);
        manager.rent(customer2, room2, equipment, fromDate2, toDate2);

        // vi) Mostrar todos los datos de las reservas de la segunda sala (Room B)
        manager.showRentingsForRoom(room2);
    }
}