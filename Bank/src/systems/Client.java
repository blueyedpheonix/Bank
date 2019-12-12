package systems;

import utils.IdGenerator;

public  class Client {
    private final int ID;
    private String name;
    private double balance;
    private Account[] accounts = new Account[10];
    private int commissionRate = 0;
    private int interestRate = 0;

    public Client(String name, int balance) {
        this.ID = IdGenerator.getClientID();
        this.name = name;
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void addAccount(Account account){
        int counter = 0;
        while(accounts[counter] != null){
            counter++;
        }
        if(counter == accounts.length)
            System.out.println("no more rooms for accounts");
        else
            accounts[counter] = account;
    }
    public Account getAccount(int i){
        return accounts[i];
    }
    public void removeAccount(int ID){
        int counter = 0;
        int accountID = accounts[counter].getID();
        while(accountID != ID && counter < accounts.length){
            if(accounts[counter] != null) {
                accountID = accounts[counter].getID();
            }
            counter++;
        }
        if(accountID != ID)
            System.out.println("no account with this ID");
        else{

            balance += accounts[counter].getBalance();
            accounts[counter] = null;
            for(int i = counter; i < accounts.length -1; i++){
                accounts[i] = accounts[i+1];
            }
        }
    }
    public double getFortune (){
        double sum = balance;
        for (int i = 0; i < accounts.length; i++){
            if(accounts[i] != null){
                sum += accounts[i].getBalance();
            }
        }
        return sum;
    }


}
