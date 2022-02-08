/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicios.java.programin.forkjoin;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

/**
 *
 * @author USUARIO
 */
public class TestForkJoin {
    public static void main(String[] args) throws InterruptedException {
        //long[] numbers = new long[100];
        long[] numbers = LongStream.rangeClosed(1, 1_000_000).toArray();
        
        ForkJoinSumCalculator forkJoinSumCalculator =  new ForkJoinSumCalculator(numbers);
        
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        
        Instant instantNow = Instant.now();
        
        Long ResultTotal = forkJoinPool.invoke(forkJoinSumCalculator);
        
        Instant instanAftter = Instant.now();
        Duration duration = Duration.between(instantNow, instanAftter);
        
        System.out.println("el resultado de la suma total es  " + ResultTotal);
       
        //System.out.println("duracion de la ejecucion fue de "+ duration.get(ChoronoUnit));
    }
    
    
   
    public  static Long sumSecuencial() throws InterruptedException {
        long sum = 0;
        for (int   i= 1; i <=  1_000_000;   i++) {
           // Thread.sleep(1);//prueba en domora de tiempos en concurencia
        sum += i;
        
        }
        return sum;
    }
         
    //comportamiento por defecto es secuencial
    public  static Long simStreamElements(){
        
       // long result = LongStream.rangeClosed(1, 1_000_000).sum();
       // return LongStream.rangeClosed(1, 1_000_000).sum();
       
       //return LongStream.rangeClosed(1, 1_000_000).parallel().sum
       
      // return LongStream.rangeClosed(1, 1_000_000).parallel().reduce(0L, (Long acumulador, Long element)-> acumulador + element);
      // return LongStream.rangeClosed(1, 1_000_000).parallel().reduce(0L, (acumulador, element)-> acumulador + element);//inferencia tipos
      // return LongStream.rangeClosed(1, 1_000_000).parallel().reduce(0L, (acumulador, element)-> Long.sum(acumulador, element)); metodo Long sum
       return LongStream.rangeClosed(1, 1_000_000).parallel().reduce(0L, Long::sum );//metodo reference delimitador :: y va inferir dos valores contexto
        
    }
}
