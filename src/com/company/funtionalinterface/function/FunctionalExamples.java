package com.company.funtionalinterface.function;



public class FunctionalExamples {
    public static void main(String[] args) {

    MyFunction<String, Integer> funcLambda = x -> x.length();
    MyFunction<String, Integer> funcMethodReference = String::length;

        int length = funcMethodReference.apply("TurkeyJavaCommunity");
        System.out.println(length);
    }
}

@FunctionalInterface
 interface MyFunction<T, R> {
    R apply(T t);
}