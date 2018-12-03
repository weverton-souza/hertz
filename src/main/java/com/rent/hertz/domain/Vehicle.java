package com.rent.hertz.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

    private String license;

    @ManyToOne
    private Manufacturer make;

    @ManyToOne
    private Model model;

    @ManyToOne
    private Category category;


    public String getId() {
        return id;
    }

    public Vehicle setId(String id) {
        this.id = id;
        return this;
    }

	public String getName() {
		return name;
	}

	public Vehicle setName(String name) {
		this.name = name;
		return this;
	}

	public String getLicense() {
		return license;
	}

	public Vehicle setLicense(String license) {
		this.license = license;
		return this;
	}

    public Manufacturer getMake() {
        return make;
    }

    public Vehicle setMake(Manufacturer make) {
        this.make = make;
        return this;
    }

    public Model getModel() {
        return model;
    }

    public Vehicle setModel(Model model) {
        this.model = model;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Vehicle setCategory(Category category) {
        this.category = category;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id.equals(vehicle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
		        ", name=" + name +
		        ", license=" + license +
                ", make=" + make +
                ", model=" + model +
                ", category=" + category +
                '}';
    }
}
