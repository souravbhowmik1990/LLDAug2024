package com.sourav.NumbersFrom1To100;

public class NumberPrinter implements Runnable {

    private int numberToPrint;
    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
        System.out.println(numberToPrint + ", printed by: " + Thread.currentThread().getName());


    }
}
