package com.company.stream.foreach;

import java.util.stream.Stream;

public class ForEachParallel {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9" , "10");
       // s.parallel().forEach(System.out::println);
s.parallel().forEachOrdered(System.out::println);
    }
}




