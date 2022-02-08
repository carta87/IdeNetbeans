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
public class Circulo extends FiguraGeometrica {

    @Override
    protected double calcularArea(double... params) {
        return (Math.PI * params[0]*params[0]);
    }

    @Override
    protected double calcularPerimetro(double... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
