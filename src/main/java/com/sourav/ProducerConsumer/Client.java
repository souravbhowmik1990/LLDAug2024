package com.sourav.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object>store = new ConcurrentLinkedQueue<>();
        int maxSize = 6;

        Semaphore producerSemaphore = new Semaphore(maxSize);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer p1 = new Producer(store, maxSize, "p1",producerSemaphore,consumerSemaphore);
        Producer p2 = new Producer(store, maxSize, "p2",producerSemaphore,consumerSemaphore);
        Producer p3 = new Producer(store, maxSize, "p3",producerSemaphore,consumerSemaphore);
        Producer p4 = new Producer(store, maxSize, "p4",producerSemaphore,consumerSemaphore);
        Producer p5 = new Producer(store, maxSize, "p5",producerSemaphore,consumerSemaphore);
        Producer p6 = new Producer(store, maxSize, "p6",producerSemaphore,consumerSemaphore);

        Consumer c1 = new Consumer(store, maxSize, "c1",producerSemaphore,consumerSemaphore);
        Consumer c2 = new Consumer(store, maxSize, "c2",producerSemaphore,consumerSemaphore);
        Consumer c3 = new Consumer(store, maxSize, "c3",producerSemaphore,consumerSemaphore);
        Consumer c4 = new Consumer(store, maxSize, "c4",producerSemaphore,consumerSemaphore);
        Consumer c5 = new Consumer(store, maxSize, "c5",producerSemaphore,consumerSemaphore);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);
        Thread t6 = new Thread(p6);
        Thread t7 = new Thread(c1);
        Thread t8 = new Thread(c2);
        Thread t9 = new Thread(c3);
        Thread t10 = new Thread(c4);
        Thread t11 = new Thread(c5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
    }
}
