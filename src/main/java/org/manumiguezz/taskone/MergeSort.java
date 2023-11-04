package org.manumiguezz.taskone;

public class MergeSort {

    private static void mergeSort (int[] ArrayInt) {

        int inputLength = ArrayInt.length;

        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int [] leftHalf = new int[midIndex];
        int [] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++){
            leftHalf [i] = ArrayInt[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf [i - midIndex] = ArrayInt[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(ArrayInt, leftHalf, rightHalf);
    }

    private static void merge(int[] arrayInt, int[] leftHalf, int[] rightHalf) {

    }
}
