 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicios.java.programin;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class TestiConcurencyAPI {

    public static void main(String[] args)  {

        
    }
    
    public static  void testRunnable(){
        
                //camino largo para especificar 
        ExecutorService eService = new ThreadPoolExecutor(3, 10, 30, TimeUnit.SECONDS, new SynchronousQueue());
        //contiene metodos utilitarios

        /*Runnable task0 = () -> {
            System.out.println("Ejecutando tarea en ele hilo");
        };   utiliando el lambda al instaciar*/

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Ejecutando tarea en ele hilo " + Thread.currentThread().getName());
                try {
                    Thread.sleep(10000);//unidad por segundos
                    System.out.println("la tarea ya fue ejecutada");
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestiConcurencyAPI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Ejecutando tarea en ele hilo " + Thread.currentThread().getName());
                try {//metodo para que duerma con el fin de testiar 
                    Thread.sleep(10000);//unidad por segundos
                    System.out.println("la tarea2 ya fue ejecutada");
                } catch (InterruptedException ex) {
                    Logger.getLogger(TestiConcurencyAPI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        System.out.println("este es el hilo desde donde se va llamar el execute: " + Thread.currentThread().getName());
        eService.execute(task);//no es bloquiante puede pasar a otra tarea/tesk
        eService.execute(task2);//utilizando una variable de referencia
        eService.execute(() -> {
            System.out.println("Ejecutando tarea en ele hilo");
        });//incluyendo lamddas

        System.out.println("aqui se podrian ejecutar otras tares adicionales");

        try {//solicitar el apagado con el primer metodo 
            eService.shutdown();//no acepte mas tareas que rompa abrutamente
            eService.awaitTermination(60, TimeUnit.SECONDS);//para finalizar de forma controlada time
        } catch (InterruptedException ex) {
            Logger.getLogger(TestiConcurencyAPI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void testCallable() {
        //contiene metodos estaticos= static //todo que este en plural corresponde a clases utilitarias
        ExecutorService eService1 = Executors.newFixedThreadPool(5);//camino corto

        Callable<String> task1 = () -> {
            System.out.println("la tarea se esta ejecutanto... en el hilo" + Thread.currentThread().getName());
            Thread.sleep(6000);
            return "nos vemos en el futuro";

        };
        
        Future<String> future = eService1.submit(task1);
        
        while(!future.isDone()){//retorna true si realiza la tarea
              System.out.println("mientras tanto realizare algunas tareas... su resultado es  ");
        }
        
         try {
                System.out.println("lista la tarea... el resultado es " + future.get());
            } catch (InterruptedException ex) {
                Logger.getLogger(TestiConcurencyAPI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(TestiConcurencyAPI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            eService1.shutdown();
        try {
            eService1.awaitTermination(20, TimeUnit.SECONDS );
            //eService1.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException ex) {
            Logger.getLogger(TestiConcurencyAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
