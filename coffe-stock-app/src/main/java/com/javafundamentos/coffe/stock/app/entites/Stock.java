/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javafundamentos.coffe.stock.app.entites;

/**
 *
 * @author Antonio
 */
public class Stock {
    private short id;
    private Product[] products;
    private Store Store;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Store getStore() {
        return Store;
    }

    public void setStore(Store Store) {
        this.Store = Store;
    }
}
