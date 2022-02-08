/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javafundamentosl.ejerciciosJava.AbstractClass;

/**
 *
 * @author Antonio
 */
public abstract class FiguraGeometrica {
    
    
    protected abstract double calcularArea(double... params);//varags...
    protected abstract double calcularPerimetro(double... params);
    
}
