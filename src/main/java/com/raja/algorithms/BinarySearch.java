package com.raja.algorithms;

public class BinarySearch {

    public static void main(String[] args) {
        //Test binary search
        int[] naturalArray = {1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        //1. If element not found: -1
        System.out.println("Not Found : " + binarySearch(naturalArray, 0, naturalArray.length - 1, 26));

        //2. If element found in middle:
        System.out.println("Found In Middle : " + binarySearch(naturalArray, 0, naturalArray.length - 1, 25));

        //3. If element found in right side of array
        System.out.println("Found In Right : " + binarySearch(naturalArray, 0, naturalArray.length - 1, 45));

        //4. If element found in left side of array
        System.out.println("Found In Left : " + binarySearch(naturalArray, 0, naturalArray.length - 1, 5));
    }


    /*
     * 1. Pass input array, leftIndex, rightIndex and search element
        2. Check endIndex >= startIndex
	    3. Find middle index = startIndex + (endIndex - startIndex) / 2
	    4. Return: Find element found in middle index
	    5. Middle Element is greater than search element
			Return: recursion (input array, starIndex, middle - 1, search element)
	    7. Return recursion(inputarray, middle + 1, endIndex, search element)
        8. If none return -1
     */
    private static int binarySearch(int inputArray[], int startIndex, int endIndex, int searchElement) {
        if (endIndex >= startIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            System.out.println("MiddleIndex [" + middleIndex + "]");
            if (inputArray[middleIndex] == searchElement) {
                return middleIndex;
            }

            if (inputArray[middleIndex] > searchElement) {
                return binarySearch(inputArray, startIndex, middleIndex - 1, searchElement);
            }

            return binarySearch(inputArray, middleIndex + 1, endIndex, searchElement);
        }
        return -1;
    }

}