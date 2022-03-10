package com.company.chaptertwo.nullthenthrowcustomnpe;

import java.awt.*;

public class OldVersionCar {
    private final String name;
    private final Color color;

    public OldVersionCar(String name, Color color) {
        if(name == null) {
            throw new NullPointerException("Car name can not be null");
        }
        if(color == null) {
            throw new NullPointerException("Car color can not be null");
        }

        this.color = color;
        this.name = name;
    }


}
