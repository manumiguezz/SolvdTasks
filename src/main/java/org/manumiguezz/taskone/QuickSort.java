package org.manumiguezz.taskone;

public class QuickSort {

    private static void quickSort (int[] array, int lowIndex, int highIndex) {

        int pivot = array [highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        if (lowIndex >= highIndex) {
            return;
        }

        while (leftPointer < rightPointer) {

            while (array [leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (array [rightPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer--;
            }

            swap (array, leftPointer, rightPointer);
        }

        swap(array, leftPointer, highIndex);
        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);

    }

    private static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
