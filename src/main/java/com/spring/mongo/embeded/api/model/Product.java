package com.spring.mongo.embeded.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order_DB")
public class Product {

    private String name;
    private int quantity;
    private int price;

    public Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
