/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javafundamentos.ejercicios_java_fundamentals;

/**
 *
 * @author Antonio
 */
public class EjerciciCicclo {
    
    public static void main(String[] args) {
       
        int[] numers = { 15, 4, 6, 10, 1};
    
    for (int a: numers ){
        if( a < 6){
         break;
        } else{
            System.out.println("a es igual o  mayor mayor de 6");
        }
           
    }
    
        System.out.println(" el programa a terminado");
}
    
}
