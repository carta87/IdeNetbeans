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
public class TestFiguraGeometrica {
    
    public static void main(String[] args) {
        
        FiguraGeometrica figuraGeometrica;
        
        figuraGeometrica = new Circulo();
        
        double resultado =figuraGeometrica.calcularArea(4);
        System.out.println ("el resultado esdel areadel circulo es: " + resultado );
        
        figuraGeometrica = new Tiriangulo();
        figuraGeometrica.calcularArea(5, 4);
        
    }
}
