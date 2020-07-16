package org.xpdojo.bank;

public class Account {
    double balance;

    Account() {
        balance = 0;
    }

    public double balance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
