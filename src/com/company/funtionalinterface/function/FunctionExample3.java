package com.company.funtionalinterface.function;

import java.util.function.Function;

public class FunctionExample3 {
    public static void main(String[] args) {

        Function<String, Integer> func = x -> x.length();

        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func.andThen(func2).apply("java");

        System.out.println(result);

    }
}
