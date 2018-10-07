package com.rent.hertz.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class TrafficTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    private String description;

    private Double price;

    public long getId() {
        return id;
    }

    public TrafficTicket setId(long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public TrafficTicket setDescription(String description) {
        this.description = description;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public TrafficTicket setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrafficTicket that = (TrafficTicket) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "TrafficTicket{" +
            "id=" + id +
            ", description='" + description + '\'' +
            ", price=" + price +
            '}';
    }
}
