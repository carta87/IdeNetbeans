/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javafundamentos.ejercicios_java_fundamentals;

/**
 *
 * @author Antonio
 */
public class OperadorUnario {
    public static void main(String[] args) {
        /*int a,b,c, resultado;
        a = 10;
        b = a++;
        c = ++b + a++;
        resultado = c++ + ++c + b++;
        
        System.out.println(" el valor de a es " +a);
        System.out.println(" el valor de a es " +b);
        System.out.println(" el valor de a es " +c);
        System.out.println(" el valor de a es " +  resultado);*/
        
        
        /*int i,j,k, resultado;
        i = 5;
        j= ++i;
        k= j++ + j + i--;
        resultado = ++k + j++ +j++ + ++i;
        
      
        
        System.out.println(" el valor de a es " + i);
        System.out.println(" el valor de a es " +j);
        System.out.println(" el valor de a es " +k);
        System.out.println(" el valor de a es " +  resultado);*/
        
        int i, j, resultado;
        i= 20;
        j = i++;
        resultado =j++ + ++i/i++;
        
        System.out.println(" el valor de a es " + i);
        System.out.println(" el valor de a es " +j);
        System.out.println(" el valor de a es " +  resultado);
                
        
    }
    
}
