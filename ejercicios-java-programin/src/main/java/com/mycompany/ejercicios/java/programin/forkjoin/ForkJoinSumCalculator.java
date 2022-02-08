
package com.mycompany.ejercicios.java.programin.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 *
 * @author USUARIO
 */
public class ForkJoinSumCalculator  extends RecursiveTask<Long> {
//la clase task me permite sobreEscribir el medoto compute

    private final long[] numbers;
    private final int start;
    private final int end;

    public ForkJoinSumCalculator(long[] numbers) {
    this(numbers, 0, numbers.length );
    }
    
    
    public ForkJoinSumCalculator(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }
    
    @Override
    protected Long compute() {
      int length = end -start;
      
      if(length<= 10_000){
          return computeSequentially();
      }
      ForkJoinSumCalculator leftTask = new ForkJoinSumCalculator(numbers, start, start + length/2);
      leftTask.fork();
       
      System.out.println("Este ejecucion dentro del fork/join" + Thread.currentThread().getName());
      
      ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(numbers, start + length/2, + end);
      Long rigthResult = rightTask.compute();
      
      Long leftResult = leftTask.join();
      
      return leftResult + rigthResult;
      
    }
    
    private long computeSequentially(){
        long sum =0;
        for (int i = start; i < end; i++) {
           // sum = sum + this.numbers[i];
            sum =+ this.numbers[i];
        }
        return sum;
    }
    
}
