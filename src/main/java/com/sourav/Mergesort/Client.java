package com.sourav.Mergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        List<Integer> listToSort = List.of(8,7,9,2,5,3,4,1,6,10);
        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(listToSort);
        List<Integer>sortedList = executorService.submit(mergeSorter);

        System.out.println(sortedList);
    }
}
