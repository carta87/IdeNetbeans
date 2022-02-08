/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javafundamentos.coffe.stock.app.entites;

/**
 *
 * @author Antonio
 */
public class Product {
    
    private short id;
    private String name;
    private float amouunt;
    private Store Store;

    public short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmouunt() {
        return amouunt;
    }

    public void setAmouunt(float amouunt) {
        this.amouunt = amouunt;
    }

    public Store getStore() {
        return Store;
    }

    public void setStore(Store Store) {
        this.Store = Store;
    }
    
    
}
