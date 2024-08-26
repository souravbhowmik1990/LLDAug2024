package com.sourav.NumbersFrom1To100;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        for(int i=1;i<=100;i++){
//            NumberPrinter numberPrinter=new NumberPrinter(i);
//
//            Thread thread=new Thread(numberPrinter);
//            thread.start();
//        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=1; i<=100; i++){
            if(i==10 || i==50 || i==97){
                System.out.println("DEBUG");
            }

            NumberPrinter numberPrinter=new NumberPrinter(i);
            executorService.execute(numberPrinter);
        }

        NumberPrinter numberPrinter=new NumberPrinter(9999999);
        executorService.execute(numberPrinter);
    }
}
