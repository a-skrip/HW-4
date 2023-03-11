package ru.otus.homework.hw06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        Person person = new Person();

        try {
            person.feedPets();
        } catch (Exception e) {
            e.printStackTrace(); // Вывод сообщения об ошибке
        }

        try {
            person.feedPets();
        } catch (Exception ignored) {
        }

        try {
            person.feedPets();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        person.petList.add(cat);

        try {
            person.feedPets();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try (Scanner scanner = new Scanner(new File("README.md"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

    }
}
