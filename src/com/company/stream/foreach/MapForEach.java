package com.company.stream.foreach;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
        }

        map.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));
    }
}
