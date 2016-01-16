package com.eileen.numericalreceipes.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShellsMethodTest {
    @Test
    public void shouldSortIntegerArray() {
        int[] ints = {701, 301, 132, 57, 23, 10, 4, 1};
        ShellsMethod.sort(ints);
        assertArrayEquals(ints, new int[]{1, 4, 10, 23, 57, 132, 301, 701});
    }
}
