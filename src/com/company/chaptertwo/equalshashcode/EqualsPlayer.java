package com.company.chaptertwo.equalshashcode;

import java.util.Objects;

public class EqualsPlayer {
    private int id;
    private String name;

    public EqualsPlayer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;  //ayni adresdeler ise esit kabul et
        }
        if(obj == null) {
            return false; // obj referansi null ise esit degildir.
        }
        if(getClass() != obj.getClass()) {
            return false; //ayni sinifa ait degillerse esit degildir.
        }

        //ayni sinifa ait olup olmadigi kontrolunu yaptigimiz icin cast edebiliriz.
        final EqualsPlayer other = (EqualsPlayer) obj;

        if(this.id != other.id) {
            return false;
        }
        if(!Objects.equals(this.name, other.name)) {
            return false;
        }

        return true;
    }

}
class EqualsPlayerTest{
    public static void main(String[] args) {
        EqualsPlayer p1 = new EqualsPlayer(1, "James Gosling");
        EqualsPlayer p2 = new EqualsPlayer(1, "James Gosling");

        System.out.println(p1 == p2); //false
        System.out.println(p1.equals(p2)); //true
        System.out.println(p1.hashCode() == p2.hashCode()); //false

        System.out.println(p1.hashCode()); //918221580
        System.out.println(p2.hashCode()); //2055281021

    }
}
