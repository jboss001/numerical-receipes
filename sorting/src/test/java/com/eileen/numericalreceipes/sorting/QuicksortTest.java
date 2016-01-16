package com.eileen.numericalreceipes.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuicksortTest {
    @Test
    public void sort() {
        int[] ints = {1, 12, 5, 26, 7, 14, 3, 7, 2};
        Quicksort.sort(ints, 0, ints.length - 1);
        assertArrayEquals(ints, new int[]{1, 2, 3, 5, 7, 7, 12, 14, 26});
    }
}
