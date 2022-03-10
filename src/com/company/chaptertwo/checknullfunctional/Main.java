package com.company.chaptertwo.checknullfunctional;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, null, 4, 5, null, 6, 7, null);

    int sum = Numbers.sumIntegersObjectsMethods(numbers);
    boolean containsNull = Numbers.integersContainsNullsObjectsMethods(numbers);
    List<Integer> evenList = Numbers.evenIntegersObjectsMethods(numbers);

        System.out.println("Sum : " + sum);
        System.out.println("Contain nulls? : " + containsNull);
        System.out.println("EvenList : " + evenList);






    }
}
