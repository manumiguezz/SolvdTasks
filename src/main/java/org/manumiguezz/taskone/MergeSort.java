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
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int a = 0, b = 0, c = 0;

        while (a < leftSize && b < rightSize) {
            if (leftHalf [a] <= rightHalf [b]) {
                arrayInt [c] = leftHalf [a];
                a++;
            } else {
                arrayInt [c] = rightHalf [b];
                b++;
            }
            c++;
        }

        while (a < leftSize) {
            arrayInt [c] = leftHalf [a];
            a++;
            c++;
        }

        while (b < leftSize) {
            arrayInt [c] = rightHalf [b];
            b++;
            c++;
        }
    }
}
