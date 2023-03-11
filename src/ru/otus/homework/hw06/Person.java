package ru.otus.homework.hw06;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    int age;
    List<Pet> petList = new ArrayList<>();

    public void feedPets() throws Exception {
        if (petList.isEmpty())  {
            throw new Exception("ПЭТА НЕТУ");
        } else {
            System.out.println("НЯМ-НЯМ");
        }
    }
}
