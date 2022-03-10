package com.company.chaptertwo.nullthrowspesifiedexception;

import java.util.function.Supplier;

public final class GenericMyObjects {
    private GenericMyObjects() {
        throw new AssertionError("GenericMyObjects is utulity class, can not be instantiated");
    }

    public static <T , X extends Throwable> T requireNonNullElseThrow(T obj, X exception) throws X {
        if(obj == null)
            throw exception;

        return obj;
    }

    public static <T , X extends Throwable> T requireNonNullElseThrowWithSupplier (T obj, Supplier<? extends X> exceptionSupplier)  throws X {
        if(obj != null) {
            return obj;
        }else {
            throw exceptionSupplier.get();
        }
    }
}
