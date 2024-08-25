package com.sourav.MultiThreading.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        // Write the code that you want to run via separate thread.
        System.out.println("Hello World,printed by: "+ Thread.currentThread().getName());


    }
}
