package systems;

import utils.IdGenerator;

public class Account {
    private final int ID;
    private double balance;

    public Account(double balance) {
        this.ID = IdGenerator.getAccountID();
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
