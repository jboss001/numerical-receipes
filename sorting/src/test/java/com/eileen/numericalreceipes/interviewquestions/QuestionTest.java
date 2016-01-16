package com.eileen.numericalreceipes.interviewquestions;

import org.junit.Test;

import java.util.List;

public class QuestionTest {
    @Test
    public void findTest() {
        List<Integer> integerList = Question.find();
        System.out.println(integerList.toString());
        System.out.print(integerList.size());
    }
}
