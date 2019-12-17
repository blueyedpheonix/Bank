package systems;

import utils.IdGenerator;

public  class Client {
    private final int ID;
    private String name;
    private double balance;
    private Account[] accounts = new Account[10];
    private int Acounter = 0;
    private int commissionRate = 0;
    private int interestRate = 0;

    //contructor

    public Client(String name, int balance) {
        this.ID = IdGenerator.getClientID();
        this.name = name;
        this.balance = balance;
    }

    // geters and seteres

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

    //functonality

    public void addAccount(Account account){
        if(Acounter >= accounts.length){
            System.out.println("There is no more room for accounts");
        }else{
        accounts[Acounter] = account;
        Acounter++;
        }
    }
    public Account getAccount(int i){
        return accounts[i];
    }
    public void removeAccount(int ID){
        int position = -1;
        for(int i = 0; i < Acounter; i++){
            if(accounts[i].getID() == ID) {
                position = i;
            }
        }
      if(position != -1){
          this.balance += accounts[position].getBalance();
          accounts[position] = null;
          for(int i = position; i < Acounter; i++){
              accounts[i] = accounts[i+1];
          }
          Acounter--;
      }else{
          System.out.println("there is no account under this ID");
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
