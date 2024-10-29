package org.example.bankingapp.accs;

public class Account {

    float balance;
    float minimumBalance;
    String accountHolderName;


    public Account(String name, float minBal) {

        this.accountHolderName = name;
        this.minimumBalance = minBal;

    }

    public Account(String name) {
        this(name, 0F);
    }

    public boolean deposit(float amount) {

        if (amount <= 0) return false;
        this.balance += amount;

        return true;
    }

    public float withdraw(float amount) {

        if (amount <= 0) return 0F; // Input sanitisation
        if (this.balance - amount < this.minimumBalance) return 0F; // Exceeds min bal

        this.balance -= amount;
        return amount;

    }

    public float getBalance() {
        return balance;
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
