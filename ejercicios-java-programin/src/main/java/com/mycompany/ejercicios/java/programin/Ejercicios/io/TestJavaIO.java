
package com.mycompany.ejercicios.java.programin.Ejercicios.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class TestJavaIO {
    public static void main(String[] args) {
        //tesCharacterStreamCopy();
       // testBufferedStreamCopy();
        //testStandarImput();
    }
    
    public  static void testByteStreamCopy(){
        
        byte[] b = new byte[128];
        
        File imputFile =  new File("C:\\Users\\USUARIO\\Documents\\Tafur\\Curriculum-FrontEnd-Angular-ES\\src\\assets\\fotoL.jpg"); 
        
        try(    FileInputStream fis =  new FileInputStream(imputFile);
                FileInputStream fos =  new FileInputStream("C:\\Users\\USUARIO\\Documents\\Tafur\\Curriculum-FrontEnd-Angular-ES\\src\\assets\\fotoL.jpg");) {
            
            while (fis.read(b) != -1) {                
               // fos.write(b);
            }
              
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestJavaIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestJavaIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void tesCharacterStreamCopy(){
        
        char[] c = new char[128];
     
        try(FileReader fReader =new FileReader("C:\\Users\\USUARIO\\Documents\\Tafur\\Curriculum-FrontEnd-Angular-ES\\src\\assets\\notas");
                FileReader fWriter = new FileReader("C:\\Users\\USUARIO\\Documents\\Tafur\\Curriculum-FrontEnd-Angular-ES\\src\\assets\\copianotas")) {
            
            while(fReader.read(c) != -1){
             //   fWriter.write(c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestJavaIO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestJavaIO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static void testBufferedStreamCopy(){
       // BufferedReader bufferedReader =  new BufferedReader(new FilterReader("C:\\Users\\USUARIO\\Documents\\Tafur\\Curriculum-FrontEnd-Angular-ES\\src\\assets")});
    }
    
    public static void testStandarImput(){
        try (BufferedReader bufferedReader =  new BufferedReader (new InputStreamReader(System.in) ); ){
            
            System.out.println("escriba abc para salir");
            String s= bufferedReader.readLine();
            while (s!= null) {
                System.out.println("Eco" + s);
             if (s.equals("abc")) {
                 System.exit(0);
             }              
                
            }
        } catch (IOException ex) {
            Logger.getLogger(TestJavaIO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
