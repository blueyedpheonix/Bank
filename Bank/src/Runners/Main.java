package Runners;

import systems.*;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        RegularClient client = new RegularClient("Yonatan",20000);
        GoldClient client2 = new GoldClient("jake",40000);
        PlatinumClient client3 = new PlatinumClient("Dylan",100000);
        Account account = new Account(5678);
        Account account2 = new Account(123);
        Account account3 = new Account(674);
        Account account4 = new Account(34);
        Account account5 = new Account(567);
        Account account6 = new Account(325);
        Account account7 = new Account(54);
        Account account8 = new Account(1058);
        Account account9 = new Account(2345);
        bank.addClient(client);
        bank.addClient(client2);
        client.addAccount(account);
        client.addAccount(account2);
        client.addAccount(account3);
        client2.addAccount(account4);
        client2.addAccount(account5);
        client2.addAccount(account6);
        client3.addAccount(account7);
        client3.addAccount(account8);
        client3.addAccount(account9);
        System.out.println(client.getBalance());
        System.out.println(client2.getBalance());
        System.out.println(client3.getBalance());
        System.out.println(client.getFortune());
        System.out.println(client2.getFortune());
        System.out.println(client3.getFortune());
        System.out.println(client.getAccount(2).getBalance());
        client2.removeAccount(2);
        System.out.println(client2.getFortune());
        System.out.println(client3.getAccount(1).getID());
        System.out.println(client3.getAccount(1).getBalance());
        System.out.println(client3.getBalance());
        client3.removeAccount(8);
        System.out.println(client3.getBalance());
        client3.withdrow(1000);
        System.out.println(client3.getBalance());
        

    }
}
