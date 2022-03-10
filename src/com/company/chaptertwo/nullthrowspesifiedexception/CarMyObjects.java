package com.company.chaptertwo.nullthrowspesifiedexception;

import java.awt.*;

public class CarMyObjects {
    private final String name;
    private final Color color;

    public CarMyObjects(String name, Color color) {
        this.name = MyObjects.requireNonNullElseThrowIllegalArgumentException(name, "name can not be null");
        this.color = MyObjects.requiereNonNullElseThrowIllegalArgumentExceptionSupplier(color, () -> "color can not be null");
    }
}
