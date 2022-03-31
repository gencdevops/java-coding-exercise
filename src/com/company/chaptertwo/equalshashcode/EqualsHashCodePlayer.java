package com.company.chaptertwo.equalshashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsHashCodePlayer {
    private int id;
    private String name;

    public EqualsHashCodePlayer(int id, String name) {
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
        final EqualsHashCodePlayer other = (EqualsHashCodePlayer) obj;

        if(this.id != other.id) {
            return false;
        }
        if(!Objects.equals(this.name, other.name)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {

        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);

        return hash;
    }

}
class EqualHashCodePlayerTest {
    public static void main(String[] args) {
        EqualsHashCodePlayer p1 = new EqualsHashCodePlayer(1, "James Gosling");
        EqualsHashCodePlayer p2 = new EqualsHashCodePlayer(1, "James Gosling");


        Set<EqualsHashCodePlayer> players = new HashSet<>();
        players.add(p1);
        players.add(p2);
        System.out.println(players.size()); //1

        System.out.println(p1 == p2); //false
        System.out.println(p1.equals(p2)); //true
        System.out.println(p1.hashCode() == p2.hashCode()); //true

        System.out.println(p1.hashCode()); // -1455880485
        System.out.println(p2.hashCode()); // -1455880485
    }
}
