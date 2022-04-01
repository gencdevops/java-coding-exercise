package com.company.stream.foreach;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerForEach {
    public static void main(String[] args) {
        List<Integer> numbersList = List.of(1, 2, 3, 4,  5, 6, 7, 8);
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4,  5, 6, 7, 8);

       Consumer<Integer> multiply = i -> {
          i *= 10;
           System.out.println(i);};

       numbersList.forEach(multiply);
       numbersStream.forEach(multiply);

    }
}
