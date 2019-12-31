package systems;

import utils.IdGenerator;

import java.util.Objects;

public class Account {
    private final int ID;
    private double balance;

// Constructor

    public Account(double balance) {
        this.ID = IdGenerator.getAccountID();
        this.balance = balance;
    }

// Getters & Setters

    public int getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

// Overrides

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return ID == account.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
