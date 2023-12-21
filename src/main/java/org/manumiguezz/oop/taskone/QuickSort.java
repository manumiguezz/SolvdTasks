package org.manumiguezz.oop.taskone;

public class QuickSort {

    private static void quickSort(int[] array, int lowIndex, int highIndex) {
        // Pick the last element as the pivot
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // Base case for recursion - if lowIndex is greater than or equal to highIndex, the array is sorted
        if (lowIndex >= highIndex) {
            return;
        }

        // Partitioning step
        while (leftPointer < rightPointer) {
            // Move the left pointer to find an element larger than the pivot
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // Move the right pointer to find an element smaller than the pivot
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            // Swap the elements found by the left and right pointers
            swap(array, leftPointer, rightPointer);
        }

        // Swap the pivot element with the element at the left pointer
        swap(array, leftPointer, highIndex);

        // Recursive calls on the left and right partitions (sub-arrays)
        quickSort(array, lowIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }

    // Helper method to swap elements in the array
    private static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
