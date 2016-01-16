package com.eileen.numericalreceipes.interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Question {
    public static List<Integer> find() {
        List<Integer> integerList = new ArrayList<Integer>();
        for (int i = 0; i< 10000; i++) {
            int first = i / 100;
            int last = i % 100;
            int middle = (i % 1000 - i % 10) / 10;
            if (first + last == middle) {
                integerList.add(i);
            }
        }
        return integerList;
    }
}
