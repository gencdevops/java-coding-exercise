package com.company.funtionalinterface.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctional1 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> f1 = (a, b) -> a + b;
        System.out.println(f1.apply(10, 20)); // 30


        Function<Integer, Integer> f2 = a -> a * a;
        System.out.println(f1.andThen(f2).apply(2, 3));


        Integer j1 = f1.apply(2, 3); // 5
        Integer j2 = f2.apply(j1); // 25
        System.out.println(j2); // 25
    }
}
