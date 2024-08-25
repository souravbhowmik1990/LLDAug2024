package com.sourav.MultiThreading.HelloWorldPrinter;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World,printed by: "+ Thread.currentThread().getName());

        // 1. create a task
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        // 2. create a thread
        // 3. assign task to the thread
        Thread thread1 = new Thread(helloWorldPrinter);

        // 4. Start the Thread
        thread1.start();

        Thread thread2 = new Thread(helloWorldPrinter);
        thread2.start();

        System.out.println("Hello World,printed by: "+ Thread.currentThread().getName());
    }

}
