package com.company.chaptertwo.nullthrowspesifiedexception;

import java.util.function.Supplier;

public final class MyObjects {
    private MyObjects() {
        throw new AssertionError("MyObject is utility class, can not be instantiated");
    }

    public static <T> T requireNonNullElseThrowIllegalArgumentException(T obj, String message) {
        if(obj == null)
        throw new IllegalArgumentException(message);

        return obj;
    }

    public static <T> T requiereNonNullElseThrowIllegalArgumentExceptionSupplier(T obj, Supplier<String> supplierMessage) {
        if(obj == null) {
            throw new IllegalArgumentException(supplierMessage == null ? null  : supplierMessage.get());
        }
        return obj;
    }

}
