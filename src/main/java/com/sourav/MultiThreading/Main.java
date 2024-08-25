package com.sourav.MultiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!, Printed by:" + Thread.currentThread().getName());
        Helper.doSomething();

        /*
        print hello world from a new thread

            1. Create a task that you want to execute in a different Tread.
            2. create a new Thread.
            3. Assign the task to the Thread.
            4. Start the Thread.



         */
    }
}
