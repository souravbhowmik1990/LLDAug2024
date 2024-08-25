package com.sourav.MultiThreading;

public class Helper {
    public static void doSomething(){
        System.out.println("Hello Everyone, printed by:" + Thread.currentThread().getName());
    }
}
