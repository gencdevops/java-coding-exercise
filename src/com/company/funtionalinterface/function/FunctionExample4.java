package com.company.funtionalinterface.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample4 {
    public static void main(String[] args) {
        List<String> list = List.of("turkey", "java" , "community" , "exercise");

        Map<String, Integer> map = convertListToMap(list, String::length);

        System.out.println(map);
    }

    private static <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {
        Map<T, R> result = new HashMap<>();
        list.forEach(t -> {
            result.put(t, func.apply(t));
        });
        return result;
    }

}
