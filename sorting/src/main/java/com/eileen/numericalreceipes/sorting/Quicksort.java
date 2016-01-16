package com.eileen.numericalreceipes.sorting;

public class Quicksort {
    public static void sort(int[] integers, int left, int right) {
        int index = partition(integers, left, right);
        if (left < index - 1) {
            sort(integers, left, index - 1);
        }
        if (index < right) {
            sort(integers, index, right);
        }
    }

    private static int partition(int[] integers, int left, int right) {
        int i = left, j = right;
        int pivot = integers[(left + right) / 2];
        while (i <= j) {
            while (integers[i] < pivot) {
                i++;
            }
            while (integers[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(integers, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    private static void swap(int[] integers, int i, int j) {
        int temp = integers[i];
        integers[i] = integers[j];
        integers[j] = temp;
    }
}
