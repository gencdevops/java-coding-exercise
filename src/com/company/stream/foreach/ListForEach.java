package com.company.stream.foreach;

import java.util.ArrayList;
import java.util.List;

public class ListForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");


        for (String l : list) {
            System.out.print(l);
        }


        list.forEach(System.out::print);

    }
}
