package org.manumiguezz.taskone;

import java.util.Random;

public class SortingAlgorithm {
    public static void main(String[] args) {

//      initialize random class to fill the array
        Random random = new Random();
        int[] numbers = new int[8];

//      filling the array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println("_________________________________________");

//      printing array without sorting process
        System.out.println("unsorted array:");
        printArray(numbers);

//      sorting array
        System.out.println("_________________________________________");
        insertionSort(numbers);
        System.out.println("sorting...");
        System.out.println("_________________________________________");

//      printing results
        System.out.println("sorted array:");
        printArray(numbers);

        System.out.println("_________________________________________");

    }

//  insertion sort method
    private static void insertionSort (int[] unsortedArray) {
//      walk thru the array
        for (int i = 1; i < unsortedArray.length; i++){

//          creating a temporary variable to host the element and check it
            int temporaryValue = unsortedArray[i];

//          creating the variable that its gonna compare with
            int a = i - 1;

//          this while loop will compare each element and place it into its correct position
            while (a >= 0 && unsortedArray[a] > temporaryValue) {
                unsortedArray[a + 1] = unsortedArray [a];
                a = a -1;
            }
            unsortedArray[a + 1] = temporaryValue;

        }
    }

//  printing array method
    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
