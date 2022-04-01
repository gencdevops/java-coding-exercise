package com.company.stream.foreach;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,4,5,6);
        nums.forEach(System.out::println);

        nums.forEach(i -> {
            i = i + 10;
            System.out.println(i);
        });

        nums.forEach(System.out::println);
    }
}
