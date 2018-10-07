package com.rent.hertz.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Demage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private String description;

    private Double price;

    public long getId() {
        return id;
    }

    public Demage setId(long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Demage setDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Demage setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demage demage = (Demage) o;
        return id == demage.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Demage{" +
            "id=" + id +
            ", description='" + description + '\'' +
            ", price=" + price +
            '}';
    }

}
