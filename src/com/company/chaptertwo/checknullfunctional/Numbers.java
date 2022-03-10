package com.company.chaptertwo.checknullfunctional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Numbers {
    public static List<Integer> evenIntegers(List<Integer> integers) {
        if(integers == null) {
            return Collections.emptyList();
        }

        List<Integer> evenList = new ArrayList<>();
        for(Integer i : integers) {
            if(i != null && i % 2 == 0)
                evenList.add(i);
        }
        return evenList;
    }

    public static List<Integer> evenIntegersObjectsMethods(List<Integer> integers) {
        if(Objects.isNull(integers)) {
            return Collections.emptyList();
        }

        List<Integer> evenList = new ArrayList<>();
        for(Integer i : integers) {
            if(Objects.nonNull(i) && i % 2 == 0)
                evenList.add(i);
        }
        return evenList;
    }

    public static int sumIntegers(List<Integer> integers) {
        if(integers == null) {
            throw new NullPointerException("List can not be null");
        }
        return integers.stream()
                .filter(i -> i  != null)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static boolean integerContainsNull(List<Integer> integers) {
        if(integers == null) {
            return false;
        }
        return integers.stream()
                .anyMatch(i -> i == null);
    }

    public static int sumIntegersObjectsMethods(List<Integer> integers) {

        if (integers == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        return integers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue).sum();
    }

    public static boolean integersContainsNullsObjectsMethods(List<Integer> integers) {

        if (integers == null) {
            return false;
        }

        return integers.stream()
                .anyMatch(Objects::isNull);
    }



}
