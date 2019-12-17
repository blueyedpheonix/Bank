package Runners;

import systems.Account;
import systems.Bank;
import systems.Client;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client client = new Client("Dylan", 10000);
        Client client2 = new Client("Omer", 1);
        Account account = new Account(5678);
        Account account2 = new Account(123);
        Account account3 = new Account(674);
        Account account4 = new Account(34);
        Account account5 = new Account(567);
        Account account6 = new Account(1002);
        bank.addClinet(client);
        client.addAccount(account);
        client.addAccount(account2);
        client.addAccount(account3);
        System.out.println(client.getName());
        System.out.println(client.getBalance());
        System.out.println(client.getFortune());
        client2.addAccount(account4);
        client2.addAccount(account5);
        client2.addAccount(account6);
        System.out.println(bank.getBankBalance());
        bank.addClinet(client2);
        System.out.println(bank.getBankBalance());
        System.out.println(client.getBalance());
        System.out.println(client2.getBalance());
        client.removeAccount(2);
        client.removeAccount(5);
        client2.removeAccount(4);
        client2.removeAccount(10);
        System.out.println(client.getBalance());
        System.out.println(client2.getBalance());
        bank.removeClinet(4);
        bank.removeClinet(1);
        System.out.println(bank.getBankBalance());


    }
}
