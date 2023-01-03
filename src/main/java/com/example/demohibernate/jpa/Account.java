package com.example.demohibernate.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * Счет клиента
 */

@Entity
public class Account {

    @Id
    private String number;

    @ManyToOne
    private Customer customer;

    public Account(String number, Customer customer) {
        this.number = number;
        this.customer = customer;
    }

    public Account() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
