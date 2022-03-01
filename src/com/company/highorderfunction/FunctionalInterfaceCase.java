package com.company.highorderfunction;


import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionalInterfaceCase {
    public static void main(String[] args) {
        Function<String, String> f1 = String::toUpperCase;
        Function<String, String> f2 = s -> s.concat(" BITTI");

        Function<String, String> f = reduceStrings(f1, f2);

        System.out.println(f.apply("test islemleri"));
    }

    public static Function<String, String> reduceStrings(Function<String , String> ... functions) {
        Function<String, String> function = Stream.of(functions)
                .reduce(Function.identity(), Function::andThen);

        return function;
   }
}

