package com.company.stream.listtomap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsMap {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Fyodor Dostoyevski", 32));
        personList.add(new Person(2, "Lev Tolstoy", 40));
        personList.add(new Person(3, "İvan Turgenyev", 25));
        personList.add(new Person(4, "Nikolay Vasilyeviç Gogol", 60));
        personList.add(new Person(5, "Maksim Gorki", 55));

        Map<Integer, String> personIdNameMap = personList.stream()
                .collect(Collectors.toMap(Person::id, Person::name));
        System.out.println(personIdNameMap);

        Map<String, Integer> personNameAgeMap = personList.stream()
                .collect(Collectors.toMap(Person::name, Person::age));
        System.out.println(personNameAgeMap);
    }
}

//record Person(int id, String name, int age) {}