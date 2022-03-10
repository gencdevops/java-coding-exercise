package com.company.chaptertwo.nullthrowspesifiedexception;

import java.awt.*;

public class CarGenericMyObjects {
    private final String name;
    private final Color color;

    public CarGenericMyObjects(String name, Color color) {
        this.name = GenericMyObjects.requireNonNullElseThrow(name, new UnsupportedOperationException("name can not be  null"));
        this.color = GenericMyObjects.requireNonNullElseThrowWithSupplier(color, () -> new UnsupportedOperationException("color can not be null"));
    }
}
