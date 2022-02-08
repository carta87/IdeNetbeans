/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprogramcion;

/**
 *
 * @author Antonio
 */
public class JavaProgramcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j, result;
        i = 3;

        j = ++i;
        result = i++  +  j++;

        System.out.println("Result: " + result + ", i: " + i + ", j: " + j);
    }
    
}
