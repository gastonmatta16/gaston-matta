package com.gastonmatta.shoppingCartAPI.domain;

import javax.persistence.*;

@Entity
public class Item {

    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Integer itemId;
    @OneToOne
    @JoinColumn(name="category_name", unique= true, nullable=true, insertable=true, updatable=true)
    private Category category;
    private String name;
    private String description;
    private double price;

    public Item(Category category, String name, String description, double price) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
