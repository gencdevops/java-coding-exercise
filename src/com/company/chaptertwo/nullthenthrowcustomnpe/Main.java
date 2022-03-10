package com.company.chaptertwo.nullthenthrowcustomnpe;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //OldVersionCar oldVersionCar = new OldVersionCar("Bmw", null);
        NewVersionCar newVersionCar = new NewVersionCar(null, new Color(123,123,13));

    }
}
