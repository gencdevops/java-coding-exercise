package com.company.chaptertwo.equalshashcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetEqualsProblem {
    private int id;
    private String name;

    public HashSetEqualsProblem(int id, String name) {
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
        final HashSetEqualsProblem other = (HashSetEqualsProblem) obj;

        if(this.id != other.id) {
            return false;
        }
        if(!Objects.equals(this.name, other.name)) {
            return false;
        }

        return true;
    }
}
class HashSetEqualsProblemTest {
    public static void main(String[] args) {
        HashSetEqualsProblem p1 = new HashSetEqualsProblem(1, "James Gosling");
        HashSetEqualsProblem p2 = new HashSetEqualsProblem(1, "James Gosling");
        System.out.println(p1.equals(p2)); //true

        Set<HashSetEqualsProblem> players = new HashSet<>();
        players.add(p1);
        players.add(p2);
        System.out.println(players.size()); //2
    }
}
