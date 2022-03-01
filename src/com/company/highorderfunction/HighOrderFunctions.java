package com.company.highorderfunction;


import java.util.List;
import java.util.stream.Collectors;


public class HighOrderFunctions {
    public static void main(String[] args) {
        List<String> names = List.of("T U R Ke Y 1  ", "Ja VA -? ", "Com    MMUNI ty 2  ");
        List<String> resultNonSpaceList = replace(names, s -> s.replaceAll("\\s", "")); //   \s regex non space character
        List<String> resultNonDigitList = replace(names, s -> s.replaceAll("\\d", "")); //   \d regex non digit character

        System.out.println(resultNonSpaceList);
        System.out.println(resultNonDigitList);

    }
    public static List<String> replace(List<String> list, Replacer<String> r){
        return list.stream().map(r::replace).collect(Collectors.toList());
    }
}

@FunctionalInterface
interface Replacer<String> {
    String replace(String s);
}