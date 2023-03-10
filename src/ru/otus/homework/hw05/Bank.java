package ru.otus.homework.hw05;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    static Map<Integer, Client> clientMap = new HashMap<>();

    public static void main(String[] args) {

        Client client = new Client("John", 35);
        Client client1 = new Client("SUUs", 17);
        Client client2 = new Client("Vasya", 29);

        BankAccount bankAccount = new BankAccount(285);
        BankAccount bankAccount1 = new BankAccount(25);
        BankAccount bankAccount2 = new BankAccount(2591001);
        BankAccount bankAccount3 = new BankAccount(175);

        client.getBankAccounts().add(bankAccount);
        client.getBankAccounts().add(bankAccount3);
        client1.getBankAccounts().add(bankAccount2);
        client2.getBankAccounts().add(bankAccount1);

        clientMap.put(client.getId(), client);
        clientMap.put(client1.getId(), client1);
        clientMap.put(client2.getId(), client2);



        System.out.println("вывод всей мапы:");
        System.out.println(clientMap.values() + "\n");
        System.out.println("поиск счетов клиента по ID:");
        System.out.println(getAccountsById(0).toString() + "\n");
        System.out.println("поиск клиента по счету:");
        System.out.println(getClientByAccountId(0));
    }

    public static List<BankAccount> getAccountsById(int id) {
        return clientMap.get(id).getBankAccounts().stream().toList();
    }

    public static Client getClientByAccountId(int id) {
        for (Client client : clientMap.values()) {
            for (BankAccount bankAccount : client.getBankAccounts()) {
                if (bankAccount.getId() == id) {
                    return client;
                }
            }
        }
        return null;
    }


}
