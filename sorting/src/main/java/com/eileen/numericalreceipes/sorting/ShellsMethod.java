package com.eileen.numericalreceipes.sorting;

import java.util.Arrays;

public class ShellsMethod {
    public static void sort(int[] integers) {
        int increment = integers.length / 2;
        while (increment > 0) {
            for (int i = increment; i < integers.length; i++) {
                int j = i;
                int temp = integers[i];
                while (j >= increment && integers[j - increment] > temp) {
                    integers[j] = integers[j - increment];
                    j = j - increment;
                    System.out.println(Arrays.toString(integers));
                }
                integers[j] = temp;
                System.out.println(Arrays.toString(integers));
            }
            if (increment == 2) {
                increment = 1;
            } else {
                increment *= (5.0 / 11);
            }
        }
    }
}
