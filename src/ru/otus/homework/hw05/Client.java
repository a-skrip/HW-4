package ru.otus.homework.hw05;

import java.util.HashSet;
import java.util.Set;

public class Client {
    private static int counter = 0;
    private int id;

    private String name;

    private int age;
    private Set<BankAccount> bankAccounts = new HashSet<>();

    public Client(String name, int age) {
        id = counter++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(Set<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bankAccounts=" + bankAccounts +
                '}';
    }
}