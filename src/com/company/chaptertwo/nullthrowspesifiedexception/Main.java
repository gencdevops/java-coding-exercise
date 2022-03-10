package com.company.chaptertwo.nullthrowspesifiedexception;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //CarMyObjects carMyObjects = new CarMyObjects("bmw" , null);
        CarGenericMyObjects carGenericMyObjects = new CarGenericMyObjects(null, new Color(123, 123, 123));
    }
}
