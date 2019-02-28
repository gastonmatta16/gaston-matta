package com.gastonmatta.shoppingCartAPI.domain;

import javax.persistence.*;

@Entity
public class CartItem{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartItemId;
    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart;
    @OneToOne
    @JoinColumn(name="item_id", unique= true, nullable=false, insertable=true, updatable=true)
    private Item item;
    private Integer quantity;
    private double finalPrice;

    public CartItem(Item item, Integer quantity) {
        this.item = item;
        this.quantity = quantity;
        this.finalPrice = item.getPrice() * quantity;
    }

    public Item getItem() {
        return item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double getFinalPrice() {
        return finalPrice;
    }
}
