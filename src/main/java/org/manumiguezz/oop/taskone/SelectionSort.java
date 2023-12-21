package org.manumiguezz.oop.taskone;

import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {

//      initialize random class to fill the array
        Random random = new Random();
        int[] numbers = new int[8];

//      filling the array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

    }

    private static void selectionSort (int[] numbers) {
        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {
            int min = numbers [i];
            int indexOfMin = i;

            for (int a = i + 1; a < length; a++) {
                if (numbers [i] < min) {
                    min = numbers[a];
                    indexOfMin = a;
                }
            }

            swap(numbers, i, indexOfMin);
        }
    }

    private static void swap (int[] numbers, int a, int b){
        int temporaryField = numbers[a];
        numbers[a] = numbers [b];
        numbers[b] = temporaryField;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
