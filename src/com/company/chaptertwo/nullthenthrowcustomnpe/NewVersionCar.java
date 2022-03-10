package com.company.chaptertwo.nullthenthrowcustomnpe;

import java.awt.*;
import java.util.Objects;

public class NewVersionCar {
    private final String name;
    private final Color color;

    public NewVersionCar(String name, Color color) {
        this.name = Objects.requireNonNull(name, "Car name can not be null");
        this.color = Objects.requireNonNull(color, "Car color can not be null");
    }
}
