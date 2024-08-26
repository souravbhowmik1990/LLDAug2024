package com.sourav.Mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MergeSorter implements Callable<List<Integer>> {
        private List<Integer> listToSort;

        MergeSorter(List<Integer> listToSort) {
            this.listToSort = listToSort;
        }

    @Override
    public List<Integer> call() throws Exception {
            // Merge Sort algorithm will be implemented here
        if (listToSort.size()<=1){
            return listToSort;

        }
        int mid = listToSort.size()/2;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        for (int i=0; i<mid; i++) {
            leftList.add(listToSort.get(i));
        }
        for (int i=mid; i<listToSort.size(); i++) {
            rightList.add(listToSort.get(i));
        }

        // We need to sort both leftList and RightList separately in different threads

        // 1. task to sort left list
        MergeSorter leftSorter = new MergeSorter(leftList);

        // 2. task to sort right list
        MergeSorter rightSorter = new MergeSorter(rightList);

        // Create Executor service
        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Integer>sortedLeftList = executorService.submit(leftSorter);
        List<Integer>sortedRightList = executorService.submit(rightSorter);

        // Merge left and right soretd array.
        List<Integer> sortedArray = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i< sortedLeftList.size() && j<sortedRightList.size()){
            if(sortedLeftList.get(i) <= sortedRightList.get(i)){
                sortedArray.add(sortedLeftList.get(i));
                i++;
            } else {
                sortedArray.add(sortedRightList.get(i));
                j++;
            }
        }

        while(i< sortedLeftList.size()){
            sortedArray.add(sortedLeftList.get(i));
            i++;
        }
        while(j<sortedRightList.size()){
            sortedArray.add(sortedRightList.get(i));
            j++;
        }

        return sortedArray;
    }
}
