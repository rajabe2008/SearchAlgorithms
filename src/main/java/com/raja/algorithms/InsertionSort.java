package com.raja.algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arrayToSort = {5, 4, 6, 3, 7, 2, 8, 1, 9, 0};
        insertionSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));

        int[] arrayToSortOrdered = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        insertionSort(arrayToSortOrdered);
        System.out.println(Arrays.toString(arrayToSortOrdered));
    }

    private static void insertionSort(int[] arrayToSort) {
        for (int index = 1; index < arrayToSort.length; index++) {
            int current = arrayToSort[index];
            int jump = index - 1;
            while (jump >= 0 && current < arrayToSort[jump]) {
                arrayToSort[jump + 1] = arrayToSort[jump];
                jump--;
            }
            arrayToSort[jump + 1] = current;
        }
    }
}