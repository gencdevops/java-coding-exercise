package com.company.chaptertwo.equalshashcode;

public class Player {
    private int id;
    private String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class PlayerTest{
    public static void main(String[] args) {
        Player p1 = new Player(1, "James Gosling");
        Player p2 = new Player(1, "James Gosling");

        System.out.println(p1 == p2); //false
        System.out.println(p1.equals(p2)); //false
        System.out.println(p1.hashCode() == p2.hashCode()); //false

        System.out.println(p1.hashCode()); //918221580
        System.out.println(p2.hashCode()); //2055281021


    }
}