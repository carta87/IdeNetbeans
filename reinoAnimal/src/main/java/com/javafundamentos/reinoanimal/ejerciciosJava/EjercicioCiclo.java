/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javafundamentos.reinoanimal.ejerciciosJava;

/**
 *
 * @author Antonio
 */
public class EjercicioCiclo { 
    
    public static void main(String[] args) {
        
        int[] sizes = {4, 18, 5, 20};
        for (int size : sizes) {
            if (size > 16) {
                break;
            }
            System.out.println("Size: " + size + ", ");
}
        
        
        System.out.println(" otro ejercicio");
        
        int[] numbers = { 15, 4, 6, 10, 1};
        
        //break y continue
        for (int a:numbers){
            
            if(a < 6){
                continue;
            } else{
                System.out.println( "a es mayor o igual a 6");
            }
            System.out.println( " va a vontinuar con el resto de ciclo ");
        }
            System.out.println("va a continuar ");
           
    }
    
}
