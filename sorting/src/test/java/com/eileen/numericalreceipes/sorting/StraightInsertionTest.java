package com.eileen.numericalreceipes.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class StraightInsertionTest {
    @Test
    public void shouldSortIntegerArray() {
        int[] ints = {1, 3, 2};
        StraightInsertion.sort(ints);
        assertArrayEquals(ints, new int[]{1, 2, 3});
    }

    @Test
    public void shouldSortDoubleArray() {
        double[] doubles = {3.4, 3.35, 5.6, 1.2};
        StraightInsertion.sort(doubles);
        assertArrayEquals(doubles, new double[]{1.2, 3.35, 3.4, 5.6}, 0.001);
    }
}
