package com.spring.mongo.embeded.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order_DB")
public class User {

    @Id
    private int id;
    private String name;
    private String gender;
    private List<Product> products;
    private Address address;

    public User(int id, String name, String gender, List<Product> products, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.products = products;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", products=" + products + ", address="
                + address + "]";
    }

}
