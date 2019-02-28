package com.gastonmatta.shoppingCartAPI.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartId;
    @OneToOne
    @JoinColumn(name="user_id", unique= true, nullable=false, insertable=true, updatable=true)
    private User user;
    @OneToMany(mappedBy="cart")
    private Set<CartItem> items;
    private double finalPrice;
    private CartStatus status;

    public Cart(User user){
        this.user = user;
        items = new HashSet<>();
        finalPrice = 0;
        status = CartStatus.IN_PROCESS;
    }

    public Integer getCartId() {
        return cartId;
    }

    public User getUser() {
        return user;
    }

    public Set<CartItem> getItems() {
        return items;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public CartStatus getStatus() {
        return status;
    }

    public void addItemToCart(CartItem newItem){
        items.add(newItem);
    }

    public void deleteItemFromCart(CartItem item){
        if(items.contains(item))
            items.remove(item);
    }

    public void discardCart(){
        status = CartStatus.DISCARTED;
    }

    public void closeCart(){
        status = CartStatus.READY;
    }

    public void payCart(){
        status = CartStatus.CLOSED;
    }


}