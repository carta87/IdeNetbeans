/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.javafundamentos.coffe.stock.app.services;

import com.javafundamentos.coffe.stock.app.entites.Store;

/**
 *
 * @author Antonio
 */
public interface StoreServiceI {
    
   public abstract void create(Store StoreToCreate);
    Store[] findAll();
    Store findByid(Byte id);   
      
}
