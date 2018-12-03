package com.rent.hertz.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Model implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

    private String modelYear;

    private String description;


    public String getId() {
        return id;
    }

    public Model setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Model setName(String name) {
        this.name = name;
        return this;
    }

    public String getModelYear() {
        return modelYear;
    }

    public Model setModelYear(String modelYear) {
        this.modelYear = modelYear;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Model setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return id.equals(model.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Model{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", modelYear='" + modelYear + '\'' +
            ", description='" + description + '\'' +
            '}';
    }
}
