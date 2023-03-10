package ru.otus.homework.hw05;

public class BankAccount {
    private static int counter = 0;
    private int id;
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
        this.id = counter++;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
