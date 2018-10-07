package com.rent.hertz.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    private Double price;

    public long getId() {
        return id;
    }

    public Category setId(long id) {
        this.id = id;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public Category setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return getId() == category.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + getId() +
                ", price=" + getPrice() +
                '}';
    }

}
