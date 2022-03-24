package com.company.funtionalinterface.bifunction;

import java.util.function.BiFunction;

public class BiFunction2 {
    public static void main(String[] args) {

        GPS obj = biFunctionFactory("40.741895", "-73.989308", GPS::new);
        System.out.println(obj);

    }

    public static <R extends GPS> R biFunctionFactory(String Latitude, String Longitude,
                                            BiFunction<String, String, R> func) {
        return func.apply(Latitude, Longitude);
    }
}
    record GPS (String Latitude, String Longitude) {}