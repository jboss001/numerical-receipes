package com.eileen.numericalreceipes.sorting;

import java.util.Arrays;

public class StraightInsertion {
    public static void sort(int[] integers) {
        for (int i = 1; i < integers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (integers[j] < integers[j - 1]) {
                    int temp = integers[j];
                    integers[j] = integers[j - 1];
                    integers[j - 1] = temp;
                    System.out.println(Arrays.toString(integers));
                }
            }
        }
    }

    public static void sort(double[] doubles) {
        for (int i = 1; i < doubles.length; i++) {
            for (int j = i; j > 0; j--) {
                if (doubles[j] < doubles[j - 1]) {
                    double temp = doubles[j];
                    doubles[j] = doubles[j - 1];
                    doubles[j - 1] = temp;
                    System.out.println(Arrays.toString(doubles));
                }
            }
        }
    }
}
