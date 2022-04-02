package com.raja.algorithms;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arrayToSort = {5, 4, 6, 3, 7, 2, 8, 1, 9, 0};
        bubbleSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));

        int[] arrayToSortOrdered = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        bubbleSort(arrayToSortOrdered);
        System.out.println(Arrays.toString(arrayToSortOrdered));
    }

    private static void bubbleSort(final int[] inputElements) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) { //No more elements to sort
            isSorted = true;
            for (int index = 0; index < inputElements.length - 1; index++) { //No need to compare last
                if(inputElements[index] > inputElements[index + 1]) {
                    temp = inputElements[index];
                    inputElements[index] = inputElements[index + 1];
                    inputElements[index + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

}