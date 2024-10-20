package org.ulpgc.is1.model;

import java.util.Objects;

public class Customer {
    private String name;
    private String surname;
    private CustomerType type;

    public Customer(String name, String surname, CustomerType type) {
        this.name = name;
        this.surname = surname;
        this.type = type;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer customer = (Customer) obj;
        return name.equals(customer.name) && surname.equals(customer.surname) && type == customer.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, type);
    }
}

