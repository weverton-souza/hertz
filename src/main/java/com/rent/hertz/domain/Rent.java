package com.rent.hertz.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private Date date;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Demage demage;


    public long getId() {
        return id;
    }

    public Rent setId(long id) {
        this.id = id;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Rent setDate(Date date) {
        this.date = date;
        return this;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Rent setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Rent setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public Demage getDemage() {
        return demage;
    }

    public Rent setDemage(Demage demage) {
        this.demage = demage;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return id == rent.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Rent{" +
            "id=" + id +
            ", date=" + date +
            '}';
    }

}
