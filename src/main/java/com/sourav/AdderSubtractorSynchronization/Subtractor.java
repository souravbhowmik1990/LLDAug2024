package com.sourav.AdderSubtractorSynchronization;

public class Subtractor implements Runnable{
    private Count count;
    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            synchronized(Count.class){
                count.value=count.value-i;
            }
        }
    }
}
